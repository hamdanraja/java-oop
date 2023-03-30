import java.util.Scanner;
public class Calculator {
    public double num1;
    public double num2;
    public Calculator(double num1,double num2)
    {
        this.num1=num1;
        this.num2=num2;

    }
    public double add()
    {
        return num1+num2;
    }
    public double sub()
    {
        return num1-num2;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        double num1= sc.nextDouble();
        System.out.println("enter second number");
        double num2= sc.nextDouble();
        Calculator c= new Calculator(12.3,13.5);
        System.out.println("enetr the operation");
        String operator=sc.next();
        switch(operator)
        {
            case "+":
                System.out.println(c.add());
                break;
            case "-":
                System.out.println(c.sub());
                break;
            default:
                System.out.println("invalid answer");
        }
    }
}
