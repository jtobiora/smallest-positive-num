/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ng.upperlink.arraydemo;


/**
 *
 * @author Toshiba
 */
public class ArrayLeastNumDemo {
    public static void main(String[] args){
       int array[] = {-1,-3};
       
       System.out.println(getSmallestPositiveInteger(array));
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
