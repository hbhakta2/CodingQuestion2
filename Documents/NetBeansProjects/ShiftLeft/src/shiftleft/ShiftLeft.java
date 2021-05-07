/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiftleft;

/**
 *
 * @author Hardikkumar Bhakta <your.name at your.org>
 */
public class ShiftLeft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("//shift left by 3");
        int[] ary = {1, 2, 3, 4, 5, 6, 7, 8};
        printArray(ary);
        printArray(rotateArray(ary.length, ary, 3));

        System.out.println("//shift left by 2");
        int[] ary2 = {1, 2, 3, 4, 5, 6, 7};
        printArray(ary2);
        printArray(rotateArray(ary2.length, ary2, 2));

        System.out.println("//shift left by 1");
        int[] ary3 = {1, 2, 3, 4, 5, 6};
        printArray(ary3);
        printArray(rotateArray(ary3.length, ary3, 1));

        System.out.println("//shift left by 1");
        int[] ary4 = {1, 2};
        printArray(ary4);
        printArray(rotateArray(ary4.length, ary4, 1));

        System.out.println("//shift left by 1");
        int[] ary5 = {1};
        printArray(ary5);
        printArray(rotateArray(ary5.length, ary5, 1));

        System.out.println("//shift left by 0");
        int[] ary6 = {};
        printArray(ary6);
        printArray(rotateArray(ary6.length, ary6, -1));
    }

    public static int[] rotateArray(int size, int[] array, int shiftBy) {
        int[] shiftedArray = new int[size];
        if (shiftBy >= 0) {
            if (size == 1) {
                shiftedArray[0] = array[0];
                return shiftedArray;
            }
            for (int i = 0; i < size; i++) {
                shiftedArray[i] = array[shiftBy];
                shiftBy++;
                if (shiftBy >= size) {
                    shiftBy = 0;
                }
            }
        }
        return shiftedArray;
    }

    private static void printArray(int[] ary) {
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + " ");
        }
        System.out.println("");
    }

}
