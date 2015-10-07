public int trapRainWater(int[] heights) {
        // write your code here
        if (heights == null || heights.length == 0) return 0;
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        int leftmax = 0;
        int rightmax = 0;
        for (int i = 0; i < heights.length; i++){
            if (heights[i] > leftmax){leftmax = heights[i];left[i] = heights[i];}
            else left[i] = leftmax;
            
        }
        for (int i = heights.length - 1; i >= 0; i--){
            if (heights[i] > rightmax){rightmax = heights[i];right[i] = heights[i];}
            else right[i] = rightmax;
        }
        int result = 0;
        for (int i = 0; i < heights.length; i++){
            int temp = Math.min(left[i],right[i]) - heights[i];
            result += temp;
        }
        return result;
    }
