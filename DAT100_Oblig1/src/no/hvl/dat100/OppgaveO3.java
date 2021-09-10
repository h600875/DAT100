package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO3 {

	public static void main(String[] args) {
		String StringN = showInputDialog("N? ");
		int n = Integer.parseInt(StringN);
		double sum = 1.0;
		
		if(n > 0) {
			for(int i = 1; i <= n; i++) {
				sum *= i;
			}
		}
		System.out.println("Sum: " + sum);
	}

}
