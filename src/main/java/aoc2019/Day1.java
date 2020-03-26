package aoc2019;

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
			carburantTotal =carburantTotal + carburantDuneMasseAvecLesCarbAdditionnels(masse);

		}


		return carburantTotal;

	}


	
	
	protected static int carburantDuneMasseAvecLesCarbAdditionnels(String masse) {
		int masseEntiere=Integer.parseInt(masse);
		int sommeDesCarburantsDuneMasse=0;
		int carburantDeLaMasse=calculerCarburant(masseEntiere);
		
		while (carburantDeLaMasse > 0) {
			sommeDesCarburantsDuneMasse+=carburantDeLaMasse;
			carburantDeLaMasse=calculerCarburant(carburantDeLaMasse);
			
			
		}
		 
		return sommeDesCarburantsDuneMasse;
	}

	private static int calculerCarburant(int masseEntiere) {
		int retour=0;
		retour=((int) Math.floor(masseEntiere/3))-2;
		return retour;
	}	

}



