package org.geekhub.studentregistry;

import org.geekhub.studentregistry.grade.GradeType;

public interface StudentsFilterer {
    Student[] filterStudentsByGrade(GradeType gradeType, Student[] studentsToFilter);
}
