import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class LettersPhoneNumber {
    public static void main(String[] args){
        String s="23";
        
        
        int a[]=new int[s.length()];
       
        for(int i=0;i<s.length();i++){
            
           a[i]=s.charAt(i)-'0';
           System.out.println(a[i]+" length:   ");
        }
        
        if(a.length>0){
        List<String> res=possibleWords(a);
        for(String ss:res){
  System.out.println(ss+"    ");
        }
    }
    }

    public static List<String> possibleWords(int[] a){
        String[] mp = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
         // To store the generated letter combinations
         List<String> res = new LinkedList<>();

         // Queue to store intermediate combinations
         Queue<String> q = new LinkedList<>();
         q.add("");
         while(!q.isEmpty()){
            String s=q.poll();

            //System.out.println(a.length+"    ");
            if(s.length()==a.length){
                res.add(s);
            }else{
                //Try all possible letters
                String chars=mp[a[s.length()]];
                for(char c:chars.toCharArray()){
                System.out.println(c+"    ");
                q.add(s+c);
                }
            }

         }

        

         return res;
    }
    
}
