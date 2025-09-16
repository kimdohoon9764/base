package JAVA;
import java.util.Scanner;


public class P65구간합 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("DATA개수, 질의개수??");
		int suNo=sc.nextInt();
		int quizNo=sc.nextInt();
		long S[]=new long[suNo+1];
		for(int i=1;i<suNo+1;i++) {
			S[i] = S[i-1]+sc.nextLong();
		}
		for(int i=1;i<suNo+1;i++) {
			System.out.printf("S[%d] : %d  ",i,S[i]);
		}
		System.out.println();
		for(int i=0;i<quizNo;i++) {
			System.out.print("시작 ?");
			int start=sc.nextInt();
			System.out.print("끝 ?");
			int end=sc.nextInt();
			System.out.printf("결과 : %d \n",(S[end]-S[start-1]));
			
		}
		
	}

}
