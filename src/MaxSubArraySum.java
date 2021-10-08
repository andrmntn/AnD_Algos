public class MaxSubArraySum {
    int[] input;
    int start;
    int end;


    public MaxSubArraySum(int[] input, int start, int end){

        this.input = input;
        this.start = start;
        this.end = end;

    }

    public int solveMaxSubArraySum(int[] input, int start, int end) {
        //System.out.println("start: " + start + ", end: " + end);

        if (end - start == 0) {
            //System.out.println("Bruder bin rausggeumpt");
            return input[start];
        }

        int mid = (start + end) / 2;

        int lowerhalf = solveMaxSubArraySum(input, start, mid);
        int upperhalf = solveMaxSubArraySum(input, mid + 1, end);
        int middlehalf = solveMaxCrossingSubArraySum(input, start, mid, end);
		/*
		System.out.println(lowerhalf);
		System.out.println(middlehalf);
		System.out.println(upperhalf);

		System.out.println("Späss mal " + Math.max(lowerhalf, Math.max(middlehalf, upperhalf)));
		System.out.println("gehe raus aus - start: " + start + ", end: " + end);*/

        return Math.max(lowerhalf, Math.max(middlehalf, upperhalf));


    }

    public int solveMaxCrossingSubArraySum(int[] input, int start, int mid, int end) {

        int sum = 0;
        int leftmaxsum = 0;
        for (int i = mid; i > start; i--) {
            sum += input[i];
            if (sum > leftmaxsum) {
                leftmaxsum = sum;
            }
        }
        sum = 0;
        int rightmaxsum = 0;
        for (int i = mid + 1; i <= end; i++) {
            sum += input[i];
            if (sum > rightmaxsum) {
                rightmaxsum = sum;
            }
        }

        return leftmaxsum + rightmaxsum;
    }

}
