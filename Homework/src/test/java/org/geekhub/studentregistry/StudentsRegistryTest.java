package org.geekhub.studentregistry;

import org.geekhub.studentregistry.grade.GradeType;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.geekhub.studentregistry.grade.GradeTestData.LETTER_GRADE;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class StudentsRegistryTest {

    @Mock
    private ConsoleStudentsReader studentsConsoleReader;
    @Mock
    private StudentsSorter studentsSorter;
    @Mock
    private StudentsFilterer studentsFilterer;
    @Mock
    private ConsoleStudentsPrinter consoleStudentsPrinter;

    private StudentsRegistry studentsRegistry;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        studentsRegistry = new StudentsRegistry(
            studentsConsoleReader,
            studentsSorter,
            studentsFilterer,
            consoleStudentsPrinter
        );
    }

    @Test
    public void application_flow_is_completed_successfully() {
        Student student = new Student("name", LETTER_GRADE);
        Student[] students = {student};

        int totalStudentsCount = 1;

        when(studentsConsoleReader.readStudents(eq(totalStudentsCount)))
            .thenReturn(students);

        when(studentsSorter.sortStudentsByGrade(eq(students)))
            .thenReturn(students);

        when(studentsFilterer.filterStudentsByGrade(
            any(GradeType.class),
            any(Student[].class)
        )).thenReturn(students);

        studentsRegistry.run(totalStudentsCount);

        verify(consoleStudentsPrinter, times(3))
            .printStudents(any(Student[].class));
    }
}