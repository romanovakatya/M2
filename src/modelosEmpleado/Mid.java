package modelosEmpleado;

import javax.swing.JOptionPane;

public class Mid extends Employee {

	// atributos,

	private final double COEFICIENTE = 0.90;
	private final double IRPF = 0.15;

	// constructores,

	public Mid() {

		super();
		setCoeficiente(this.COEFICIENTE);
		setIrpf(this.IRPF);
	}

	// con el atributo salario,
	public Mid(int salarioBase) {
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
			JOptionPane.showMessageDialog(null, "El salario de Mid tiene que ser entre 1800 y 2500 euros");

			e.printStackTrace();
		}
	}

	// para controlar el salario de Mid,
	// tiene que ser entre 1800 y 2500 euros,
	public void setSueldoBase(int salarioBase) throws Throwable {

		if ((this.setSueldoBrutoMes(salarioBase) > 1800) && (this.setSueldoBrutoMes(salarioBase) < 2500)) {
			
			this.sueldoBase = salarioBase;
		} 
		else {
			throw new Exception();

		}
	}
	
	@Override
	public String toString() {
		
		return "Mid: " + super.toString();
	}
}
