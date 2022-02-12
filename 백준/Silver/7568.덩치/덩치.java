import java.util.*;
public class Main {
	public static void main(String[] ar) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		//학생정보 담은 배열
		Person[] parray = new Person[t];
		
		for(int i=0;i<t;i++) {
			//학생정보 입력
			int kg=in.nextInt(); int cm=in.nextInt();		 
			Person nperson=new Person(kg,cm);
			parray[i]= nperson;
		}
		
		int answer[] = new int[t];
		//자신의 순위 구하기
		for(int i=0;i<t;i++) {
			int my_rank =1;
			Person now = parray[i];
			for(int j=0;j<t;j++)
			{
				if(i==j) {continue;}
				//System.out.println(now.Is(now, parray[i]));
				my_rank +=now.Is(now, parray[j]);				
			}
			
			answer[i] = my_rank;
		}
		
		String ans ="";
		for(int i=0;i<t;i++) {ans+=answer[i];if(i != t-1) {ans+=" ";}}
		
		System.out.println(ans);
	}
}


class Person{
	int kg;
	int cm;
	public Person(int kg,int cm) {
		this.kg=kg;
		this.cm=cm;
	}
	
	    int Is(Person a, Person b){
		int result = 0;
		if(a.kg<b.kg && a.cm <b.cm) {result = 1;}
		//else if(a.kg<b.kg && a.cm <b.cm) {result = -1;}
		else   {result = 0;}
		
		return result;
	}
}

