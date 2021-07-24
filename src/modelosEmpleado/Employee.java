package modelosEmpleado;

import javax.swing.JOptionPane;

public class Employee {
	
	//atributos,
	protected int sueldoBase;
	protected int sueldoBrutoMes;
	protected int sueldoNetoMes;
	protected int sueldoNetoAnyo;
	protected int sueldoBrutoAnyo;
	protected int bonusAnual;
	
	//cada empleado tiene el suyo,
	protected double coeficiente;
	protected double irpf;
	
	private final double COEFICIENTE = 0.85;
	// (Boss: 32% ,Manager: 26% ,Senior:24%, Mid: 15%, Junior: 2%)
	private final double IRPF = 1;

	
	//constructores,
	//por defecto,
	public Employee() {
			
		this.setCoeficiente(this.COEFICIENTE);
		this.setIrpf(this.IRPF);
		this.sueldoBase = 0;
		this.sueldoBrutoMes = 0;
		this.bonusAnual = 0;
	}
	
	//con el atributo salario,
	public Employee(int salarioBase) throws Throwable {
		
		this.setCoeficiente(this.COEFICIENTE);
		this.setIrpf(this.IRPF);
		this.setSueldoBase(salarioBase);
		this.sueldoBrutoMes = (int) this.setSueldoBrutoMes(salarioBase);
		this.setSueldoNetoMes();
		this.setSueldoBrutoAnyo();
		this.setSueldoNetoAnyo();
		this.setBonusAnual();
				
	}

	//los getters y setters,
	
	//guardar sueldo base,
	public void setSueldoBase(int salarioBase) throws Throwable {
		
		if ((this.setSueldoBrutoMes(salarioBase) > 0)) {
			this.sueldoBase = salarioBase;
		} else {
			
			throw new Exception();

		}
	}
	
	public int getSueldoBase() {
		return this.sueldoBase;
	}

	//método que cálcula el salario final que cobra cada empleado,
	protected double setSueldoBrutoMes(int salarioBase) {
		return (salarioBase * this.coeficiente);
	}
	
	public int getSueldoBrutoMes() {
		return sueldoBrutoMes;
	}
	
	public int getSueldoNetoMes() {
		return sueldoNetoMes;
	}

	public void setSueldoNetoMes() {

		this.sueldoNetoMes = (int) (this.sueldoBrutoMes - (this.sueldoBrutoMes * this.irpf));

	}
		
	public int getSueldoBrutoAnyo() {
		return this.sueldoBrutoAnyo;
	}

	public void setSueldoBrutoAnyo() {
		this.sueldoBrutoAnyo = (this.sueldoBrutoMes * 14);
	}

	public int getSueldoNetoAnyo() {
		return sueldoNetoAnyo;
	}

	public void setSueldoNetoAnyo() {
		this.sueldoNetoAnyo = (int) (this.sueldoBrutoAnyo - (this.sueldoBrutoAnyo * this.irpf));
	}
	
	public int getBonusAnual() {
		return bonusAnual;
	}

	public void setBonusAnual() {
		
		if (!(this instanceof Volunteer)) {
			this.bonusAnual = (int) (this.sueldoNetoAnyo * 0.1);
		}
		
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}

	public double getCoeficiente() {
		return coeficiente;
	}

	public void setCoeficiente(double coeficiente) {
		this.coeficiente = coeficiente;
	}

	//método para mostrar sueldos de cada empleado,
	public void cobrar() {
	
		if (this.getSueldoBrutoMes() > 0) {
			JOptionPane.showInternalMessageDialog(null,
					this.toString());
		}
	}

	@Override
	public String toString() {
		return " sueldo Base=" + this.sueldoBase + ", sueldo Bruto al Mes=" + this.sueldoBrutoMes + ", sueldo Neto al Mes="
				+ this.sueldoNetoMes + ", sueldo Bruto al Año=" + this.sueldoBrutoAnyo + ", sueldo Neto al Año=" +  this.sueldoNetoAnyo
				+ ", bonus Anual=" + this.bonusAnual;
	}	
}
