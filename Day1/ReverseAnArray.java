package Day1;

public class ReverseAnArray {
        public static void reverseArray(int Array[]){
            int first=0, last=Array.length-1;
            while(first<last){
                //swap
                int temp=Array[last];
                Array[last]=Array[first];
                Array[first]=temp;

                first++;
                last--;
            }
        }
        public static void main(String[] args) {
            int Array[]={2, 4, 6, 8, 10};
            reverseArray(Array);
            for(int i=0; i<Array.length; i++){
                System.out.print(Array[i]+ " ");
            }
            System.out.println();
        }
    }

