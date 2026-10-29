public int LinearSearch(int A[] , int size ,int value , int key) {
    for(int i=0 ; i<size ; i++){
        if(key == A[i]){
            return i ;
        }
        return -1 ;
    }
}
