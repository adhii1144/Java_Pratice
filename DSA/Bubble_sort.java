package DSA;

public class Bubble_sort {
    public static void  bubble_sort(int arr[]) {
        int n = arr.length;
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        Sort.sort_Array(arr);
    }
    public static void main(String[] args) {
        int arr[] = {5,6,4,3,2,1};
        bubble_sort(arr);
    }
}
