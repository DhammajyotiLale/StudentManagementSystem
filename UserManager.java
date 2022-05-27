package sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class UserManager {

	public static void operations() throws FileNotFoundException, IOException, ClassNotFoundException {
		Scanner scanner = new Scanner(System.in);
		// Verification verification = new Verification();
		
		
		File file1 = new File("StudentsDetails.txt");
		User_Verification user_verification = new User_Verification();
		ArrayList<StudentData> list1 = new ArrayList<StudentData>();
		ObjectOutputStream out1 = null;
		ObjectInputStream in1 = null;
		ListIterator<StudentData> iterator = null;

		char ch;
		do {
			System.out.println("Welcome to User page");
			System.out.println("1:View student Details");
			System.out.println("2. Exit");
			
			int userOption = scanner.nextInt();
			switch (userOption) {
			case 1:
				System.out.println("1:View student Details");
				System.out.println("*******Hi User! Welcome to the student management system********");
				in1 = new ObjectInputStream(new FileInputStream(file1));
				list1 = (ArrayList<StudentData>) in1.readObject();
				in1.close();
				iterator = list1.listIterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				break;

			
				
			default: System.out.println("enter the valid option");
			  break;
			  
			case 2:
			
				System.exit(0);
			
			
				
				break;
				
			}
			System.out.println("do you wish to continue then press y if not press n");
			ch = scanner.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

	}

}

