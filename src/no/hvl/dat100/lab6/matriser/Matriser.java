package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		int[][] nyMatrise = new int[matrise.length][matrise.length];
		for (int i = 0; i<matrise.length; i++) {
			for (int j = 0; j<matrise[i].length; j++) 
				
			nyMatrise[i][j] = matrise[i][j];
			}
		}
	

	// b)
	public static String tilStreng(int[][] matrise) {

		String txt = "";
		
		for (int i = 0; i<matrise.length; i++) {
			for (int j = 0; j<matrise[i].length; j++) 
				
					txt += matrise[i][j] + " ";
					txt += "\n";
			
		}
	
		 return txt;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] nyMatrise = new int[matrise.length][matrise.length];
		
		for (int i = 0; i<matrise.length; i++) {
			for (int j = 0; j<matrise.length; j++) 
				
				nyMatrise[i][j] = matrise[i][j] * tall;
			
		}
		
		return nyMatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean check = false;

	    for(int i = 0; i < a.length; i++)  {

	        for(int k = 0 ; k< b.length ; k++) {

	            for(int j = 0 ; j<b[0].length ; j++)  {
	              
	            	if(a[i][j]!=b[k][j])  {
	                    break;
	                }
	            	
	                else  {
	                	
	                    if(j==b[0].length-1)   {
	                        check = true;
	                     }
	                }

	            }
	            if(check == true)  {
	               break;
	            }
	        }
	        if(check == true)  {
	           break;
	        }
	    }
	    return check;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
