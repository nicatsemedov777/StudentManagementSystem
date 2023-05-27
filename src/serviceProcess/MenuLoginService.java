package serviceProcess;

import bean.Account;
import bean.User;
import servInterface.LoginInter;
import util.Menu;

import java.util.Objects;
import java.util.Scanner;

public class MenuLoginService implements LoginInter {
    @Override
    public void processAbstract() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Username :");
        String username = sc.nextLine();
        System.out.println("Enter your password :");
        Scanner sc2 = new Scanner(System.in);
        String password = sc2.nextLine();

        User u;

        Account.initialize();

        for (int i = 0; i < Account.getAccount().getUsers().length; i++) {
            u = Account.getAccount().getUsers()[i];
            if(Objects.equals(username, u.getUserName()) && Objects.equals(password, u.getPassword())){
                System.out.println("logged in");
                Menu.setLoggedIn(true);

            }
            else{
                System.out.println("Password or Username is not correct!!");
            }
            if(Menu.getLogCounter()==3){
                System.out.println("You are banned ! Please try later.");
                System.exit(1);
            }

            Menu.setLogCounter(Menu.getLogCounter()+1);


        }



    }
}
