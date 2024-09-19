import java.util.Scanner;

public abstract class Osoba {
    /*
    z klasy abstrakcyjnej nie mozna ztrobic obiketu sluzy do dziedziczenia
     */
    private String imie;
    private String nazwisko;
    private int wiek;
    //Hermetyzacja -> modyfikatory dostępu
    /*
    public to dostępne wszędzie
    private to dostępne tylko w tej klasie
    protected dostępne w tej klasie i klasie pochodnej
    (w Javie protected to dostępne też w ramach pakietu)
    brak modyfikatora - dostępne w pakiecie
     */

    public Osoba(String imie, String nazwisko, int wiek) {
        //zmienne lokalne, imie, nazwisko i wiek
        this.imie = imie;
        //this.imie pole klasy
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    //przeciążanie konstruktora
    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        wiek =7; // wiek to pole klasy
    }

    //metody dostępowe

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setImie(String imie) {
        System.out.println("Podaj haslo");
        Scanner scanner = new Scanner(System.in);
        String haslo =scanner.next();
        if (haslo.equals("qwe123")){
            this.imie = imie;
        }
        else {
            System.out.println("odmowa dostepu");;
        }
    }

    @Override
    public String toString() {
        return "Osoba: " +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ',';
    }
}

















