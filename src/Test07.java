import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//백준 온라인 저지 1253번
public class Test07 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        StringTokenizer stk= new StringTokenizer(br.readLine());

        int cnt = 0;
        for(int i = 0; i < N; i++){

            A[i] = Integer.parseInt(stk.nextToken());

        }//end for

        Arrays.sort(A);

        for(int k = 2; k < A.length; k++){

            int s = 0;
            int e = k-1;

            while(s < e){
                if(A[s] + A[e] > A[k]){
                    e--;
                }else if(A[s] + A[e] < A[k]){
                    s++;
                }else{
                    cnt++;
                    break;
                }//end else
            }//end while

        }//end for

        System.out.println(cnt);

    }

}
