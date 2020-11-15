package org.geekhub.studentregistry.grade;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LetterGradeTest {

    private Grade grade;

    @Test
    public void print_version_of_grade_is_A() {
        String printVersion = grade.asPrintVersion();

        assertEquals(printVersion, "A");
    }

    @Test
    public void print_version_of_grade_is_B() {
        assertEquals(grade.asPrintVersion(), "B");
    }

    @Test
    public void print_version_of_grade_is_C() {
        assertEquals(grade.asPrintVersion(), "C");
    }

    @Test
    public void print_version_of_grade_is_D() {
        assertEquals(grade.asPrintVersion(), "D");
    }

    @Test
    public void print_version_of_grade_is_F() {
        assertEquals(grade.asPrintVersion(), "F");
    }

    @Test
    public void print_version_of_grade_is_F_for_invalid_positive_grade_value() {
        assertEquals(grade.asPrintVersion(), "F");
    }

    @Test
    public void print_version_of_grade_is_F_for_invalid_negative_grade_value() {
        assertEquals(grade.asPrintVersion(), "F");
    }
}