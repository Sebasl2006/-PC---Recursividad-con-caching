
public class Maze {
    private boolean[][] grid;
    

    public Maze(boolean[][] maze) {
       this.grid = maze;
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

}
