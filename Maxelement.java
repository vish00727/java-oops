package OOps;

public  class Charge {
    public static void main(String[] args) {

        int temp=0;
        int [] arr= {23,43,65,87,23,44,34,33};
        for (int i=0; i<arr.length; i++){
            for(int j=0; j<i; j++){
                
            if (arr[i]> arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                  }
            }
            System.out.print(arr[i]);
        }


    }
}




