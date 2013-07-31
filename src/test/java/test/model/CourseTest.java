package test.model;
import test.scheme.DefaultGradingScheme;
import gradebook.model.Course;
import gradebook.model.Class;
import gradebook.model.GradebookCategory;
import gradebook.model.GradebookItem;
import gradebook.model.GradingScheme;
import gradebook.model.Section;
import gradebook.model.Student;
import junit.framework.TestCase;

public class CourseTest extends TestCase {
	
	private Course summerSchool;
	private Class summer1995, summer1996;
	private Section dudes95, chicks95, dudes96, chicks96;
	private Student ed, edd, eddy, inky, blinky, pinky, clyde;
	private GradingScheme scheme;
	
	public CourseTest(String name) {
		super(name);
		
		scheme = new DefaultGradingScheme();
		
		/* This code makes the following hierarchy.
		 * 
		 *							SUMMER SCHOOL:
		 *			Class 1995				Class 1996
		 *			Dudes95		Chicks95	Dudes96			Chicks96
		 *			Ed Edd		Eddy Inky	Blinky Pinky	Clyde
		 *
		 */
		
		summerSchool = new Course("SKOOL", 101, "School... Summer School", null);
		
		summer1995 = new Class();
		summer1996 = new Class();
		summerSchool.addClass(summer1995);
		summerSchool.addClass(summer1996);
		
		dudes95 = new Section();
		chicks95 = new Section();
		summer1995.addSection(dudes95);
		summer1995.addSection(chicks95);

		dudes96 = new Section();
		chicks96 = new Section();
		summer1996.addSection(dudes96);
		summer1996.addSection(chicks96);
		
		ed = new Student("Ed");
		edd = new Student("Double D");
		dudes95.addStudent(ed);
		dudes95.addStudent(edd);
		
		eddy = new Student("Eddy");
		inky = new Student("Inky");
		chicks95.addStudent(eddy);
		chicks95.addStudent(inky);
		
		blinky = new Student("Blinky");
		pinky = new Student("Pinky");
		dudes96.addStudent(blinky);
		dudes96.addStudent(pinky);
		
		clyde = new Student("Clyde");
		chicks96.addStudent(clyde);
		
		ed.giveGrade(new GradebookItem("your grade", new GradebookCategory("default", 1), 50, 100));
		edd.giveGrade(new GradebookItem("your grade", new GradebookCategory("default", 1), 90, 100));
		eddy.giveGrade(new GradebookItem("your grade", new GradebookCategory("default", 1), 10, 100));
		inky.giveGrade(new GradebookItem("your grade", new GradebookCategory("default", 1), 80, 100));
		blinky.giveGrade(new GradebookItem("your grade", new GradebookCategory("default", 1), 100, 100));
		pinky.giveGrade(new GradebookItem("your grade", new GradebookCategory("default", 1), 60, 100));
		clyde.giveGrade(new GradebookItem("your grade", new GradebookCategory("default", 1), 30, 100));
	}
	
	public void testAverageScore() {
		assertEquals(56.25, summerSchool.averageScore(scheme));
	}
	
	public void testAverageLetterGrade() {
		assertEquals(1.0, summerSchool.averageLetterGrade(scheme));
	}

}
