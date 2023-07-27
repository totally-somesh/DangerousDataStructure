package Q2;

public class Tester {

	public static void main(String[] args) {
		
		Stack StudentStack = new Stack(10);
		
		Student S1 = new Student(1, "Virat Kohli", 85);
		Student S2 = new Student(2, "MS Dhoni", 80);
		Student S3 = new Student(3, "Rohit Sharma", 75);
		Student S4 = new Student(4, "Hadrik Pandya", 80);
		Student S5 = new Student(5, "K L Rahul", 75);
		
		System.out.println(" ");
		System.out.println( " | Student Stack Created Succesfully ! ");
		
		System.out.println(" ");
		System.out.println(" | isEmpty Condition Check :- ");
		System.out.println(StudentStack.isEmpty());
			
		System.out.println(" ");
		System.out.println(" | Pushed 3 Students Through Tester :- ");
		System.out.println(StudentStack.push(S1));
		System.out.println(StudentStack.push(S2));
		System.out.println(StudentStack.push(S3));
		System.out.println(StudentStack.push(S4));
		System.out.println(StudentStack.push(S5));
		System.out.println("");

		System.out.println(" | Displaying Student's Stack ( Traversal ):- ");
		Student[] arr = StudentStack.getArr();
		for(Student S : arr) {
			
			if(S != null)
			System.out.println(S);
		}
		
//		System.out.println(" | Displaying Student's Stack ( Traversal ):- ");
//		Stack.display(StudentStack);
		System.out.println(" ");
		System.out.println(" | isFull Condition Check :- ");
		System.out.println(StudentStack.isFull());
		
		System.out.println(" ");
		System.out.println(" | Pop Operation :- ");
		System.out.println(StudentStack.pop());
		
		System.out.println(" ");
		System.out.println(" | Peek Operation :- ");
		System.out.println(StudentStack.peek());
		
		System.out.println(" ");
		System.out.println(" | isEmpty Condition Check :- ");
		System.out.println(StudentStack.isEmpty());
		
		
		
	}
}
