package bean;

import util.FileUtility;


import java.io.IOException;
import java.io.Serializable;

public class Account extends User  implements Serializable {
    private  User[] users;
    private static Account account;

    private Account(){}

    public static void save(){
        try {
            FileUtility.writeObj(account,"account.obj");
        } catch (IOException e) {
            System.out.println("Account cant save");
        }
    }

    public static void initialize(){
        try {
            account=(Account)FileUtility.readObj("account.obj");
        } catch (Exception e) {
            System.out.println("Account cant initialize");
        }

    }

    public static Account getAccount(){
        if(account==null){
            account = new Account();
        }
        return account;
    }
    public void appendUser(User u){
        int temp=0;
        if(users!=null){
            temp = users.length;
        }
        User[] newU = new User[temp+1];
        for (int i = 0; i < temp; i++) {
            newU[i] = users[i];
        }

        newU[newU.length-1] = u;

        users = newU;

    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
}
