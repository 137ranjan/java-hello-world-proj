import java.util.Date;

/**
 * HelloWorld
 */
public class HelloWorld {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        System.out.println("Hello World");
        Date date = new Date();
        System.out.println(date);
        System.out.println("Version: 1.0");

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken to execute: " + (endTime - startTime) + " ms");
    }

}