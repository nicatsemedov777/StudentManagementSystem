package util;

import servInterface.MenuService;
import serviceProcess.*;

public enum Menu {
    LOGIN(1, "Login", new MenuLoginService()),
    REGISTER(2, "Register", new MenuRegisterService()),
    ADD_TEACHER(3, "Add Teacher", new MenuAddTeacherService()),
    ADD_STUDENT(4, "Add Student", new MenuAddStService()),
    SHOW_ALL_STUDENT(5, "Show All Students", new MenuShowAllStService()),
    SHOW_ALL_TEACHER(6, "Show All Teachers", new MenuShowAllTeachService()),
    UNKNOWN(0, "Exit From System", null);

    private static final Menu[] menus = Menu.values();
    private static boolean loggedIn;
    private int turn;
    private String label;
    private MenuService service;
    private static int logCounter=1;

    Menu() {

    }

    Menu(int turn, String label, MenuService service) {
        this.turn = turn;
        this.label = label;
        this.service = service;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Menu.loggedIn = loggedIn;
    }

    public static void showAllMenu() {
        System.out.println("\n Please select menu:\n");

        for (Menu menu : menus) {
            if (menu.equals(UNKNOWN)) {
                break;
            }

            if (!loggedIn && (menu.equals(REGISTER) || menu.equals(LOGIN))) {
                System.out.println(menu.getTurn() + "." + menu.getLabel());

            }

            if (loggedIn && (menu != LOGIN && menu != REGISTER)) {
                System.out.println(menu.getTurn() + "." + menu.getLabel());

            }

        }


    }

    public static Menu menuFinder(int mNum) {
        for (Menu menu : menus) {
            if (menu.getTurn() == mNum) {
                return menu;
            }
        }


        return UNKNOWN;
    }

    public static int getLogCounter() {
        return logCounter;
    }

    public static void setLogCounter(int logCounter) {
        Menu.logCounter = logCounter;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public String getLabel() {
        return this.label;
    }

    public MenuService getService() {
        return this.service;
    }

    public void getOperation() {
        service.process();
    }

}
