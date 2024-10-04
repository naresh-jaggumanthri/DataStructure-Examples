import java.util.ArrayList;
class CalPalindromes{
    boolean checkPalindrome(String s){
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
                i++;
                j--;
        }

        return true;
    }
    void doPartition(ArrayList<ArrayList<String>> res,int ind,String s,ArrayList<String> curr){
        //if we reach end of the string
        //add the current list to the result
        if(ind==s.length()){
            res.add(new ArrayList<String>(curr));
            return;
        }
        String temp="";
        for(int i=ind;i<s.length();i++){
            temp+=s.charAt(i);

            //check if given string is palindrome or not
            if(checkPalindrome(temp)){
                //adds the string to curr
                curr.add(temp);
                //recursive call
                doPartition(res, ind+1, s, curr);
//backtracking remove the string from curr
                curr.remove(curr.size()-1);

            }
        }

    }
}
public class AllPossiblePalindromes {
    public static void main(String[] args){
        CalPalindromes c=new CalPalindromes();
        String s="nitin";
        ArrayList<ArrayList<String>> res=new ArrayList<>();
        int ind =0;
        ArrayList<String> curr=new ArrayList<>();

        //partition the string
        c.doPartition(res, ind, s, curr);

        //print items
        for(ArrayList<String> iter:res){
System.out.println(iter);
        }
    }
    
}
