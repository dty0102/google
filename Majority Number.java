//可用一个集合， 将两个不一样的数从集合里扔掉
    //集合中可以只保存candidate 和 count, 如果candidate = nums[i] 则 count ++
    // 当count == 0 时表示这个candidate已经被抵消掉了，并不是majority number
     public int majorityNumber(ArrayList<Integer> nums) {
         if(nums == null || nums.size() == 0) return -1;
         int candidate = 0;
         int count = 0;
         for (int i = 0; i < nums.size(); i++){
             if (count == 0){
                 candidate = nums.get(i);
                 count++;
             }
             else{
                 if(candidate != nums.get(i)){
                     count --;
                 }
                 else {
                     count++;
                 }
             }
         }
         return candidate;
     }
