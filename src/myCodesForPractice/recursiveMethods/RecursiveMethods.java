package myCodesForPractice.recursiveMethods;

public class RecursiveMethods {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
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

    /*
        //Computer positive power with ( O(logn) )
        System.out.println(computePositivePowerEfficient(2,10));
    */

    /*
        System.out.println(binarySum(array,0,array.length-1));
    */

    /*
        //sum of 2d array
        int[][] array2d = new int[3][3];
        int counter=1;
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                array2d[i][j]=counter;
                counter++;
            }
        }
        //print the array
        System.out.println("The array is : ");
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[0].length; j++) {
                System.out.print(array2d[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Sum of all elements in 2D array is: "+sumOfAllElementsIn2DArray(array2d,0,0));
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

    public static int computePositivePowerEfficient(int base,int power){
        if (power==0){
            return 1;
        }else if(power%2==1) {
            return base*computePositivePowerEfficient(base,(power)/2)*computePositivePowerEfficient(base,(power)/2);
        }else{
            return computePositivePowerEfficient(base,(power)/2)*computePositivePowerEfficient(base,(power)/2);
        }
    }

    public static int binarySum(int[] data,int firstIndex,int lastIndex){
        if (firstIndex>lastIndex){
            return 0;
        }
        if (firstIndex==lastIndex){
            return data[firstIndex];
        }else {
            int middle = (firstIndex+lastIndex)/2;
            return binarySum(data,firstIndex,middle)+binarySum(data,middle+1,lastIndex);
        }

    }

    public static int sumOfAllElementsIn2DArray(int[][] array,int rowIndex,int columnIndex){
        if (rowIndex==array.length-1&&columnIndex==array[0].length-1){
            return array[rowIndex][columnIndex];
        }else if (columnIndex==array[0].length-1){
            return array[rowIndex][columnIndex]+sumOfAllElementsIn2DArray(array,rowIndex+1,0);
        }else {
            return array[rowIndex][columnIndex]+sumOfAllElementsIn2DArray(array,rowIndex,columnIndex+1);
        }
    }


}
