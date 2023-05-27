package servInterface;

public interface MenuService {
    void processAbstract();

    default void process(){
        processAbstract();
    }




}
