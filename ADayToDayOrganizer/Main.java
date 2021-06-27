import java.io.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import UserInformation.*;
import Activities.DailyActivities.*;
import Activities.HealthManagementActivities.*;
import Activities.TransactionActivities.*;
import Activities.AcademicActivities.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        File Users_Information = new File("Users Information.txt");
        Users_Information.createNewFile();
        File Log_In_History = new File("Log In History.txt");
        Log_In_History.createNewFile();
        File Premium_Subscription_Membership_Numbers = new File("Premium Subscription Memberships Numbers.txt");
        Premium_Subscription_Membership_Numbers.createNewFile();
        File Earned_Amount = new File("jEarned Amount.txt");
        Earned_Amount.createNewFile();
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||  /\\\\    /\\\\    /\\\\    /\\\\    /\\\\    /\\\\    /\\\\    /\\\\    /\\\\    /\\\\    /\\\\    /\\\\    /\\\\    /\\\\    ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| /  \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\\\  /||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||/    \\\\/    \\\\/    \\\\/    \\\\/    \\\\/    \\\\/    \\\\/    \\\\/    \\\\/    \\\\/    \\\\/    \\\\/    \\\\/    \\\\/ ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||                             A  D A Y - T O - D A Y  O R G A N I Z E R                              ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||             M A K E  L I F E  E A S Y ,  S I M P L E  &  M O R E  D I S C I P L I N E D            ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||\\\\    /\\\\    /\\\\    /\\\\    /\\\\    /\\\\    /\\\\    /\\\\    /\\\\    /\\\\    /\\\\    /\\\\    /\\\\    /\\\\    /\\\\||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\\\  /  \\||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||  \\\\/    \\\\/    \\\\/    \\\\/    \\\\/    \\\\/    \\\\/    \\\\/    \\\\/    \\\\/    \\\\/    \\\\/    \\\\/    \\\\/    ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||                                                                                                    ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| D O  Y O U  W A N T  T O ( E N T E R  T H E  S E R I A L  N U M B E R ) :                          ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| 1 .  S I G N  U P                                                                                  ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| 2 .  L O G  I N                                                                                    ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.print("\t\t\t\t\t\t\t\t\t\t|| -----|>  ");
        String choice = scanner.next();
        if (!choice.equals("1") && !choice.equals("2")) {
            do {
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  S E R I A L  N U M B E R  1  O R  2 . . .                                        ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  A G A I N . . .                                                            ||\t\t\t\t\t\t\t\t\t\t");
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| -----|>  ");
                choice = scanner.next();
            } while (!choice.equals("1") && !choice.equals("2"));
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .  ");
        char nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
        do {
            if (nextPageChoice != 's') {
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .  ");
                nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
            }
            else
                cls();
        } while (nextPageChoice != 's');
        switch (choice) {
            case "1" -> {
                signUp();
            }
            case "2" -> {
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                                            L O G  I N                                              ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                                                                                                    ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                             E N T E R  Y O U R  I N F O R M A T I O N                              ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E - M A I L :  ");
                String electronicMail = scanner.next().trim().toLowerCase();
                if (!electronicMail.equals("admin")) {
                    do {
                        if (electronicMail.indexOf("@") <= 0) {
                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  E - M A I L  A D D R E S S . . .                                          ||\t\t\t\t\t\t\t\t\t\t");
                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  A G A I N . . .                                                            ||\t\t\t\t\t\t\t\t\t\t");
                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E - M A I L :  ");
                            electronicMail = scanner.next().trim();
                        } else if (electronicMail.indexOf(".com") <= 0) {
                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  E - M A I L  A D D R E S S . . .                                          ||\t\t\t\t\t\t\t\t\t\t");
                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  A G A I N . . .                                                            ||\t\t\t\t\t\t\t\t\t\t");
                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E - M A I L :  ");
                            electronicMail = scanner.next().trim();
                        } else if (electronicMail.indexOf(".com") < electronicMail.indexOf("@")) {
                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  E - M A I L  A D D R E S S . . .                                          ||\t\t\t\t\t\t\t\t\t\t");
                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  A G A I N . . .                                                            ||\t\t\t\t\t\t\t\t\t\t");
                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E - M A I L :  ");
                            electronicMail = scanner.nextLine().trim();
                        } else if (electronicMail.indexOf(".com") == (electronicMail.indexOf("@") + 1)) {
                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  E - M A I L  A D D R E S S . . .                                          ||\t\t\t\t\t\t\t\t\t\t");
                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  A G A I N . . .                                                            ||\t\t\t\t\t\t\t\t\t\t");
                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E - M A I L :  ");
                            electronicMail = scanner.next().trim();
                        } else
                            break;
                    } while (electronicMail.indexOf("@") <= 0 || electronicMail.indexOf(".com") <= 0 || electronicMail.indexOf(".com") == (electronicMail.indexOf("@") + 1) || electronicMail.indexOf(".com") == (electronicMail.indexOf("@") + 1));
                }
                FileWriter usersElectronicMailFileWriter = new FileWriter(Log_In_History, true);
                usersElectronicMailFileWriter.write("E - M A I L :  " + electronicMail + "\r\n");
                usersElectronicMailFileWriter.flush();
                usersElectronicMailFileWriter.close();
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P A S S W O R D :  ");
                scanner.nextLine();
                String password = scanner.nextLine().trim();
                FileWriter usersPasswordsFileWriter = new FileWriter(Log_In_History, true);
                usersPasswordsFileWriter.write("P A S S W O R D :  " + password + "\r\n");
                usersPasswordsFileWriter.flush();
                usersPasswordsFileWriter.close();
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                                  L O G  I N  S U C C E S S F U L L                                 ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
                nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                do {
                    if (nextPageChoice != 's')
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                    else
                        cls();
                } while (nextPageChoice != 's');
                if(electronicMail.equals("admin") && password.equals("admin")) {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||                                   A D M I N  P A N E L                                             ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| 1 .  A L L  T H E  U S E R S  I N F O R M A T I O N                                                ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| 2 .  L O G  I N  H I S T O R Y                                                                     ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| 3 .  P R E M I U M  S U B S C R I P T I O N  M E M B E R S H I P  N U M B E R                      ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| 4 .  E A R N E D  A M O U N T                                                                      ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| 5 .  A D D  A N  U S E R                                                                           ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| 6 .  E X I T                                                                                       ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| -----|>  ");
                    do {
                        choice = scanner.next();
                        switch (choice) {
                            case "1" -> {
                                FileReader usersInformation=new FileReader("Users Information.txt");
                                int i;
                                while((i=usersInformation.read())!=-1)
                                    System.out.print((char)i);
                                usersInformation.close();
                            }
                            case "2" -> {
                                FileReader fr=new FileReader("UserInformation\\Log In History.txt");
                                int i;
                                while((i=fr.read())!=-1)
                                    System.out.print((char)i);
                                fr.close();
                            }
                            case "3" -> {
                                FileReader premiumSubscriptionMembershipNumbersFileReader=new FileReader("UserInformation\\Premium Subscription Memberships Numbers.txt");
                                int i;
                                long premiumSubscriptionMembershipNumbers = 0;
                                while((i=premiumSubscriptionMembershipNumbersFileReader.read())!=-1) {
                                    if ((char)i == '1')
                                        ++premiumSubscriptionMembershipNumbers;
                                }
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 3 .  P R E M I U M  S U B S C R I P T I O N  M E M B E R S H I P  N U M B E R :  " + premiumSubscriptionMembershipNumbers);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");

                                premiumSubscriptionMembershipNumbersFileReader.close();
                            }
                            case "4" -> {
                                FileReader earnedAmountFileReader=new FileReader("Earned Amount.txt");
                                int i;
                                double earnedAmount = 0;
                                while((i=earnedAmountFileReader.read())!=-1) {
                                    if ((char)i == '5')
                                        earnedAmount = earnedAmount + 5;
                                    else if ((char)i == '2')
                                        earnedAmount = earnedAmount + 20;
                                    else if ((char)i == '1')
                                        earnedAmount = earnedAmount + 180;
                                }
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 3 .  P R E M I U M  S U B S C R I P T I O N  M E M B E R S H I P  N U M B E R :  " + earnedAmount);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                            }
                            case "5" -> {
                                signUp();
                            }
                        }
                    } while (!choice.equals("6"));
                }
            }
        }
        String activitiesChoice;
        do {
            System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t||                                              H O M E                                               ||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  W H A T  Y O U  W A N T  T O  O R G A N I Z E  &  M A N A G E ( E N T E R  T H E        ||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t|| S E R I A L  N U M B E R ) :                                                                        ||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t|| 1 .  D A I L Y  A C T I V I T I E S                                                                ||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t|| 2 .  H E A L T H  M A N A G E M E N T  A C T I V I T I E S                                         ||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t|| 3 .  T R A N S A C T I O N  A C T I V I T I E S                                                    ||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t|| 4 .  A C A D E M I C  A C T I V I T I E S                                                          ||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t|| 5 .  E X I T                                                                                        ||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
            activitiesChoice = scanner.next();
            var booleanActivitiesChoice = !activitiesChoice.equals("1") && !activitiesChoice.equals("2") && !activitiesChoice.equals("3") && !activitiesChoice.equals("4") && !activitiesChoice.equals("5");
            do {
                if (booleanActivitiesChoice) {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  S E R I A L  N U M B E R  1  O R  2  O R  3  O R  4  OR  5 . . .                 ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R A G A I N . . .                                                             ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| -----> ");
                    activitiesChoice = scanner.next();
                }
            } while (booleanActivitiesChoice);
            System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
            System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
            nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
            do {
                if (nextPageChoice != 's') {
                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                    nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                }
                else
                    cls();
            } while (nextPageChoice != 's');
            switch (activitiesChoice) {
                case "1" -> {
                    DailyActivities dailyActivities = new DailyActivities();
                    do {
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||                                       D A I L Y  A C T I V I T I E S                               ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  W H A T  Y O U  W A N T  T O  K N O W ( E N T E R  T H E  S E R I A L  N U M B E R ) :  ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| 1 .  T H E  N U M B E R  O F  C A L O R I E S  B U R N E D  O N  A N  A V E R A G E  D A Y         ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| 2 .  H O W  M U C H  C A L O R I E S  Y O U  H A V E  S P E N D  S O  F A R                        ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| 3 . B A C K                                                                                        ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                        choice = scanner.next();
                        if (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
                            do {
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  S E R I A L  N U M B E R  1  O R  2  O R  3 . . .                                ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R A G A I N . . .                                                             ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                            } while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3"));
                        }
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
                        nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                        do {
                            if (nextPageChoice != 's') {
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                                nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                            } else
                                cls();
                        } while (nextPageChoice != 's');
                        switch (choice) {
                            case "1" -> {
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||                                       D A I L Y  A C T I V I T I E S                               ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||       T H E  N U M B E R  O F  C A L O R I E S  B U R N E D  O N  A N  A V E R A G E  D A Y        ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                String gender;
                                do {
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  G E N D E R ( M A L E / F E M A L E ) :  ");
                                    gender = scanner.next().trim().toLowerCase();
                                    if (gender.equals("male") || gender.equals("female"))
                                        break;
                                    else {
                                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R   M A L E   O R  F E M A L E . . .");
                                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R   A G A I N . . . ");
                                    }
                                } while (true);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  H E I G H T ( I N   F E E T ) :  ");
                                String heightInString = scanner.next();
                                double height = Double.parseDouble(heightInString);
                                dailyActivities.setHeight(height);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  W E I G H T ( I N    K I L O G R A M S ) :  ");
                                String weightInString = scanner.next();
                                double weight = Double.parseDouble(weightInString);
                                dailyActivities.setWeight(weight);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  A G E ( I N   Y E A R S ) :  ");
                                String ageInString = scanner.next();
                                double age = Double.parseDouble(ageInString);
                                dailyActivities.setAge(age);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| I D E N T I F Y   Y O U R   A C T I V I T Y   L E V E L  I N  A  W E E K  F R O M  T H E           ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| F O L L O W I N G ( E N T E R  T H E  S E R I A L  N U M B E R ) :                                 ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 1 .  Y O U  A R E  A  P E R S O N  W H O  D O E S  L I T T L E  T O  N O  E X E R C I S E  I N  A  ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||      W E E K                                                                                       ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 2 .  Y O U  A R E  A  S L I G H T L Y  A C T I V E  P E R S O N  W H O  D O E S  L I G H T         ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||      E X E R C I S E  1 - 3  D A Y S  A  W E E K                                                   ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 3 .  A  M O D E R A T E L Y  A C T I V E  P E R S O N  W H O  P E R F O R M S  M O D E R A T E   ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||      E X E R C I S E  3 - 5  D A Y S  A  W E E K                                                   ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 4 .  A  V E R Y  A C T I V E  P E R S O N  W H O   E X E R C I S E S  H A R D  6 - 7  D A Y S  A   ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||      W E E K                                                                                       ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 5 .  A N  E X T R A  A C T I V E  P E R S O N  W H O  E I T H E R  H A S  A  P H Y S I C A L L Y   ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||      D E M A N D  I N G  J O B  O R  H A S  A  P A R T I C U L A R L Y  C H A L L E N G I N G      ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||      E X E R C I S E  R O U T I N E                                                                ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                byte activityLevelInAWeekChoice = scanner.nextByte();
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
                                nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                                do {
                                    if (nextPageChoice != 's') {
                                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                                        nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                                    }
                                    else
                                        cls();
                                } while (nextPageChoice != 's');
                                switch (activityLevelInAWeekChoice) {
                                    case 1 -> dailyActivities.setActivityLevelInAWeek(1.2);
                                    case 2 -> dailyActivities.setActivityLevelInAWeek(1.37);
                                    case 3 -> dailyActivities.setActivityLevelInAWeek(1.55);
                                    case 4 -> dailyActivities.setActivityLevelInAWeek(1.725);
                                    case 5 -> dailyActivities.setActivityLevelInAWeek(1.9);
                                }
                                dailyActivities.showTheNumberOfCaloriesBurned0nAnAverageDay();
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
                                nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                                do {
                                    if (nextPageChoice != 's') {
                                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                                        nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                                    }
                                    else
                                        cls();
                                } while (nextPageChoice != 's');
                                break;
                            }
                            case "2" -> {
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||                                       D A I L Y  A C T I V I T I E S                               ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||                H O W  M U C H  C A L O R I E S  Y O U  H A V E  S P E N D  S O  F A R              ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                String gender;
                                do {
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  G E N D E R ( M A L E / F E M A L E ) :  ");
                                    gender = scanner.next().trim().toLowerCase();
                                    if (gender.equals("male") || gender.equals("female"))
                                        break;
                                    else {
                                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R   M A L E   O R  F E M A L E . . .");
                                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R   A G A I N . . . ");
                                    }
                                } while (true);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  H E I G H T ( I N   F E E T ) :  ");
                                String heightInString = scanner.next();
                                double height = Double.parseDouble(heightInString);
                                dailyActivities.setHeight(height);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  W E I G H T ( I N    K I L O G R A M S ) :  ");
                                String weightInString = scanner.next();
                                double weight = Double.parseDouble(weightInString);
                                dailyActivities.setWeight(weight);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  A G E ( I N   Y E A R S ) :  ");
                                String ageInString = scanner.next();
                                double age = Double.parseDouble(ageInString);
                                dailyActivities.setAge(age);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  W H I C H  A C T I V I T I E S  Y O U  H A V E  D O N E  S O  F A R ( E N T E R  T H E  ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| S E R I A L  N U M B E R ) :                                                                       ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 1 .  W A L K I N G  A T  4 . 5  m p h           || 1 0 .  C O O K I N G                            ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 2 .  C L E A N I N G  T H E  G U T T E R S      || 1 1 .  S I T T I N G  I N  M E E T I N G S      ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 3 .  M O W I N G  T H E  L A W N                || 1 2 .  L I G H T  O F F I C E  W O R K          ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 4 .  G A R D E N I N G                          || 1 3 .  C O M P U T E R  W O R K                 ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 5 .  W A S H I N G  T H E  C A R                || 1 4 .  S T A N D I N G  I N  L I N E            ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 6 .  W A L K I N G  A T  4  m p h               || 1 5 .  R E A D I N G                            ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 7 .  W A L K I N G  A T  3 . 5  m p h           || 1 6 .  W A T C H I N G  T E L E V I S I O N     ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 8 .  P L A Y I N G  W I T H  T H E  K I D S (   || 1 7 .  S L E E P I N G                          ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||      M O D E R A T E  A C T I V I T Y )         ||                                                 ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 9 .  G R O C E R Y  S H O P P I N G ( W I T H   || 1 8 .  E X I T                                  ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||      C A R T S )                                ||                                                 ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                String dailyActivityChoice;
                                do {
                                    dailyActivityChoice = scanner.next().trim();
                                    do {
                                        if (Double.parseDouble(dailyActivityChoice) < 1 || Double.parseDouble(dailyActivityChoice) > 18) {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  S E R I A L  N U M B E R  1  T O  1 8 . . .                                      ||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R A G A I N . . .                                                             ||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                            dailyActivityChoice = scanner.next().trim();
                                        }
                                    } while (Double.parseDouble(dailyActivityChoice) < 1 || Double.parseDouble(dailyActivityChoice) > 18);

                                    switch (dailyActivityChoice) {
                                        case "1", "2" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  T I M E  T H A T  Y O U  H A V E  S P E N D  F O R  T H I S  A C T I V I T Y ( IN||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| M I N U T E S ) :                                                                                  ||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                            double timeSpent = scanner.nextDouble();
                                            dailyActivities.calculateTotalCaloriesBurnt(0.04, timeSpent);
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                        }
                                        case "3", "4", "5", "6" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  T I M E  T H A T  Y O U  H A V E  S P E N D  F O R  T H I S  A C T I V I T Y ( IN||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| M I N U T E S ) :                                                                                  ||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                            double timeSpent = scanner.nextDouble();
                                            dailyActivities.calculateTotalCaloriesBurnt(0.036, timeSpent);
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                        }
                                        case "7", "8" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  T I M E  T H A T  Y O U  H A V E  S P E N D  F O R  T H I S  A C T I V I T Y ( IN||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| M I N U T E S ) :                                                                                  ||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                            double timeSpent = scanner.nextDouble();
                                            dailyActivities.calculateTotalCaloriesBurnt(0.032, timeSpent);
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                        }
                                        case "9" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  T I M E  T H A T  Y O U  H A V E  S P E N D  F O R  T H I S  A C T I V I T Y ( IN||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| M I N U T E S ) :                                                                                  ||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                            double timeSpent = scanner.nextDouble();
                                            dailyActivities.calculateTotalCaloriesBurnt(0.028, timeSpent);
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                        } case "10" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  T I M E  T H A T  Y O U  H A V E  S P E N D  F O R  T H I S  A C T I V I T Y ( IN||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| M I N U T E S ) :                                                                                  ||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                            double timeSpent = scanner.nextDouble();
                                            dailyActivities.calculateTotalCaloriesBurnt(0.02, timeSpent);
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                        }
                                        case "11" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  T I M E  T H A T  Y O U  H A V E  S P E N D  F O R  T H I S  A C T I V I T Y ( IN||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| M I N U T E S ) :                                                                                  ||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                            double timeSpent = scanner.nextDouble();
                                            dailyActivities.calculateTotalCaloriesBurnt(0.01306666667, timeSpent);
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                        }
                                        case "12" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  T I M E  T H A T  Y O U  H A V E  S P E N D  F O R  T H I S  A C T I V I T Y ( IN||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| M I N U T E S ) :                                                                                  ||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                            double timeSpent = scanner.nextDouble();
                                            dailyActivities.calculateTotalCaloriesBurnt(0.012, timeSpent);
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                        }
                                        case "13" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  T I M E  T H A T  Y O U  H A V E  S P E N D  F O R  T H I S  A C T I V I T Y ( IN||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| M I N U T E S ) :                                                                                  ||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                            double timeSpent = scanner.nextDouble();
                                            dailyActivities.calculateTotalCaloriesBurnt(0.01093333333, timeSpent);
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                        }
                                        case "14" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  T I M E  T H A T  Y O U  H A V E  S P E N D  F O R  T H I S  A C T I V I T Y ( IN||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| M I N U T E S ) :                                                                                  ||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                            double timeSpent = scanner.nextDouble();
                                            dailyActivities.calculateTotalCaloriesBurnt(0.01013333333, timeSpent);
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                        }
                                        case "15" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  T I M E  T H A T  Y O U  H A V E  S P E N D  F O R  T H I S  A C T I V I T Y ( IN||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| M I N U T E S ) :                                                                                  ||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                            double timeSpent = scanner.nextDouble();
                                            dailyActivities.calculateTotalCaloriesBurnt(0.009066666667, timeSpent);
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                        }
                                        case "16" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  T I M E  T H A T  Y O U  H A V E  S P E N D  F O R  T H I S  A C T I V I T Y ( IN||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| M I N U T E S ) :                                                                                  ||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                            double timeSpent = scanner.nextDouble();
                                            dailyActivities.calculateTotalCaloriesBurnt(0.006133333330, timeSpent);
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                        }
                                        case "17" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  T I M E  T H A T  Y O U  H A V E  S P E N D  F O R  T H I S  A C T I V I T Y ( IN||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| M I N U T E S ) :                                                                                  ||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                            double timeSpent = scanner.nextDouble();
                                            dailyActivities.calculateTotalCaloriesBurnt(0.00566666667, timeSpent);
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                        }
                                        case "18" -> {
                                            dailyActivities.showTheTotalCaloriesBurnt();
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
                                            nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                                            do {
                                                if (nextPageChoice != 's') {
                                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                                                    nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                                                }
                                                else
                                                    cls();
                                            } while (nextPageChoice != 's');
                                        }
                                    }
                                } while (!dailyActivityChoice.equals("18"));
                            }
                        }
                    } while (!choice.equals("3"));
                }
                case "2" -> {
                    HealthManagementActivities healthManagementActivities = new HealthManagementActivities();
                    do {
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  W H A T  Y O U  W A N T  T O  D O ( E N T E R  T H E  S E R I A L  N U M B E R ) :      ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| 1 .  C A L C U L A T E  B  M  R                                                                    ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| 2 .  C A L C U L A T E  B  M  I                                                                    ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| 3 .  C A L C U L A T E  H O W  M U C H  C A L O R I E  Y O U  N E E D  D A I L Y  F O R            ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||      M A I N T A I N I N G  Y O U R  W E I G H T                                                   ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| 4 .  C A L C U L A T E  H O W  M U C H  C A L O R I E  Y O U  N E E D  D A I L Y  F O R            ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||      L O O S I N G  O N E  P O U N D  P E R  W E E K                                               ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| 5 .  C A L C U L A T E  H O W  M U C H  C A L O R I E  Y O U  H A V E  T A K E N  S O  F A R       ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| 6 .  E X I T                                                                                       ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                        choice = scanner.next();
                        if (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4") && !choice.equals("5") && !choice.equals("6")) {
                            do {
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  S E R I A L  N U M B E R  1  O R  2  O R  3  O R  4  0 R  5                      ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R A G A I N . . .                                                             ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                choice = scanner.next();
                            } while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4") && !choice.equals("5") && !choice.equals("6"));
                        }

                        switch (choice) {
                            case "1" -> {
                                String gender;
                                do {
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  G E N D E R ( M A L E / F E M A L E ) :  ");
                                    gender = scanner.next().trim().toLowerCase();
                                    if (gender.equals("male") || gender.equals("female"))
                                        break;
                                    else {
                                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R   M A L E   O R  F E M A L E . . .");
                                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R   A G A I N . . . ");
                                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  G E N D E R ( M A L E / F E M A L E ) :  ");
                                    }
                                } while (true);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  H E I G H T ( I N   F E E T ) :  ");
                                String heightInString = scanner.next();
                                double height = Double.parseDouble(heightInString);
                                healthManagementActivities.setHeight(height);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  W E I G H T ( I N    K I L O G R A M S ) :  ");
                                String weightInString = scanner.next();
                                double weight = Double.parseDouble(weightInString);
                                healthManagementActivities.setWeight(weight);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  A G E ( I N   Y E A R S ) :  ");
                                String ageInString = scanner.next();
                                double age = Double.parseDouble(ageInString);
                                healthManagementActivities.setAge(age);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                healthManagementActivities.showBMR();
                            }
                            case "2" -> {
                                String gender;
                                do {
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  G E N D E R ( M A L E / F E M A L E ) :  ");
                                    gender = scanner.next().trim().toLowerCase();
                                    if (gender.equals("male") || gender.equals("female"))
                                        break;
                                    else {
                                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R   M A L E   O R  F E M A L E . . .");
                                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R   A G A I N . . . ");
                                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  G E N D E R ( M A L E / F E M A L E ) :  ");
                                    }
                                } while (true);
                                healthManagementActivities.setGender(gender);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  H E I G H T ( I N   F E E T ) :  ");
                                String heightInString = scanner.next();
                                double height = Double.parseDouble(heightInString);
                                healthManagementActivities.setHeight(height);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  W E I G H T ( I N    K I L O G R A M S ) :  ");
                                String weightInString = scanner.next();
                                double weight = Double.parseDouble(weightInString);
                                healthManagementActivities.setWeight(weight);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  A G E ( I N   Y E A R S ) :  ");
                                String ageInString = scanner.next();
                                double age = Double.parseDouble(ageInString);
                                healthManagementActivities.setAge(age);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                healthManagementActivities.showBMI();
                            }
                            case "3" -> {
                                String gender;
                                do {
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  G E N D E R ( M A L E / F E M A L E ) :  ");
                                    gender = scanner.next().trim().toLowerCase();
                                    if (gender.equals("male") || gender.equals("female"))
                                        break;
                                    else {
                                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R   M A L E   O R  F E M A L E . . .");
                                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R   A G A I N . . . ");
                                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  G E N D E R ( M A L E / F E M A L E ) :  ");
                                    }
                                } while (true);
                                healthManagementActivities.setGender(gender);
                                healthManagementActivities.calculateCalorieNeed();
                            }
                            case "4" -> {
                                String gender;
                                do {
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  G E N D E R ( M A L E / F E M A L E ) :  ");
                                    gender = scanner.next().trim().toLowerCase();
                                    if (gender.equals("male") || gender.equals("female"))
                                        break;
                                    else {
                                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R   M A L E   O R  F E M A L E . . .");
                                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R   A G A I N . . . ");
                                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  G E N D E R ( M A L E / F E M A L E ) :  ");
                                    }
                                } while (true);
                                healthManagementActivities.setGender(gender);
                                healthManagementActivities.calculateCalorieNeedForLoosingWeight();
                            }
                            case "5" -> {
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  W H I C H  F O O D S  Y O U  H A V E  T A K E N   S O  F A R ( E N T E R  T H E         ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| S E R I A L  N U M B E R ) :                                                                       ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 1 .  C H O C O L A T E  M I L K                 || 2 .  L O W  F A T  ( 2 % )  M I L K             ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 3 .  A P P L E                                  || 4 .  B A N A N A                                ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 5 .  D A T E S                                  || 6 .  G R A P E S                                ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 7 .  O R A N G E                                || 8 .  P E A R                                    ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 9 .  P I N E A P P L E                          || 1 0 .  S T R A W B E R R I E S                  ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 1 1 .  W A T E R M E L O N                      || 1 2 .  C A R R O T                              ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 1 3 .  C O R N                                  || 1 4 .  P O T A T O                              ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 1 5 .  S W E E T  P O T A T O                   || 1 6 .  B I S C U I T                            ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 1 7 .  B R E A D ( W H I T E )                  || 1 8 . B R E A D ( W H O L E  W H E A T )        ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 1 9 .  R I C E ( W H I T E )                    || 2 0 . R I C E ( B R O W N )                     ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 2 1 .  E X I T                                                                                     ||\t\t\t\t\t\t\t\t\t\t");
                                do {
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                    choice = scanner.next().trim();
                                    do {
                                        if (Double.parseDouble(choice) < 1 || Double.parseDouble(choice) > 21) {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  S E R I A L  N U M B E R  1  T O  21 . . .                                      ||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R A G A I N . . .                                                             ||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                            choice = scanner.next().trim();
                                        }
                                    } while (Double.parseDouble(choice) < 1 || Double.parseDouble(choice) > 21);
                                    switch (choice) {
                                        case "1" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  A M O U N T ( I N  C U P ) :  ");
                                            double amount = scanner.nextDouble();
                                            healthManagementActivities.calculateCarbohydrateAndCalorie(26, 208, amount);
                                        }
                                        case "2" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  A M O U N T ( I N  C U P ) :  ");
                                            double amount = scanner.nextDouble();
                                            healthManagementActivities.calculateCarbohydrateAndCalorie(12, 121, amount);
                                        }
                                        case "3" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  A M O U N T :  ");
                                            double amount = scanner.nextDouble();
                                            healthManagementActivities.calculateCarbohydrateAndCalorie(21, 81, amount);
                                        }
                                        case "4" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  A M O U N T :  ");
                                            double amount = scanner.nextDouble();
                                            healthManagementActivities.calculateCarbohydrateAndCalorie(27, 105, amount);
                                        }
                                        case "5" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  A M O U N T :  ");
                                            double amount = scanner.nextDouble();
                                            healthManagementActivities.calculateCarbohydrateAndCalorie(0.61, 2.28, amount);
                                        }
                                        case "6" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  A M O U N T :  ");
                                            double amount = scanner.nextDouble();
                                            healthManagementActivities.calculateCarbohydrateAndCalorie(28, 114, amount);
                                        }
                                        case "7" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  A M O U N T :  ");
                                            double amount = scanner.nextDouble();
                                            healthManagementActivities.calculateCarbohydrateAndCalorie(16, 65, amount);
                                        }
                                        case "8" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  A M O U N T :  ");
                                            double amount = scanner.nextDouble();
                                            healthManagementActivities.calculateCarbohydrateAndCalorie(25, 98, amount);
                                        }
                                        case "9" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  A M O U N T ( I N  C U P ) :  ");
                                            double amount = scanner.nextDouble();
                                            healthManagementActivities.calculateCarbohydrateAndCalorie(19, 77, amount);
                                        }
                                        case "10" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  A M O U N T ( I N  C U P ) :  ");
                                            double amount = scanner.nextDouble();
                                            healthManagementActivities.calculateCarbohydrateAndCalorie(11, 45, amount);
                                        }
                                        case "11" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  A M O U N T ( I N  C U P ) :  ");
                                            double amount = scanner.nextDouble();
                                            healthManagementActivities.calculateCarbohydrateAndCalorie(12, 50, amount);
                                        }
                                        case "12" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  A M O U N T :  ");
                                            double amount = scanner.nextDouble();
                                            healthManagementActivities.calculateCarbohydrateAndCalorie(8, 31, amount);
                                        }
                                        case "13" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  A M O U N T ( I N  C U P ) :  ");
                                            double amount = scanner.nextDouble();
                                            healthManagementActivities.calculateCarbohydrateAndCalorie(21, 89, amount);
                                        }
                                        case "14" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  A M O U N T :  ");
                                            double amount = scanner.nextDouble();
                                            healthManagementActivities.calculateCarbohydrateAndCalorie(50, 220, amount);
                                        }
                                        case "15" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  A M O U N T :  ");
                                            double amount = scanner.nextDouble();
                                            healthManagementActivities.calculateCarbohydrateAndCalorie(28, 118, amount);
                                        }
                                        case "16" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  A M O U N T :  ");
                                            double amount = scanner.nextDouble();
                                            healthManagementActivities.calculateCarbohydrateAndCalorie(13, 103, amount);
                                        }
                                        case "17" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  A M O U N T ( I N  S L I C E ) :  ");
                                            double amount = scanner.nextDouble();
                                            healthManagementActivities.calculateCarbohydrateAndCalorie(12, 61, amount);
                                        }
                                        case "18" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  A M O U N T ( I N  S L I C E ) :  ");
                                            double amount = scanner.nextDouble();
                                            healthManagementActivities.calculateCarbohydrateAndCalorie(11, 55, amount);
                                        }
                                        case "19" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  A M O U N T ( I N  C U P ) :  ");
                                            double amount = scanner.nextDouble();
                                            healthManagementActivities.calculateCarbohydrateAndCalorie(50, 223, amount);
                                        }
                                        case "20" -> {
                                            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  A M O U N T ( I N  C U P ) :  ");
                                            double amount = scanner.nextDouble();
                                            healthManagementActivities.calculateCarbohydrateAndCalorie(50, 232, amount);
                                        }
                                        case "21" -> {
                                            healthManagementActivities.showCarbohydrateAndCalorie();
                                            break;
                                        }
                                    }
                                } while (!choice.equals("21"));
                            }
                            case "6" -> {
                                break;
                            }
                        }

                    } while (!choice.equals("6"));
                }
                case "3" -> {
                    TransactionActivities transactionActivities = new TransactionActivities();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||                             T R A N S A C T I O N   A C T I V I T I E S                            ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  M O N E Y  A T  T H E  S T A R T  O F  Y O U R  D A Y :                        ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                    transactionActivities.setMoneyAtTheStartOfYourDay(scanner.next());
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  T R A N S P O R T A T I O N  C O S T :                                         ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                    transactionActivities.setTransportationCost(scanner.next());
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  F O O D  C O S T :                                                             ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                    transactionActivities.setFoodCost(scanner.next());
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  A C C E S S O R I E S  C O S T :                                               ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                    transactionActivities.setAccessoriesCost(scanner.next());
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  O T H E R S  C O S T :                                                         ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                    transactionActivities.setOthers(scanner.next());
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
                    nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                    do {
                        if (nextPageChoice != 's') {
                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                            nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                        }
                        else
                            cls();
                    } while (nextPageChoice != 's');
                    transactionActivities.showInformation();
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
                    nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                    do {
                        if (nextPageChoice != 's') {
                            System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                            nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                        }
                        else
                            cls();
                    } while (nextPageChoice != 's');
                }
                case "4" -> {
                    AcademicActivities academicActivities = new AcademicActivities();
                    do {
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||                               A C A D E M I C  A C T I V I T I E S                                 ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  W H A T  Y O U  W A N T  T O  D O ( E N T E R  T H E  S E R I A L  N U M B E R ) :      ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| 1 .  Y O U R  M A R K S  R E P R O T                                                               ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| 2 .  C A L C U L A T E  G P A                                                                      ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| 3 .  C A L C U L A T E  C G P A                                                                    ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| 4 . B A C K                                                                                        ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                        choice = scanner.next().trim();
                        if (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4")) {
                            do {
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  S E R I A L  N U M B E R  1  O R  2  O R  3  O R  4 . . .                        ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R A G A I N . . .                                                             ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                choice = scanner.next().trim();
                            } while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4"));
                        }
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
                        nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                        do {
                            if (nextPageChoice != 's') {
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                                nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                            }
                            else
                                cls();
                        } while (nextPageChoice != 's');
                        int case1Choice = 0;
                        switch (choice) {
                            case "1" -> {
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||                               A C A D E M I C  A C T I V I T I E S                                 ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||                                   Y O U R  M A R K S  R E P R O T                                  ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  N A M E :  ");
                                scanner.nextLine();
                                String name = scanner.nextLine().trim();
                                academicActivities.setName(name);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  U N I V E R S T Y :  ");
                                String university = scanner.nextLine().trim();
                                academicActivities.setUniversity(university);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t| E N T E R  Y O U R  D E P A R T M E N T :  ");
                                String department = scanner.nextLine().trim();
                                academicActivities.setDepartment(department);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  I D :  ");
                                String id = scanner.nextLine().trim();
                                academicActivities.setId(id);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  H O W  M A N Y  S U B J E C T S  M A R K S  Y O U  W A N T  T O  E N T E R :  ");
                                int numberOfSubjects = scanner.nextInt();
                                academicActivities.setNumberOfSubjects(numberOfSubjects);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  N A M E  O F  T H E  S U B J E C T S :  ");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                String[] subjects = new String[numberOfSubjects];
                                scanner.nextLine();
                                for (int count = 0; count < numberOfSubjects; ++ count) {
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                    subjects[count] = scanner.nextLine().trim();
                                }
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                academicActivities.setSubjects(subjects);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  M A R K S  O F  T H E  S U B J E C T S :  ");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                double[] marks = new double[numberOfSubjects];
                                for (int count = 0; count < numberOfSubjects; ++ count) {
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| " + subjects[count] + "  M A R K :  ");
                                    marks[count] = scanner.nextDouble();
                                }
                                academicActivities.setMarks(marks);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                academicActivities.showResults();
                                ++ case1Choice;
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
                                nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                                do {
                                    if (nextPageChoice != 's') {
                                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                                        nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                                    }
                                    else
                                        cls();
                                } while (nextPageChoice != 's');
                            }
                            case "2" -> {
                                if (case1Choice == 0) {
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||                               A C A D E M I C  A C T I V I T I E S                                 ||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||                                   Y O U R  M A R K S  R E P R O T                                  ||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  N A M E :  ");
                                    scanner.nextLine();
                                    String name = scanner.nextLine().trim();
                                    academicActivities.setName(name);
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  U N I V E R S T Y :  ");
                                    String university = scanner.nextLine().trim();
                                    academicActivities.setUniversity(university);
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t| E N T E R  Y O U R  D E P A R T M E N T :  ");
                                    String department = scanner.nextLine().trim();
                                    academicActivities.setDepartment(department);
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  I D :  ");
                                    String id = scanner.nextLine().trim();
                                    academicActivities.setId(id);
                                    ++ case1Choice;
                                }
                                int numberOfSubjects;
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  H O W  M A N Y  S U B J E C T S  M A R K S  Y O U  W A N T  T O  E N T E R :  ");
                                numberOfSubjects = scanner.nextInt();
                                scanner.nextLine();
                                academicActivities.setNumberOfSubjects(numberOfSubjects);
                                String[] subjects = new String[numberOfSubjects];
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  N A M E  O F  T H E  S U B J E C T S :  ");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                for (int count = 0; count < numberOfSubjects; ++ count) {
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| ----->  ");
                                    subjects[count] = scanner.nextLine().trim();
                                }
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                academicActivities.setSubjects(subjects);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  M A R K S  O F  T H E  S U B J E C T S :  ");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                double[] marks = new double[numberOfSubjects];
                                for (int count = 0; count < numberOfSubjects; ++ count) {
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| " + subjects[count] + "  M A R K :  ");
                                    marks[count] = scanner.nextDouble();
                                }
                                academicActivities.setMarks(marks);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  C R E D I T S  O F  T H E  S U B J E C T S :  ");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                double[] credits = new double[numberOfSubjects];
                                for (int count = 0; count < numberOfSubjects; ++ count) {
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| " + subjects[count] + "  C R E D I T :  ");
                                    credits[count] = scanner.nextDouble();
                                }
                                academicActivities.setCredits(credits);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
                                nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                                do {
                                    if (nextPageChoice != 's')
                                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                                    else
                                        cls();
                                } while (nextPageChoice != 's');
                                academicActivities.showGPA();
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
                                nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                                do {
                                    if (nextPageChoice != 's')
                                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                                    else
                                        cls();
                                } while (nextPageChoice != 's');
                            }
                            case "3" -> {
                                int numberOfSubjects = 0;
                                String[] subjects = new String[numberOfSubjects];
                                if (case1Choice == 0) {
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||                               A C A D E M I C  A C T I V I T I E S                                 ||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||                                   Y O U R  M A R K S  R E P R O T                                  ||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  N A M E :  ");
                                    scanner.nextLine();
                                    String name = scanner.nextLine().trim();
                                    academicActivities.setName(name);
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  U N I V E R S T Y :  ");
                                    String university = scanner.nextLine().trim();
                                    academicActivities.setUniversity(university);
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t| E N T E R  Y O U R  D E P A R T M E N T :  ");
                                    String department = scanner.nextLine().trim();
                                    academicActivities.setDepartment(department);
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  I D :  ");
                                    String id = scanner.nextLine().trim();
                                    academicActivities.setId(id);
                                }
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  H O W  M A N Y  S E M E S T E R  G P A  Y O U  W A N T  T O  I N P U T :  ");
                                int totalSemester = scanner.nextInt();
                                academicActivities.setTotalSemester(totalSemester);
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  G P A  O F  E V E R Y  S E M E S T E R :  ");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                double[] gpa = new double[totalSemester];
                                for (int count = 0; count < totalSemester; ++ count) {
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| E N T E R  S E M E S T E R  " + (count + 1) + "  G P A : ");
                                    gpa[count] = scanner.nextDouble();
                                }
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
                                nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                                do {
                                    if (nextPageChoice != 's') {
                                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                                        nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                                    }
                                    else
                                        cls();
                                } while (nextPageChoice != 's');
                                academicActivities.setGpa(gpa);
                                academicActivities.showCGPA();
                            }
                        }
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
                        nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                        do {
                            if (nextPageChoice != 's') {
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                                nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                            }
                            else
                                cls();
                        } while (nextPageChoice != 's');
                    } while (!choice.equals("4"));
                }
            }
        } while(!activitiesChoice.equals("5"));
    }
    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch(Exception exception) {
            System.err.println(exception);
        }
    }
    public static void signUp () throws Exception {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        File Users_Information = new File("UserInformation\\Users Information.txt");
        Users_Information.createNewFile();
        File Premium_Subscription_Membership_Numbers = new File("Premium Subscription Memberships Numbers.txt");
        Premium_Subscription_Membership_Numbers.createNewFile();
        File Earned_Amount = new File("Earned Amount");
        Earned_Amount.createNewFile();
        String choice = "";
        char nextPageChoice;
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||                                           S I G N  U P                                             ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||                                                                                                    ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||                             E N T E R  Y O U R  I N F O R M A T I O N                              ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.print("\t\t\t\t\t\t\t\t\t\t|| N A M E     :  ");
        String name = scanner.nextLine().trim();
        student.setName(name);
        FileWriter usersNamesFileWriter = new FileWriter(Users_Information, true);
        usersNamesFileWriter.write("N A M E :  " + name + "\r\n");
        usersNamesFileWriter.flush();
        usersNamesFileWriter.close();
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.print("\t\t\t\t\t\t\t\t\t\t|| E - M A I L :  ");
        String electronicMail = scanner.next().trim();
        do {
            if (electronicMail.indexOf("@") <= 0) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  E - M A I L  A D D R E S S . . .                                          ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  A G A I N . . .                                                            ||\t\t\t\t\t\t\t\t\t\t");
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E - M A I L :  ");
                electronicMail = scanner.next().trim();
            } else if (electronicMail.indexOf(".com") <= 0) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  E - M A I L  A D D R E S S . . .                                          ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  A G A I N . . .                                                            ||\t\t\t\t\t\t\t\t\t\t");
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E - M A I L :  ");
                electronicMail = scanner.next().trim();
            } else if (electronicMail.indexOf(".com") < electronicMail.indexOf("@")) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  E - M A I L  A D D R E S S . . .                                          ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  A G A I N . . .                                                            ||\t\t\t\t\t\t\t\t\t\t");
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E - M A I L :  ");
                electronicMail = scanner.nextLine().trim();
            } else if (electronicMail.indexOf(".com") == (electronicMail.indexOf("@") + 1)) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  E - M A I L  A D D R E S S . . .                                          ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  A G A I N . . .                                                            ||\t\t\t\t\t\t\t\t\t\t");
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| E - M A I L :  ");
                electronicMail = scanner.next().trim();
            } else
                break;
        } while (electronicMail.indexOf("@") <= 0 || electronicMail.indexOf(".com") <= 0 || electronicMail.indexOf(".com") == (electronicMail.indexOf("@") + 1) || electronicMail.indexOf(".com") == (electronicMail.indexOf("@") + 1));
        FileWriter usersElectronicMailFileWriter = new FileWriter(Users_Information, true);
        usersElectronicMailFileWriter.write("E - M A I L :  " + electronicMail + "\r\n");
        usersElectronicMailFileWriter.flush();
        usersElectronicMailFileWriter.close();
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P A S S W O R D :  ");
        scanner.nextLine();
        String password = scanner.nextLine().trim();
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.print("\t\t\t\t\t\t\t\t\t\t|| C O N F I R M  P A S S W O R D :  ");
        String confirmedPassword = scanner.nextLine().trim();
        do {
            if (!confirmedPassword.equals(password)) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| P A S S W O R D  D O S E N ' T  M A T C H . . .  E N T E R  T H E  S A M E  P A S S W O R D . . .  ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  A G A I N . . .                                                            ||\t\t\t\t\t\t\t\t\t\t");
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| C O N F I R M  P A S S W O R D :  ");
                confirmedPassword = scanner.nextLine().trim();
            } else
                break;
        } while (!confirmedPassword.equals(password));
        FileWriter usersPasswordsFileWriter = new FileWriter(Users_Information, true);
        usersPasswordsFileWriter.write("P A S S W O R D :  " + password + "\r\n");
        usersPasswordsFileWriter.flush();
        usersPasswordsFileWriter.close();
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||                                                                                                    ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||                                 S I G N  U P  S U C C E S S F U L L                                ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");

        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
        nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
        do {
            if (nextPageChoice != 's') {
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
            }
            else
                cls();
        } while (nextPageChoice != 's');
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U  C A N  S U B S C R I B E  O U R  P R E M I U M  M E M B E R S H I P  P L A N  F O R         ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| E X T R A  A N D  A  L O T  M O R E  P R E M I U M  F E A T U R E S  A T  A  L O W  C O S T . . .  ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| T H E  B E S T  P R E M I U M  M E M B E R S H I P  P L A N S  A V A I L A B L E  F O R  Y O U     ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| A R E :                                                                                            ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||               1              ||               2              ||               3                    ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  <><><><><><><<><><><><><><><><  <><><><><><><><><><><><><><><>  <><><><><><><><><><><><><><><><><><>  \t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t<>             $ 5              <>             $ 1 0            <>              $ 1 0 0               <>\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t<>       P E R  W E E K         <>       P E R  M O N T H       <>          P E R  Y E A R            <>\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t  <><><><><><><<><><><><><><><><  <><><><><><><><><><><><><><><>  <><><><><><><><><><><><><><><><><><>  \t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||                                                                                                    ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| D O  Y O U  W A N T  T O  S U B S C R I B E  O U R  P R E M I U M  M E M B E R S H I P  P L A N (  ||\t\t\t\t\t\t\t\t\t\t");
        System.out.print("\t\t\t\t\t\t\t\t\t\t|| Y E S / N O ) :  ");
        choice = scanner.next().trim().toLowerCase();
        do {
            if (!choice.equals("yes") && !choice.equals("no")) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y E S  O R  N O . . .                                                                   ||\t\t\t\t\t\t\t\t\t\t");
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P L E A S E E N T E R  A G A I N . . .  ");
                choice = scanner.next().trim().toLowerCase();
            } else
                break;
        } while (!choice.equals("yes") && !choice.equals("no"));
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
        nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
        do {
            if (nextPageChoice != 's') {
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
            } else
                cls();
        } while (nextPageChoice != 's');
        switch (choice) {
            case "yes" -> {
                Payment payment = new Payment();
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| I N  W H I C H  P R E M I U M  M E M B E R S H I P  P L A N  Y O U  W A N T  T O  R E G I S T E R  ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| F O R ( E N T E R  T H E  S E R I A L  N U M B E R ) :                                             ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| T H E  B E S T  P R E M I U M  M E M B E R S H I P  P L A N S  A V A I L A B L E  F O R  Y O U     ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| A R E :                                                                                            ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||               1              ||               2              ||               3                    ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t  <><><><><><><<><><><><><><><><  <><><><><><><><><><><><><><><>  <><><><><><><><><><><><><><><><><><>  \t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t<>             $ 5              <>             $ 2 0            <>              $ 1 8 0               <>\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t<>       P E R  W E E K         <>       P E R  M O N T H       <>          P E R  Y E A R            <>\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t  <><><><><><><<><><><><><><><><  <><><><><><><><><><><><><><><>  <><><><><><><><><><><><><><><><><><>  \t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                                                                                                    ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| =====|>  ");
                choice = scanner.next();
                if (!choice.equals("1") && !choice.equals("2") && !choice.equals("3")) {
                    do {
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  S E R I A L  N U M B E R  1  O R  2  O R  3 . . .                                ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R A G A I N . . .                                                             ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| =====|>  ");
                    } while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3"));
                }
                FileWriter earnedAmountFileWriter = new FileWriter(Earned_Amount, true);
                FileWriter premiumSubscriptionMembershipsNumbersFileWiter = new FileWriter(Premium_Subscription_Membership_Numbers, true);
                String premiumSubscriptionMembershipsNumbers = "";
                switch (choice) {
                    case "1" -> {
                        premiumSubscriptionMembershipsNumbers = "1 ";
                        premiumSubscriptionMembershipsNumbersFileWiter.write(premiumSubscriptionMembershipsNumbers);
                        earnedAmountFileWriter.write("5\n\r");
                        payment.setPaidAmount(5);
                    }
                    case "2" -> {
                        premiumSubscriptionMembershipsNumbers = "1 ";
                        premiumSubscriptionMembershipsNumbersFileWiter.write(premiumSubscriptionMembershipsNumbers);
                        earnedAmountFileWriter.write("20\n\r");
                        payment.setPaidAmount(20);
                    }
                    case "3" -> {
                        premiumSubscriptionMembershipsNumbers = "1 ";
                        premiumSubscriptionMembershipsNumbersFileWiter.write(premiumSubscriptionMembershipsNumbers);
                        earnedAmountFileWriter.write("180\n\r");
                        payment.setPaidAmount(180);
                    }
                }
                premiumSubscriptionMembershipsNumbersFileWiter.flush();
                premiumSubscriptionMembershipsNumbersFileWiter.close();
                earnedAmountFileWriter.flush();
                earnedAmountFileWriter.close();
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
                nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                do {
                    if (nextPageChoice != 's') {
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                        nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                    }
                    else
                        cls();
                } while (nextPageChoice != 's');
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                      E N T E R  Y O U R  P A Y M E N T  I N F O R M A T I O N                      ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| C U S T O M E R  N A M E     :  ");
                scanner.nextLine();
                String customerName = scanner.nextLine().trim();
                payment.setCustomerName(customerName);
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| B I L L I N G  E - M A I L   :  ");
                String billingElectronicMail = scanner.next();
                do {
                    if (billingElectronicMail.indexOf("@") <= 0) {
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  E - M A I L  A D D R E S S . . .                                          ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  A G A I N . . .                                                            ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| B I L L I N G  E - M A I L   :  ");
                        billingElectronicMail = scanner.next().trim();
                    } else if (billingElectronicMail.indexOf(".com") <= 0) {
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  E - M A I L  A D D R E S S . . .                                          ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  A G A I N . . .                                                            ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| B I L L I N G  E - M A I L   :  ");
                        billingElectronicMail = scanner.next().trim();
                    } else if (billingElectronicMail.indexOf(".com") < electronicMail.indexOf("@")) {
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  E - M A I L  A D D R E S S . . .                                          ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  A G A I N . . .                                                            ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| B I L L I N G  E - M A I L   :  ");
                        billingElectronicMail = scanner.next().trim();
                    } else if (billingElectronicMail.indexOf(".com") == (electronicMail.indexOf("@") + 1)) {
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  E - M A I L  A D D R E S S . . .                                          ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  A G A I N . . .                                                            ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| B I L L I N G  E - M A I L   :  ");
                    } else
                        break;
                } while (electronicMail.indexOf("@") <= 0 || electronicMail.indexOf(".com") <= 0 || electronicMail.indexOf(".com") == (electronicMail.indexOf("@") + 1) || electronicMail.indexOf(".com") == (electronicMail.indexOf("@") + 1));
                payment.setBillingElectronicMail(electronicMail);
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| B I L L I N G  A D D R E S S :  ");
                scanner.nextLine();
                String billingAddress = scanner.nextLine().trim();
                payment.setBillingAddress(billingAddress);
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| C O U N T R Y                :  ");
                String country = scanner.nextLine().trim();
                payment.setCountry(country);
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| C I T Y                      :  ");
                String city = scanner.nextLine().trim();
                payment.setCity(city);
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  Y O U R  P A Y M E N T  M E T H O D ( E N T E R  T H E  S E R I A L  N U M B E R ) :    ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 1 .  C R E D I T  C A R D                                                                          ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| 2 .  P A Y P A L                                                                                   ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.print("\t\t\t\t\t\t\t\t\t\t||=====|>  ");
                String paymentChoice = scanner.next();
                if (!paymentChoice.equals("1") && !paymentChoice.equals("2")) {
                    do {
                        System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  T H E  S E R I A L  N U M B E R  1  O R  2 . . .                                        ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R A G A I N . . .                                                             ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t||=====|> ");
                        paymentChoice = scanner.next();
                    } while (!paymentChoice.equals("1") && !paymentChoice.equals("2"));
                }
                switch (paymentChoice) {
                    case "1" -> {
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| C R E D I T  C A R D  N U M B E R                         : ");
                        String creditCardNumber = scanner.next();
                        int count = 0;
                        int creditCardNumberIntegerNumberCount = 0;
                        do {
                            if (creditCardNumber.length() != 19) {
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  C R E D I T   C A R D  N U M B E R . . .                                  ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E   E N T E R  C R E D I T   C A R D   N U M B E R   A G A I N . . .                     ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| C R E D I T   C A R D   N U M  B E R   F O R M A T        :  XXXX-XXXX-XXXX-XXXX                   ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| C R E D I T  C A R D  N U M B E R                         : ");
                                creditCardNumber = scanner.next();
                                continue;
                            }
                            while (count < 19) {
                                char[] integerNumber = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-'};
                                for (int integerNumberCount = 0; integerNumberCount < 11; ++integerNumberCount) {
                                    if (creditCardNumber.charAt(count) != integerNumber[integerNumberCount]) {
                                        ++creditCardNumberIntegerNumberCount;
                                    }
                                }
                                if (creditCardNumberIntegerNumberCount == 11) {
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  C R E D I T   C A R D  N U M B E R . . .                                  ||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E   E N T E R  C R E D I T   C A R D   N U M B E R   A G A I N . . .                     ||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| C R E D I T   C A R D   N U M  B E R   F O R M A T        :  XXXX-XXXX-XXXX-XXXX                   ||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| C R E D I T  C A R D  N U M B E R                         : ");
                                    creditCardNumber = scanner.next();
                                    break;
                                }
                                creditCardNumberIntegerNumberCount = 0;
                                ++count;
                            }
                            if (creditCardNumber.charAt(4) != '-' && creditCardNumber.charAt(9) != '-' && creditCardNumber.charAt(14) != '-') {
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  C R E D I T   C A R D  N U M B E R . . .                                  ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E   E N T E R  C R E D I T   C A R D   N U M B E R   A G A I N . . .                     ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| C R E D I T   C A R D   N U M  B E R   F O R M A T        :  XXXX-XXXX-XXXX-XXXX                   ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| C R E D I T  C A R D  N U M B E R                         : ");
                                creditCardNumber = scanner.next();
                            } else
                                break;
                        } while (true);
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| C R E D I T  C A R D  E X P I R Y  D A T E              : ");                                String creditCardExpiryDate = scanner.next();
                        count = 0;
                        int creditCardExpiryDateIntegerNumberCount = 0;
                        do {
                            if (creditCardExpiryDate.length() != 10) {
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  C R E D I T  C A R D  E X P I R Y  D A T E . . .                          ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  C R E D I T  C A R D  E X P I R Y  D A T E  A G A I N . . .                ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| C R E D I T  C A R D  E X P I R Y  D A T E  F O R M A T :  DD/MM/YYYY                              ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| C R E D I T  C A R D  E X P I R Y  D A T E              : ");
                                creditCardExpiryDate = scanner.next();
                                continue;
                            }
                            while (count < 10) {
                                char[] integerNumber = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '/'};
                                for (int integerNumberCount = 0; integerNumberCount < 11; ++integerNumberCount) {
                                    if (creditCardExpiryDate.charAt(count) != integerNumber[integerNumberCount]) {
                                        ++creditCardExpiryDateIntegerNumberCount;
                                    }
                                }
                                if (creditCardExpiryDateIntegerNumberCount == 11) {
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  C R E D I T  C A R D  E X P I R Y  D A T E . . .                          ||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  C R E D I T  C A R D  E X P I R Y  D A T E  A G A I N . . .                ||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| C R E D I T  C A R D  E X P I R Y  D A T E  F O R M A T :  DD/MM/YYYY                              ||\t\t\t\t\t\t\t\t\t\t");
                                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| C R E D I T  C A R D  E X P I R Y  D A T E              : ");
                                    creditCardExpiryDate = scanner.next();
                                }
                                creditCardExpiryDateIntegerNumberCount = 0;
                                ++count;
                            }
                            if (creditCardExpiryDate.charAt(2) != '/' || creditCardExpiryDate.charAt(5) != '/' || Integer.parseInt(creditCardExpiryDate.substring(0, 2)) > 31 || Integer.parseInt(creditCardExpiryDate.substring(3, 5)) > 12) {
                                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  C R E D I T  C A R D  E X P I R Y  D A T E . . .                          ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  C R E D I T  C A R D  E X P I R Y  D A T E  A G A I N . . .                ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| C R E D I T  C A R D  E X P I R Y  D A T E  F O R M A T :  DD/MM/YYYY                              ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| C R E D I T  C A R D  E X P I R Y  D A T E              : ");
                                creditCardExpiryDate = scanner.next();
                            } else
                                break;
                        } while (true);
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||                                P A Y M E N T  S U C C E S S F U L                                  ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
                        nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                        do {
                            if (nextPageChoice != 's')
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                            else
                                cls();
                        } while (nextPageChoice != 's');
                        payment.showPaymentInformation();
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||                                  L O G  I N  S U C C E S S F U L L                                 ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
                        nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                        do {
                            if (nextPageChoice != 's') {
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                                nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                            }
                            else
                                cls();
                        } while (nextPageChoice != 's');
                    }
                    case "2" -> {
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||                      E N T E R  Y O U R  P A Y M E N T  I N F O R M A T I O N                      ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P A Y P A L  E - M A I L     :  ");
                        String paypalElectronicMail = scanner.next().trim();
                        do {
                            if (paypalElectronicMail.indexOf("@") <= 0) {
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  E - M A I L  A D D R E S S . . .                                          ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  A G A I N . . .                                                            ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P A Y P A L  E - M A I L     :  ");
                                paypalElectronicMail = scanner.next().trim();
                            } else if (paypalElectronicMail.indexOf(".com") <= 0) {
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  E - M A I L  A D D R E S S . . .                                          ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  A G A I N . . .                                                            ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P A Y P A L  E - M A I L     :  ");
                                paypalElectronicMail = scanner.next().trim();
                            } else if (paypalElectronicMail.indexOf(".com") < electronicMail.indexOf("@")) {
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  E - M A I L  A D D R E S S . . .                                          ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  A G A I N . . .                                                            ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P A Y P A L  E - M A I L     :  ");
                                paypalElectronicMail = scanner.nextLine().trim();
                            } else if (paypalElectronicMail.indexOf(".com") == (electronicMail.indexOf("@") + 1)) {
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| E N T E R  A  V A L I D  E - M A I L  A D D R E S S . . .                                          ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.println("\t\t\t\t\t\t\t\t\t\t|| P L E A S E  E N T E R  A G A I N . . .                                                            ||\t\t\t\t\t\t\t\t\t\t");
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P A Y P A L  E - M A I L     :  ");
                                paypalElectronicMail = scanner.next().trim();
                            } else
                                break;
                        } while (paypalElectronicMail.indexOf("@") <= 0 || paypalElectronicMail.indexOf(".com") <= 0 || paypalElectronicMail.indexOf(".com") == (paypalElectronicMail.indexOf("@") + 1) || paypalElectronicMail.indexOf(".com") == (paypalElectronicMail.indexOf("@") + 1));
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P A Y P A L  P A S S W O R D :  ");
                        scanner.nextLine();
                        String paymentPassword = scanner.nextLine().trim();
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||                                P A Y M E N T  S U C C E S S F U L                                  ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
                        nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                        do {
                            if (nextPageChoice != 's') {
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                                nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                            }
                            else
                                cls();
                        } while (nextPageChoice != 's');
                        payment.showPaymentInformation();
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||                                  L O G  I N  S U C C E S S F U L L                                 ||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
                        nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                        do {
                            if (nextPageChoice != 's') {
                                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                                nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                            }
                            else {
                                cls();
                                break;
                            }
                        } while (nextPageChoice != 's');
                    }
                }
            }
            case "no" -> {
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                                  L O G  I N  S U C C E S S F U L L                                 ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . . ");
                nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                do {
                    if (nextPageChoice != 's') {
                        System.out.print("\t\t\t\t\t\t\t\t\t\t|| P R E S S  ' S '  T O  C O N T I N U E . . .");
                        nextPageChoice = scanner.next().trim().toLowerCase().charAt(0);
                    }
                    else {
                        cls();
                    }
                } while (nextPageChoice != 's');
				System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||                                   A D M I N  P A N E L                                             ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| 1 .  A L L  T H E  U S E R S  I N F O R M A T I O N                                                ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| 2 .  L O G  I N  H I S T O R Y                                                                     ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| 3 .  P R E M I U M  S U B S C R I P T I O N  M E M B E R S H I P  N U M B E R                      ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| 4 .  E A R N E D  A M O U N T                                                                      ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| 5 .  A D D  A N  U S E R                                                                           ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t|| 6 .  E X I T                                                                                       ||\t\t\t\t\t\t\t\t\t\t");
                    System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                    System.out.print("\t\t\t\t\t\t\t\t\t\t|| -----|>  ");
            }
        }
    }
}