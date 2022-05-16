public class InsertionSORT {
    public static void main(String args[]){
        int A[]={5,1,4,8,10,3};
        int n =6;
        //for unsorted Array
        System.out.println("Unsorted Array");
        for(int i =0; i<n; i++){
            System.out.print(A[i]+" ");
        }
        //for insertion Sort
        System.out.println("\n__________________________________________");
        //loop for pass
for(int i=1; i<n; i++){

    int key,j;
    key = A[i];
    j=i-1;
    //loop for each passes
    while(j>=0 && A[j]>key){
        A[j+1]=A[j];
        j--;
    }
    A[j+1]=key;

}
        System.out.println("\nSorted Array");
        for(int i =0; i<n; i++){
            System.out.print(A[i]+" ");
        }
    }

}
