public class MaxSubArraySumDP {

    double maxEnding = (double) Integer.MIN_VALUE;
    double[] input;
    //int endindex;



    public MaxSubArraySumDP(double[] input){
        this.input = input;
        //this.endindex = endindex;
    }

    public double solveMaxSubArraySumDP() {
        double res = compute(input.length-1);

        if (maxEnding < res) maxEnding = res;

        return maxEnding;
    }

    public double compute(int endindex) {

        if (endindex == 0){
            return input[0];
        }

        double prevresult = compute(endindex-1);
        if( prevresult >= 1){
            
            if (maxEnding < prevresult*input[endindex]) maxEnding = prevresult*input[endindex];

            return prevresult*input[endindex];
        }

        return input[endindex];
    }
}
