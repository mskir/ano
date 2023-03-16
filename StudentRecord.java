import java.io.*;
import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) throws IOException {

    String studentNo, degree, yearLevel, firstName, middleName, lastName, gender;
    double prelimGrade, midtermGrade, finalGrade;
    double finalTermGrade;
    String userChoice;
    String filename;
    
    Scanner input = new Scanner(System.in);

    System.out.println("     ***************** Student Record Management ******************");
    System.out.println("            =============== FINAL PROJECT ================\n     ");
    System.out.println("                      [N] New Student Record                ");
    System.out.println("                      [O] Open Student Record               ");
    System.out.println("                             [X] Exit\n                       ");
    System.out.print("                         Enter your choice: ");
    userChoice = input.nextLine();

    if(userChoice.equalsIgnoreCase("N")) {
        System.out.print("Student No: ");
        studentNo = input.nextLine();
        System.out.print("Degree: ");
        degree = input.nextLine();
        System.out.print("Year Level: ");
        yearLevel = input.nextLine();
        System.out.print("First Name: ");
        firstName = input.nextLine();
        System.out.print("Middle Name: ");
        middleName = input.nextLine();
        System.out.print("Last Name: ");
        lastName = input.nextLine();
        System.out.print("Gender: ");
        gender = input.nextLine();
        System.out.print("Prelim Grade: ");
        prelimGrade = input.nextDouble();
        System.out.print("midterm grade: ");
        midtermGrade = input.nextDouble();
        System.out.print("final grade: ");
        finalGrade = input.nextDouble();

        finalTermGrade = (prelimGrade + midtermGrade + finalGrade) / 3;

        System.out.println("Final Term Grade: " + finalTermGrade);

        System.out.print("Set Filename: ");
        filename = input.next();

        FileWriter fw = new FileWriter(filename);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("************ Student Record *************\n");
        bw.write("Student No: " + studentNo + "\n");
        bw.write("Degree: " + degree + "\n");
        bw.write("Year Level: " + yearLevel + "\n");
        bw.write("First Name: " + firstName + "\n");
        bw.write("Middle Name: " + middleName + "\n");
        bw.write("Last Name: " + lastName + "\n");
        bw.write("Gender: " + gender + "\n");
        bw.write("Prelim Grade: " + prelimGrade + "\n");
        bw.write("midterm Grade: " + midtermGrade + "\n");
        bw.write("final grade: " + finalGrade + "\n");
        bw.close();
        
        System.out.println("New File is successfully created.");
        System.out.println("Press [Q] Quit [C] Continue\n");
        System.out.print("Enter your choice: ");
        userChoice = input.nextLine();
    }
    
    if(userChoice.equalsIgnoreCase("O")) {
        System.out.print("Enter your Filename: ");
        userChoice = input.nextLine();

        FileReader fw = new FileReader(userChoice);
        BufferedReader bw = new BufferedReader(fw);
        System.out.println(bw.readLine());
        System.out.println(bw.readLine());
        System.out.println(bw.readLine());
        System.out.println(bw.readLine());
        System.out.println(bw.readLine());
        System.out.println(bw.readLine());
        System.out.println(bw.readLine());
        System.out.println(bw.readLine());
        System.out.println(bw.readLine());
        System.out.println(bw.readLine());
        System.out.println(bw.readLine());
        bw.close();

    }
    
}
}

