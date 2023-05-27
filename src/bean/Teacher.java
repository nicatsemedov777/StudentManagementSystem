package bean;

import java.io.Serializable;

public class Teacher extends Person implements Serializable {
    private String schoolName;
    private double salary;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void info(){
        System.err.println(this.getName()+" "+this.getSurName()+" "+this.getAge() +" "+ schoolName+" "+salary);

    }
}
