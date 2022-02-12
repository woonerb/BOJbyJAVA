import java.util.*;
public class Main {
	
	static int sol(int k){
		
		int result=0; int zari=1;
		String StrK = Integer.toString(k);
		int Strk_len = StrK.length();
		
		for(int i=0;i<Strk_len;i++)
		{
			result+= ((StrK.charAt(i)-'0'));
		}
		result+=k;
		//System.out.println("파라미터: "+k + "  리턴값!: "+ result);
		return result;
	}
	
	
	public static void main(String[] args) {

			Scanner in = new Scanner(System.in);			
			String ans ="";
			
			String CHOI     = in.next();
			int    CHOI_INT = Integer.parseInt(CHOI); 
			for(int i=0;i<CHOI_INT;i++) {
				
				if( CHOI_INT ==  sol(i) ) {System.out.println(i);return;}
			}
			System.out.println("0");
    }	
}