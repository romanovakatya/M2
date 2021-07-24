package main;

import javax.swing.JOptionPane;

import modelosEmpleado.*;

public class EmpleadoApp {

	public static void main(String[] args) {
		
		//para mostrar datos de los empleados,
		int salarioBoss;

		salarioBoss = Integer.parseInt(JOptionPane.showInputDialog("Salario de Boss"));

		Boss newBoss;
		try {
			newBoss = new Boss(salarioBoss);

			newBoss.cobrar();

		} catch (Throwable e) {

			e.printStackTrace();
		}
		

		int salarioManager;

		salarioManager = Integer.parseInt(JOptionPane.showInputDialog("Salario de Manager"));

		Manager newManager;
		try {
			newManager = new Manager(salarioManager);

			newManager.cobrar();
		} catch (Throwable e) {

			e.printStackTrace();
		}

		int salarioSenior;

		salarioSenior = Integer.parseInt(JOptionPane.showInputDialog("Salario de Senior"));

		Senior newSenior;
		try {
			newSenior = new Senior(salarioSenior);

			newSenior.cobrar();
		} catch (Throwable e) {

			e.printStackTrace();
		}

		int salarioMid;

		salarioMid = Integer.parseInt(JOptionPane.showInputDialog("Salario de Mid"));

		Mid newMid;
		try {
			newMid = new Mid(salarioMid);

			newMid.cobrar();
		} catch (Throwable e) {

			e.printStackTrace();
		}

		int salarioJunior;

		salarioJunior = Integer.parseInt(JOptionPane.showInputDialog("Salario de Junior"));

		Junior newJunior;
		try {
			newJunior = new Junior(salarioJunior);

			newJunior.cobrar();
		} catch (Throwable e) {

			e.printStackTrace();
		}

		int salarioVolunteer;

		salarioVolunteer = Integer.parseInt(JOptionPane.showInputDialog("Salario de Voluntee"));

		Volunteer newVolunteer;
		try {
			newVolunteer = new Volunteer(salarioVolunteer);

			newVolunteer.cobrar();
		} catch (Throwable e) {

			e.printStackTrace();
		}
	}

}
