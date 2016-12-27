package programmes;

import java.util.Scanner;

public class Assignment34 {class student{
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create a student result processing system.
		//Display the details and result of at-least three students.
		boolean continueLoop;
		do{
		System.out.println("enter your roll_no");
		int roll_no;
		Scanner roll=new Scanner(System.in);
		roll_no = roll.nextInt();
		
		String name;
		System.out.println("enter your name");
		Scanner input=new Scanner(System.in);
		name=input.nextLine();
		
		String email_id;
		System.out.println("enter your email id");
		Scanner email=new Scanner(System.in);
		email_id=email.nextLine();
		
		int marks;
		System.out.println("enter the marks obtained");
		Scanner marksReader=new Scanner(System.in);
		marks=marksReader.nextInt();
		
		String grade=marks>60?" A":marks<40?"F":"B";
		System.out.println("name: " +name+ " roll_no: " +roll_no+ " email_id: " +email_id+ " grade: " +grade);
		
		System.out.println("Do you wish to continue..");
		Scanner ji=new Scanner(System.in);
		continueLoop =ji.nextBoolean();
		
		}
		while(continueLoop);
		System.out.println("thank you");
		
		
	}
		
	}


