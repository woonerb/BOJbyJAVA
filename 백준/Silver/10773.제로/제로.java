import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner in = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		
		int t=in.nextInt();
		
		for(int i=0;i<t;i++) {
			int a = in.nextInt(); //System.out.println(a);
			if(a==0) {stack.pop();} //pop
			else {
				stack.push(a);	
			}			
		}		
			int result =0;
			while(!stack.isEmpty()) {
				result+=stack.pop();
		}
			System.out.println(result);
	}
}
