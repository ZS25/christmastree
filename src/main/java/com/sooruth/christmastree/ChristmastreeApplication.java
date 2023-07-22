package com.sooruth.christmastree;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ChristmastreeApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of branches of the Christmas tree: ");
        int numberOfLinesEntered = scanner.nextInt();
        int numberOfLines = numberOfLinesEntered * 2;


        int lines = numberOfLines;
        for (int line = 0; line < lines; line++) {
            int spaces = lines - 1;

            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }

            int stars = numberOfLines - spaces;
            for (int star = 0; star < stars; star++) {
                System.out.print("*");
            }

            stars = numberOfLines - spaces - 1;
            for (int star = 0; star < stars; star++) {
                System.out.print("*");
            }

            System.out.println();
            lines--;

            //trunk
            if (lines == numberOfLinesEntered) {
                int spacesFinal = numberOfLines - 1;
                for (int space = 0; space < spacesFinal; space++) {
                    System.out.print(" ");
                }
                System.out.println("^");

            }
        }
    }
}
