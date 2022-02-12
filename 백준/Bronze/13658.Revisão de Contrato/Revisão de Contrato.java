import java.util.*;
public class Main {
	
	static String sol(char a, String b) {
		String an="";
		int len = b.length();
		for(int i=0;i<len;i++) {
			if(b.charAt(i)!=a) {an+=b.charAt(i);} 
		}
		if(an.compareTo("")==0) {an+="0";}
		if(an.charAt(0)=='0') {an="0";}
		return an;
	}
	
	public static void main(String[] args) {

			Scanner in = new Scanner(System.in);			
			String ans ="";
			
			while(true) {				
				String ina =  in.next();
				char a= ina.charAt(0);
				String b = in.next();
				
				if( a=='0' && b.length()==1 && b.charAt(0)=='0') {return;}

				System.out.println(sol(a, b));
    	}
    }	
}