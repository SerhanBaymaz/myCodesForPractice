package myCodesForPractice.recursiveMethods;

public class RecursiveMethods {
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,7,8,9,15,19};
    /*
        //Linear Sum

        System.out.println("Sum of array is = "+linearSum(array,array.length-1));
    */

    /*
        //reverseArray
        int[] array2=reverseArray(array,0,array.length-1);
        System.out.print("Reverse of given array is : ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+",");
        }
    */

    /*
        //Computer positive power
        System.out.println("Result power is : "+computePositivePower(2,10));
    */




    }


    public static int linearSum(int[] data,int lastIndex){
        //Computing the sum of a sequence recursively,
        if (lastIndex<0 || data==null){
            return 0;
        }

        if (lastIndex==0){
            return data[0]; //BaseCase
        }else {
            return data[lastIndex]+linearSum(data,lastIndex-1);
        }

    }

    public static int[] reverseArray(int[] data,int firstIndex,int lastIndex){
        if (firstIndex >=lastIndex) {
            return data;
        }else {
            int temp= data[firstIndex];
            data[firstIndex]=data[lastIndex];
            data[lastIndex]=temp;
            return reverseArray(data,firstIndex+1,lastIndex-1);
        }
    }

    public static int computePositivePower(int base,int power){
        if (power==0){
            return 1;
        }else {
            return base*computePositivePower(base,power-1);
        }
    }



}
