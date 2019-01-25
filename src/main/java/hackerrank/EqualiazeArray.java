package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class EqualiazeArray {


        // Complete the equalizeArray function below.
        static int equalizeArray(int[] arr) {
            Arrays.sort(arr);
            int result = 0;
            for(int i = 0  ; i < arr.length ; i++){
                int count = 0;
                for(int j = i; j < arr.length ; j++){
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }

                if( result < count){
                    result = count;
                }

            }
            return arr.length - result;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int result = equalizeArray(arr);

            scanner.close();
        }



}
