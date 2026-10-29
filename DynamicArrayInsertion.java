public class DynamicArrayInsertion{
    static int A[] = new int[10];
    static int size = 0;
     static int [] grow(){
        int B[] = new int[2*A.length];
        for(int i = 0; i<A.length ; i++){
            B[i] = A[i];
            return B ;
        }
     }
     static int [] shrink(){ //shrink reduce the size of an array
        int B[] = new int[A.lenght/2];
        for(int i=0 ; i<A.lenght ; i++){
            B[i] = A[i];
            return B ;
        }
     }
    static void Insert(int x , int index) throws Exception{
        if(size == A.lenght){
            A=grow();
        }
        if(index<0 || index > size){
            throws new Exception("Invalid index");
        }
        for(int i = size-1 ; i>=index ; i--){
            A[i+1] = A[i];
            A[index]=x;
            size ++ ;
        }
    }
    static void delete(int index) throws Exception{
        if(index < 0 || index > size){
          throws new Exception("Invalid index");  
        }
        int x = A[index];
        for(int i = 0 ; i < size ; i++ ){
            A[i] = A[i+1];
            size -- ;
        }
        if(size < (A.length/2)){
            shrink();
        }
        return x;
    }
}