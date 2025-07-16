import java.util.Map;

public class EjerciciosPD {
    public long getFibonaci(int n) {
        Map<Integer, Long> cache = new java.util.HashMap<>();
        return fibonacciRecursivo(n, cache);
    
        

    }

    private long fibonacciRecursivo(int n, Map<Integer, Long> cache) {
        if (n <= 1) {
            return n;
        }
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        long result = fibonacciRecursivo(n - 1, cache) + fibonacciRecursivo(n - 2, cache);
        cache.put(n, result);
        return result;
    }

    public long getFibonaciCaching(int n) {
        Map<Integer, Long> cache = new java.util.HashMap<>();
        return fibonacciRecursivo(n, cache);
        
    }
}
    

    
