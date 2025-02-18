package DSA;

public class Sortings {
    public static void selection_sort(int arr[]){
        int n = arr.length;
        int smin =0;
        for(int i=0;i<=n-2;i++){
            smin =i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[j] < arr[smin]) smin=j;
            }
            int temp = arr[smin];
            arr[smin] = arr[i];
            arr[i] = temp;
        }
        for(int ele : arr){
            System.out.print(ele +" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        selection_sort(arr);
    }
}
