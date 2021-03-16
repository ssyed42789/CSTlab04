/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication48;

/**
 *
 * @author ssyed
 */
public class JavaApplication48 {
    
    private static int col;

   
    public static void main(String[] args) {
       
        int[][] myGrid = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
        
        int[][] myGrid2 = { {-9,11,-5,6,12}, {-90,-100,-65,-23,-87} };
        printMaxOfEachRow(myGrid2);
        
    }
    public static void printMaxOfEachRow(int[][] inputArray) {
        int maxofEachRow;
        
        for(int row = 0; row < inputArray.length; col++){
            
            maxofEachRow = inputArray[row][0];
            for(int col = 0; col < inputArray[row].length; col++){
                if(inputArray[row][col] > maxofEachRow) {
                    maxofEachRow = inputArray[row][col];
                }
            }
            System.out.println("The MAX value at row" + row + "is :" + maxofEachRow);
        }
    }
}
