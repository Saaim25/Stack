public class SudokuSolver
{
    public static boolean isSafe(int grid[][], int row, int col, int digit){
        //Column
        for(int i=0; i<=8; i++){
            if(grid[i][col]== digit){
                return false;
            }
        }
        //row
        for(int j=0; j<=8; j++){
            if(grid[row][j]==digit){
                return false;
            }
        }
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(grid[i][j]==digit){
                    return false;
                }
            }
        }
        
        return true;
    }
    public static boolean sudokuSolver(int grid[][], int row,int col){
        //base case
        
        if(row==9){
            return true;
        }
        // recursion
        
        int newRow = row, newCol = col+1;
        if(col+1 == 9){
            newRow = row+1;
            newCol = 0;
        }
        
        if(grid[row][col]!=0){
            return sudokuSolver(grid, newRow, newCol);
        }
        
        for(int digit=1; digit<=9; digit++){
            if(isSafe(grid,row,col,digit)){
                grid[row][col] = digit;
                if(sudokuSolver(grid,newRow,newCol)){
                    return true;
                }
                grid[row][col] = 0;
            }
        }
        return false;
        
    }
    public static void print(int grid [][]){
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
    		int grid [] [] =   { {0, 0, 8, 0, 0, 0, 0, 0, 0},
                                                  {4, 9, 0, 1, 5, 7, 0, 0, 2},
                                                  {0, 0, 3, 0, 0, 4, 1, 9, 0},
                                                  {1, 8, 5, 0, 6, 0, 0, 2, 0},
                                                  {0, 0, 0, 0, 2, 0, 0, 6, 0},
                                                  {9, 6, 0, 4, 0, 5, 3, 0, 0},
                                                  {0, 3, 0, 0, 7, 2, 0, 0, 4},
                                                  {0, 4, 9, 0, 3, 0, 0, 5, 7},
                                                  {8, 2, 7, 0, 0, 9, 0, 1, 3} };
		if(sudokuSolver(grid,0,0)){
		    print(grid);
		}else{
		    System.out.println("solution does not exist");
		}
		
		
	}
}
