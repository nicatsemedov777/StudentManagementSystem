package serviceProcess;

import bean.Config;
import bean.Student;
import servInterface.MenuAddStServiceInter;

import java.util.Scanner;

public class MenuAddStService implements MenuAddStServiceInter {

    @Override
    public void processAbstract() {
        Student st = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        st.setName(sc.nextLine());
        System.out.println("Enter Your Surname :");
        st.setSurName(sc.nextLine());
        System.out.println("Enter Your Age :");
        st.setAge(sc.nextInt());

        Scanner scc = new Scanner(System.in);

        System.out.println("ScholarShip :");
        st.setScholarShip(scc.nextDouble());

        Scanner ss = new Scanner(System.in);

        System.out.println("SchoolName :");
        st.setSchoolName(ss.nextLine());

        Config.getInstance().appendStudent(st);



    }
}
