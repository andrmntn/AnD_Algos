public class Main {


        public static void main(String[] args) {
            int[] input = new int[] { 7, -11, 18, 10, -23, -3, 27, -1};

            MaxSubArraySum msas = new MaxSubArraySum(input);
            MaxSubArraySumDP msasdp = new MaxSubArraySumDP(input);

            System.out.println(msas.solveMaxSubArraySum(input, 0, input.length-1));
            System.out.println(msasdp.solveMaxSubArraySumDP());

        }

}
