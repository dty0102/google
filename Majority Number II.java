public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        //1 2 3, 1,3,2 1,4,2
        //将三个不同的数进行抵消操作，在集合中保存两个candidate和他们的count，如果nums[i]不是两个candidate则表明找到了三个不同的数，将count1 count2减一，最后需要判断两个candidate哪个运行次数超过1/3，因为count只能反应抵消的结果而不能反应运行次数总数，所以需要再次循环一遍
        if (nums == null || nums.size() == 0) return -1;
        int candidate1 = 0;
        int candidate2 = 0;
        int count1 = 0;
        int count2 = 0;
        //应该将candidate == nums.get(i)的条件放在count==0之前，因为如果序列为1,1,1,1,2,3则两个candidate都为1,失去了原本应该抵消三个不同的数的意义
        for (int i = 0; i < nums.size();i++){
            if (candidate1 == nums.get(i)) {count1++;}
            else if (candidate2 == nums.get(i)) {count2++;}
            else if(count1 == 0) {candidate1 = nums.get(i);count1 = 1;}
            else if (count2 == 0){candidate2 = nums.get(i);count2 = 1;}
            else {count1--;count2--;}
        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.size();i++){
            if(nums.get(i) == candidate1) {count1++;}
            else if (nums.get(i) == candidate2) {count2++;}
        }
        // for (int i = 0; i < nums.size();i++){
        //     if(nums.get(i) == candidate2) {count2++;}
        // }
        if (count1 > count2) {return candidate1;}
        return candidate2;
    }
