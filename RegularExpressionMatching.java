public class RegularExpressionMatching {
    public static void main(String[] args) {
        String s="aa";
        String p="a*";
        System.out.println(isMatch(s,p));

        System.out.println(isMatch("aab", "a.*"));
        System.out.println(isMatch("aa", "a"));
        System.out.println(isMatch("aa", "a*"));
        System.out.println(isMatch("ab", ".*"));
        System.out.println(isMatch("mississippi", "mis*is*p*."));


    }
    public static boolean isMatch(String s,String p){
        int i=p.length();
        int j=s.length();

        return isMatchRec(i,j,s,p);

    }

    public static boolean isMatchRec(int i,int j,String s,String p){
        //base1 condition if pattern is empty
        if(i==0){
            return j==0;
        }
        //base2 if text is empty
        if(j==0){
            return(i>=2 && p.charAt(i-1)=='*')&&isMatchRec(i-2,j,s,p);
        }

         //case 1
         if(p.charAt(i-1)==s.charAt(j-1) || p.charAt(i - 1) == '.'){
           return isMatchRec(i-1,j-1,s,p);
         }

        

       // Handle '*' in the pattern
        if (p.charAt(i - 1) == '*' && i > 1) {
           
            // Check if '*' can represent zero occurrences
            // of the preceding character
            boolean zero = isMatchRec(i-2,j,s,p);

            // Check if '*' can represent one or more occurrences
            // of the preceding character
            //System.out.println("str is :=="+p.charAt(i-1));
            boolean oneOrMore = (p.charAt(i - 2) == s.charAt(j - 1) || p.charAt(i - 2) == '.') && isMatchRec(i,j-1,s,p);

            return zero || oneOrMore;
        }

        // If no match
        return false;
    }


}
