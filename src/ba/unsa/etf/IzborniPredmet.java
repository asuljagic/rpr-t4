package ba.unsa.etf;

public class IzborniPredmet extends Predmet {
    private int ects = 0;
    private String nazivPredmeta = "";
    private Student spisakStudenata;
    private IzborniPredmet() {};

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

    public IzborniPredmet(IzborniPredmet p) {};

    public String ispisi(){
        return null;
    }

    public void upisiStudenta(Student s) {};
}
