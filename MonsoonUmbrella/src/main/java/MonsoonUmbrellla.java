package main.java;

import java.util.Arrays;
import java.util.Collections;

public class MonsoonUmbrellla {


	public static int getUmbrellas(int n, int[] p) {
		int noOfUmbrellas = 0;
		int noOfTypesOfUmbrella = p[0];
		Integer[] typesOfUmbrella = new Integer[p.length-1];
		int remainingPeople = n;
		
		/*Check the correctness of the input*/
		if(noOfTypesOfUmbrella != p.length -1) {
			return -1;
		}
		/*Remove the first element of the array*/
		for(int i=1; i <= p.length-1; i++) {
			typesOfUmbrella[i-1] = p[i];
		}
		
		/*Sort the array in descending order*/
		Arrays.sort(typesOfUmbrella, Collections.reverseOrder());
		
		int quantity = 0;
		for(int i = 0; i <= typesOfUmbrella.length -1; i++) {
			if(typesOfUmbrella[i] <= remainingPeople) {
				quantity = remainingPeople / typesOfUmbrella[i];
				if(remainingPeople % typesOfUmbrella[i] >= 0) {
					remainingPeople = remainingPeople - quantity * typesOfUmbrella[i];
					noOfUmbrellas = noOfUmbrellas + quantity;
					if(remainingPeople == 0) break;
				}
			}
		}
		if(remainingPeople > 0) return -1;
		return noOfUmbrellas;
	}

}
