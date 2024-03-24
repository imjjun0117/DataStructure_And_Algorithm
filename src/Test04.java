import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test04 {

    public static void main(String[] args) throws IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      long N = Long.parseLong(br.readLine());

      long start_idx = 1;
      long end_idx = 1;
      long sum = 1;
      long cnt = 1;

      while(end_idx != N){

          if(sum > N){
              sum -= start_idx;
              start_idx++;
          }else if(sum < N) {
              end_idx++;
              sum += end_idx;
          }else{
              cnt++;
              end_idx++;
              sum += end_idx;
          }//end else

      }

        System.out.println(cnt);
    }

}
