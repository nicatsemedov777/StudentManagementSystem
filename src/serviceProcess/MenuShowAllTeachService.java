package serviceProcess;

import bean.Config;
import bean.Teacher;
import servInterface.MenuShowAllTeachInter;

public class MenuShowAllTeachService implements MenuShowAllTeachInter {
    @Override
    public void processAbstract() {
        Config.initializeObject();
        Teacher[] t = Config.getInstance().getTeacher();
        for (Teacher teacher : t) {
            teacher.info();
        }
    }
}
