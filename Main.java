import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Q: store a roll number
        int a = 19;

        // Q: store a person's name
        String name = "Thejes";

        // syntax
        // datatype[] variable _name = new datatype[size];

        // store 5 roll no:
//        int[] rnos = new int[5];
        // or directly
//        int[] rnos2 = {23,19,45,178};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // actually object is being created in the memory(heap)
        System.out.println(ros[0]);

        String arr[] = new String[4];
        System.out.println(arr[0]);
    }
}