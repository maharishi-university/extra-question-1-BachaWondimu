Map map = new HashMap<Integer, Integer>();

public int[] findIndices(int[] nums, int target){
    int diff = target-nums[0];
    if(diff<target){
        map.put(diff, 0);
    }
    int [] res = new int[2];

    for(int i=1; i< nums.length; i++){
        Integer index = map.get(1);
        value = nums[i];

        if(index != null){
            res[0] = index;
            res[1] = value;
            return res;
        }
        else{
            if(i<target){
                map.put(value,i);
            }
        }
        
    }
    return res;
}