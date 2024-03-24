import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

//백준 온라인 저지 11003번
public class Test09 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stk.nextToken());
        int L = Integer.parseInt(stk.nextToken());

        stk = new StringTokenizer(br.readLine());

        Deque<Node> deque = new LinkedList<>();
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < N; i++){

            int value = Integer.parseInt(stk.nextToken());

            while(!deque.isEmpty() && deque.getLast().value > value){
                deque.removeLast();
            }//end if

            deque.addLast(new Node(value, i));

            if(deque.getFirst().index <= i - L){
                deque.removeFirst();
            }

            sb.append(deque.getFirst().value + " ");

        }//end for

        System.out.println(sb);

    }//main

    static class Node {

        public int value;
        public int index;

        Node(int value, int index){
            this.value = value;
            this.index = index;
        }

    }

}//class
