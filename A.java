package preparation;

public class A {
    static int Binary_search(int arr[], int l,int r,int x){
        while (r>=l){
            int mid = l+(r-1)/2;
            if (arr[mid]==x){
                System.out.println("element found");
                return mid;
            }
            if (arr[mid]<x){
                return Binary_search(arr,l,mid-1,x);
            }
            else {
                return Binary_search(arr,mid+1,r,x);
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]= {1,6,2,4,8,9,3};
        int x = 4;
        int result = Binary_search(arr,0, arr.length-1,x);
        if (result == -1){
            System.out.println("element not found");
        }
        else {
            System.out.println("element found at index "+result);
        }
    }
}
