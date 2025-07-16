public class App {
    public static void main(String[] args) throws Exception {
        runEjerciciosPD();
    }

    private static void runEjerciciosPD() {
        EjerciciosPD ejerciciosPD = new EjerciciosPD();
        System.out.println("Fibonacci Recursivo: " );
        long start = System.nanoTime();
        long resultado = ejerciciosPD.getFibonaci(100);
        System.out.println("Resultado: " + resultado + " en tiempo " + (System.nanoTime() - start) + " nanosegundos");

        System.out.println("Fibonacci Recursivo Caching ");
        start = System.nanoTime();
        long resultadoCaching = ejerciciosPD.getFibonaciCaching(100);
        
        System.out.println("Resultado: " + resultadoCaching + " en tiempo " +  (System.nanoTime() - start) + " nanosegundos");

    }
}
