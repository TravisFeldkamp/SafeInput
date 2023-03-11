import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favInteger = 0;
        double favDouble = 0;

        favInteger = SafeInput.getInt(in,"Enter your favorite integer");//call method, output to user, save input to variable

        favDouble= SafeInput.getDouble(in,"Enter your favorite double");//call method, output to user, save input to variable


        System.out.println("Your favorite integer is " + favInteger);//output to user
        System.out.println("Your favorite double is " + favDouble);//output to user


    }
}
