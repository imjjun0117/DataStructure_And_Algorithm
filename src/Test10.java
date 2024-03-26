import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//백준 온라인 저지 1874번
public class Test10 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        StringBuffer sb = new StringBuffer();

        Stack<Integer> stack = new Stack<>();

        int A[] = new int[N];

        for(int i = 0; i < N; i++){

            int value = Integer.parseInt(br.readLine());
            A[i] = value;

        }//end for

        int num = 1;
        boolean result = true;
        for(int i = 0; i < A.length; i++){

            //해당 값이 나올때까지 오름차순으로 데이터를 넣어준다.
            if(A[i] >= num){

                while(A[i] >= num){
                    stack.push(num++);
                    sb.append("+\n");
                }//end while

              stack.pop();
              sb.append("-\n");

            }
            //배열 값이 더 작은 경우
            else{

                int pop = stack.pop();

                //같지 않으면 오류
                if(pop != A[i]){
                    System.out.println("NO");
                    result = false;
                    break;
                }else{
                    sb.append("-\n");
                }

            }//end else

        }//end for

        if(result){
            System.out.println(sb.toString());
        }//end if

    }//main
}//class
