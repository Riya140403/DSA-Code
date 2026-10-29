public class BinarySearch{
    public int [] bubblesort(int A[]){
    int i,j, n = A.length;
    for(i = 0;i<n;i++){
        for(j=0;j<n;j++){
            if(A[j] > A[j+1]){
                int temp = A[j];
                A[j]=A[j+1];
                A[j+1]=temp;
            }
        }
    }

    return A;
}
    public int Binaryrecursion(int A[],int key,int low,int high){
        A = bubblesort(A);
        if(low>high){
            return -1 ;
        }
        int mid =(low+high)/2;
        if (key==mid){
            return mid ;
        }
        else if (key>mid){
            return Binaryrecursion(A,key,mid+1,high);
        }
        else{
            return Binaryrecursion(A,key,low,mid-1);
        }
    }
    public int BinarySearchiterative(int key , int A[]) {
        A = bubblesort(A);
        int l=0;
        int h=A.length-1;
        int mid ;
        while(l<=h){
            mid = (l+h)/2;
            if(key == mid){
                return mid ;
            }
            else if(key < A[mid]){
                h = mid-1 ;
                    }
            else if(key > A[mid]){
                l = mid + 1 ;
            }
        }
        return -1;
    }
}