public class Main {


        public static void main(String[] args) {
            double[] input = new double[] { 1, 0.1, 0.5, 5};

            //MaxSubArraySum msas = new MaxSubArraySum(input);
            MaxSubArraySumDP msasdp = new MaxSubArraySumDP(input);

            //System.out.println(msas.solveMaxSubArraySum(input, 0, input.length-1));
            System.out.println(msasdp.solveMaxSubArraySumDP());

        }

}
