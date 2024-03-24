import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test06 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());

        int[] S = new int[M];
        int[] T = new int[N+1];

        int answer = 0;
        int remainer = 0;

        stk = new StringTokenizer(br.readLine());
        for(int i = 1; i < N+1; i++){

            T[i] = (Integer.parseInt(stk.nextToken()) + T[i-1]);
            remainer =  T[i] % M;

            if(remainer == 0) answer++;

            S[remainer] ++;

        }//end for

        for(int i = 0; i < S.length; i++){

            if(S[i] > 1){

              answer += (S[i] * (S[i] - 1) / 2);
            }
        }//end for

        System.out.println(answer);


    }

}
