/*
In a class of ‘n’ Students the teacher distributed an answer sheet to the students. Few students have scored very good marks but few have scored very few marks. The teacher is not happy with the performance of the students in the test. So she wants to change the seating arrangement a bit. She wants students scoring less to sit with students who score good marks so that they can get some help. So, to begin with, she wants that on the first bench, two students should sit, that the difference between the marks of those two students comes out to a maximum.
Students have got their marks and the marks of students have been arranged in the array where ‘Mi’ determines the marks of the ith student.
Your task is to determine the maximum difference of marks that can be achieved between the students followed by how many such pairs are in the class that follow the conditions mentioned above and are eligible to sit on the first bench.
Note if one pair is already selected as (I,j) then (j,i) will not be considered.
Example 1:
Input
3 -> Number of the students ‘n’
2 5 6 -> Marks of each student Mi

Output
4 1 -> Maximum difference of marks followed by the number of pairs possible with that difference space-separated.

Explanation
The maximum mark difference is between 1st and 3rd students, which is 6-2=4.
And the valid pair thus can be only (2,6) thus, the count is 1.
 */

import java.util.*; 
public class HighandLowMarks {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt(); // No of Students
        int[] arr = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i]= SC.nextInt();
        }

        int left = arr[0];
        int right = arr[n-1];

        int count=0;
        int val = right-left;

        for(int i=0; i<n; i++){
            for(int j=n-1; j>=0; j--){
                if((arr[j] - arr[i] ) == val){
                    count++;
                }
            }
        }
        System.out.println(val+" "+count);
        SC.close();
    }
}
