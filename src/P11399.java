import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//백준 11399번 ATM 인출 시간 계산하기
public class P11399 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] S = new int[N];

        StringTokenizer stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N; i++){
            A[i] = Integer.parseInt(stk.nextToken());
        }//end for

        //버블 정렬 사용
        for(int i = 1; i < N; i++){

            int insert_point = i;
            int insert_value = A[i];

            for(int j = i-1; j >= 0; j--){

                if(A[j] < A[i]){
                    insert_point = j+1;
                    break;
                }//end if

                if(j == 0){
                    insert_point = 0;
                }

            }//end for

            for(int j = i ; j > insert_point; j--){

                A[j] = A[j-1];

            }//end for

            A[insert_point] = insert_value;

        }//end for

        S[0] = A[0];
        int sum = S[0];

        for(int i = 1; i < S.length; i++){

            S[i] = S[i-1]+A[i];
            sum += S[i];
        }


        System.out.println(sum);

    }
}
