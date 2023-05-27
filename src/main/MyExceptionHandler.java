package main;

public class MyExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.err.println("""
                ***                     ***
                   Something went wrong
                ***                     ***
                """);
        System.out.println("Error Details:");
        e.printStackTrace();
    }
}
