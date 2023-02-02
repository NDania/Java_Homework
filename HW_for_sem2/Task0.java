//Напишите программу, которая принимает с консоли число в формате byte и
//записывает его в файл ”result.txt”.
//Требуется перехватить все возможные ошибки и вывести их в логгер.
//
//После написания, попробуйте подать на вход числа 100 и 200 и проследите 
//разницу в результате.

import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.util.logging.*;

public class Task0 {
    public static void main(String[] args) throws IOException {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        boolean flag = iScanner.hasNextByte();
        if(!flag) {
            Logger logger = Logger.getLogger(Task0.class.getName());
            FileHandler fh = new FileHandler("log.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.info("Entered incorrect number.");
        } else {
            Byte num = iScanner.nextByte();
            System.out.println(num);
            FileWriter fw = new FileWriter("result.txt", false);
            fw.write(num);
            fw.close();
        }
        iScanner.close();
    }
}