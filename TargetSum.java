

public class TargetSum {
    public static void main(String[] args){
        int[] v=new int[]{1,1,1,1,1,1};
        int n=v.length;
        int target=1;
        int res=calTotalWay(v,target,n-1);
        System.out.println("result is:"+res);


    }
    public static int calTotalWay(int[] nums,int target,int index){
        if(index==0){
            int ways=0;
            if(target-nums[index]==0){
                ways++;
            }
            if(target+nums[index]==0){
                ways++;

            }
            return ways;
        }
        int addition=calTotalWay(nums,target+nums[index],index-1);
        int subtraction=calTotalWay(nums,target-nums[index],index-1);

        return addition+subtraction;
    }
    
}
