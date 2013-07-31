package test.model;
import test.scheme.DefaultGradingScheme;
import gradebook.model.GradebookCategory;
import gradebook.model.GradebookItem;
import gradebook.model.GradingScheme;
import gradebook.model.Section;
import gradebook.model.Student;
import junit.framework.TestCase;

public class SectionTest extends TestCase {
	
    private Section 			ruckusClan;
    private Student 			dan, christina, keith;
    private GradingScheme		scheme;
	
	public SectionTest(String name) {
		super(name);
		
		ruckusClan = new Section();
		
		scheme = new DefaultGradingScheme();
		
		dan = new Student("Daniel Rosmus");
		christina = new Student("Christina Kirkman");
		keith = new Student("Keith Pickering");
		
		ruckusClan.addStudent(dan);
		ruckusClan.addStudent(christina);
		ruckusClan.addStudent(keith);
		
		dan.giveGrade(new GradebookItem("Teamwork", new GradebookCategory("foo", 0.5), 80, 100));
		dan.giveGrade(new GradebookItem("Technical", new GradebookCategory("bar", 0.5), 95, 100));
		christina.giveGrade(new GradebookItem("Teamwork", new GradebookCategory("foo!", 0.5), 80, 100));
		christina.giveGrade(new GradebookItem("Technical", new GradebookCategory("bar?", 0.5), 80, 100));
		keith.giveGrade(new GradebookItem("Teamwork", new GradebookCategory("foo...", 0.5), 85, 100));
		keith.giveGrade(new GradebookItem("Technical", new GradebookCategory("ugliestCodeEver.java", 0.5), 75, 100));
	}
	
	public void testAverageScore() {
		assertEquals(82.5, ruckusClan.averageScore(scheme));
	}
	
	public void testAverageLetterGrade() {
		assertEquals(3.0, ruckusClan.averageLetterGrade(scheme));
	}

}
