package JAVA;
import java.util.Scanner;
public class P60평균 {

		public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			System.out.print("과목수 ?");
			int N=sc.nextInt();
			int A[]=new int[N];
			for(int i=0;i<N;i++) {
				A[i]=sc.nextInt();
				
			}
			int sum=0;
			int max=0;
			for(int i=0;i<N;i++) {
				if(max<A[i]) max=A[i];
				sum+=A[i];
			}
			System.out.println("평균 : "+sum*100/N/max);
			sc.close();
		}
}
