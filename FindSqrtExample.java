class DoSqrt{
    int calSquare(int x,int i,int j){
        int mid=i+(j-i)/2;
        int mul=mid*mid;
        if(mul==x){
            return mid;
        }else if(mul<x){
            return calSquare(x, mid, j);
        }else{
            return calSquare(x, i, mid);
        }

    }
    int findSqrt(int x){

        if(x==0||x==1){
            return x;
        }
        int start=1;
        int end=x;
        int mid=-1;
        while (start<=end) {
            mid=start+(end-start)/2;
            if ((long) mid * mid > (long) x){
                end=mid-1;

            }else if(x==mid*mid){
                System.out.println("Perfect Square:"+mid);
                return mid;
    
            }else{
                start=mid+1;
            }
    
        }
       
        return Math.round(end);

    }
}
public class FindSqrtExample {
    public static void main(String[] args){
        int x=8;
        DoSqrt d=new DoSqrt();
        int res=d.findSqrt(x);
        System.out.println("result is :"+res);
        


    }
    
}
