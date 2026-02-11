public class Cola{
    
    private Node inicio;
    private Node ultimo;

    // ------------------ METODOS ------------------

    public void enqueue(PrintJob job) {
        Node newNode = new Node(job);

        if (ultimo == null) {
            inicio = ultimo = newNode;
            return;
        }

        ultimo.next = newNode;
        ultimo = newNode;
    }

    public PrintJob dequeue() {
        if (inicio == null){
            return null;
        }
        PrintJob job = inicio.job;
        inicio = inicio.next;

        if (inicio == null){
            ultimo = null;
        }
        return job;
    }

    public boolean isEmpty(){
    return inicio == null;
    }
}