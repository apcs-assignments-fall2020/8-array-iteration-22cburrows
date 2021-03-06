//did with Rasika
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
        int seclarge = -1000000000;
        for (int i = 0; i < arr.length; i++){
            if (!(arr[i] == large)){
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
        double [] diff = new double[arr.length-1];
        for (int i = 0; i < arr.length-1; i++){
            double r = (double) arr[i + 1]/arr[i];
            diff[i] = r;
        }
        double num = diff[0];
        int counter = 0;
        for (int i = 0; i < arr.length-1; i++){
            if (num == diff[i]){
                counter = counter + 1;
            }
        }
        if (counter == arr.length-1){
            return true;
        }
        else{
            return false;
        }
            
    }

    public static void main(String[] args) {
        
        int arr[] = {9, 5, -3, 4, 6};
        int arr2[] = {-3, 7, 8, 5};

        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(Arrays.toString(reverse(arr2)));

        System.out.println(secondLargest(arr));
        System.out.println(secondLargest(arr2));

        System.out.println(isGeometric(arr));
        System.out.println(isGeometric(arr2));
    }
}
