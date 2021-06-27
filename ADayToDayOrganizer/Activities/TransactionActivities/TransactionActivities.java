package Activities.TransactionActivities;

import java.io.*;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import UserInformation.*;
import Activities.DailyActivities.*;
import Activities.HealthManagementActivities.*;
import Activities.AcademicActivities.*;

public class TransactionActivities {
    private String moneyAtTheStartOfYourDay = "";
    private String transportationCost = "";
    private String foodCost = "";
    private String accessoriesCost = "";
    private String others = "";
    private double savedMoney = 0.0;

    public void setMoneyAtTheStartOfYourDay(String moneyAtTheStartOfYourDay) {
        this.moneyAtTheStartOfYourDay = moneyAtTheStartOfYourDay;
    }
    public void setTransportationCost(String transportationCost) {
        this.transportationCost = transportationCost;
    }

    public void setFoodCost(String foodCost) {
        this.foodCost = foodCost;
    }

    public void setAccessoriesCost(String accessoriesCost) {
        this.accessoriesCost = accessoriesCost;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public double getMoneyAtTheStartOfYourDay() {
        return Double.parseDouble(moneyAtTheStartOfYourDay);
    }

    public double getTransportationCost() {
        return Double.parseDouble(transportationCost);
    }

    public double getFoodCost() {
        return Double.parseDouble(foodCost);
    }

    public double getAccessoriesCost() {
        return Double.parseDouble(accessoriesCost);
    }

    public double getOthers() {
        return Double.parseDouble(others);
    }

    public void setSavedMoney() {
        savedMoney = getMoneyAtTheStartOfYourDay() - (getTransportationCost() + getFoodCost() + getAccessoriesCost() + getOthers());
    }
    public double getSavedMoney() {
        return savedMoney;
    }
    public String percentageOfTransactionActivities(double cost) {
        double percentageOfTransactionActivities = cost / getMoneyAtTheStartOfYourDay();
        return NumberFormat.getPercentInstance().format(percentageOfTransactionActivities);
    }
    public void showInformation() throws IOException {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        File TranscationActivities = new File("Transaction Activities.txt");
        TranscationActivities.createNewFile();
        FileWriter fileWriter  = new FileWriter(TranscationActivities);
        fileWriter.write(dateTimeFormatter.format(now) + ": ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||                        Y O U R  T R A N S A C T I O N  I N F O R M A T I O N                       ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  T R A N S P O R T A T I O N  C O S T :  " + NumberFormat.getCurrencyInstance().format(getTransportationCost()));
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  F O O D  C O S T :  " + NumberFormat.getCurrencyInstance().format(getFoodCost()));
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  A C C E S S O R I E S  C O S T : " + NumberFormat.getCurrencyInstance().format(getAccessoriesCost()));
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  O T H E R S  C O S T : " + NumberFormat.getCurrencyInstance().format(getOthers()));
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        setSavedMoney();
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  S A V E D  M O N E Y : " + NumberFormat.getCurrencyInstance().format(getSavedMoney()));
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  T R A N S P O R T A T I O N  C O S T :  " + percentageOfTransactionActivities(getTransportationCost()));
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  F O O D  C O S T                     :  " + percentageOfTransactionActivities(getFoodCost()));
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  A C C E S S O R I E S  C O S T       :  " + percentageOfTransactionActivities(getAccessoriesCost()));
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  O T H E R S  C O S T                 :  " + percentageOfTransactionActivities(getOthers()));
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  S A V E D  M O N E Y                 :  " + percentageOfTransactionActivities(getSavedMoney()));
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        fileWriter.write(" Y O U R  T R A N S P O R T A T I O N  C O S T :  " + NumberFormat.getCurrencyInstance().format(getTransportationCost()) + "\r\n");
        fileWriter.write("Y O U R  F O O D  C O S T :  " + NumberFormat.getCurrencyInstance().format(getFoodCost()) + "\r\n");
        fileWriter.write("Y O U R  A C C E S S O R I E S  C O S T : " + NumberFormat.getCurrencyInstance().format(getAccessoriesCost()) + "\r\n");
        fileWriter.write("Y O U R  O T H E R S  C O S T : " + NumberFormat.getCurrencyInstance().format(getOthers()) + "\r\n");
        fileWriter.write("Y O U R  S A V E D  M O N E Y : " + NumberFormat.getCurrencyInstance().format(getSavedMoney()) + "\r\n");
        fileWriter.write("Y O U R  T R A N S P O R T A T I O N  C O S T :  " + percentageOfTransactionActivities(getTransportationCost()) + "\r\n");
        fileWriter.write("Y O U R  A C C E S S O R I E S  C O S T       :  " + percentageOfTransactionActivities(getAccessoriesCost()) + "\r\n");
        fileWriter.write("Y O U R  O T H E R S  C O S T                 :  " + percentageOfTransactionActivities(getOthers()) + "\r\n");
        fileWriter.write("Y O U R  S A V E D  M O N E Y                 :  " + percentageOfTransactionActivities(getSavedMoney()) + "\r\n");
        fileWriter.flush();
        fileWriter.close();
    }
}