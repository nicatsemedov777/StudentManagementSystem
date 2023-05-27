package bean;

import util.FileUtility;

import java.io.IOException;
import java.io.Serializable;

public class Config  implements Serializable {
    private static Config config = null;
    private Student[] student = null;
    private Teacher[] teacher = null;

    private Config(){}

    public static void initializeObject(){
        try {
            config = (Config) FileUtility.readObj("app.obj");
        } catch (Exception e) {
            System.out.println("File Oxunmadi");
        }

    }
    public static void save(){
        try {
            FileUtility.writeObj(config,"app.obj");
        } catch (Exception e) {
            System.out.println("File Yazilmadi");
        }
    }


    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public Teacher[] getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher[] teacher) {
        this.teacher = teacher;
    }

    public static Config getInstance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    public void appendStudent(Student s) {
        int temp = 0;
        if(student!=null){
            temp = student.length;
        }
        int length = temp + 1;
        Student[] st = new Student[length];
        int i = 0;
        for (; i < temp; i++) {
            st[i] = student[i];
        }
        st[length-1] = s;

        student = st;
    }

    public void appendTeacher(Teacher t) {
        int temp = 0;
        if(teacher!=null){
            temp = teacher.length;
        }
        int length =  temp + 1;
        Teacher[] newT = new Teacher[length];
        int i = 0;
        for (; i < temp; i++) {
            newT[i] = teacher[i];
        }
        newT[length-1] = t;
        teacher = newT;
    }

}
