public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            newarr[i] = arr[arr.length-1 - i];
        }
        return newarr;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        // REPLACE WITH YOUR CODE HERE
        return -1;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        int num = arr.length-1;
        if (arr[num]/arr[num-1] == arr[1]/arr[0]){
            return true;
            }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
