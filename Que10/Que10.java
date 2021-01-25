import java.util.Scanner;
class Que9
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 3 digits a,b,c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
         int[] d={a,b,c};
         for(int i=0;i<3;i++)
         {
             for(int j=0;j<3;j++)
             {
                   for(int k=0;k<3;k++)
                   {
                       if(i!=j && j!=k && k!=i)
                       {
                           System.out.println(d[i]+""+d[j]+""+d[k]);
                       }

                   }

             }
         }

        }
}