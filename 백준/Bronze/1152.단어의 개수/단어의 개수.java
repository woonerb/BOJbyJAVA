import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);

		String in = scan.nextLine();
		int cnt=1;
		
		for(int i=0;i<in.length();i++)
		{
			if(in.charAt(i)==' ') {cnt++;}
		}
		
		if(in.charAt(0)==' ') {cnt--;}
		if(in.charAt(in.length()-1)==' ') {cnt--;}
	
			System.out.println(cnt);
	
	}
		
}

