import java.util.*;
public class Main {
	
	/* 문제:    BOJ1004_어린왕자_원에대한이해와구현
	 * 카테코리: String구현
	 * 
	 *  3,6,9하는데, 박수의 횟수 가 총 몇 번 인가?
	 *  N = 36이라면 3, 6, 9, 13, 16, 19, 23, 26, 29, 30, 31, 32, 33, 34, 35, 36에서 박수를 치게 되는데 
	 *  33, 36에서는 각 각 두 번 박수를 쳐야 하므로 총 18회가 된다. 
	 *  1 이상의 정수 N에 대하여 369게임을 N까지 규칙을 지키며 진행된다면 그때까지 듣게 되는 박수의 총 횟수를 계산하여 출력하는 프로그램을 작성하시오.
	 * */
	static int BakCnt(int c) {
		int cnt=0;
		
		String strC=Integer.toString(c);
		//System.out.println(" strC: "+strC);
		int strC_len = strC.length();
		
		for(int j=0;j<strC_len;j++)
		{
			if(strC.charAt(j)=='3' || strC.charAt(j)=='6' || strC.charAt(j)=='9' ) {cnt++;}
			//System.out.println(strC+" : 1상승 "+cnt);
				
		}
		return cnt;
	}
	
	public static void main(String[] args) {

			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			
			int ans=0;
			
			for(int i=1;i<=t;i++) {
				
				ans+=BakCnt(i);
    		}	
			
    		System.out.println(ans);
    }	
}