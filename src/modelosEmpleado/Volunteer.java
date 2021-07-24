package modelosEmpleado;

import javax.swing.JOptionPane;

public class Volunteer extends Employee {

	// atributos,
	private final double COEFICIENTE = 1;

	// constructores,

	public Volunteer() {

		super();
		this.setCoeficiente(this.COEFICIENTE);
	}

	// con el atributo salario,
	public Volunteer(int salarioBase) {

		super();
		this.setCoeficiente(this.COEFICIENTE);

		try {
			this.setSueldoBase(salarioBase);
		} 
		catch (Throwable e) {
			JOptionPane.showMessageDialog(null, "Volunteer no puede tener salario");

			e.printStackTrace();
		}
	}

	// para controlar el salario de Volunteer,
	// no cobra nada o recibe ayuda governal hasta 300 euros,
	public void setSueldoBase(int salarioBase) throws Throwable {

		int ayuda;
		
		if (salarioBase <= 300) {
			
			ayuda = JOptionPane.showOptionDialog(null, "Ayuda governal", "Tiene ayuda governal?",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "No", "Sí" },
					"Sí");
			
			this.sueldoBase = ayuda > 0 ? salarioBase : 0;				
		} 
		else {
			throw new Exception();

		}
	}
	
	//para mostrar que cobra voluntario,
	public void cobrar() {
		
			JOptionPane.showInternalMessageDialog(null,
					this.toString());
	}


	@Override
	public String toString() {
		
		if(this.sueldoBase == 0) {
			return "Voluntario no tiene ni salario, ni recibe ayuda governal.";
		}
		else {
			return "Voluntario recibe ayuda governal = " + this.sueldoBase;
		}		
	}
}
