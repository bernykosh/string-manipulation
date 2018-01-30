/** 
* User: Bernedette Perera
* Created At: 18-June-2017 
*/

import java.io.*;
import java.lang.*;
import java.util.*;

public class AboutMe {

	private static void jbk(String[] sugarP){

		for(String hobby : sugarP){
			System.out.printf("%s ", hobby);
		}
		System.out.println();
	}

	private static void amor(byte[] cj) {

		Arrays.sort(cj);
		for(int bk = cj.length-1; bk>=0; bk--) {
			System.out.print(cj[bk] +".. ");
		}
		System.out.println("\n\n\n\n");
	}

	public static void main (String[] args) throws java.lang.Exception {

		String[] sugarP = new String[4];
		sugarP[3] = "Me";
		sugarP[1] = "Is";
		sugarP[0] = "This";
		sugarP[2] = "About";
		jbk(sugarP); 

		byte[] cj = {2,1,3};
		amor(cj);

		StringBuilder bewunderer = new StringBuilder().append(131092).append('c');
		String GAHAPH, KATAWAHAP;	
		StringBuilder buriya = new StringBuilder("m9skpo$lc/mbf@scowuq%u(jf#axpy=lu");

		GAHAPH = buriya.substring(buriya.indexOf("o"), buriya.indexOf("#a"));
		KATAWAHAP = GAHAPH.toString().substring(7,11).replace('@','u').toUpperCase();

		StringBuilder tahukanda = new StringBuilder(KATAWAHAP).deleteCharAt(2);
		System.out.print(tahukanda.append('K'));

		StringBuffer bj = new StringBuffer(GAHAPH); 
		bj.delete(1,7);
		bj.delete(2, 13);
		bj.insert(0, '-').insert(4, '!');

		System.out.print(bj.toString().toUpperCase() + "\n:P"); 
	} 
}
