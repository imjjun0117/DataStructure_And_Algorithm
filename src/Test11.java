import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//백준 온라인 저지 카드게임 2164번
public class Test11 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < N; i++){
            q.add(i+1);
        }//end for

        int num = 1;
        boolean flag = true;
        while(flag){
            q.poll();
            if(q.size() > 1){

                q.add(q.poll());

            }else{
                System.out.println(q.poll());
                flag = false;
            }

        }//end while

        br.close();

    }//main
}//class
