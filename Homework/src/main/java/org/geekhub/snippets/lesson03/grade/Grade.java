package org.geekhub.snippets.lesson03.grade;

/**
 * Represent a Grade of Academic Grade System (more at
 * <a href="https://en.wikipedia.org/wiki/Academic_grading_in_the_United_States#Numerical_and_letter_grades">
 * Academic grading in the United States</a>)
 * Please provide implementations(use {@link GradeType} as a hint) of this interface.
 */
public interface Grade {

    /**
     * Represent Grade value for printing to user.
     *
     * @return a string representation of Grade
     */
    String asPrintVersion();

}
