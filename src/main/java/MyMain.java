import java.util.Arrays; 
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
        int large = arr[0];
        for (int i = 1; i < arr.length; i++){
            large = Math.max(large, arr[i]);
        }
        int seclarge = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (!(arr[i] == large || arr[0] == large)){
                seclarge = Math.max(seclarge, arr[i]);
            }
            else{
                seclarge = seclarge + 0;
            }
        
        }
        return seclarge;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        int [] diff = new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++){
            diff[i] = arr[i + 1]/arr[i];
        }
        int num = diff[0];
        int[] check = new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++){
            check[i] = num;
        }
        for (int i = 0; i < arr.length-1; i++){
            if (Arrays.equals(diff, check) == true){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {1, 5, -3, 4, 6};
        int arr2[] = {-3, 7, 8, 5};

        System.out.println(reverse(arr));
        System.out.println(reverse(arr2));

        System.out.println(secondLargest(arr));
        System.out.println(secondLargest(arr2));

        System.out.println(isGeometric(arr));
        System.out.println(isGeometric(arr2));
    }
}
