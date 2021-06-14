package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String subject;
    private String teacher;
    private ArrayList<Student> classRoster;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return subject.equals(course.subject) && teacher.equals(course.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, teacher);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getClassRoster() {
        return classRoster;
    }

    public void setClassRoster(ArrayList<Student> classRoster) {
        this.classRoster = classRoster;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Subject: '" + subject + '\'' +
                "Teacher: '" + teacher + '\'' +
                "Class Roster:  " + classRoster;
    }
}
