import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterPhoneNumbersRecursive {
    private static final HashMap<Character,String> phoneMap=new HashMap<>();
    static{
        phoneMap.put('2',"abc");
        phoneMap.put('3',"def");
        phoneMap.put('4',"ghi");
        phoneMap.put('5',"jkl");
        phoneMap.put('6',"mno");
        phoneMap.put('7',"pqrs");
        phoneMap.put('8',"tuv");
        phoneMap.put('9',"wxyz");

    }
    public static void main(String[] args){
        String s="23";
        List<String> res=new ArrayList<>();
        res=letterCombinations(s);
        System.out.println(res.toString());

    }
     public static List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();

        //base case
        if(digits.length()==0||digits==null){
            return res;
        }
        backtrack(res,new StringBuilder(), digits, 0);
        return res;

     }
     private static void backtrack(List<String>result , StringBuilder combination , String digits,int index){
        if(index==digits.length()){
            result.add(combination.toString());
            return;
        }
        char d=digits.charAt(index);
        String letters=phoneMap.get(d);
        for(char l:letters.toCharArray()){
            combination.append(l);
            backtrack(result, combination, digits, index+1);
            System.out.println("letters==>>"+index);
            combination.deleteCharAt(combination.length()-1);
        }

     }
    
}
