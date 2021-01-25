class Que8
{
    public static void main(String[] args) {
        java.util.Scanner sc= new java.util.Scanner(System.in);
        System.out.println("Enter current world population");
        float population=sc.nextFloat();
        System.out.println("Annnual growth rate in %");
        float rate=sc.nextFloat();

        System.out.println("World Population after 1 year: ");
        float p1=(float) (((rate/100) * population) + population);
        System.out.printf("%.3f\n",p1);

        System.out.println("World Population after 2 year: ");
        float p2=(float) (((rate/100) * p1) + p1);
        System.out.printf("%.3f\n",p2);

        System.out.println("World Population after 3 year: ");
        float p3=(float) (((rate/100) * p2)) + p2;
        System.out.printf("%.3f\n",p3);

        System.out.println("World Population after 4 year: ");
        float p4=(float) (((rate/100) * p3) + p3);
        System.out.printf("%.3f\n",p4);

        System.out.println("World Population after 5 year: ");
        float p5=(float) (((rate/100) * p4) + p4);
        System.out.printf("%.3f\n",p5);
        
    }
}