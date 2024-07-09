/*
 Youaregivenanintegerarraylistnums.Anumberxislonelywhenitappearsonlyonce,and
 no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
 Return all lonely numbers in nums. You may return the answer in any order.
 Sample Input 1: nums = [10,6,5,8]
 Sample Output 1: [10,8]
 Explanation :- 
 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
 5 is not a lonely number since 6 appears in nums and vice versa.
 Hence, the lonely numbers in nums are [10, 8].
 Note that [8, 10] may also be returned.
 */


 import java.util.*;
 public class LonelyNumbersinArrayList {
     public static void main(String[] args) {
         Scanner SC = new Scanner(System.in);
         int n = 4;
         ArrayList<Integer> list = new ArrayList<>();
         for(int i=0; i<n; i++){
             list.add(SC.nextInt());
         }
         ArrayList<Integer> lonelyNumbers = new ArrayList<>();
 
         for(int i=0; i<n; i++){
             boolean isLonely = true;
             for(int j=1; j<n; j++){
                 if(i != j && (list.get(i) == list.get(j) || list.get(i) - 1 == list.get(j) || list.get(i) + 1 == list.get(j))){
                     isLonely = false;
                     break;
                 }
             }
             if(isLonely){
                 lonelyNumbers.add(list.get(i));
             }
         }
         System.out.println(lonelyNumbers);
         SC.close();
     }
 }
