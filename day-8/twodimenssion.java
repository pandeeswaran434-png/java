package day8;

public class twodimenssion {
    public static void main(String[] args){
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int target=3;
        if(ls(arr,target)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
    public static boolean ls(int[][]arr ,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++)
            {
                if(target==arr[i][j]){
                    return true;
            }
            }
        }
        return false;
    }
}
