 public int majorityNumber(ArrayList<Integer> nums, int k) {
        // write your code
         if(nums == null) return -1;
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i< nums.size(); i++){
            if(!hash.containsKey(nums.get(i))) {hash.put(nums.get(i),0);}
            else hash.put(nums.get(i),hash.get(nums.get(i))+1);
            if (hash.get(nums.get(i)) >= nums.size()/k) return nums.get(i);
        }
        return -1;
    }
