public class PrintService {
    private PrintQueue cola;

    public PrintService() {
        cola = new PrintQueue();
    }

    // ------------------ METODOS ------------------
    // Cuando lo mando es enquence 
    public void submitJob(PrintJob job){
        cola.enqueue(job);
    }

    //Procesar el siguiente elemento arriba es dequeue
    public void processNext(){
        if(!cola.isEmpty()){
            PrintJob job = cola.dequeue();
            System.out.println("Imprimiendo: " + job);
        }else{
            System.out.println("No hay mas trabajos en cola");
        }
    }

    public void processAll(){
        while(!cola.isEmpty()){
            processNext();
        }
        System.out.println("Se procesaron todos los trabajos");
        return;
    }
}

