package hillel.models;

public class Employee {
    private String name;
    private String jobTitle;
    private String email;
    private String telNumber;
    private int age;

    public Employee(String name, String jobTitle, String email, String telNumber, int age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.email = email;
        this.telNumber = telNumber;
        this.age = age;
    }
public String toString(){
        return name + jobTitle + email + telNumber + ", " + age;
}
    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}