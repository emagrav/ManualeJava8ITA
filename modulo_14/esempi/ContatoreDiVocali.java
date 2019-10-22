import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.regex.*;

public class ContatoreDiVocali extends RecursiveTask<Integer> {
    private final static long serialVersionUID = 1L;
    private static final int MAX_TOKENS = 5;

    private String 
    private final String[] tokens;
    private final int length;
    private final int inizio;
    private final int fine;

    public ContatoreDiVocali(String text, int inizio, int fine) {
        this.tokens = text.split(" ");
        this.length = tokens.length;
        this.inizio = inizio;
        this.fine = fine;
    }
    
    public ContatoreDiVocali(){
    
    }

    @Override
    protected Integer compute() {
        if (length < MAX_TOKENS) {
            return computeDirectly();
        }
        int split = length / 2;
        ContatoreDiVocali primaParte = new ContatoreDiVocali(text, inizio, start + split);
        primaParte.fork();
        ContatoreDiVocali secondaParte = new ContatoreDiVocali(text, inizio + split, fine);
        return Math.sum(primaParte.compute(), secondaParte.join());
    }

    private int getNumeroVocali(String text) {
        String vocali ="[aeiou]";
        Pattern p = Pattern.compile(vocali);
        Matcher m = p.matcher(text);
        int numeroVocali = m.groupCount();
        return numeroVocali;
    }
    
    private Integer computeDirectly() {
        System.out.println(Thread.currentThread() + " analizzo da: " + inizio  +" a "+ fine);
        String[] parte = new String[MAX_TOKENS];
        for (int i = 0, j = inizio; i < MAX_TOKENS; i++, j++) {
            parte[i] = tokens[j];
        }
        return getNumeroVocali(parte);
    }

    public static void main(String[] args) {
        String testo ="Abbiamo creato con una classe interna un’implementazione dell’interfaccia generica Callable, che nel suo metodo call() (che equivale al metodo run() di Runnable), stampa la situazione e restituisce un Integer, definito direttamente come tipo parametro di Callable. Possiamo invece osservare nel metodo main() della classe TestExecutorService, che viene istanziato un oggetto ExecutorService mediante il metodo newFixedThreadPool(), che istanzia una pool non ridimensionabile di 10 elementi. Poi all’interno del ciclo for viene invocato il metodo submit() (che equivale al vecchio metodo start() della classe Thread) sull’oggetto ExecutorService. Viene poi catturato l’oggetto Future con tipo parametro Integer, che contiene il risultato dell’operazione.";
    // submit the task to the pool
        final ForkJoinPool pool = new ForkJoinPool(4);
        final ContatoreDiVocali contatoreDiVocali = new ContatoreDiVocali(data);
        System.out.println(pool.invoke(contatoreDiVocali));
    }
}