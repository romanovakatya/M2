package modelosEmpleado;

import javax.swing.JOptionPane;

public class Junior extends Employee{

	// atributos,

	private final double COEFICIENTE = 0.85;
	private final double IRPF = 0.02;

	// constructores,

	public Junior() {
		
		super();
		setCoeficiente(this.COEFICIENTE);
		setIrpf(this.IRPF);
				
	}

	// con el atributo salario,
	public Junior(int salarioBase) {
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
		} 
		catch (Throwable e) {
			JOptionPane.showMessageDialog(null, "El salario de Junior tiene que ser entre 900 y 1600 euros");

			e.printStackTrace();
		}
	}

	// para controlar el salario de Junior,
		// tiene que ser entre 900 y 1600 euros,
		public void setSueldoBase(int salarioBase) throws Throwable {

			if ((this.setSueldoBrutoMes(salarioBase) > 900) && (this.setSueldoBrutoMes(salarioBase) < 1600)) {
				
				this.sueldoBase = salarioBase;
			} 
			else {
				throw new Exception();

			}
		}
		
		public String toString() {
			
			return "Junior: " + super.toString();
		}	
}
