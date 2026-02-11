public class PrintManager {
    public static void main(String[] args) {

        PrintJob p1 = new PrintJob("Juan", 5, 'M');
        PrintJob p2 = new PrintJob("Ana", 2, 'H');
        PrintJob p3 = new PrintJob("Luis", 10, 'L');

        //PrintJob p4 = new PrintJob("Samantha", 10);
        PrintJob p5 = new PrintJob("Carlos", 3, 'H');
        PrintJob p6 = new PrintJob("Maria", 4);

        PrintService servidor = new PrintService();

        servidor.submitJob(p1);
        servidor.submitJob(p2);
        servidor.submitJob(p3);
        //servidor.submitJob(p4);
        servidor.submitJob(p5);
        servidor.submitJob(p6);

        System.out.println("--- ORDEN DE IMPRESION ---");
        servidor.processAll();
    }
}
