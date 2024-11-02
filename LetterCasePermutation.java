import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class LetterCasePermutation {
    public static void main(String[] args){
        String s="a1b2";
        List<String> res=new ArrayList<>();
        res=letterCombinations(s);
        System.out.println(res.toString());

    }
    public static List<String> letterCombinations(String s){

 List<String> res=new ArrayList<>();
String out="";

        //base case
        if(s.length()==0||s==null){
           
            return res;
        }
        //s=s.replaceAll("[0-9]", "");
        backtrack(s,out,res);
        return res;

    }
    public static void backtrack(String input,String output,List<String> res){
        if(input.length()==0){
            res.add(output);
            return;
        }

        
//Base case
        String ch = ("" + input.charAt(0)).toLowerCase();
    String ch2 = ("" + input.charAt(0)).toUpperCase();
    // if(input.contains('[0-9]')){

    // }
    input = input.substring(1, input.length()) ;
    String regex = "(.)*(\\d)(.)*";      
Pattern pattern = Pattern.compile(regex);
boolean containsNumber = pattern.matcher(input).matches();
   // if(containsNumber){
    backtrack(input, output + ch,res);
    backtrack(input, output + ch2,res);
  //  }
    // }else{
    //     backtrack(input, output,res);
    //     backtrack(input, output,res);  
    // }
   

    }
    
}
