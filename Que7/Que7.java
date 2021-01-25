class Que6
{

    public static void main(String[] args) {
        float height;
        float weight;
        float BMI;
        java.util.Scanner sc =  new java.util.Scanner(System.in);
        System.out.println("Weight (kgs) and height (meters) : ");
        weight = sc.nextFloat();
        height = sc.nextFloat();
        
        BMI = weight/(height*height);
        if(BMI < 18.5)
        {
            System.out.println("Unbderweight");
        }
        else if(BMI >= 18.5 && BMI <= 24.9){
            System.out.println("Normal");
        }
        else if(BMI >= 25 && BMI <= 29.9){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        }
    }
}
