import java.util.ArrayList;
import java.util.Collections;

//숫자만 정렬해서 출력하기
public class Test18 {

    public static void main(String[] args) {

        String[] arr = {"a", "1", "b", "5", "c", "3", "x", "y", "10"};
        ArrayList<Integer> list = new ArrayList<Integer>();

        String intReg = "\\d+";
        for(String str : arr){

            if(str.matches(intReg)){
                list.add(Integer.parseInt(str));
            }//end if

        }//end for


        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(int i = list.size() - 1; i >= 0; i--){
           sb.append(list.get(i)+" ");
        }//end for

        System.out.println(sb.toString());

    }//main

}//class
