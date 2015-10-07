public int sqrt(int x) {
        // write your code here
        if(x==0) {return 0;}
        long start=0;
        long end=x;
        long mid;
        while(start+1<end){
            mid=start+(end-start)/2;
            if(mid*mid>x) end=mid;
            if(mid*mid==x) return (int)mid;
            if(mid*mid<x) start=mid;
        }
        if(end*end<=x) return (int)end;
        if(start*start<=x) return (int)start;
         return 0;
    }
