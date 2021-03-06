package pkginstanceof;

public class Main {
    public static void main(String[] args) {
        Osoba[] osoba = new Osoba[10];
        osoba[0] = new Pracownik("Jan", "Zalesiński", 2300);
        osoba[1] = new Student("Student", "Student");
        osoba[2] = new Pracownik("Pracownik","Pracownik",4000);
        for (Osoba person : osoba) {
            if (person instanceof Pracownik) {
                ((Pracownik)person).pobierzOpis();
                ((Pracownik)person).pracuj();
            } else if(person instanceof Student) {
                ((Student)person).pobierzOpis();
                ((Student)person).studiuj();
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

    void pracuj() {
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
    void studiuj() {
        System.out.println("Studiuję");
    }
}
