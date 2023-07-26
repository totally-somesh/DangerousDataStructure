package Stack;

public class Tester {

	public static void main(String[] args) {
	
		Stack<Integer> SingleStack = new Stack<>(5);
		
		SingleStack.push(10);
		SingleStack.push(20);
		SingleStack.push(30);
		
		System.out.print(" | Insrting 10 | 20 | 30 :- ");
		System.out.println(" ");

		System.out.print(" | Peeking :- ");
		System.out.print(SingleStack.peek());
		
		
		System.out.println(" ");

		System.out.print(" | Popping (30) :- ");
		System.out.print(SingleStack.pop());
		

		System.out.println(" ");
		System.out.print(" | Peeking :- ");
		System.out.print(SingleStack.peek());
		
		
		DoubleStack DoubleStack = new DoubleStack(6);
		
		System.out.println(" | Pushing Into 1 (10/20/30) :- ");
		DoubleStack.push1(10);
		DoubleStack.push1(20);
		DoubleStack.push1(30);
		
		System.out.println(" | Pushing Into 2 (10/20/30) :- ");
		DoubleStack.push2(10);
		DoubleStack.push2(20);
		DoubleStack.push2(30);
		
		System.out.println(" | Popping From 1 (10/20/30) :- ");
		System.out.println(DoubleStack.pop1());
		
		System.out.println(" | Popping From 2 (10/20/30) :- ");
		System.out.println(DoubleStack.pop2());
		
		System.out.println(" | Popping From 1 Again (10/20/30) :- ");
		System.out.println(DoubleStack.pop1());
		
		System.out.println(" | Popping From 2  Again (10/20/30) :- ");
		System.out.println(DoubleStack.pop2());
		
		
		
		
		
		
	}

}
