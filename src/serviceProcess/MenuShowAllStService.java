package serviceProcess;

import bean.Config;
import bean.Student;
import servInterface.MenuShowAllStServiceInter;

public class MenuShowAllStService implements MenuShowAllStServiceInter {
    @Override
    public void processAbstract() {
        Config.initializeObject();
        Student[] st = Config.getInstance().getStudent();
        for (Student student : st) {
            student.info();
        }


    }
}
