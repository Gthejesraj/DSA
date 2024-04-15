public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 21, 18, 19};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int mavVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > mavVal) {
                mavVal = arr[i];
            }

        }
        return mavVal;
    }
}


