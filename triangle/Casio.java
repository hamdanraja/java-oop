import java.util.Scanner;
public class Casio {
    public double num1;
    public double num2;
    public Casio(double num1,double num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
    public double add()
    {
        System.out.println("the sum of two numbers is");
        return num1+num2;
    }
    public double sub()
    {
        System.out.println("the subtract of two numbers is ");
        return num1-num2;
    }
    public double mult()
    {
        System.out.println("the multiplication of two numbers is");
        return num1*num2;
    }
    public double div()
    {
        System.out.println("the division of two numbers is");
        return num1/num2;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        double num1=sc.nextDouble();
        System.out.println("enter second number");
        double num2=sc.nextDouble();
        Casio c=new Casio(12,13);
        System.out.println("enter the operator");
        String operator=sc.next();
        switch(operator)
        {
            case "+" :
                System.out.println(c.add());
                break;
            case "-" :
                System.out.println(c.sub());
                break;
            case "*" :
                System.out.println(c.mult());
                break;
            case "/" :
                System.out.println(c.div());
                break;
            default:
                System.out.println(" invalid arguement ");
        }
    }

}
