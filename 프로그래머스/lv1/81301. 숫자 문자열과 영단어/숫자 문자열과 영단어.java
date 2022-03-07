import java.util.*;
class Solution {
    public int solution(String s) {
        String answer = "";
        
        String[] str = {"zero","one","two","three","four","five",
                        "six","seven","eight","nine","ten"};
        char [] num  ={'0','1','2','3','4','5','6','7','8','9'}; 
        
        int str_len = str.length;
        int num_len = num.length;
        

        //s를 다 지워내면 종료한다
        while(!s.isEmpty())
        {
        	boolean breaking = false;
        	
        	//맨앞이 숫자
        	for(int i=0;i<num_len;i++)
        	{
        		if(s.charAt(0)==num[i])
	        	{
        			answer+=num[i];
                    if(s.length()==1){return Integer.parseInt(answer); } 
        			int s_len = s.length()-1; 
                           //	System.out.println("숫자자르기전"+s);
                    s = s.substring(1,s_len+1);
                         //   System.out.println("숫자자르기후"+s);
                    breaking =true;
        			break;
	        	}
        	}
            
        	for(int i=0;i<num_len;i++)
        	{
        		if(breaking == true ) {break;}
        		//System.out.println("문자자르기전"+s);
        		if(s.startsWith(str[i])==true)
        		{
        			answer+=num[i];
        			int sp_p  = str[i].length();
        			int cp_p  = s.length()-1; 
        			
                    //System.out.println("문자자르기전:"+s);
        			s = s.substring(sp_p,cp_p+1 );
                    //System.out.println("sp:"+sp_p + "cp:"+cp_p);

                    //System.out.println("문자자르기후:"+s);
        			break;
        		}
        	}       	
        }
        
        int a =Integer.parseInt(answer);
        return a;
    }
}