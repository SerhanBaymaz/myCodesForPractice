package myCodesForPractice.recursiveMethods;

public class RecursiveMethods {
    public static void main(String[] args) {
        //Linear Sum
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("Sum of array is = "+linearSum(array,array.length-1));



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





}
