package org.geekhub.snippets.lesson02;

import java.util.Scanner;

public class StudentsRegistry {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Total students count is expected as a first start argument but missing");
            System.exit(1);
        }
        int totalStudentsCount = Integer.parseInt(args[0]); // Use me (and remove this comment)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the student:");
        String studentName = scanner.nextLine();
        System.out.println(studentName);

        System.exit(1); // Implement registry (and remove this line)
    }
}
