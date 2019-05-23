package ordenacao;

public class InsertionSort {

	public InsertionSort() {
		
	}
	
	public void ordenaInsertSort(int[] vet){
        for(int i = 1; i < vet.length; i++){
            for(int j = i; j > 0; j--){
                if(vet[j-1] > vet[j]){
                    int aux = vet[j];
                    vet[j] = vet[j-1];
                    vet[j-1] = aux;
                }
            }
        }
    }
	
	public void imprimeArray(int arr[]){ 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
	
}
