public class IntegerDigits {
    public static void main(String[] args) {
        int n=234;
        CalMath c=new CalMath();
        int result=c.prodDigits(n)-c.sumDigits(n);
        System.out.println("Result is :"+result);
    }
    
}

class CalMath{
    public int prodDigits(int n){
        int res=1;
        int rem;
        while(n>0){
            rem=n%10;
            n=n/10;
            res=res*rem;
        }
        return res;
    }
    public int sumDigits(int n){
        int res=0;
        int rem;
        while(n>0){
            rem=n%10;
            n=n/10;
            res=res+rem;
        }
        return res;
        
    }
}
