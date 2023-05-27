package servInterface;

import bean.Config;

public interface SavableMenuService extends MenuService{
    default void process(){
        processAbstract();
        Config.save();
    }
}
