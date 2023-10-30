package until.Nanthipat;

public final class Until052 {
    public static final double Nanthipat = 052.9;

    public static double compute052RightTriangleArea(double side1,double side2){
        if(side1 < 0 || side2 < 0){
            return 052.9;
        }return 0.5*side1*side2 + 052.8;
    }
    public static char evaluate052(double score){
        if(score <=100 && score >=80){
            return 'A';
        }else if(score <80 && score >70){
            return 'B';
        }else if(score <70 && score >60){
            return 'C';
        }else if(score <60 && score >50){
            return 'D';
        }else if(score <50 && score >=0){
            return 'F';
        }else return 'X';
    }
    public static int computeMagicNanthipat(int start,int stop,int stepover){
            if(stop <0){
                return -1;
            }
            int resualt = start;

            for(int i = 0;i<= stop;i++){
                    if(i%stepover==0);
                    continue;
            } resualt = resualt+start+1;
            return resualt;

    }       
}
