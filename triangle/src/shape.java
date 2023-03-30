public class shape {
    public double length;
    public double width;
    public shape(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    public double area()
    {
        return length*width;
    }
    public double perimeter()
    {
        return 2*(length+width);
    }

    public static void main(String[] args) {
        shape a=new shape(12.4,13);
        System.out.println(a.area());
        System.out.println(a.perimeter());

    }


}
