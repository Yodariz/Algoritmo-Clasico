//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;

public class PrintJob {

    private String user;
    private int pages;
    private char priority;
    //(L - Baja, M - Media, H - Alta)


    public PrintJob(String user, int pages, char priority) {
        this.user = user;
        this.pages = pages;
        this.priority = priority;
    }

    public PrintJob(String user, int pages) {
    this(user, pages, 'M');
    }


    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }

    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    // public LocalTime getHora() {
    //     return hora;
    // }
    // public void setHora(LocalTime hora) {
    //     this.hora = hora;
    // }

    public char getPriority() {
        return priority;
    }
    public void setPriority(char priority) {
        this.priority = priority;
    }



    // ------------------ METODOS ------------------
    public int getPriorityValue() {
        switch (priority) {
            case 'H': return 3;
            case 'M': return 2;
            case 'L': return 1;
            default: return 2;
        }
    }
    
    @Override
    public String toString() {
        return "Usuario: " + user +
            " | Paginas: " + pages +
            " | Prioridad: " + priority;
    }
}