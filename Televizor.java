public class Televizor {
    private int brojKanala;
    private String nazivKanala;
    private int jacinaZvuka;

    public Televizor(int brojKanala, String nazivKanala, int jacinaZvuka) {
        this.brojKanala = brojKanala;
        this.nazivKanala = nazivKanala;
        this.jacinaZvuka = jacinaZvuka;
    }
    public static void main(String[] args) {
        Televizor televizor = new Televizor(100, "HBO", 50);
        System.out.println("Broj kanala: " + televizor.brojKanala);
        System.out.println("Naziv kanala: " + televizor.nazivKanala);
        System.out.println("Jacina zvuka: " + televizor.jacinaZvuka);
    }
}
