package com.stt.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

public class OrderOfExceptions {
    public static void main(String[] args) {
        login();

    }

    public static void login() {
        try {
             int a =5/0;
            int[] b = {1, 2, 3, 4};
            int c = b[4];

            File file = new File("/poom.xml");
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException fe) {

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException er) {
            System.out.println(er.toString());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString());
        } catch (RuntimeException re) {
            System.out.println(re.toString());
        } finally {
            System.out.println("Finally Block");
        }
    }
}
