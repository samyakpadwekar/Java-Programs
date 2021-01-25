import java.util.Scanner;
class Que7
{
    public static void main(String[] args)
    {
        System.out.println("To calculate the cost per day to office:");
        System.out.print("Enter your miles per day:");
        Scanner sc=new Scanner(System.in);
        float miles=sc.nextFloat();
        System.out.print("Enter cost per gallon per day:");
        float costpergallon=sc.nextFloat();
        System.out.print("Enter average miles per gallon day:");
        float averagemilesgallon=sc.nextFloat();
        System.out.print("Enter parking fees:");
        float parkingfees=sc.nextFloat();
        System.out.print("Enter tolls:");
        float tolls=sc.nextFloat();

        float cost=((miles/averagemilesgallon)*costpergallon)+parkingfees+tolls;

        System.out.println("Total cost per day:"+cost);
        System.out.println("\nEnter number of person in car pooling: ");
        int n = sc.nextInt();
        System.out.println("Individual cost saved by car pooling: "+(cost-(cost/n)));       
    }    
}
