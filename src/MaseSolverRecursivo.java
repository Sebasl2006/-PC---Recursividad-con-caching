import java.util.ArrayList;
import java.util.List;

import models.Cell;

public class MaseSolverRecursivo implements MazeSolver {

    @Override
    public List<Cell> getPath(boolean[][] grid, Cell start, Cell end) {
        if (grid == null || grid.length == 0) {
            return new ArrayList<>();
        }
        List<Cell> path = new ArrayList<>();
        if (findPath(grid, start, end, path)) {
            return path;
        }
        return new ArrayList<>();
    }
       
    
    private boolean findPath(boolean[][] grid, Cell start, Cell end, List<Cell> path) {
        int row = start.row;
        int col = start.col;

        if (row >= grid.length || col >= grid[0].length || !grid[row][col]) {
            return false; 
        }

        if (row == end.row && col == end.col) {
            path.add(start);
            return true;
        }
        if (findPath(grid, new Cell(start.row + 1, start.col), end, path)) {
            path.add(start);
            return true;
        }
        if (findPath(grid, new Cell(start.row, start.col + 1), end, path)) {
            path.add(start);
            return true;
        }

        return false;
    }

}
    
    

