package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculos;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Calculos[] vect = new Calculos[9];
		
		for(int i=0; i<n; i++) {
			System.out.println("Rent #" + (i+1) + ":");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Calculos(name, email, room);
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Busy rooms:");
		for(int i=0; i<vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();

	}

}
