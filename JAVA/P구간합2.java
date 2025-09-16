package JAVA;
import java.io.*;
import java.util.StringTokenizer;

public class P구간합2 {
	public static void main(String[] args)throws IOException {
		BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringtokenizer = new StringTokenizer(bufferedReader.readLine());
		int suNo=Integer.parseInt(stringtokenizer.nextToken());
		int quizNo=Integer.parseInt(stringtokenizer.nextToken());
		long[] S = new long[suNo+1];
		stringtokenizer=new StringTokenizer(bufferedReader.readLine());
		for(int i=1;i<suNo+1;i++) {
			S[i]=S[i-1]+Integer.parseInt(stringtokenizer.nextToken());
		}
		for(int q=0;q<quizNo;q++){
			stringtokenizer=new StringTokenizer(bufferedReader.readLine());
			int i=Integer.parseInt(stringtokenizer.nextToken());
			int j=Integer.parseInt(stringtokenizer.nextToken());
			System.out.printf("결과 : %d \n", S[j]-S[i-1]);
		}
		
	}
}
