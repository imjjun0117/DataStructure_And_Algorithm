package sort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


//배열 1,5,3,x,10 을 숫자만 나오게 순서대로 정렬하기
public class Pxxxx {

    public static void main(String[] args) throws IOException {

        String[] strArr = {"1", "5", "3", "x", "10"};
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for(String str : strArr){

            try{

                numbers.add(Integer.parseInt(str));

            }catch(Exception e){


            }//end catch

        }//end for


        Collections.sort(numbers);

        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

    }
}
