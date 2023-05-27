package util;

import main.MyExceptionHandler;

import java.util.Scanner;

public class MenuUtil {
    public static void menu(){
        Thread t = new Thread(){

            @Override
            public void run(){

                while (true){

                    Scanner sc = new Scanner(System.in);
                    Menu.showAllMenu();
                    int selectedMenu =sc.nextInt();
                    if(selectedMenu==0){
                        System.exit(0);
                    }
                    Menu m = Menu.menuFinder(selectedMenu);
                    m.getOperation();

                }
            }
        };

        t.setUncaughtExceptionHandler(new MyExceptionHandler());
        t.start();




    }
}
