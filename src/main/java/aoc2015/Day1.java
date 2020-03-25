package aoc2015;

import java.io.IOException;
import java.util.List;

import utils.FlatFileReader;

public class Day1 {

	public static void main(String[] args) {
		FlatFileReader ffr=new FlatFileReader();

		try {
			List<String> masses=ffr.readLinesOfFile("input1");
			int resultat=sommeDesCarburants(masses);
			System.out.println(resultat);



		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
	}

	private static int sommeDesCarburants(List<String> masses) {

		int carburantTotal=0;

		for (String masse : masses) {
			int masseEntiere=Integer.parseInt(masse);
			int carburantDeLaMasse=calculerCarburant(masseEntiere);
			carburantTotal+=carburantDeLaMasse;

		}


		return carburantTotal;

	}

	private static int calculerCarburant(int masseEntiere) {
		int retour=0;
		retour=((int) Math.floor(masseEntiere/3))-2;
		return retour;
	}	

}



