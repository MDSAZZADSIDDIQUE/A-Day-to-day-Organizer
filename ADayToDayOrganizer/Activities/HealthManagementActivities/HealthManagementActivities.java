package Activities.HealthManagementActivities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import UserInformation.*;
import Activities.DailyActivities.*;
import Activities.TransactionActivities.*;
import Activities.AcademicActivities.*;

public class HealthManagementActivities extends DailyActivities {

    protected double bmi = 0.0;
    protected double totalCalorie = 0.0;
    protected double totalCarbohydrate = 0.0;
    public double calculateBMI () {
        bmi = (weight / (height * height))  *  703;
        return bmr;
    }
    public void showBMR () {
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  B M R  I S :  " + calculateBMR());
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
    }

    public void showBMI () {
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  B M I  I S :  " + calculateBMI());
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        if (bmi < 18.5) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t||                                 Y O U  A R E  U N D E R W E I G H T                                ||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t||                               Y O U  A R E  N O R M A L  W E I G H T                               ||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t||                                 Y O U  A R E  O V E R W E I G H T                                  ||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        } else {
            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t||                                       Y O U  A R E  O B E S E                                      ||\t\t\t\t\t\t\t\t\t\t");
            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        }
    }

    public void calculateCalorieNeed () {
        if (getGender().equals("male")) {
            if (getAge() >= 25 && getAge() < 45) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  R E Q U I R E D  C A L O R I E  I S :  2 , 6 0 0  C A L O R I E S                         ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            } else if (getAge() >= 18 && getAge() < 25) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  R E Q U I R E D  C A L O R I E  I S :  2 , 8 0 0  C A L O R I E S                         ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            } else if (getAge() >= 45 && getAge() < 65) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  R E Q U I R E D  C A L O R I E  I S :  2 , 4 0 0  C A L O R I E S                         ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            } else if (getAge() >= 0 && getAge() < 12) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  R E Q U I R E D  C A L O R I E  I S :  1 , 4 0 0  C A L O R I E S                         ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            } else {
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  R E Q U I R E D  C A L O R I E  I S :  2 , 8 0 0  C A L O R I E S                         ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            }
        } else {
            if (getAge() >= 25 && getAge() < 45) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  R E Q U I R E D  C A L O R I E  I S :  2 , 0 0 0  C A L O R I E S                         ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            } else if (getAge() >= 18 && getAge() < 25) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  R E Q U I R E D  C A L O R I E  I S :  2 , 2 0 0  C A L O R I E S                         ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            } else if (getAge() >= 45 && getAge() < 65) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  R E Q U I R E D  C A L O R I E  I S :  1 , 8 0 0  C A L O R I E S                         ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            } else if (getAge() >= 0 && getAge() < 12) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  R E Q U I R E D  C A L O R I E  I S :  1 , 4 0 0  C A L O R I E S                         ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            } else {
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  R E Q U I R E D  C A L O R I E  I S :  2 , 8 0 0  C A L O R I E S                         ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            }

        }
    }
    public void calculateCalorieNeedForLoosingWeight () {
        if (getGender().equals("male")) {
            if (getAge() >= 26 && getAge() <= 45) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  R E Q U I R E D  C A L O R I E  I S :  2 , 1 0 0  C A L O R I E S                         ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            } else if (getAge() >= 18 && getAge() < 25) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  R E Q U I R E D  C A L O R I E  I S :  2 , 3 0 0  C A L O R I E S                         ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            } else if (getAge() >= 45 && getAge() < 65) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  R E Q U I R E D  C A L O R I E  I S :  2 , 2 0 0  C A L O R I E S                         ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            }
        } else {
            if (getAge() >= 26 && getAge() <= 45) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  R E Q U I R E D  C A L O R I E  I S :  1 , 5 0 0  C A L O R I E S                         ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            } else if (getAge() >= 18 && getAge() < 25) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  R E Q U I R E D  C A L O R I E  I S :  1 , 7 0 0  C A L O R I E S                         ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            } else if (getAge() >= 45 && getAge() < 65) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  R E Q U I R E D  C A L O R I E  I S :  1 , 3 0 0  C A L O R I E S                         ||\t\t\t\t\t\t\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            }
        }
    }

    public void calculateCarbohydrateAndCalorie(double carbohydrate, double calorie, double amount ) {
        totalCarbohydrate = totalCarbohydrate + carbohydrate * amount;
        totalCalorie = totalCalorie + calorie * amount ;
    }

    public void showCarbohydrateAndCalorie () throws IOException {
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||                       H E A L T H  M A N A G E M E N T  A C T I V I T I E S                        ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U  H A V E  T A K E N :  " + totalCarbohydrate + "  C A R B O H Y D R A T E");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U  H A V E  T A K E N :  " + totalCalorie + "  C A L O R I E S");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        File TotalCarbohydratesTaken= new File("Total Carbohydrates Taken.txt");
        File TotalCaloriesTaken= new File("Total Calories Taken.txt");
        TotalCarbohydratesTaken.createNewFile();
        TotalCaloriesTaken.createNewFile();
        FileWriter totalCarbohydratesTakenFileWriter  = new FileWriter(TotalCarbohydratesTaken);
        FileWriter totalCaloriesTakenFileWriter  = new FileWriter(TotalCaloriesTaken);
        totalCarbohydratesTakenFileWriter.write(dateTimeFormatter.format(now) + " : " + String.valueOf(totalCarbohydrate) + "  C A L O R I E S");
        totalCaloriesTakenFileWriter.write(dateTimeFormatter.format(now) + " : " + String.valueOf(totalCalorie) + "  C A L O R I E S");
        totalCarbohydratesTakenFileWriter.flush();
        totalCaloriesTakenFileWriter.flush();
        totalCarbohydratesTakenFileWriter.close();
        totalCaloriesTakenFileWriter.close();
    }
}
