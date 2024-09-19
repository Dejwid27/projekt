public class Main {
    public static void main(String[] args) {
        Osoba osoba =new Osoba("Jaś", "Stokrotka");
        System.out.println(osoba.getImie());
        System.out.println(osoba.getNazwisko());
        System.out.println(osoba.getWiek());
        osoba.setImie("Jan");
        System.out.println(osoba.getWiek());
        System.out.println(osoba);

        System.out.println("Liczba uczniow: "+Uczen.liczbaUczniow);
        Uczen uczen = new Uczen( "Ewa","Mewa");
        System.out.println(uczen);
        System.out.println("Liczba uczniow: "+Uczen.liczbaUczniow);
        Uczen uczen1 = new Uczen( "Pawel","Jawel");
        System.out.println(uczen1);
        System.out.println("Liczba uczniow: "+Uczen.liczbaUczniow);
        Uczen uczen2 = new Uczen( "ASAP","ROCKY");
        System.out.println(uczen2);
        System.out.println("Liczba uczniow: "+Uczen.liczbaUczniow);

    }
}