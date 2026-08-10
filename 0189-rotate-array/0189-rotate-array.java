class Solution {
    public void rotate(int[] arr, int k) {
        int l=0;
        int n=arr.length;
         k=k%n;
        int r=n-1;
            while(r>l){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        int i=0;
        int j=k-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        int m=k;
        int m2=n-1;
        while(m<m2){
            int temp=arr[m];
            arr[m]=arr[m2];
            arr[m2]=temp;
            m++;
            m2--;
        }
    }
}