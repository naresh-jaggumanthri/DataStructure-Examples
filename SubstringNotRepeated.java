public class SubstringNotRepeated {
    public static void main(String[] args)
    {
        String s = "geeksforgeeks";
        System.out.println(longestUniqueSubstr(s)); 
    }
    static int longestUniqueSubstr(String s){
        int count=0;
        int left=0;
        int right=0;
        int n=s.length();
        boolean[] visited=new boolean[256];
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        while(right<n){
        while(visited[s.charAt(right)]){
            visited[s.charAt(right)]=false;
        left++;
        }
        visited[s.charAt(right)]=true;
        count=Math.max(count,(right-left+1));
        right++;
        }
       


    
    return count;
    }
}
