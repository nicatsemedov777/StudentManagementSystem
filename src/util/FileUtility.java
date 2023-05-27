package util;

import main.MyExceptionHandler;

import java.io.*;

public class FileUtility {

    public static void writeObj (Object ob,String fileName) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(fileName);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(ob);
        objectOut.close();


    }
    public static Object readObj(String fileName) throws Exception {
        FileInputStream fileIn = new FileInputStream(fileName);
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);

        Object obj = objectIn.readObject();
        objectIn.close();
        return obj;
    }
}
