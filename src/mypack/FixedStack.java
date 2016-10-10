package mypack;

public class FixedStack implements Stack {
	private int top;
	private int stack[];

	FixedStack(int size) {
		stack = new int[size];
		top = -1;
	}

	@Override
	public void push(int i) {
		if (top == stack.length - 1) {
			System.out.println("stack overflow");
		} else {
			stack[++top] = i;
		}

	}

	@Override
	public int pop() {
		if (top < 0) {
			System.out.println("stack underflow");
			return 0;
		} else {
			return stack[--top];
		}
	}

	public static void main(String[] args) {
		
		FixedStack fs1=new FixedStack(15);
		
		for(int i=0;i<19;i++){
			fs1.push(i);
		}
		for(int i=0;i<19;i++){
		System.out.println(fs1.pop());
		}
	}
}
