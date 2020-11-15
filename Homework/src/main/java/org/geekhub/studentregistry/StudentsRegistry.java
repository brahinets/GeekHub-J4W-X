package org.geekhub.studentregistry;

public class StudentsRegistry {

    private final ConsoleStudentsReader studentsConsoleReader;
    private final StudentsSorter studentsSorter;
    private final StudentsFilterer studentsFilterer;
    private final ConsoleStudentsPrinter consoleStudentsPrinter;

    public StudentsRegistry(
        ConsoleStudentsReader studentsConsoleReader,
        StudentsSorter studentsSorter,
        StudentsFilterer studentsFilterer,
        ConsoleStudentsPrinter consoleStudentsPrinter
    ) {
        this.studentsConsoleReader = studentsConsoleReader;
        this.studentsSorter = studentsSorter;
        this.studentsFilterer = studentsFilterer;
        this.consoleStudentsPrinter = consoleStudentsPrinter;
    }

    public void run(int totalStudentsCount) {
        throw new IllegalStateException();
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Total students count is expected as a first start argument but missing");
            System.exit(1);
        }
        int totalStudentsCount = Integer.parseInt(args[0]);

        new StudentsRegistry(
            null,
            null,
            null,
            null
        ).run(totalStudentsCount);
    }
}
