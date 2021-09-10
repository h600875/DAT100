package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB05 {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			String antallPoeng = showInputDialog("Poeng? ");
			int poeng = Integer.parseInt(antallPoeng);
			
			if(poeng <= 100 && poeng >= 90) {
				System.out.println("A");
			}
			else if(poeng <= 89 && poeng >= 80) {
				System.out.println("B");
			}
			else if(poeng <= 79 && poeng >= 60) {
				System.out.println("C");
			}
			else if(poeng <= 59 && poeng >= 50) {
				System.out.println("D");
			}
			else if(poeng <= 49 && poeng >= 40) {
				System.out.println("E");
			}
			else if(poeng <= 39 && poeng >= 0) {
				System.out.println("F");
			}
			else {
				System.out.println("Ugyldig poengsum, les inn på nytt");
				i--;
			}
		}
	}

}