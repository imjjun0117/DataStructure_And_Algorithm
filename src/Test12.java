import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//백준 온라인 저지 절대값 힙 구현하기 11286번
public class Test12 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {

            //return 양수가 우선으로 들어감
            int abs_o1 = Math.abs(o1);
            int abs_o2 = Math.abs(o2);

            if(abs_o1 == abs_o2){ // 절대값이 같은 경우 음수 우선
               return o1 > o2 ? 1 : -1;
            }else{ // 절대값이 작은값 우선
                return abs_o1 > abs_o2 ? 1 : -1;
            }//end else
        });


        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            int input = Integer.parseInt(br.readLine());

            if(input == 0){

                if(queue.isEmpty()){
                    sb.append("0\n");
                }else{
                    sb.append(queue.poll()+"\n");
                }

            }else{
                queue.add(input);
            }

        }//end for

        br.close();
        System.out.println(sb.toString());


    }//main
}//class
