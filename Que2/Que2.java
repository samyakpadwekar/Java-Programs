class Program2{
    public static void main(String[] args) {
      
           int num=20;
           System.out.println("Given number : " + num);
           String binary = Integer.toBinaryString(num);
           System.out.println("Binary equivalent : " + binary);
           String octal = Integer.toOctalString(num);
           System.out.println("Octal equivalent: " + octal);
           String hexa = Integer.toHexString(num);
           System.out.println("HexaDecimal equivalent: " + hexa);
}
}