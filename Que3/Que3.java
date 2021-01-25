class Program2{
    public static void main(String[] args )
    {
        int i=(int) 9348.39;      
        System.out.println("Intege value : "+i+"    Width of Integer:"+Integer.BYTES);

        long j=100;
        System.out.println("Long value   : "+j+"    Width of Long : "+Long.BYTES);

        Short k=(short)80999;
        System.out.println("Short value  : "+k+"    Width of Short : "+Short.BYTES);

        Long a=(long)2373467e189;
        System.out.println("Long value   : "+a+"    Width of Long : "+Long.BYTES);

        byte l=(byte)100;
        System.out.println("Byte value   : "+l+"    Width of Byte :"+Byte.BYTES);

        float m= (float)218.928;
        System.out.println("Float value   : "+m+"    Width of Float : "+Float.BYTES);

        double n= (double)2930.3f;
        System.out.println("Double value   : "+n+" Width of Double : "+Double.BYTES);

        char o=(char)-3;
        System.out.println("Char value   : "+o+" Width of Char : "+Character.BYTES);
        
      /*  boolean b=(boolean)0;
        System.out.println("Boolean value   : "+b+" Width of Boolean : "+Boolean.BYTES);  */    

      //error: incompatible types: int cannot be converted to boolean boolean b=(boolean)0;
    }
}

