
class allFun{
     
    public void revNum(int num){
        int temp;
        int s = 0;
        while(num != 0){
            temp = num % 10;
            s = s*10 + temp;
            num = num / 10;
        }
        System.out.println("Reversed number is : "+s);
    }

    public void sumDigit(int num){
        int temp;
        int s = 0;
        while(num != 0){
            temp = num % 10;
            s = s + temp;
            num = num / 10;
        }
        System.out.println("Sum of digits is : "+s);
    }

    public void isPalin(int num){
        int temp;
        int originaL = num;
        int s = 0;
        while(num != 0){
            temp = num % 10;
            s = s*10 + temp;
            num = num / 10;
        }
        if(originaL == s)
            System.out.println("Number is Palindrome ");
        else
            System.out.println("Number is not Palindrome ");
    }

    public void isPerfect(int num){
        int temp, sum = 0;
        int n1 = 1;
        while(n1 <= num/2){
            if(num % n1 == 0){
                sum = sum + n1;
            }
            n1 = n1 + 1;
        }
        if(sum == num)
            System.out.println("Number is perfect ");
        else
            System.out.println("Number is not perfect ");
    }

    public void isStrong(int num){
        int mod;
        int originaL = num;
        int s = 0;
        int fact;
        while(num != 0){
            mod = num % 10;
            fact = 1;
            while(mod>0){
                fact = fact*mod;
                mod--;
            }
            s = s + fact;
            num = num / 10;
        }
        if(s == originaL)
            System.out.println("Number is Strong. ");
        else
            System.out.println("Number is not Strong. ");
    }

    public void isArmstrong(int num){
        int mod;
        int originaL = num;
        int s = 0;
        while(num != 0){
            mod = num % 10;
            s = s + mod*mod*mod;
            num = num / 10;
        }
        if(s == originaL)
            System.out.println("Number is Armstrong. ");
        else
            System.out.println("Number is not Armstrong. ");
    }

    public void listPrime(){
    
        boolean flag = false;
    
        System.out.printf(" Prime Numbers below 100 : ");
        for (int i = 2; i <= 100; i = i + 1) { 
            for (int j = 2; j <= i/2; j = j + 1) {
                if (i % j == 0) 
                    {
                        flag = true;
                        break;
                    }
            }
            if (!flag)
                    System.out.printf(" %d",i);
            flag = false;
        } 
        
    }

}


class Que3{
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(args[0]);

        allFun obj = new allFun();
        
        obj.sumDigit(num);
        obj.revNum(num);
        obj.isPalin(num);
        obj.isPerfect(num);
        obj.isStrong(num);
        obj.isArmstrong(num);
        obj.listPrime();

    }
}