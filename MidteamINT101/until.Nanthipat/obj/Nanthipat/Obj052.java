package obj.Nanthipat;

public class Obj052 {
    private static String id052;
    private String nameNanthipat;
    private double value052;

    public Obj052(String id052, String nameNanthipat, double value052) {
        this.id052 = id052;
        this.nameNanthipat = nameNanthipat;
        this.value052 = value052;
    }

    public static String getId052() {
        return id052;
    }

    public String getNameNanthipat() {
        return nameNanthipat;
    }

    public double getValue052() {
        return value052;
    }

    public static void setId052(String id052) {
        Obj052.id052 = id052;
    }

    public void setNameNanthipat(String nameNanthipat) {
        this.nameNanthipat = nameNanthipat;
    }

    public void setValue052(double value052) {
        this.value052 = value052;
    }

    public static int compare(Obj052 o1,Obj052 o2){
        if(o1 == o2){
            return 0;
        }else if(o1.getValue052() < o2.getValue052()){
            return -1;
        }else return 1;
    }
    public boolean isGreaterThan(Obj052  o){
        if(this.getValue052() > o.value052){
            return true;
        }else return false;
    }

    @Override
    public String toString() {
        return "Obj052 [id052=" + id052 + ", nameNanthipat=" + nameNanthipat + ", value052=" + value052 + "]";
    }

}
