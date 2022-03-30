package alessandrod;

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



@SuppressWarnings("unused")
public class Prova {
	@SuppressWarnings("unused")
	private static BufferedReader oLeggi = new BufferedReader (new InputStreamReader(System.in));
	public static void main(String[] args) {
		List <Integer> pa = new ArrayList<>();
		System.out.println("L'array è stato creato");
		System.out.println("Quanti valori vuoi inserire ?");
		//int i = int.Parse(Console.ReadLine());
		int i;
		var scan = new Scanner(System.in);
		i = scan.nextInt();
		//System.out.println(i);
		int j = 0;
		while (j < i) {
			System.out.println("Inserisci il " + (j+1) + "° valore");
			pa.add(scan.nextInt());
			j++;
		}
		int k=0;
		System.out.println(pa);
		System.out.println("Il valore che vuoi eliminare in quale posizione si trova?");
		k=scan.nextInt();
		pa.remove(k-1);
		System.out.println(pa);
		
		/*while (j<i) {
			System.out.println("Il " + (j++) + "° valore è " + pa.get(i));
			j++;
		}
		*/
		//System.out.println("");
	}

}
