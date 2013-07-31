package test.model;
import test.scheme.DefaultGradingScheme;
import gradebook.model.GradebookCategory;
import gradebook.model.GradebookItem;
import gradebook.model.GradingScheme;
import gradebook.model.Student;
import junit.framework.TestCase;

public class StudentTest extends TestCase {
	
    private Student keith;
    private GradingScheme scheme;
    private GradebookCategory tf2Classes;
    private GradebookCategory teamwork;
    private GradebookItem pyro;
    private GradebookItem soilder;
    private GradebookItem scout;
    private GradebookItem teamworkScore;
	
	public StudentTest(String name) {
		super(name);
		
		keith = new Student("Keith Pickering");
		scheme = new DefaultGradingScheme();
		
		tf2Classes = new GradebookCategory("TF2 Class Skillz", 0.5);
		pyro = new GradebookItem("Pyro Skillz", tf2Classes, 90, 100);
		soilder = new GradebookItem("Soilder Skillz", tf2Classes, 80, 100);
		scout = new GradebookItem("Scout Skillz", tf2Classes, 40, 100);
		
		teamwork = new GradebookCategory("Teamwork Skillz", 0.5);
		teamworkScore = new GradebookItem("Teamwork", teamwork, 90, 100);
		
		keith.giveGrade(pyro);
		keith.giveGrade(soilder);
		keith.giveGrade(scout);
		keith.giveGrade(teamworkScore);
	}
	
	public void testAverageScore() {
		assertEquals(80.0, keith.averageScore(scheme));		
	}
	
	public void testAverageLetterGrade() {
		assertEquals(3.0, keith.averageLetterGrade(scheme));
	}
	
}
