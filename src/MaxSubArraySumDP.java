public class MaxSubArraySumDP {

    int maxEnding = Integer.MIN_VALUE;
    int[] input;
    //int endindex;



    public MaxSubArraySumDP(int[] input){
        this.input = input;
        //this.endindex = endindex;
    }

    public int solveMaxSubArraySumDP() {
        compute(input.length-1);
        return maxEnding;
    }

    public int compute(int endindex) {

        if (endindex == 0){
            return input[0];
        }

        int prevresult = compute(endindex-1);
        if( prevresult >= 0){
            
            if (maxEnding < prevresult+input[endindex]) maxEnding = prevresult+input[endindex];

            return prevresult+input[endindex];
        }
        return input[endindex];
    }
}
