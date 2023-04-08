public class Sort {
    
    public static void main(String[] args) {
        int [] array= new int[]{0,5,4,3,10,20,8,9,12,18};

        quickSort(array,0,array.length-1);
        
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }


    public static void bubbleSort(int[] array) {

        boolean finish = false;

        do {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish=true;
                }

            }

        } while (!finish);
    }

    public static void directSort(int[] array){
        for (int i=0; i<array.length-1; i++){
            int minPosition=i;
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[minPosition]){
                    minPosition=j;
                }

            }
            if(i!=minPosition){
                int temp=array[i];
                array[i]=array[minPosition];
                array[minPosition]=temp;
            }
        }    

    }

    public static void insertSort(int[] array){
        for(int i=0; i<array.length-1;i++){
            for(int j=i+1; j<array.length;j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

    }

    public static void quickSort(int[] array, int startPosition, int endPosition){
        int leftPosinion=startPosition;
        int rightPosition=endPosition;
        int pivot=array[(startPosition+endPosition)/2];
        do{
            while(array[leftPosinion]<pivot){
                leftPosinion++;
            }
            while(array[rightPosition]>pivot){
                rightPosition--;
            }
            if(leftPosinion<=rightPosition){
                if(leftPosinion<rightPosition){
                    int temp=array[leftPosinion];
                    array[leftPosinion]=array[rightPosition];
                    array[rightPosition]=temp;
                }
                leftPosinion++;
                rightPosition--;
            }
        }while(leftPosinion<=rightPosition);

        if(leftPosinion<endPosition){
            quickSort(array, leftPosinion, endPosition);
        }
        if(startPosition<rightPosition){
            quickSort(array, startPosition, rightPosition);
        }

    }
    
}
