public class SpecialBinaryMatrix {
    public static void main(String[] args) {
        int[][] input={{1,0,1},{0,0,0},{0,1,0}};
        Solution s=new Solution();
        int res=s.numSpecial(input);
        System.out.println("Result is :"+res);
    }

}
class Solution {
    
   
    
    public int numSpecial(int[][] mat) {
      
       
        int rowLength=mat.length;
        int colLength=mat[0].length;
        int[] colOnes=new int[colLength];
        int[] rowOnes=new int[rowLength];
        for(int i=0;i<rowLength;i++){
            for(int j=0;j<colLength;j++){
            
                if(mat[i][j]==1){
                    rowOnes[i]++;
                    colOnes[j]++;
                }
            }
        }
        int specials=0;
        for(int i=0;i<rowLength;i++){
            for(int j=0;j<colLength;j++){
                
            
                if(mat[i][j]==1){
                    if(rowOnes[i]==1&&colOnes[j]==1){
                        specials++;
                    }
                    //System.out.println("temp row :"+rowOnes[i]);
                //System.out.println("temp col :"+colOnes[j]);
                }
            }
        }
        
        return specials;
    }
}