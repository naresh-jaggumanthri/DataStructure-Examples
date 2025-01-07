public class MaximumWealth {
    public static void main(String[] args) {
        CalRich c=new CalRich();
        int[][] input={{1,5},{7,3},{3,5}};

        int res=0;
        res=c.findRichest(input);

        System.out.println("The result is: "+res);
       
    }

}

class CalRich{
    public int findRichest(int[][] accounts){
        int res = 0;
        for(int i =0;i<accounts.length;i++){
            int temp = 0;
            for(int j = 0;j<accounts[i].length;j++){
                temp+=accounts[i][j];
            }
            res = Math.max(res,temp);
        }
        return res;
    }
}
