import java.util.Scanner;
public class studentsmarks {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?:");
        String name= input.nextLine();

        int [] marks= new int[3];
        System.out.println("Enter the first marks:");
        marks[0] = input.nextInt();

        System.out.println("Enter the second marks:");
        marks[1] =input.nextInt();

        System.out.println("Enter the third marks:");
        marks[2] =input.nextInt();

        System.out.println("the student name:" +name);
        int sum=marks[0]+ marks[1] + marks[2];
        System.out.println("the sum is " + sum);
        double average = sum/3;
        System.out.println("the average is " + average);

        input.close ();
    }
}