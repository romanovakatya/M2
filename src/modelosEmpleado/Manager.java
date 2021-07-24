package modelosEmpleado;

import javax.swing.JOptionPane;

public class Manager extends Employee {

	// atributos,
	private final double COEFICIENTE = 1.1;
	private final double IRPF = 0.26;

	// constructores,

	// por defecto,
	public Manager() {
		
		super();
		setCoeficiente(this.COEFICIENTE);
		setIrpf(this.IRPF);
		
	}

	// con el atributo salario,
	public Manager(int salarioBase) {
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
			JOptionPane.showMessageDialog(null, "El salario de Manager tiene que ser entre 3000 y 5000 euros");

			e.printStackTrace();
		}
	}

	// para controlar el salario de Manager,
	// tiene que ser entre 3000 y 5000 euros,
	public void setSueldoBase(int salarioBase) throws Throwable {

		if ((this.setSueldoBrutoMes(salarioBase) > 3000) && (this.setSueldoBrutoMes(salarioBase) < 5000)) {
			
			this.sueldoBase = salarioBase;
			
		} else {
			throw new Exception();

		}
	}
	
	@Override
	public String toString() {
		
		return "Manager: " + super.toString();
	}
}
