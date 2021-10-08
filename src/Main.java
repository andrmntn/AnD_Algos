public class Main {


        public static void main(String[] args) {
            int[] input = new int[] { 2, -3, 4, 5, 6, 7 };

            MaxSubArraySum msas = new MaxSubArraySum(input, 0, 5);

            System.out.println(msas.solveMaxSubArraySum(input, 0, 5));

        }

}
