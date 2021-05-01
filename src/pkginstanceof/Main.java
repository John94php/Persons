package pkginstanceof;

public class Main {
    public static void main(String[] args) {
        Osoba[] osoba = new Osoba[10];
        osoba[0] = new Pracownik("Jan", "Zalesiński", 2300);
        osoba[1] = new Student("Joanna", "Wolff");
        osoba[0].pobierzOpis();
        osoba[1].pobierzOpis();
        for (Osoba person:osoba) {
            if (person instanceof Osoba) {
                ((Pracownik)person).pobierzOpis();
            } else {
                break;
            }
        }
    }
}

abstract class Osoba {
    String imie;
    String nazwisko;

    Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    abstract void pobierzOpis();

}

class Pracownik extends Osoba {
    double wynagrodzenie;

    Pracownik(String imie, String nazwisko, double wynagrodzenie) {
        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    void pobierzOpis() {
        System.out.println("Jestem pracownikiem");
        System.out.println("Imię " + imie);
        System.out.println("Nazwisko " + nazwisko);
        System.out.println("Wynagrodzenie " + wynagrodzenie + "zł");
    }
    void pracuj()
    {
        System.out.println("Ja pracuję");
    }
}

class Student extends Osoba {
    Student(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    @Override
    void pobierzOpis() {
        System.out.println("Jestem studentem");
        System.out.println("Imię " + imie);
        System.out.println("Nazwisko " + nazwisko);
    }
}
