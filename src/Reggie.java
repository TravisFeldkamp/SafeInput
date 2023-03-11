import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);// new scanner in
        String SSN = "";
        String ucId = "";
        String menuChoice = "";
        SSN = SafeInput.getRegExString(in,"Enter your SSN" ,"\\d{3}-\\d{2}-\\d{4}");//call method, output to user, set parameters for input
        ucId = SafeInput.getRegExString(in,"Enter your M number","(M|m)\\d{5}");//call method, output to user, set parameters for input
        menuChoice = SafeInput.getRegExString(in,"Would you like to open, save, view, quit ","[OoSsVvQq]");// call method, output to user, set parameters for input


    }
}
