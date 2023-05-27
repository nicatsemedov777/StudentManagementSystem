package serviceProcess;

import bean.Config;
import bean.Teacher;
import servInterface.MenuAddTeacherServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {
    @Override
    public void processAbstract() {
        Teacher t = new Teacher();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name :");
        t.setName(sc.nextLine());

        System.out.println("Enter Your Surname :");
        t.setSurName(sc.nextLine());

        System.out.println("Enter Your Age :");
        t.setAge(sc.nextInt());

        Scanner scc = new Scanner(System.in);

        System.out.println("Salary :");
        t.setSalary(scc.nextDouble());

        Scanner ss = new Scanner(System.in);

        System.out.println("SchoolName :");
        t.setSchoolName(ss.nextLine());

        Config.getInstance().appendTeacher(t);


    }
}
