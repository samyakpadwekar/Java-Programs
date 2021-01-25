
class Que5 {
    public static void main(String[] args){
      int choice;
      
      java.util.Scanner sc=new java.util.Scanner(System.in);
      
      System.out.println("Enter first number : ");
      int i=sc.nextInt();
      System.out.println("Enter second number : ");
      int j=sc.nextInt();
      do{
            System.out.println("Enter Choice: \n0 : EXIT\n1 : Add\n2 : Sub\n3 : Mul\n4 : Div");
            choice = sc.nextInt();
            switch (choice) {
            case 1:  
                System.out.println("Sum of given two numbers: "+(i + j));
                break;
            case 2:  
                System.out.println("Subtraction of given two numbers: "+(i-j));
                break;
            case 3:  
                System.out.println("Multiplication of given two numbers: "+(i * j));
                break;
            case 4:      
                if(j!=0)
                {
                System.out.println("Division of given two numbers: "+(i/j));      
                }   
                break;
            }
      
        }while(choice != 0);
    }
}
