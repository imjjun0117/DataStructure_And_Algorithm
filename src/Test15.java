import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//백준 온라인 저지 내림차순으로 자릿수 정렬하기 1427번
public class Test15 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int A[] = new int[str.length()];
        int result[]  = new int[str.length()];

        for (int i = 0; i < str.length(); i++){
            A[i] = Integer.parseInt(str.substring(i, i+1));
        }//end for

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            int max = 0;
            int maxI = -1;

            for(int j = i+1; j < str.length(); j++){

                if(max < A[j]){
                    max = A[j];
                    maxI = j;
                }

            }//end for

            int temp = A[i];
            A[i] = max;
            A[maxI] = temp;

            sb.append(A[i]);

        }

        System.out.println(sb.toString());
        br.close();


    }//main
}//class
