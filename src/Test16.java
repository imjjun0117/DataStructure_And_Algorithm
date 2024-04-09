import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//String형 숫자들을 sum해서 avg내기
public class Test16 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk = new StringTokenizer(br.readLine());

        double sum = 0;
        int i = 0;
        while(stk.hasMoreTokens()){

            sum += Double.parseDouble(stk.nextToken());
            i++;

        }//end while

        System.out.println(sum/i);



    }

}
