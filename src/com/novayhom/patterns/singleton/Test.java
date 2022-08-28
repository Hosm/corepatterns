package com.novayhom.patterns.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DateUtil dateUtil = DateUtil.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(
                        new File("/home/hbourr/Documents/00-Projects/corepatterns/singleton/dateUtil.ser")));
        oos.writeObject(dateUtil);


        DateUtil dateUtil2 = null;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                new File("/home/hbourr/Documents/00-Projects/corepatterns/singleton/dateUtil.ser")
        ));
        dateUtil2 = (DateUtil) ois.readObject();

        oos.close();
        ois.close();
        System.out.println(dateUtil == dateUtil2);
    }
}
