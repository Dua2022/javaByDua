public class Merge_sort {
    public static void divide(int arr[],int si,int ei){
        if(si>ei){
            return ;
        }
        int mid =(si+ei)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conqure(arr,si,mid,ei);
    }
    public static void conqure(int arr[],int si, int mid,int ei){
        int merged[]= new int[ei-si+1];
        int indx1 =si;
        int indx2= mid+1;
        int m_index =0;
        while (indx1<=mid && indx2 <= ei){
            if (arr[indx1] < arr[indx2]){
                merged[m_index]=arr[indx1];
                m_index++;indx1++;
            }
            else{
                merged[m_index]=arr[indx2];
                m_index++;indx2++;
            }
        }

        while (indx1<=mid){
            merged[m_index]=arr[indx1];
            m_index++;indx1++;
        }
        while(indx2<=ei){
            merged[m_index]=arr[indx2];
            m_index++;indx2++;
        }

        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[i]=merged[j];
        }
    }
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }


    public static void main(String[] args) {
        int arr[]={1,4,2,9,5,6};
        divide(arr,0, arr.length-1);
    }
}
