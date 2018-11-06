package ba.unsa.etf;

public class PlanStudija {
    private String ime = "";
    private Semestar studij;
    private PlanStudija(){};

    public PlanStudija(String ime, Semestar studij) {
        this.ime = ime;
        this.studij = studij;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String ispisi(){
        return null;
    }
}
