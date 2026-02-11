public class PrintQueue {

    private Cola h;
    private Cola m;
    private Cola l;
    
    public PrintQueue(){
        h = new Cola();
        m = new Cola();
        l = new Cola();
    }

    public void enqueue(PrintJob job) {

        if (job.getPriority() == 'H') {
            h.enqueue(job);
        }
        else if (job.getPriority() == 'M') {
            m.enqueue(job);
        }
        else {
            l.enqueue(job);
        }
    }

    public PrintJob dequeue() {

        if (!h.isEmpty()) 
            return h.dequeue();
        if (!m.isEmpty()) 
            return m.dequeue();
        if (!l.isEmpty()) 
            return l.dequeue();

        return null;
    }

    public boolean isEmpty() {
        return h.isEmpty() && m.isEmpty() && l.isEmpty();
    }
}
