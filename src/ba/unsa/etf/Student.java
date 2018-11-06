package ba.unsa.etf;

public class Student {
    private int brIndexa = 0;
    private String imeStudenta = "";
    private Semestar semestar;

    private Student(){};

    public int getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    public String getImeStudenta() {
        return imeStudenta;
    }

    public void setImeStudenta(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }

    public Semestar getSemestar() {
        return semestar;
    }

    public void setSemestar(Semestar semestar) {
        this.semestar = semestar;
    }

    public Student (Student s){};
    public String ispisi(){
        return null;
    }

    public void Izborni(IzborniPredmet p){};
}
