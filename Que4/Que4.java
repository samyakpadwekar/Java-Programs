class Que4 {
    public static void main(String[] args){
      int res;
      java.util.Scanner sc=new java.util.Scanner(System.in);
      System.out.println("Enter first number : ");
      int i=sc.nextInt();
      System.out.println("Enter second number : ");
      int j=sc.nextInt();    
      System.out.println("Sum of given two numbers: "+(i + j));
      System.out.println("Subtraction of given two numbers: "+(i-j));
      System.out.println("Multiplication of given two numbers: "+(i * j));
      if(j!=0)
      {
          System.out.println("Division of given two numbers: "+(i/j));      
      }   
    }
  }
