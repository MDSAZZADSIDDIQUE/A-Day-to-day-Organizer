package UserInformation;
import Activities.DailyActivities.*;
import Activities.HealthManagementActivities.*;
import Activities.TransactionActivities.*;
import Activities.AcademicActivities.*;

public class Student {
    protected String name = "";
    protected String gender = "";
    protected double height = 0.0;
    protected double weight = 0.0;
    protected double age = 0.0;
    protected String school = "";
    protected String highSchool = "";
    protected String college = "";
    protected String university = "";
    protected String department = "";
    protected String id = "";


    // C O N S T R U C T O R S ->
    public Student() {
    }

    public Student(String name, String gender, double height, double weight, double age, String school, String highSchool, String college, String university, String department, String id) {
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.school = school;
        this.highSchool = highSchool;
        this.college = college;
        this.university = university;
        this.department = department;
        this.id = id;
    }

    // S E T T E R S ->
    public void setName(String name) { this.name = name; }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeight(double height) { this.height = height; }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setId(String id) {
        this.id = id;
    }


    // G E T T E R S ->
    public String getName() { return name; }

    public String getGender() { return gender; }

    public double getHeight() { return height; }

    public double getWeight() { return weight; }

    public double getAge() { return age; }

    public String getSchool() { return school; }

    public String getHighSchool() { return highSchool; }

    public String getCollege() { return college; }

    public String getUniversity() { return university; }

    public String getDepartment() {
        return department;
    }

    public String getId() { return id; }

}
