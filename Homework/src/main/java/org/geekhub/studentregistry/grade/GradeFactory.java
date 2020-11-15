package org.geekhub.studentregistry.grade;

/**
 * Responses for creation of {@link GradeType} objects.
 */
public interface GradeFactory {

    /**
     * Supports creation only of {@link GradeType#LETTER}, {@link GradeType#PERCENTAGE}
     * and {@link GradeType#GPA} grades.
     *
     * @param gradeType on of {@link GradeType}
     * @param value Grade value in range [0,100]
     * @return {@link Grade} instance
     */
    Grade createGrade(GradeType gradeType, int value);

}
