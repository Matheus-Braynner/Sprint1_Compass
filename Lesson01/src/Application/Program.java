package Application;

import java.util.Scanner;

import Entities.Quiz;

public class Program {

	public static void main(String[] args) {		
			System.out.println("|------------------------------|");
			System.out.println("|                              |");
			System.out.println("|          NordesTeam          |");
			System.out.println("|                              |");
			System.out.println("|------------------------------|");
			Scanner sc = new Scanner(System.in);
			
			Quiz q = new Quiz();
			System.out.println("Welcome to Compass quiz");
			System.out.print("Enter your name: ");
			String name = sc.nextLine();
			q.setName(name);
			System.out.println("What language do you want to do your Quiz ?");
			System.out.println("1- Portuguese \n" + "2- English");
			int choice = sc.nextInt();
			
			int score = 0;
			if (choice == 1) {
				for(int i = 0; i < 10; i++) {
					System.out.println(q.questionPortuguese(i));
					String ans = sc.next();
					if(ans.equals(q.ansPortuguese(i))) {
						score++;
					}
				}
			}
			
			if (choice == 2) {
				for(int i = 0; i < 10; i++) {
					System.out.println(q.questionEnglish(i));
					String ans = sc.next();
					if(ans.equals(q.ansEnglish(i))) {
						score++;
					}
				}
			}
			
			System.out.println("User: " + q.getName());
			System.out.println("Corrects answers: " + score);
			System.out.println("Wrong answers: " +  (10 - score));
			
			
		
			
			sc.close();

	}

}
