package ba.unsa.etf;

public class ObavezniPredmet extends Predmet {
    private int ects = 0;
    private String nazivPredmeta = "";
    private Student spisakStudenata;
    private ObavezniPredmet(){};

    public ObavezniPredmet(ObavezniPredmet p){};

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String ispisi(){
        return null;
    }
}
