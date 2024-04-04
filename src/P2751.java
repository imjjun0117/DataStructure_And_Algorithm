import java.io.*;

//수 정렬하기2 백준 온라인 저지 2751번
//merge sort를 이용할것 (nlogn)
public class P2751 {
    public static int[] A,tmp;
    public static long result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        A = new int[N+1];
        tmp = new int[N+1];

        for(int i = 1; i <= N; i++){
            A[i] = Integer.parseInt(br.readLine());
        }

        merge_sort(1, N);

        for(int i = 1; i <= N; i++){
          bw.write(A[i] + "\n");
        }//end for

        bw.flush();
        bw.close();
        br.close();

    }//main

    private static void merge_sort(int s, int e){
        if(e - s < 1){
            return;
        }//end if

        int m = s + (e-s)/2;

        //재귀 호출
        merge_sort(s, m);
        merge_sort(m + 1, e);

        for(int i = s; i <= e; i++){
            tmp[i] = A[i];
        }//end for

        int k = s;
        int index1 = s;
        int index2 = m+1;

        while(index1 <= m && index2 <= e){
            //두 그룹을 병합하는 로직
            //양쪽 그룹의 index가 가리키는 값을 비교해 더 작은 수를 선택해 배열에 저장하고
            //선택된 데이터의 index값을 오른쪽으로 한칸 이동하기
            if(tmp[index1] > tmp[index2]){
                A[k] = tmp[index2];
                k++;
                index2 ++;

            }else{
                A[k] = tmp[index1];
                k++;
                index1++;
            }//end else
        }
        while(index1 <= m){
            A[k] = tmp[index1];
            k++;
            index1++;
        }

        while(index2 <= e){
            A[k] = tmp[index2];
            k++;
            index2++;
        }

    }//merge_sort

}//class

