,4,8,8,8,15,16,23,23,42};
        int res[] = new int[2];
        int first=  LeetCode34(nums,5,true);
        int last = LeetCode34(nums,5,false);
        if(first == -1 || last == -1){
            System.out.println("occurance of target is 0");
        } else 
       
          System.out.println("the occurance of target is :" + (last - first +1));
