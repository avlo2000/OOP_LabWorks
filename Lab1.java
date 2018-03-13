public class SquareRoot{

    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;
        double D = b * b - 4 * a * c;

        if((D >= 0) && (a != 0))
        {
            System.out.println( "x1=" + ((((0 - b) + Math.sqrt(D))/(a*2))) );
            System.out.println( "x2=" + ((((0 - b) - Math.sqrt(D))/(a*2))) );
        }
        else
        {
            if(a!=0)
            {
                System.out.println("x1=");
                System.out.println("x2=");
            }
            else
            {
                if(b!=0)
                {
                    System.out.println("x1=" + (0 - c) / b);
                    System.out.println("x2=" + (0 - c) / b);
                }
                else
                {
                    System.out.println("x1=");
                    System.out.println("x2=");
                }
            }
        }
    }
}
