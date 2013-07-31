package gradebook.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The Course class represents a particular semester-long treatment of set
 * material.
 *
 * @author christina
 *
 */
public class Course implements GradeableEntity {

    private String subject;
    private int courseNumber;
    private String name;
    private List<Course> prereqCourses;
    private List<Class> classes;

    public Course(String subject, int courseNumber, String name,
            List<Course> prereqCourses) {
        this.setSubject(subject);
        this.setCourseNumber(courseNumber);
        this.setName(name);
        this.setPrereqCourses(prereqCourses);
        classes = new ArrayList<Class>();
    }

    public void addClass(Class aClass) {
        classes.add(aClass);
    }

    public double averageScore(GradingScheme scheme) {
        double total = 0;
        for (Class c : classes) {
            total += c.averageScore(scheme);
        }
        return total / classes.size();
    }

    public double averageLetterGrade(GradingScheme scheme) {
        double total = 0;
        for (Class c : classes) {
            total += c.averageLetterGrade(scheme);
        }
        return Math.floor(total / classes.size());
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getPrereqCourses() {
        return prereqCourses;
    }

    public void setPrereqCourses(List<Course> prereqCourses) {
        this.prereqCourses = prereqCourses;
    }

}
