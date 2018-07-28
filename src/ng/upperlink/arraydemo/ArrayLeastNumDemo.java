/*
 * A function that, given an array A of N integers, returns the smallest positive integer
  that does not occur in A
 */
package ng.upperlink.arraydemo;

public class ArrayLeastNumDemo {
    public static void main(String[] args){
       int array[] = {-1,-3};
       int positiveNum = getSmallestPositiveInteger(array);
       System.out.println(positiveNum);
    }
  
  public static int getSmallestPositiveInteger(int[] A) {
    int num = 1;
    for (int j = 0; j < A.length; j++) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                if (A[i] == num) {
                    num++;
                    break;
                }

            }
        }

    }
    return num;
}
  
}
