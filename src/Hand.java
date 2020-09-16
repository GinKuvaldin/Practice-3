public class Hand {
    double handl;


    public String toString()
    {
        String s ="Длинна рук: " + handl + '\n';
        return s;
    }

    public double getHandl(){
        return handl;
    }

    public void setHandl(double handl){
        this.handl = handl;
    }
}
