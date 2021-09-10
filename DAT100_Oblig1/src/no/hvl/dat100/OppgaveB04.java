package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class OppgaveB04 {

	public static void main(String[] args) {
		String bruttoInntekt = showInputDialog("Bruttoinntekt? ");
		int lonn = Integer.parseInt(bruttoInntekt);
		
		double sats1 = 0.0093;
		double sats2 = 0.0241;
		double sats3 = 0.1152;
		double sats4 = 0.1452;
		
		int belop1 = 164100;
		int belop2 = 230950;
		int belop3 = 580650;
		int belop4 = 943050;
		
		double trinn4 = 0;
		double trinn3 = 0;
		double trinn2 = 0;
		double trinn1 = 0;
		
		if(lonn > belop1) {
			trinn1 = (belop2-belop1)*sats1;
		}
		if(lonn > belop2) {
			trinn2 = (belop3-belop2)*sats2;
		}
		if(lonn > belop3) {
			trinn3 = (belop4-belop3)*sats3;
		}
		if(lonn > belop4) {
			trinn4 = (lonn-belop4)*sats4;
		}

		System.out.println("Trinn 1 " + trinn1);
		System.out.println("Trinn 2 " + trinn2);
		System.out.println("Trinn 3 " + trinn3);
		System.out.println("Trinn 4 " + trinn4);
	}

}