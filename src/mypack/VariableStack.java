package mypack;

public class VariableStack implements Stack {
	private int top;
	private int stack[];

	VariableStack(int size) {
		stack = new int[size];
		top = -1;
	}

	@Override
	public void push(int item) {
		if (top == stack.length - 1) {
			int temp[] = new int[stack.length * 2];
			for (int i = 0; i < stack.length; i++) {
				stack = temp;
				stack[++top] = item;
			}
		} else
			stack[++top] = item;

	}

	@Override
	public int pop() {
		if (top < 0) {
			System.out.println("stack underflow");
			return 0;
		} else {
			return stack[top--];
		}
	}

public static void main(String[] args) {
		
	VariableStack vs1=new VariableStack(15);
		
		for(int i=0;i<15;i++){
			vs1.push(i);
		}
		for(int i=0;i<15;i++){
		System.out.println(vs1.pop());
		}
	}
}
