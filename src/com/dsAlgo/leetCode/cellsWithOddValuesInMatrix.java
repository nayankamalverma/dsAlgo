
/*
* There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.

For each location indices[i], do both of the following:

Increment all the cells on row ri.
Increment all the cells on column ci.
Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.



Example 1:


Input: m = 2, n = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
Example 2:


Input: m = 2, n = 2, indices = [[1,1],[0,0]]
Output: 0
Explanation: Final matrix = [[2,2],[2,2]]. There are no odd numbers in the final matrix.


Constraints:

1 <= m, n <= 50
1 <= indices.length <= 100
0 <= ri < m
0 <= ci < n


Follow up: Could you solve this in O(n + m + indices.length) time with only O(n + m) extra space?
* */

package com.dsAlgo.leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class cellsWithOddValuesInMatrix {
    public static void main(String[] args) {
        int  m = 2, n = 3;
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int cnt=0;
        int[][] arr =new int[m][n];
        System.out.println(Arrays.toString(arr));
        for (int i=0;i<indices.length;i++){
            int r=indices[i][0];
            int c=indices[i][1];
            arr = updateRow(arr,r);
            System.out.println(Arrays.toString(arr));
        }
        return cnt;
    }

    private static int[][] updateRow(int[][] arr, int r) {
        int n=arr[r].length;
        for(int i=0;i<n;i++){
            arr[r][i]++;
        }
        return arr;
    }

}
//
//    /**
//     * The idea is following: since we increment whole rows/columns at once there is no need
//     * to keep the matrix model and insted we can have 2 separate arrays for rows[n] and columns[m].
//     *
//     * By iterating through the indices array we'll be incrementing corresponding values for rows and columns in
//     * their dedicated arrays.
//     *
//     * The second important thing - how to interpret those and see which numbers we'll have? For those purposes we'll
//     * be using several things:
//     * 0. Imagine our matrix as a linear array where all the rows go one after another (quite common practice to
//     *    display multi-dimensional data structures) so that n=0 would mean first m elements, then n=1 -> next m
//     *    elemenst and so on.
//     * 1. overall matrix size (or number of numbers if you like) -> n*m
//     * 2. the fact that by updating the row array by 1, we're updating the whole row to 1
//     *    e.g. if we have n=2 and m=3, then 1 row updated to 1 would mean first 3 numbers in the matrix are 1s
//     * 3. Similar goes for the columns -> +1 to columns at a specific index means we're updating every m-th element in
//     *    that imaginary matrix to +1
//     */
//    public int oddCells(int n, int m, int[][] indices) {
//        int[] rows = new int[n];
//        int[] columns = new int [m];
//
//        //Updating the corresponding arrays in O(n)
//        //here we'll keep track of the updates for each row and column
//        //based on indices array
//        for(int ind=0; ind<indices.length; ind++){
//            rows[indices[ind][0]] ++;
//            columns[indices[ind][1]] ++;
//        }
//
//
//        //Now the fun part - interpreting which numbers we have in result.
//        //Starting from rows array. As you remember, it shows which rows were incremented and how many times.
//        //e.g. [2, 1] would say `first row was incremented twice so we now have all dueces there and
//        // the second one we've incremented only once - so all the elements will be 1s`
//
//        int oddNumbers = 0;
//        int matrixSize = n*m;
//        for(int i=0; i<matrixSize; i++){
//
//            int rowsIncrementIndex = i/m; //e.g. 0,0,0,1,1,1
//            int colsIncrementIndex = i%m; //e.g. 0,1,2,0,1,2
//
//            //then we'll be iterating through n*m numbers in total
//            //the rows[0] would display how we should update our first `n` numbers
//            //the cols[0] - how we additionally should update every `m`-th number
//            //so in order to get the information on how to update this particular number by its index
//            //we can use such calculations (notice how we don't really need n value there):
//            //if i is the current index, then `i/m` would let us get the value from rows array
//            //and the `i%m` - for the columns. Then we just sum those 2 values to get the current number in
//            //the matrix which, in turn, we don't really need to put anything and just increment our oddNumbers
//            //if it is actuall odd.
//            //
//            //e.g. let's go over some example iterations
//            //     consider our rows are [2, 1] and columns are [1,0,1]
//            //i=0  ->  row_index = i/3 = 0;  col_index = i%3 =0; -> 2 + 1 = 3; -> oddNumbers++
//            //i=1  ->  row_index = i/3 = 0;  col_index = i%3 =1; -> 2 + 0 = 2;
//            //i=2  ->  row_index = i/3 = 0;  col_index = i%3 =2; -> 2 + 1 = 3; -> oddNumbers++
//            //i=3  ->  row_index = i/3 = 1;  col_index = i%3 =0; -> 1 + 1 = 2;
//            //i=4  ->  row_index = i/3 = 1;  col_index = i%3 =1; -> 1 + 2 = 1; -> oddNumbers++
//            //i=5  ->  row_index = i/3 = 1;  col_index = i%3 =2; -> 1 + 1 = 2;
//            //
//            //and the result: oddNumbers==3
//            if((rows[rowsIncrementIndex] + columns[colsIncrementIndex]) %2 == 1) {
//                oddNumbers++;
//            }
//        }
//        return oddNumbers;
//    }
//	```
//            }
