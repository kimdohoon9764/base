package JAVA;
import java.util.Scanner;
public class Two_Pointer {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("수?");
		int N=sc.nextInt();
		int count=1;
		int sum=1;
		int start_index=1;
		int end_index=1;
		while(end_index!=N) {
			if(sum==N) {
			
				count++;
				end_index++;
				sum=sum+end_index;
			}
			else if(sum > N) {
				sum=sum-start_index;
				start_index++;
			}else {
				end_index++;
				sum=sum+end_index;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
