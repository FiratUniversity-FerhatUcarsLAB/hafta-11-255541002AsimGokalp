public class Exercise4_6_Multadd {

   public class Multadd {

    // a * b + c işlemini yapan metot
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // x * e^(-x) + sqrt(1 - e^(-x)) ifadesini hesaplayan metot
    public static double expSum(double x) {
        double ePart = Math.exp(-x);                 // e^(-x)
        return multadd(x, ePart, Math.sqrt(1 - ePart));
    }

    public static void main(String[] args) {

        // multadd için basit testler
        System.out.println("multadd(1, 2, 3) = " + multadd(1, 2, 3));       // 1*2+3 = 5
        System.out.println("multadd(2.5, 4, -1) = " + multadd(2.5, 4, -1)); // 2.5*4-1 = 9

        // 1) sin(pi/4) + cos(pi/4)/2  ifadesini multadd ile hesaplama
        double expr1 = multadd(Math.cos(Math.PI / 4), 0.5, Math.sin(Math.PI / 4));
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + expr1);

        // 2) log 10 + log 20  ifadesini multadd ile hesaplama
        double expr2 = multadd(Math.log(10), 1.0, Math.log(20));
        System.out.println("log(10) + log(20) = " + expr2);

        // 3) expSum(x) test: örneğin x = 1.0
        double x = 1.0;
        double expr3 = expSum(x);
        System.out.println("expSum(" + x + ") = " + expr3);
    }
}

}
