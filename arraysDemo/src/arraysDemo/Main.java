package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String student1 = "Ahmet";
		String student2	= "Mehmet";
		String student3 = "Asiye";
		String student4 = "Serdar";
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		
		System.out.println("--------------------------------------------");
		
		System.out.println("\n\n");
		
		String[] students = new String[4];
		 students[0] = "Ahmet";
		 students[1] = "Mehmet";
		 students[2] = "Asiye";
		 students[3] = "Serdar";
		 
		 for(int i = 0 ; i < students.length ; i++) {
			 System.out.println(students[i]);
		 }
		 
		 System.out.println("\n\n\n");
		 
		 for(String student:students){
			 System.out.println(student);
		 }
	}

}
