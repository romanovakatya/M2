package modelosEmpleado;

import javax.swing.JOptionPane;

public class Senior extends Employee {

	// atributos,

	private final double COEFICIENTE = 0.95;
	private final double IRPF = 0.24;

	// constructores,

	public Senior() {

		super();	
		setCoeficiente(this.COEFICIENTE);
		setIrpf(this.IRPF);
	}

	
	// con el atributo salario,
	public Senior(int salarioBase) {
		super();
		setCoeficiente(this.COEFICIENTE);
		setIrpf(this.IRPF);

		try {
			this.setSueldoBase(salarioBase);
			this.sueldoBrutoMes = (int) this.setSueldoBrutoMes(salarioBase);
			this.setSueldoNetoMes();
			this.setSueldoBrutoAnyo();
			this.setSueldoNetoAnyo();
			this.setBonusAnual();
			
		} catch (Throwable e) {
			JOptionPane.showMessageDialog(null, "El salario de Senior tiene que ser entre 2700 y 4000 euros");

			e.printStackTrace();
		}
	}

	// para controlar el salario de Senior,
	// tiene que ser entre 2700 y 4000 euros,
	public void setSueldoBase(int salarioBase) throws Throwable {

		if ((this.setSueldoBrutoMes(salarioBase) > 2700) && (this.setSueldoBrutoMes(salarioBase) < 4000)) {
			
			this.sueldoBase = salarioBase;
		} 
		
		else {
			throw new Exception();

		}
	}
	
	@Override
	public String toString() {
		
		return "Senior: " + super.toString();
	}
}
