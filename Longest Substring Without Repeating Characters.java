public int lengthOfLongestSubstring(String s) {
        // write your code here
        if(s == null || s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        int left = 0;
        int i = 0;
        int len = s.length();
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        while(left <= i && i < len) {
            //if (i == len - 1) {max = Math.max(max,i - (left - 1));break;}
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),i);
                if (i == len - 1) {max = Math.max(max,i - (left - 1));break;}
                else i++;}
            else if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) >= left) {
                max = Math.max(max,i - left);
                left = map.get(s.charAt(i)) + 1; 
                map.put(s.charAt(i),i);
                i++;
            }
            else if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) < left){
                map.put(s.charAt(i),i);
                i++;
            }
        }
        return max;
    }
