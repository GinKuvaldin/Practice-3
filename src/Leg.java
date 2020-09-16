public class Leg {
    double feetl;
    double razmer;

    public String toString()
    {
        String s ="Длинна ног: " + feetl + '\n' + "Размер обуви: " + razmer + '\n';
        return s ;
    }

    public double getFeetL(){
        return feetl;
    }
    public double getRazmer() {
        return razmer;
    }

    public void setFeetl(double feetl){
        this.feetl = feetl;
    }

    public void setRazmer(double razmer) {this.razmer = razmer;}
}
