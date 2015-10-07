public ArrayList<Integer> maxSlidingWindow(int[] nums, int k) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        
        Deque<Integer> deque = new LinkedList<Integer>();
        deque.add(0);
        
        for (int i = 1; i < k; i++) {
            while (deque.size() > 0 && nums[i] >= nums[deque.peekFirst()]) {
                deque.pollFirst();
            }
            deque.addFirst(i);
        }
        
        for (int i = k; i < nums.length; i++) {
            result.add(nums[deque.peekLast()]);
            
            while (deque.size() > 0 && nums[i] > nums[deque.peekFirst()]) {
                deque.removeFirst();
            }
            deque.addFirst(i);
            
            if (deque.peekLast() <= i - k) {
                deque.removeLast();
            }
        }
        
        result.add(nums[deque.peekLast()]);
        return result;
    }
