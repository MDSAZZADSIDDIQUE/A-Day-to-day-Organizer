package Activities.AcademicActivities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import UserInformation.*;
import Activities.DailyActivities.*;
import Activities.HealthManagementActivities.*;
import Activities.TransactionActivities.*;

public class AcademicActivities extends Student {
    protected int numberOfSubjects;
    protected String[] subjects = new String[numberOfSubjects];
    protected double[] marks = new double[numberOfSubjects];
    protected double[] credits = new double[numberOfSubjects];
    protected int totalSemester = 0;
    protected double[] gpa = new double[totalSemester];

    public void setNumberOfSubjects(int numberOfSubjects) {
        this.numberOfSubjects = numberOfSubjects;
    }
    public void setCredits(double[] credits) {
        this.credits = credits;
    }
    public void setMarks(double[] marks) {
        this.marks = marks;
    }
    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
    public void setTotalSemester(int totalSemester) { this.totalSemester = totalSemester; }
    public void setGpa(double[] gpa) { this.gpa = gpa; }

    public int getNumberOfSubjects() {
        return numberOfSubjects;
    }
    public String[] getSubjects() {
        return subjects;
    }
    public double[] getCredits() {
        return credits;
    }
    public double[] getMarks() {
        return marks;
    }
    public int getTotalSemester() { return totalSemester; }
    public double[] getGpa() { return gpa; }

    public void showResults () {
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||                                   Y O U R  M A R K S  R E P R O T                                  ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| N A M E :  " + getName());
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| U N I V E R S T Y :  " + getUniversity());
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t| D E P A R T M E N T :  " + getDepartment());
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| I D :  " + getId());
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        double highestMark = 0;
        double totalMarks = 0;
        for (int count = 0; count < getNumberOfSubjects(); ++ count) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t|| " + subjects[count] + " :  " + marks[count]);
            System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
            if (highestMark < marks[count])
                highestMark = marks[count];
            totalMarks = totalMarks + marks[count];
        }
        double lowestMark = highestMark;
        for (int count = 0; count < getNumberOfSubjects(); ++ count) {
            if (lowestMark > marks[count])
                lowestMark = marks[count];
        }
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  H I G H E S T  M A R K  I S :  " + highestMark);
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  L O W E S T  M A R K  I S :  " + lowestMark);
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| Y O U R  T O T A L  M A R K  I S :  " + totalMarks);
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
    }

    public void showGPA () throws IOException {
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||                                   Y O U R  M A R K S  R E P R O T                                  ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| N A M E :  " + getName());
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| U N I V E R S T Y :  " + getUniversity());
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t| D E P A R T M E N T :  " + getDepartment());
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| I D :  " + getId());
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        double totalCredits = 0.0;
        double totalGrade = 0;
        for (int count = 0; count < numberOfSubjects ; ++ count) {
            if (marks[count] >= 90  && marks[count] <= 100)
                totalGrade = totalGrade + 4.00 * credits[count];
            else if (marks[count] >= 85  && marks[count] < 90)
                totalGrade = totalGrade + 3.75 * credits[count];
            else if (marks[count] >= 80  && marks[count] < 85)
                totalGrade = totalGrade + 3.50 * credits[count];
            else if (marks[count] >= 75  && marks[count] < 80)
                totalGrade = totalGrade + 3.25 * credits[count];
            else if (marks[count] >= 70  && marks[count] < 75)
                totalGrade = totalGrade + 3.00 * credits[count];
            else if (marks[count] >= 65  && marks[count] < 70)
                totalGrade = totalGrade + 2.75 * credits[count];
            else if (marks[count] >= 60  && marks[count] < 65)
                totalGrade = totalGrade + 2.50 * credits[count];
            else if (marks[count] >= 50  && marks[count] < 60)
                totalGrade = totalGrade + 2.25 * credits[count];
            else
                totalGrade = totalGrade + 0 * credits[count];
            totalCredits = totalCredits + credits[count];
        }
        double gpa = totalGrade / totalCredits;
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| GPA :  " + gpa);
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        File GPA = new File("GPA.txt");
        GPA.createNewFile();
        FileWriter fileWriter  = new FileWriter(GPA);
        fileWriter.write("N A M E :  " + getName() + "\r\n");
        fileWriter.write("U N I V E R S T Y :  " + getUniversity() + "\r\n");
        fileWriter.write("D E P A R T M E N T :  " + getDepartment() + "\r\n");
        fileWriter.write("I D :  " + getId() + "\r\n");
        fileWriter.write("G P A :  " + String.valueOf(gpa) + "\r\n");
        fileWriter.flush();
        fileWriter.close();
    }

    public void showCGPA () throws IOException {
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||                                   Y O U R  M A R K S  R E P R O T                                  ||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||====================================================================================================||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| N A M E :  " + getName());
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| U N I V E R S T Y :  " + getUniversity());
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| D E P A R T M E N T :  " + getDepartment());
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| I D :  " + getId());
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        double totalGPA = 0;
        for (int count = 0; count < totalSemester; ++ count) {
            totalGPA = totalGPA + gpa[count];
        }
        double cgpa = totalGPA / totalSemester;
        System.out.println("\t\t\t\t\t\t\t\t\t\t|| CGPA :  " + cgpa);
        System.out.println("\t\t\t\t\t\t\t\t\t\t||----------------------------------------------------------------------------------------------------||\t\t\t\t\t\t\t\t\t\t");
        File CGPA = new File("CGPA.txt");
        CGPA.createNewFile();
        FileWriter fileWriter  = new FileWriter(CGPA);
        fileWriter.write("N A M E :  " + getName() + "\r\n");
        fileWriter.write("U N I V E R S T Y :  " + getUniversity() + "\r\n");
        fileWriter.write("D E P A R T M E N T :  " + getDepartment() + "\r\n");
        fileWriter.write("I D :  " + getId() + "\r\n");
		fileWriter.write("C G P A :  " + String.valueOf(cgpa) + "\r\n");
        fileWriter.flush();
        fileWriter.close();
    }

}
