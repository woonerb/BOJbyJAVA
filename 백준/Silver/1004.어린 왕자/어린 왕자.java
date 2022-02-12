import java.util.*;
public class Main {

	
	public static void main(String[] args) {
		
		/* 문제:    BOJ1004_어린왕자_원에대한이해와구현
		 * 카테코리: String구현
		 * 
		 *  [입력]
		 *  첫째 줄에 출발점 (x1, y1)과 도착점 (x2, y2)이 주어진다. 두 번째 줄에는 행성계의 개수 n이 주어지며,
         *  세 번째 줄부터 n줄에 걸쳐 행성계의 중점과 반지름 (cx, cy, r)이 주어진다. 
         *  
         *  [출력]
         *  각 테스트 케이스에 대해 어린 왕자가 거쳐야 할 최소의 행성계 진입/이탈 횟수를 출력한다.    
		 * */
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		for(int test_case=0; test_case<t;test_case++)
		{
		        double dA, dB;
		        int count = 0;
		        
				//sp, cp 입력받기
		        int x1 = in.nextInt();
		        int y1 = in.nextInt();
		        int x2 = in.nextInt();
		        int y2 = in.nextInt();

    			//행성 입력받기
    			int hanglen= in.nextInt(); //행성갯수
    			int [][]hang = new int[hanglen][3];
    			for(int hangCnt=0;hangCnt<hanglen;hangCnt++)
    			{
    		        int cx = in.nextInt();
                    int cy = in.nextInt();
                    int r = in.nextInt();	
    				
				/*
				 * 1) ( x좌표간의 거리 제곱 + y좌표간의 거리 제곱 ) 에 루트를 씌운것
				 * 2) 원의 반지름
				 * -> 2)가  1)보다 크면 원안에 있다고 판단!
				 * 
				 */
                dA = Math.sqrt(Math.pow((double)x1 - (double)cx, 2) + Math.pow((double)y1 - (double)cy, 2));
                dB = Math.sqrt(Math.pow((double)x2 - (double)cx, 2) + Math.pow((double)y2 - (double)cy, 2));
                if(dA < (double)r && dB < (double)r){ }

                else if(dA < r){ count++; }  //2)가  1)보다 크므로, 출발지가 원안에 있다고 판단!
                else if(dB < r){ count++; }  //2)가  1)보다 크므로, 도착지가 원안에 있다고 판단!
    			}       
    			
    		System.out.println(count);
         }
	}		
}