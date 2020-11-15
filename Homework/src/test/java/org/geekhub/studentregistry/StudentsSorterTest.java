package org.geekhub.studentregistry;

import org.geekhub.studentregistry.util.TestNotImplementedException;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotSame;

public class StudentsSorterTest {

    private StudentsSorter studentsSorter;

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void students_cant_be_sorted_for_null_input() {
    }

    @Test
    public void sorted_students_are_not_same_array_as_empty_input_students() {
        Student[] studentsToSort = new Student[0];

        Student[] sortedStudents = studentsSorter.sortStudentsByGrade(studentsToSort);

        assertNotSame(sortedStudents, studentsToSort);
    }

    @Test
    public void sorted_students_are_not_same_array_as_not_empty_input_students() {
        throw new TestNotImplementedException();
    }

    @Test
    public void students_sorted_with_only_one_student_in_input() {
        throw new TestNotImplementedException();
    }

    @Test
    public void students_sorted_by_grades_with_unique_values() {
        throw new TestNotImplementedException();
    }

    @Test
    public void students_sorted_by_grades_with_same_values() {
        throw new TestNotImplementedException();
    }

}
