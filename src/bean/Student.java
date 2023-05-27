package bean;

import java.io.Serializable;

public class Student extends Person implements Serializable {
    private String schoolName;
    private double scholarShip;


    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getScholarShip() {
        return scholarShip;
    }

    public void setScholarShip(double scholarShip) {
        this.scholarShip = scholarShip;
    }


    public void info(){
        System.err.println(this.getName()+" "+this.getSurName()+" "+this.getAge() +" "+ schoolName+" "+scholarShip);

    }
}
