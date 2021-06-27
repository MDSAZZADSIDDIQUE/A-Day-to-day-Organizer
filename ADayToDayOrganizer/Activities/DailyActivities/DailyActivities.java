package Activities.DailyActivities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import UserInformation.*;
import Activities.HealthManagementActivities.*;
import Activities.TransactionActivities.*;
import Activities.AcademicActivities.*;

public class DailyActivities extends Student {
    protected double bmr = 0.0;
    protected double activityLevelInAWeek = 0.0;
    protected double theNumberOfCaloriesBurned0nAnAverageDay = 0.0;
    protected double totalCaloriesBurnt = 0.0;

    @Override
    public void setHeight(double height) {
        this.height = height * 12;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight * 2.20462262185;
    }

    public void setActivityLevelInAWeek (double activityLevelInAWeek) {
        this.activityLevelInAWeek = activityLevelInAWeek;
    }

    public double calculateBMR () {
        if (getGender().equals("male"))
            bmr = 66 + (6.2 * weight) + (12.7 * height) - (6.76 * age);
        else
            bmr = 655.1 + (4.35 * weight) + (4.7 * height) - (4.7 * age);
        return bmr;
    }

    public double calculateTheNumberOfCaloriesBurned0nAnAverageDay () {
        theNumberOfCaloriesBurned0nAnAverageDay = (bmr * calculateBMR())/1000.0;
        return theNumberOfCaloriesBurned0nAnAverageDay;
    }

    public void calculateTotalCaloriesBurnt (double number, double timeSpent) {
        double caloriesBurnt = number * timeSpent * weight;
        totalCaloriesBurnt = totalCaloriesBurnt + caloriesBurnt;
    }

    public void showTheNumberOfCaloriesBurned0nAnAverageDay () throws IOException {
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||                                       D A I L Y  A C T I V I T I E S                               ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        calculateBMR();
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| T H E  N U M B E R  O F  C A L O R I E S  B U R N E D  O N  A N  A V E R A G E  D A Y :  " + calculateTheNumberOfCaloriesBurned0nAnAverageDay() + "  C A L O R I E S");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        File TheNumberOfCaloriesBurnedOnAnAverageDay = new File("The Number of Calories burned on an average day.txt");
        TheNumberOfCaloriesBurnedOnAnAverageDay.createNewFile();
        FileWriter fileWriter  = new FileWriter(TheNumberOfCaloriesBurnedOnAnAverageDay);
        fileWriter.write(dateTimeFormatter.format(now) + " : " + String.valueOf(calculateTheNumberOfCaloriesBurned0nAnAverageDay()) + "  C A L O R I E S");
        fileWriter.flush();
        fileWriter.close();
    }

    public void showTheTotalCaloriesBurnt () throws IOException {
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||                                       D A I L Y  A C T I V I T I E S                               ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| H O W  M U C H  C A L O R I E S  Y O U  H A V E  S P E N D  S O  F A R :  " + totalCaloriesBurnt + "  C A L O R I E S");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        File TotalCaloriesBurnt= new File("Total Calories.txt");
        TotalCaloriesBurnt.createNewFile();
        FileWriter fileWriter  = new FileWriter(TotalCaloriesBurnt);
        fileWriter.write(dateTimeFormatter.format(now) + " : " + String.valueOf(totalCaloriesBurnt) + "  C A L O R I E S");
        fileWriter.flush();
        fileWriter.close();
    }


}
