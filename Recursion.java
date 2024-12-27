/* Online Java Compiler and Editor */
import java.util.*;
class Recursion{

     public static void main(String []args){
         
         Scanner SC = new Scanner(System.in);
         int n = SC.nextInt();
         System.out.println();
         printDec(n);
         printInc(n);
         System.out.println("\n"+factorial(n));
         System.out.println("\n"+SumOfNatural(n));
         System.out.println("\n"+fibo(n));
         
         
         int[] arr = {1,2,3,4,5};
         boolean flag = isSorted(arr, 0);
         System.out.println(flag);
         
         // arr, key, i
         System.out.println(firstOccurance(arr, 3, 0));
         
         int arr1[] = {5,5,5,5};
         System.out.println(lastOccurance(arr1,5,0));
         
         System.out.println(powerOfNumber(2, 10));
     }
     
     public static void printDec(int n){
         if(n == 1){
             System.out.println(1);
             System.out.println();
             return;
         }
         System.out.println(n);
         printDec(n-1);
     }
     
     public static void printInc(int n){
         if(n == 1){
             System.out.println(n+" ");
             return;
         }
         printInc(n-1);
         System.out.println(n);
         
     }
     
     public static int factorial(int n){
         if(n == 0){
             return 1;
         }
         return n* factorial(n-1);
     }
     
     
     public static int SumOfNatural(int n){
         if(n == 1){
            return 1;
         }
         return n+SumOfNatural(n-1);
     }
     
     
     public static int fibo(int n){
         if(n == 0 || n ==1){
             return n;
         }
         
         return fibo(n-1)+fibo(n-2);
     }
     
     
     public static boolean isSorted(int arr[], int i){
         if(i == arr.length-1)
            return true;
        if(arr[i] > arr[i+1])
            return false;
        return isSorted(arr, i+1);
     }
     
     public static int firstOccurance(int[] arr, int key, int i){
         if(i == arr.length)
            return -1;
        if(arr[i] == key)
            return i;
        return firstOccurance(arr, key, i+1);
     }
     
     public static int lastOccurance(int[] arr, int key, int i){
         if(i == arr.length)
            return -1;
        int isFound = lastOccurance(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        
        return isFound;
     }
     
     public static int powerOfNumber(int x, int num){
         if(num == 0){
             return 1;
         }
         return x * powerOfNumber(x, num-1);
     }
}