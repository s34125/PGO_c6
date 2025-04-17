public class TestBiblioteki {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Wiedźmin", 1990, "Andrzej Sapkowski", 320);
        Ksiazka ksiazka2 = new Ksiazka("Pan Tadeusz", 1834, "Adam Mickiewicz", 600);
        Film film1 = new Film("Zielona Mila", 1999, "Frank Darabont", 189);
        Film film2 = new Film("Skazani na Shawshank", 1994, "Frank Darabont", 142);

        MediaBiblioteczne[] mediaArray = new MediaBiblioteczne[4];
        mediaArray[0] = ksiazka1;
        mediaArray[1] = ksiazka2;
        mediaArray[2] = film1;
        mediaArray[3] = film2;

        System.out.println("===== INFORMACJE O WSZYSTKICH MEDIACH =====");
        for (MediaBiblioteczne media : mediaArray) {
            media.wyswietlInformacje();
            System.out.println("--------------------");
        }

        System.out.println("\n===== OPERACJE WYPOŻYCZANIA I ZWRACANIA =====");
        ksiazka1.wypozycz();
        ksiazka1.wypozycz();
        ksiazka1.zwroc();

        System.out.println("\n===== METODY SPECYFICZNE DLA TYPÓW =====");
        ksiazka1.sprawdzLiczbeStron();
        film1.sprawdzCzasTrwania();

        System.out.println("\n===== RZUTOWANIE TYPÓW =====");
        for (MediaBiblioteczne media : mediaArray) {
            if (media instanceof Ksiazka) {
                ((Ksiazka) media).sprawdzLiczbeStron();
            } else if (media instanceof Film) {
                ((Film) media).sprawdzCzasTrwania();
            }
        }
    }
}