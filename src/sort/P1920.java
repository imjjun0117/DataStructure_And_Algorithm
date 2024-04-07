package sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//수 찾기 백준 온라인 저지 1920번
//시간제한: 1초 / N, M은 1보다 크거나 같고 100,000보다 작거나 같다
public class P1920 {

    public static void main(String[] args) throws IOException {
        //단순히 이중 M을 이중 for문을 통해서 값을 찾는다면 시간초과
        //모든 정수 범위는 int 범위까지 boolean 배열과 M 배열 인덱스를 통햏 찾을 예정(되려나?)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        boolean[] target_bool = new boolean[Integer.MAX_VALUE];

        StringTokenizer stk = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){

            int value = Integer.parseInt(stk.nextToken());

            target_bool[value] = true;

        }//end for


        int M = Integer.parseInt(br.readLine());
        stk = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++){

            int searchInt = Integer.parseInt(stk.nextToken());

            if(target_bool[searchInt]){
                sb.append("1\n");
            }else{
                sb.append("0\n");
            }//end else

        }//end for

        System.out.println(sb.toString());
        br.close();
    }//main

}//class
