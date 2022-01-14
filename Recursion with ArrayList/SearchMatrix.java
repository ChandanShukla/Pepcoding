package Practice;

public class SearchMatrix {
    public static int temp;
    public static int searchItem(int [][]arr,int item,int currRow, int currCol){
        if(currRow<arr.length){
            if(currCol < arr[0].length){
                if(arr[currRow][currCol] == item){
                    return item;
                }else{
                    temp = searchItem(arr,item,currRow,currCol+1);
                }

            }else{
                temp = searchItem(arr,item,currRow+1,0);
            }
        }
        return temp;
    }


    public static void main(String [] args){
        int [][]matrix =  {{1,2,3,5,6,9},{4,5,9,7,8,9},{7,8,9,7,9,100}};
        System.out.println("Item Value: "+searchItem(matrix,100,0,0));
    }
}
