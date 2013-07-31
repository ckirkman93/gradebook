package test.model;
import gradebook.model.GradebookCategory;
import gradebook.model.GradebookItem;
import junit.framework.TestCase;

public class GradebookCategoryTest extends TestCase {
	
    private GradebookCategory flipTests;
    private GradebookItem omeletteFlip;
    private GradebookItem pancakeFlip;
	
	public GradebookCategoryTest(String name) {
		super(name);
		flipTests = new GradebookCategory("Flipping Exams", 0.4);
		omeletteFlip = new GradebookItem("Omelette Flip", flipTests, 80, 100);
		pancakeFlip = new GradebookItem("Pancake Flip", flipTests, 90, 100);
	}
	
	public void testUpdateItemWeights() {
		double pancakeWeight = pancakeFlip.getItemWeight();
		assertEquals(0.2, pancakeWeight);
	}
	
}
