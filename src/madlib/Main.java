/**
 * Name: Rian 
 * Date: Feb. 20, 2020
 * Project: RianMadLib
 * Package: madlib
 * File: Main.java
 * Description: Sample madlib program.
 */
package madlib;

import java.util.Scanner;

/**
 * @author s254406
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Get variables
		System.out.println("Give me a name:");
		String name1=in.nextLine();
		System.out.println("Give me an adjective:");
		String adj1=in.nextLine();
		System.out.println("Give me another adjective:");
		String adj2=in.nextLine();
		System.out.println("Give me a noun:");
		String noun1=in.nextLine();
		System.out.println("Give me a verb that does not end with -ing:");
		String verb1=in.nextLine();
		System.out.println("Give me an adjective:");
		String adj3=in.nextLine();
		System.out.println("Give me a verb that does not end with -ing:");
		String verb2=in.nextLine();
		System.out.println("Give me an adjective:");
		String adj4=in.nextLine();
		System.out.println("Give a number:");
		int num1=in.nextInt();
		in.nextLine();
		System.out.println("Give me a verb that does not end with -ing:" );
		String verb3=in.nextLine();
		System.out.println("Give me an adjective:");
		String adj5=in.nextLine();
		System.out.println("Give me a plural noun:");
		String plnoun1=in.nextLine();
		System.out.println("Give me a verb that does not end with -ing:" );
		String verb4=in.nextLine();
		System.out.println("Name someone in this room:");
		String name2=in.nextLine();
		
	
		
		//Write out the story
		System.out.println("Hey "+name1+"!");
		System.out.println("I just want to let you know ");
		System.out.println("you are the "+adj1+" and most "+adj2+" "+noun1+" I know.");
		System.out.println("I really want to meet up and "+verb1+" all night");
		System.out.println("and make "+adj3+" memories that we can "+verb2+"");
		System.out.println("you just make me a "+adj4+" person overall.");
		System.out.println("The thought of you makes me "+num1+" times happier,");
		System.out.println("will you "+verb3+" with me?");
		System.out.println("Don't let your "+adj5+" "+plnoun1+" "+verb4+" you into your decision");
		System.out.println("Yours forever,"+name2+"");

	}	
}
