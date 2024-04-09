import java.util.Arrays;

//1,5,3,x,10을 숫자만 정렬시켜 출력할 것
public class Test17 {

    public static void main(String[] args) {
        String[] arr = {"1", "5", "3", "x", "10"};

        String reg = "\\d+";

        Arrays.sort(arr, (a, b) -> {

            if(a.matches(reg) && b.matches(reg)){
                return Integer.parseInt(a) - Integer.parseInt(b);
            }else if(a.matches(reg)){
                return -1;
            }else if(b.matches(reg)){
                return 1;
            }else{
                return 0;
            }

        });


        System.out.println(Arrays.toString(arr));

    }


}
