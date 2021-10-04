package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i<tabell.length; i++) 					// Counting from start to end of table length
			System.out.println(i + "\t" + tabell[i]);

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String utskrift = "[";
		
		for (int i = 0; i<tabell.length; i++) {
			utskrift += tabell[i];
		if (i != tabell.length -1) {
			utskrift += ",";
		}
	}
		return utskrift + "]";
		
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		
		for (int x: tabell) {								// Enhanced for loop
			sum += x;
		}
		return sum;
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for (int i = 0; i<tabell.length; i++) {
			
		if (tabell[i] == tall)
			return true;
			
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		 if (tabell == null) {
	            return -1;
	        }
	 
	        int lengde = tabell.length;
	        int i = 0;
	        
	        while (i < lengde) {
	
	            if (tabell[i] == tall) {
	                return i;
	            }
	            else {
	                i = i + 1;
	            }
	        }
	        return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] rev = tabell.clone();

        for (int i = 0; i<tabell.length; i++){
            rev[tabell.length-1-i] = tabell[i];
        }

        return rev;
     }
		

	// g)
	public static boolean erSortert(int[] tabell) {

        for (int i = 0; i<tabell.length - 1; i++) {
        if (tabell[i] > tabell[i+1])
        	return false;
        }
        return true;
        }
            
	

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int nyLengde = tabell1.length + tabell2.length;
        int[] nyTab = new int[nyLengde];
        for (int i=0; i<tabell1.length; i++) {
            nyTab[i] = tabell1[i];
        }
        for(int j=0; j<tabell2.length; j++) {
            nyTab[tabell1.length+j] = tabell2[j];
        }
        return nyTab;
	}
}
