import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test03 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int suNo = Integer.parseInt(stk.nextToken());
        int quizNo = Integer.parseInt(stk.nextToken());

        System.out.println(suNo + "" + quizNo);

        long[] S = new long[suNo + 1];

        stk = new StringTokenizer(br.readLine());
        for(int i = 1; i <= suNo; i++){

            S[i] = S[i-1] + Integer.parseInt(stk.nextToken());

        }//end for


        for(int i = 0; i < quizNo; i++){

            stk = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(stk.nextToken());
            int end = Integer.parseInt(stk.nextToken());

            System.out.println(S[end] - S[start - 1]);

        }//end for

    }

}
