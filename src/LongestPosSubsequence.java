import java.util.Scanner;

public class LongestPosSubsequence {


    public static void main(String[] args) {


        // Uncomment this line if you want to read from a file
        // In.open("public/test1.in");
        // Out.compareTo("public/test1.out");

        Scanner scanner = new Scanner(System.in);
        int[] array; // an array of integers as input


        int length = scanner.nextInt();  // read the length of the input array

        array = new int[length];

        // read the input array
        for (int i = 0; i < length; i++)
            array[i] = scanner.nextInt();

        System.out.println(longest_positive_subarray(array));
        
        scanner.close();

        // Uncomment this line if you want to read from a file
        // In.close();
    }

    public static int longest_positive_subarray(int[] array) {
        int sum = 0;
        for(int num:array){
            if(num > 0) sum += num;
        }


        return sum;

    }


}
