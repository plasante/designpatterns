package design.mvc;

public class MVCPatternTest {

	public static void main(String[] args) {
		// fetch student
		Student model = retrieveStudentFromDatabase();
		
		// Create a view to write student details on console
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		
		// update model data
		controller.setStudentName("Karo");
	
		controller.updateView();
	}
	
	private static Student retrieveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Pierre");
		student.setRollNo("10");
		return student;
	}
}
