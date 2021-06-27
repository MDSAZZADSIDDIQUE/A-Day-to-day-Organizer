package UserInformation;

import Activities.DailyActivities.*;
import Activities.HealthManagementActivities.*;
import Activities.TransactionActivities.*;
import Activities.AcademicActivities.*;

import java.text.NumberFormat;

public class Payment {

    public String customerName = "";
    public String billingElectronicMail = "";
    public String billingAddress = "";
    public String country = "";
    public String city = "";
    public double paidAmount = 0.0;


    // C O N S T R U C T O R S ->
    public Payment () {
	}

    public Payment(String customerName, String billingElectronicMail, String billingAddress, String country, String city, double paidAmount) {
        this.customerName = customerName;
        this.billingElectronicMail = billingElectronicMail;
        this.billingAddress = billingAddress;
        this.country = country;
        this.city = city;
        this.paidAmount = paidAmount;
    }


    // S E T T E R S ->
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBillingElectronicMail(String billingElectronicMail) {
        this.billingElectronicMail = billingElectronicMail;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPaidAmount(double paidAmount) { this.paidAmount = paidAmount; }


    // G E T T E R S ->
    public String getCustomerName() {
        return customerName;
    }

    public String getBillingElectronicMail() {
        return billingElectronicMail;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getPaidAmount() {
        return NumberFormat.getCurrencyInstance().format(paidAmount);
    }

    public void showPaymentInformation() {
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||                                P A Y M E N T  I N F O R M A T I O N                                ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| C U S T O M E R  N A M E       :  " + getCustomerName());
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| B I L L I N G  E - M A I L     :  " + getBillingElectronicMail());
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| C U S T O M E R  A D D R E S S :  " + getBillingAddress());
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| C O U N T R Y                  :  " + getCountry());
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| C I T Y                        :  " + getCity());
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| P A I D  A M O U N T           :  " + getPaidAmount());
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
    }


}
