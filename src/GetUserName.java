import java.util.Scanner;
        public class GetUserName
        {
            public static void main(String[] args)
            {
                Scanner in = new Scanner(System.in);//import scanner
                String firstName = "";
                String lastName = "";
                firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");//output to user for first name, save input as firstName
                lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");//output to user for last name, save input as lastName
                System.out.println("\nYour full name is: " + firstName + " " + lastName);//output to user
            }
        }




