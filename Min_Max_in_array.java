package lab11;

public class Min_Max_in_array {
    public static void min(int arr[], int n){
        if (arr[n]<arr[n-1]){
            System.out.println("min = "+arr[n]);
            return;
        }
        min(arr,n-1);
    }
    public static void max(int arr[], int n){
        if (arr[n]>arr[n-1]){
            System.out.println("max = "+arr[n]);
            return;
        }
        max(arr,n-1);
    }
    public static void main(String[] args) {
        int arr[] ={1,4,2,0};
        min(arr,arr.length-1);
        max(arr,arr.length-1);
    }
}
