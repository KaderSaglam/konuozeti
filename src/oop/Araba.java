package oop;

public class Araba {
    int hiz;
    String renk;
    String Model;
    int km;

    public Araba(){

    }

    public Araba(int hiz, String renk, String model, int km) {
        this.hiz = hiz;
        this.renk = renk;
        Model = model;
        this.km = km;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "hiz=" + hiz +
                ", renk='" + renk + '\'' +
                ", Model='" + Model + '\'' +
                 ", km=" + km +
                '}';
    }
}
