package JAVA;
import java.util.Scanner;
public class Chapter4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        String sNum=sc.next();
        char cNum[]=sNum.toCharArray();
        int sum=0;

        for (int i=0;i<cNum.length;i++){
            sum+=Integer.parseInt(String.valueOf(cNum[i]));
        }
        System.out.print(sum);
    }
    
}
