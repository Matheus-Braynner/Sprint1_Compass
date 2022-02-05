package Application;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import Entities.SignIn;

public class Program {

	public static void main(String[] args) {
		System.out.println("|------------------------------|");
		System.out.println("|                              |");
		System.out.println("|          NordesTeam          |");
		System.out.println("|                              |");
		System.out.println("|------------------------------|");
		
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		d = cal.getTime();
		int horas = cal.get(Calendar.HOUR_OF_DAY);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<SignIn> signIn = new ArrayList<SignIn>();
		
		System.out.println("Welcome to Compass team");
		System.out.println("Do you have an account ?");
		
		System.out.println("0- Exit\n1- Sign up  \n2- Sign in");
		int select = sc.nextInt();
			do {
				switch (select) {
				case 0 : 
					System.out.println("End of program");
					break;
				case 1 :
					System.out.print("Put a login that you desire:");
					String login = sc.next();
					System.out.print("Put a new password(only numbers): ");
					int password = sc.nextInt();
					System.out.print("Repeat your password: ");
					int passwordVerify = sc.nextInt();
					while(password != passwordVerify) {
						System.out.println("Different passwords\n" + "Please, repeat with the correct password\n");
						System.out.print("Put a new password(only numbers): ");
						password = sc.nextInt();
						System.out.println("Repeat your password: ");
						passwordVerify = sc.nextInt();
					}
					signIn.add(new SignIn(login, password));
					System.out.println("Created account with success");
					System.out.println();
					System.out.println("0- Exit\n1- Sign up  \n2- Sign in");
					select = sc.nextInt();
					break;
				case 2 :
					if(signIn == null || signIn.isEmpty()) {
						System.out.println("You don't have an account!\n");
						System.out.println("Press number 1 to create an account");
						System.out.println("0- Exit\n1- Sign up  \n2- Sign in");
						select = sc.nextInt();
					} else {
						System.out.print("Enter your login:");
						String loginPermanent = sc.next();
						System.out.print("Enter you password: ");
						int passwordPermanent = sc.nextInt();
							for (int i = 0; i < signIn.size();) {
								if(signIn.get(i).getLogin().equals(loginPermanent) && signIn.get(i).getPassoword() == passwordPermanent) {
									System.out.println("\nLogin with success\n");
									if (horas > 6 && horas < 12) {
										System.out.println("Bom dia, você se logou ao nosso sistema.\n" +
												"Horário: " + d + "\n");
										System.out.println("Now press 0 to exit");
									} else if (horas > 12 && horas < 18) {
										System.out.println("Boa tarde, você se logou ao nosso sistema.\n" +
												"Horário: " + d + "\n");
										System.out.println("Now press 0 to exit");
									} else if (horas > 18 && horas < 24) {
										System.out.println("Boa noite, você se logou ao nosso sistema.\n"+
												"Horário: " + d + "\n");
										System.out.println("Now press 0 to exit");
									} else if (horas > 0 && horas < 6) {
										System.out.println("Boa madrugada, você se logou ao nosso sistema."+
												"Horário: " + d + "\n");
										System.out.println("Now press 0 to exit");
									}
									break;
								} else {
									System.out.println("Fail to login\n");
									break;
								}
							}	
					}
					System.out.println("0- Exit\n1- Sign up  \n2- Sign in");
					select = sc.nextInt();
					break;
				}
			} while (select != 0);		
		sc.close();
	}

}


