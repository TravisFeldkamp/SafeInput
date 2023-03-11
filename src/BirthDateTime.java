import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int yearBorn = 0 ;
        int monthBorn = 0 ;
        int dayBorn = 0 ;
        int hourBorn = 0 ;
        int minuteBorn = 0;

        yearBorn = SafeInput.getRangedInt(in,"Input the year you were born  ",1950,2010);//ask user for input between 1950- 2010
         monthBorn = SafeInput.getRangedInt(in,"Input the month you were born ", 1,12  );//ask user for input between 1- 12
         switch (monthBorn){//create switch to test for different days in each month
             case 1://months with 31 days
                 case 3:
                     case 5:
                         case 7:
                             case 8:
                                case 10:
                                    case 12:
                dayBorn = SafeInput.getRangedInt(in, "Enter the day you were born", 1 , 31);
                    break;

                case 2://month with 28 days
                dayBorn = SafeInput.getRangedInt(in, "Enter the day you were born", 1 , 28);
                    break;
                    case 4://month with 30 days
                        case 6:
                            case 9:
                                case 11:
                 dayBorn = SafeInput.getRangedInt(in, "Enter the day you were born", 1 , 30);
                    break;
         }
         hourBorn = SafeInput.getRangedInt(in, "Enter the hour you were born ", 1 ,24);//output to user for int between 1-24
         minuteBorn =SafeInput.getRangedInt(in,"Enter the minute you were born ",1 , 59);//output to user for in between 1-59
        System.out.println("You were born in " + yearBorn ); //output to user
        System.out.println("You were born in month " + monthBorn);//output to user
        System.out.println("You were born on day " + dayBorn);//output to user
        System.out.println("You were born on hour " + hourBorn);//output to user
        System.out.println("You were born on minute " +minuteBorn);//output to user


    }
}
