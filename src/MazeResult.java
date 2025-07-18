import java.util.List;
import java.util.Set;

import models.Cell;

public class MazeResult {
    private List<Cell> path;
    private Set<Cell> visited;
    private boolean[][] grid;



    public MazeResult(List<Cell> path, Set<Cell> visited, boolean[][] grid) {
        this.path = path;
        this.visited = visited;
        this.grid = grid;
    }
    


    public void printMaze() {

        
        for (boolean[] row : grid) {
            for (boolean cell : row) {
                System.out.print(cell ? "- " : "* ");
            }
            System.out.println();
        }
    }

    
    public boolean[][] getGrid() {
        return grid;
    }



    public Set<Cell> getVisited() {
        return visited;
    }

}



