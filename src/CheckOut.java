import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean done = true;
        double itemPrice = 0;
        double total = 0;
        boolean userAnswer = true;
        do {//do block until condition met
          itemPrice = SafeInput.getRangedDouble(in,"What is the price of your item?",.50, 9.99);//call method, output to user, range of .5 - 9.99
          in.nextLine();
         total = itemPrice + total ;//create total by adding item price together and saving as total
         done = SafeInput.getYNConfirm(in, "Do you have anymore items?");//call method , output to user, store input in done
            System.out.println("your total price is");//output to user
            System.out.printf("$%,.2f",total );//output to user


        }while (done);


    }
}
