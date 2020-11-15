package org.geekhub.studentregistry.grade;

import org.geekhub.studentregistry.util.TestNotImplementedException;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CommonGradeFactoryTest {

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void cant_create_grade_instance_for_null_grade_type() {
    }

    @Test
    public void letter_grade_is_created_for_grade_type_LETTER() {
        Grade grade = null;

        assertTrue(grade instanceof LetterGrade);
    }

    @Test
    public void letter_grade_is_created_for_grade_type_PERCENTAGE() {
        throw new TestNotImplementedException();
    }

    @Test
    public void letter_grade_is_created_for_grade_type_GPA() {
        throw new TestNotImplementedException();
    }
}