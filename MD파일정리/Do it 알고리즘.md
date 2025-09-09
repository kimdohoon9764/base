# Chapter 3
## 3-3 인덱스에 의미 부여 하여 풀어보기
**코딩 테스트**에서 가장 많이 사용하는 자료구조는 배열.<br>
배열을 사용할때는 **인덱스**로 데이터에 접근 <br>
**주의** 상황에 따라 인덱스 해싱 개념을 적용하여 단순한 위치가 아니라 특정한 의미를 지닌값으로 활용하면 문제를 더 쉽게 해결가능.<br>

### A[1]의 의미

1. 몇번째 데이터인지 순서를 의미하는 경우 -> 첫번째 데이터를 저장합니다.
2. 숫자값으로 의미를 부여한 경우 -> 1이라는 값이 몇개 있는지를 저장합니다.

```java
import java.io.*;
import java.util.StringTokenizer;


public class indexHash{
    public static void main (String[] args){
        BufferedReader br = new BufferedReadered(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.in));

        int N= Integer.parseInt(br.readline());
        int[] count = new int[1001];
        StringTokenizer st = new StringTokenizer(br.readline());
        for (int i=0; i< N; i++) {
            int number = Integer.parseInt(st.nextToken());
            count[number]++; //인덱스에 숫잣값으로 의미를 부여하여 데이터를 저장 

        }
        br.close();
        for ( int i=0; i<=1000; i++){
            if (count[i]!=0){
                for (int j=0;j < count[i];j++)
                bw.write(i+" ");
            }
        }
        bw.flush();
        bw.close();
    }
}
```
**그런데 왜 인덱스에 등장 횟수를 저장하는 게 의미가 있을까?**

바로 이것이 가능한 이유는,
우리가 숫자의 범위를 알고 있을 때입니다.

예를 들어 0 ~ 1000 사이의 숫자만 등장한다고 하면

우리는 0 ~ 1000까지의 숫자 자체를 인덱스로 사용하는 배열을 만들 수 있어요.
이 배열은 각 숫자가 몇 번 등장했는지를 저장하는 구조가 됩니다.
## 3-6 다중 조건 정렬 익히기
코딩 테스트 문제를 다루다보면 여러 기준에 따라 데이터를 정렬해야하는 상황이 자주 등장한다.<br>
자바에선 Comparable과 Comparator 인터페이스를 사용하여 다중 조건 정렬을 구현 할 수 있습니다.

```java

```