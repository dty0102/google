public class Solution {
    /**
     * @param grid a boolean 2D matrix
     * @return an integer
     */
    private boolean[][] temp = null;
    public int numIslands(boolean[][] grid) {
        // Write your code here
        if (grid == null || grid.length == 0) return 0;
        int result = 0;
        temp = grid;
        for(int i = 0; i < temp.length; i++){
            for(int j = 0; j < temp[0].length;j++){
                if(temp[i][j]) {remove(temp,i,j);result++;}
            }
        }
        return result;
    }
    private void remove(boolean[][] grid, int i, int j){
        grid[i][j] = false;
        if (i - 1 >= 0){
            if (grid[i - 1][j]) {remove(grid,i-1,j);}
        }
        if (j - 1 >= 0){
            if (grid[i][j - 1]) {remove(grid,i,j - 1);}
        }
        if (i + 1 < grid.length){
            if (grid[i + 1][j]) {remove(grid,i+1,j);}
        }
        if (j + 1 < grid[0].length){
            if (grid[i][j + 1]) {remove(grid,i,j + 1);}
        }
        return;
    }
}
