package m3.task1;

public class StudentsApp {
public static void main(String[] args) {
		
		Students ramesh = new Students();
		ramesh.setStudentName("Ramesh");
		ramesh.setTotalMarks(58);
		
		ramesh.giveExam(98);
		
		
		Students suresh = new Students();
		suresh.setStudentName("Suresh");
		suresh.setTotalMarks(48);
		
		// --- calling of business method 
		suresh.giveExam(98);
		
		
		System.out.println(ramesh.getTotalMarks()+" - "+ramesh.getStudentName());
		System.out.println(ramesh.getStudentName()+" Status  "+ramesh.isStatus());
		
		
		
		
	}
}
