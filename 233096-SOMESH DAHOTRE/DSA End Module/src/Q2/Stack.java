package Q2;

import java.util.ArrayList;
import java.util.List;

public class Stack {

	public int size;
	public Student[] arr;
	public int top;

	
	
	public Student[] getArr() {
		return arr;
	}

	public void setArr(Student[] arr) {
		this.arr = arr;
	}

	public Stack(int size) {

		this.size = size;
		arr = new Student[size];
		top = -1;
	}

	public boolean isEmpty() {

		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {

		if (top == size - 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean push(Student S) {

		if (isFull()) {
			return false;
		}

		arr[++top] = S;
		return true;
	}// end of push method

	public Student pop() {

		return arr[top--];
	}// end of pop method

	public Student peek() {

		return arr[top];
	}// end of peek method

//	public static void display(Stack StudentStack) {
//
//		List<Student> StudentList = new ArrayList<Student>();
//		Student[] StudentArray = new Student[5];
//
//		for (int j = 0; j < 5; j++) {
//
//			StudentArray[j] = StudentStack.pop();
//		}
//
//		int j = 4;
//		for (int i = 0; i < 5; i++) {
//
//			StudentList.add(StudentArray[j]);
//			j--;
//		}
//
//		for (Student S : StudentList) {
//
//			System.out.println(S);
//		}
//
//	}// end of display method

//	public int size;
//	public int[] arr;
//	public int top;
//
//	public Stack(int size) {
//
//		this.size = size;
//		arr = new int[size];
//		top = -1;
//	}
//
//	public boolean isEmpty() {
//
//		if (top == -1) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//	public boolean isFull() {
//
//		if (top == size - 1) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//	public boolean push(int data) {
//
//		if (isFull()) {
//			return false;
//		}
//
//		arr[++top] = data;
//		return false;
//	}//end of push method
//
//	public int pop() {
//
//		if (isEmpty()) {
//			return 999;
//		}
//
//		return arr[top--];
//	}//end of pop method
//
//	public int peek() {
//		
//		if (isEmpty()) {
//			return 999;
//		}
//		
//		return arr[top];	
//	}//end of peek method
//	
//	
}
