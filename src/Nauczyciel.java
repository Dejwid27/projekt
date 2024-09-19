public sealed class Nauczyciel extends Osoba permits Wychowawca{
    //ograniczone dziewdziczenie

    private String przedmiot;

    public Nauczyciel(String imie, String nazwisko, int wiek, String przedmiot) {
        super(imie, nazwisko, wiek);
        this.przedmiot = przedmiot;
    }
}
