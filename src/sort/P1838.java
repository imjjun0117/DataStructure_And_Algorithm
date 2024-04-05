package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

//버블 정렬 정렬 완료 시 인덱스 구하기 /백준 온라인 저지 1838번
//데이터 갯수 N 제한시간 2초 버블 정렬은 시간초과남
public class P1838 {

    static class Pair implements Comparable<Pair> {
        int index;
        long value;

        public Pair(int index, long value) {
            this.index = index;
            this.value = value;
        }

        public int compareTo(Pair o) {
            return (int) (this.value - o.value);
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int max = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            pq.add(new Pair(i, Integer.parseInt(st.nextToken())));
        }

        int idx = 0;
        while(!pq.isEmpty()) {
            Pair pair = pq.poll();

            if(max < pair.index - idx)
                max = pair.index - idx;

            idx++;
        }

        System.out.println(max);
    }
}//class
