import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5]; // array of primitives
        arr[0] =45;
        arr[1] =5;
        arr[2] =15;
        arr[3] =30;
        arr[4] =8;
        // [45,5,15,30,8]
        System.out.println(arr[3]);


        // input using for loops
//        for (int i=0;i<arr.length;i++){
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int num : arr) { // for every element in array,print the element
//            System.out.print(num + " "); // here num represents element of the array
//        }
        // array of objects
        String[] str = new String[4];
        for (int i = 0; i <str.length ; i++) {
            str[i] = in.next();

        }
        System.out.println(Arrays.toString(str));


    }
}
