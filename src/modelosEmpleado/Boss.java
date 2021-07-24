package modelosEmpleado;

import javax.swing.JOptionPane;

public class Boss extends Employee {

	// atributos,
	private final double COEFICIENTE = 1.5;
	private final double IRPF = 0.32;

	// constructores,

	// por defecto,
	public Boss() {
		
		super();
		this.setCoeficiente(this.COEFICIENTE);
		this.setIrpf(this.IRPF);

	}

	// con el atributo salario,
	public Boss(int salarioBase)  {
		super();
		this.setCoeficiente(this.COEFICIENTE);
		this.setIrpf(this.IRPF);
			
		try {
			this.setSueldoBase(salarioBase);
			this.sueldoBrutoMes = (int) this.setSueldoBrutoMes(salarioBase);
			this.setSueldoNetoMes();
			this.setSueldoBrutoAnyo();
			this.setSueldoNetoAnyo();
			this.setBonusAnual();
		} 
		catch (Throwable e) {
			JOptionPane.showMessageDialog(null, "El salario de Boss no puede ser inferior de 8000 euros");
			
			e.printStackTrace();
		}
	}

	// para controlar el salario de Boss,
	// tiene que ser más que 8000 euros,
	public void setSueldoBase(int salarioBase) throws Throwable {

		if (this.setSueldoBrutoMes(salarioBase) > 8000) {
						
			this.sueldoBase = salarioBase;

		} else {
			throw new Exception();
		}
	}

	@Override
	public String toString() {
		
		return "Boss: " + super.toString();
	}	
}
