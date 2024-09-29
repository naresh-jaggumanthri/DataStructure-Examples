import java.util.HashMap;

public class Anagram {

    public static void main(String[] args)
    {
       String str1="cat";
       String str2="pat";
       if(areAnagram(str1,str2)){
        System.out.println("Anagram String");
       }else{
        System.out.println("Not a Anagram String");
       }
    }

    static boolean areAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        HashMap<Character,Integer> charCount=new HashMap<Character,Integer>();

        for(char c1:str1.toCharArray()){
            charCount.put(c1,charCount.getOrDefault(c1,0)+1);
        System.out.println("S1"+charCount.toString());

        
        }
        for(char c:str2.toCharArray()){
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
            System.out.println("S2"+charCount.toString());
        }
        for(int count:charCount.values()){
            if(count!=0){
                return false;
            }
        }
       return true;
    }
    
}
