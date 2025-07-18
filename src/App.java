import java.util.Arrays;
import java.util.List;

import models.Cell;

public class App {
    public static void main(String[] args) throws Exception {
        runEjerciciosPD();
        runMaze();
    }

    private static void runEjerciciosPD() {
        EjerciciosPD ejerciciosPD = new EjerciciosPD();
        //System.out.println("Fibonacci Recursivo: " );
        long start = System.nanoTime();
        long resultado = ejerciciosPD.getFibonaci(100);
        //System.out.println("Resultado: " + resultado + " en tiempo " + (System.nanoTime() - start) + " nanosegundos");

        //System.out.println("Fibonacci Recursivo Caching ");
        start = System.nanoTime();
        long resultadoCaching = ejerciciosPD.getFibonaciCaching(100);
        
        //System.out.println("Resultado: " + resultadoCaching + " en tiempo " +  (System.nanoTime() - start) + " nanosegundos");

    }

    public static void runMaze (){
        boolean[][] predefineMaze = {
            {true, true, true, true},
            {false, true, true, true},
            {true, false, false, true},
            {true, true, true, true}
        };
        Maze maze = new Maze(predefineMaze);
        System.out.println("Sebastian Lopez");
        maze.printMaze();

        Cell start = new Cell(0, 0);
        Cell end = new Cell(3, 3);
        List<MazeSolver> solvers = Arrays.asList(
            new MaseSolverRecursivo(),
            new MazeSolverRecursiveCompletoBT()
            );

        MazeSolver solver = solvers.get(1);
        List<Cell> path;
        path = solver.getPath(maze.getGrid(), start, end);
        System.out.println(path);
        

    }

     {
    
        
    }
}
