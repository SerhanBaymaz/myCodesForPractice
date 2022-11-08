package myCodesForPractice.Algorithms.binarySearch;
public class MyBinarySearch {

    /*
       Array=     [11 ,14 ,19 ,27 ,33 ,45 ,(66) ,74 ,89]
       Index=       0   1   2   3   4   5   6   7   8
     */

    public static boolean binarySearchWithPrint(int[] array,int searchingNumber,int minIndex,int maxIndex){
        int middleIndex = (minIndex+maxIndex)/2;
        if (minIndex>maxIndex){
            return false;
        }
        if (minIndex==maxIndex&&searchingNumber!=array[middleIndex]){
            return false;
        }

        if (searchingNumber==array[middleIndex]){
            return true;
        } else if (searchingNumber > array[middleIndex]) {
            //new min will be middleIndex+1
            //max stay same
            System.out.println("***********************************");
            System.out.println("Searching number = "+searchingNumber);
            System.out.println("Middle number = "+array[(minIndex+(maxIndex-1))/2]);

            printArray(array,middleIndex+1,maxIndex);
            System.out.println();
            System.out.println("***********************************");
            return  binarySearchWithPrint(array,searchingNumber,middleIndex+1,maxIndex);
        }else{
            // min will be same.
            // new max will be middleIndex-1

            System.out.println("***********************************");
            System.out.println("Searching number = "+searchingNumber);
            System.out.println("Middle number = "+array[(minIndex+(maxIndex-1))/2]);
            printArray(array,minIndex,middleIndex-1);
            System.out.println();
            System.out.println("***********************************");
            return binarySearchWithPrint(array,searchingNumber,minIndex,middleIndex-1);
        }
    }

    public static boolean binarySearch(int[] array,int searchingNumber,int minIndex,int maxIndex){
        int middleIndex = (minIndex+maxIndex)/2;
        if (minIndex>maxIndex){
            return false;
        }
        if (minIndex==maxIndex&&searchingNumber!=array[middleIndex]){
            return false;
        }


        if (searchingNumber==array[middleIndex]){
            return true;
        } else if (searchingNumber > array[middleIndex]) {
            //new min will be middleIndex+1
            //max stay same
            return  binarySearch(array,searchingNumber,middleIndex+1,maxIndex);
        }else {
            // min will be same.
            // new max will be middleIndex-1
            return binarySearch(array,searchingNumber,minIndex,middleIndex-1);
        }

    }

    public static void printArray(int[] array,int min,int max){
        for (int i = min; i < max; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("********************************************************************************");
        int[] sortedArray = new int[21];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = (i*i*2+i)+4;
        }

        printArray(sortedArray,0,21);
        System.out.println();
        System.out.println();

        //System.out.println(binarySearch(sortedArray,4,0,21));
        System.out.println(binarySearchWithPrint(sortedArray,4,0,21));

        System.out.println("********************************************************************************");
    }
}
