package ba.unsa.etf;

public class Semestar {
    private int ects = 0;
    private Predmet predmeti;
    private String nazivSemestra ="";

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public Predmet getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(Predmet predmeti) {
        this.predmeti = predmeti;
    }

    public String getNazivSemestra() {
        return nazivSemestra;
    }

    public void setNazivSemestra(String nazivSemestra) {
        this.nazivSemestra = nazivSemestra;
    }

    void dodajIzborni(IzborniPredmet p){};
}
