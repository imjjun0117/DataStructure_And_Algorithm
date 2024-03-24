import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test05 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stk.nextToken());
        long M = Long.parseLong(stk.nextToken());

        int S[][] = new int[N+1][N+1];

        for(int i = 1; i <= N; i++){
            stk = new StringTokenizer(br.readLine());

            for(int j = 1; j <= N; j++){
                S[j][i] = S[j-1][i] + Integer.parseInt(stk.nextToken());
            }//end for

        }//end for


        for(int i = 0; i < M; i++ ){
            stk = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(stk.nextToken());
            int y1 = Integer.parseInt(stk.nextToken());
            int x2 = Integer.parseInt(stk.nextToken());
            int y2 = Integer.parseInt(stk.nextToken());
            int sum = 0;

            for(int j = y1; j <= y2; j++){
                sum += S[x2][j] - S[x1-1][j];
            }//end for

            System.out.println(sum);

        }//end for


    }

}
