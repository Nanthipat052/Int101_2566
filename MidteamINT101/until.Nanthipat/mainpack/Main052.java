package mainpack;

import obj.Nanthipat.Obj052;
import until.Nanthipat.Until052;

public class Main052 {
    public static void main(String[] args) {
        testZ();
        

    }
    public static void testZ(){
        System.out.println(Until052.Nanthipat);

        System.out.println(Until052.compute052RightTriangleArea(-2, 4));
        System.out.println(Until052.compute052RightTriangleArea(4, 500));
        System.out.println(Until052.compute052RightTriangleArea(2, -4));
        System.out.println(Until052.compute052RightTriangleArea(-2, -4));

        System.out.println(Until052.evaluate052(110));
        System.out.println(Until052.evaluate052(90));
        System.out.println(Until052.evaluate052(78));
        System.out.println(Until052.evaluate052(68));
        System.out.println(Until052.evaluate052(58));
        System.out.println(Until052.evaluate052(48));
        System.out.println(Until052.evaluate052(-11));

        System.out.println(Until052.computeMagicNanthipat(2, -1, 6));
        System.out.println(Until052.computeMagicNanthipat(2, 6, 4));

        Obj052 A01 = new Obj052("052", "Nanthipat", 1000);   
        Obj052 A02 = new Obj052("null", "null", 0);
        

        System.out.println(A01);                                                           // test constructor

        A02.setId052("007");                                                        //setter
        A02.setNameNanthipat("Poom");
        A02.setValue052(2000.0);

        System.out.println(A02.getId052());                                                //getter
        System.out.println(A02.getNameNanthipat());
        System.out.println(A02.getValue052());

        System.out.println(A01);                                                        // test toString

        Obj052 A03 = new Obj052("052", "Nanthipat", 6000);      //testisGreaterThan
        Obj052 A04 = new Obj052("098", "null", 2000);
        System.out.println(A03.isGreaterThan(A04));
    }
    
    
}
