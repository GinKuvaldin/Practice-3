public class Head {
    String l;
    String hair;
    String eye;

    public String toString()
    {
        String s ="Лицо: " + l + '\n' + "Цвет волос: " + hair +'\n'+ "Цвет глаз: " + eye+ '\n';
        return  s;
    }

    public String getHair(){
        return hair;
    }
    public String getL() {
        return l;
    }
    public String getEye(){
        return eye;
    }
    public void setHair(String hair){
        this.hair = hair;
    }
    public void setL(String l){
        this.l = l;
    }
    public void setEye(String eye) {this.eye = eye;}
}

