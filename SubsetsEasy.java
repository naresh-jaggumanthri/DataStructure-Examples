import java.util.ArrayList;
import java.util.List;

public class SubsetsEasy {
    public static void main(String[] args){
        int[] arr = { 0,1,2,3 };
        List<List<Integer>> res = subsets(arr);
        // Print the generated subsets
        for (List<Integer> subset : res) {
            for (Integer num : subset) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }

     public static List<List<Integer> >
    subsets(int[] A)
    {
        List<Integer> subset = new ArrayList<>();
        List<List<Integer> > res = new ArrayList<>();

        int index = 0;
        
        calcSubset(A, res, subset, index);

        return res;
    }


    public static void calcSubset(int[] A,
    List<List<Integer> > res,
    List<Integer> subset,
    int index)
{
// Add the current subset to the result list
if (index == A.length) {
    res.add(convertArrayToList(A));
    return;
}


// Generate subsets by recursively including and
// excluding elements
for (int i = index; i < A.length; i++) {
// Include the current element in the subset
//subset.add(A.get(i));

// Recursively generate subsets with the current
// element included
swap(A, index, i);
calcSubset(A, res, subset, index + 1);
swap(A, index, i);


// Exclude the current element from the subset
// (backtracking)
//System.out.println("subset 1"+subset.toString());
//subset.remove(subset.size() - 1);

}
}
static List<Integer> convertArrayToList(int[] arr) {
    List<Integer> list = new ArrayList<>();
    for (int num : arr) {
        list.add(num);
    }
    return list;
}
static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}



    
}
