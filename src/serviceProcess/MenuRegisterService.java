package serviceProcess;

import bean.Account;
import bean.User;
import servInterface.RegisterInter;

import java.util.Scanner;

public class MenuRegisterService implements RegisterInter {
    @Override
    public void processAbstract() {
        User u = new User();
        System.out.println("Username :");
        Scanner sc = new Scanner(System.in);
        u.setUserName(sc.nextLine());
        Scanner scc = new Scanner(System.in);
        System.out.println("Password :");
        u.setPassword(scc.nextLine());
        Account.getAccount().appendUser(u);
        Account.save();



    }
}
