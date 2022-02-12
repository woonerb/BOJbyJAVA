import java.util.*;
public class Main {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String a; String b; int a_len;  int b_len;	
		String x =in.next();
		String y =in.next(); 
		String ans = "";
		
		int x_len = x.length();
		int y_len = y.length();

		
		//더 긴자릿수를 a로 짧은것을 b로 세팅한다.
		int len = 0;
		if(x_len>=y_len) { a = x; b=y; len = a.length(); }
		else{ a = y; b=x; len = a.length(); }
		 
		a_len = a.length();
		b_len = b.length();
		int cha = a_len-b_len;

		
		int olim = 0; int nam = 0; 
		
		/*a는 자릿수가 더 긴놈, b는 자릿수가 더 짧은놈,  len은 더 긴놈의 자릿수*/		
		for(int i=len;i>0;i--)
		{		
			// 지난 자리들의 계산에서 올라온 올림수와 a를 더한다
			nam = olim + (a.charAt(i-1)-'0');
			//System.out.println("a: " + a.charAt(i-1));
			
			//b는 짧으니까 뒤로 땡겨줘야지 a,b 자릿수가 맞춰져서 조정!!
			//b에 더할 숫자가 있다면 더해준다
			if(i-1-cha>=0) {
				nam = nam + (b.charAt(i-1-cha)-'0');
				//System.out.println("b: " + b.charAt(i-1-cha));
			}
			
			
			// 다음 자릿수로 올려줄 olim을 구하고, 이번 계산의 결과값인 nam을 구한다			
			olim = nam / 10; nam %= 10; 

			//계산 결과 저장
			ans = nam+ans;
			
			//마지막 계산이면서, olim수가 있다면 붙여준다
			if(i==1 && olim>0) {ans = olim+ans;}
		}
	    
		
		System.out.println(ans);
		//System.out.println("end");
		}
	}