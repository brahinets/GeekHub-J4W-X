package org.geekhub.studentregistry;

import org.geekhub.studentregistry.grade.GradeType;
import org.testng.annotations.Test;

import static org.geekhub.studentregistry.grade.GradeTestData.GPA_GRADE;
import static org.geekhub.studentregistry.grade.GradeTestData.LETTER_GRADE;
import static org.geekhub.studentregistry.grade.GradeTestData.PERCENTAGE_GRADE;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotSame;

public class StudentsFiltererTest {

    private StudentsFilterer studentsFilterer;

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void students_cant_be_filtered_for_null_input() {
    }

    @Test
    public void filtered_students_are_not_same_array_as_empty_input_students() {
        Student[] studentsToFilter = new Student[0];

        Student[] filteredStudents = studentsFilterer.filterStudentsByGrade(
            GradeType.LETTER, studentsToFilter
        );

        assertNotSame(filteredStudents, studentsToFilter);
    }

    @Test
    public void filtered_students_are_not_same_array_as_not_empty_input_students() {
        Student[] filteredStudents = studentsFilterer.filterStudentsByGrade(
            GradeType.LETTER,
            null
        );

        Student[] expectedStudents = new Student[]{
            new Student("name", LETTER_GRADE)
        };

        assertNotSame(filteredStudents, expectedStudents);
    }

    @Test
    public void filtered_students_are_empty_if_no_students_with_required_grade_type() {
        Student[] filteredStudents = studentsFilterer.filterStudentsByGrade(
            GradeType.PERCENTAGE,
            null
        );

        Student[] expectedStudents = new Student[0];

        assertEquals(filteredStudents, expectedStudents);
    }

    @Test
    public void filtered_students_are_only_with_required_grade_type() {
        Student[] filteredStudents = studentsFilterer.filterStudentsByGrade(
            GradeType.LETTER,
            null
        );

        Student[] expectedStudents = new Student[]{
            new Student("name", LETTER_GRADE)
        };

        assertEquals(filteredStudents, expectedStudents);
    }

    @Test
    public void filtered_students_are_only_with_required_grade_type_when_input_contain_different_grade_types() {
        Student[] filteredStudents = studentsFilterer.filterStudentsByGrade(
            GradeType.LETTER,
            null
        );

        Student[] expectedStudents = new Student[]{
            new Student("name", LETTER_GRADE)
        };

        assertEquals(filteredStudents, expectedStudents);
    }

    @Test
    public void students_filtered_by_LETTER_grade_type() {
        Student[] filteredStudents = studentsFilterer.filterStudentsByGrade(
            GradeType.LETTER,
            null
        );

        Student[] expectedStudents = new Student[]{
            new Student("name", LETTER_GRADE)
        };

        assertEquals(filteredStudents, expectedStudents);
    }

    @Test
    public void students_filtered_by_PERCENTAGE_grade_type() {
        Student[] filteredStudents = studentsFilterer.filterStudentsByGrade(
            GradeType.PERCENTAGE,
            null
        );

        Student[] expectedStudents = new Student[]{
            new Student("name", PERCENTAGE_GRADE)
        };

        assertEquals(filteredStudents, expectedStudents);
    }

    @Test
    public void students_filtered_by_GPA_grade_type() {
        Student[] filteredStudents = studentsFilterer.filterStudentsByGrade(
            GradeType.GPA,
            null
        );

        Student[] expectedStudents = new Student[]{
            new Student("name", GPA_GRADE)
        };

        assertEquals(filteredStudents, expectedStudents);
    }
}
