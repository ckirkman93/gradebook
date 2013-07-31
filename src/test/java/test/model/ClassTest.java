package test.model;

import test.scheme.DefaultGradingScheme;
import gradebook.model.Class;
import gradebook.model.GradebookCategory;
import gradebook.model.GradebookItem;
import gradebook.model.GradingScheme;
import gradebook.model.Section;
import gradebook.model.Student;
import junit.framework.TestCase;

public class ClassTest extends TestCase {

    private Class classyClass;
    private Section us, them;
    private Student clay, charles, pez, ryan;
    private GradingScheme scheme;

    public ClassTest(String name) {
        super(name);

        scheme = new DefaultGradingScheme();

        classyClass = new Class();

        us = new Section();
        them = new Section();

        classyClass.addSection(us);
        classyClass.addSection(them);

        clay = new Student("Clay Anderson");
        charles = new Student("Charles Hancock");
        pez = new Student("Jon Perez");
        ryan = new Student("Ryan Krepps");

        us.addStudent(pez);
        us.addStudent(ryan);
        them.addStudent(clay);
        them.addStudent(charles);

        clay.giveGrade(new GradebookItem("1", new GradebookCategory("A", 0.4),
                70, 100));
        clay.giveGrade(new GradebookItem("2", new GradebookCategory("B", 0.6),
                95, 100));
        charles.giveGrade(new GradebookItem("1",
                new GradebookCategory("A", 0.4), 80, 100));
        charles.giveGrade(new GradebookItem("2",
                new GradebookCategory("B", 0.6), 70, 100));
        pez.giveGrade(new GradebookItem("1", new GradebookCategory("A", 0.4),
                90, 100));
        pez.giveGrade(new GradebookItem("2", new GradebookCategory("B", 0.6),
                90, 100));
        ryan.giveGrade(new GradebookItem("1", new GradebookCategory("A", 0.4),
                10, 100));
        ryan.giveGrade(new GradebookItem("2", new GradebookCategory("B", 0.6),
                100, 100));
    }

    public void testAverageScore() {
        assertEquals(78.25, classyClass.averageScore(scheme));
    }

    public void testAverageLetterGrade() {
        assertEquals(2.0, classyClass.averageLetterGrade(scheme));
    }

}
