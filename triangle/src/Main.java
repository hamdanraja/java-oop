import java.util.Scanner;

class rectangle {
    public float length;
    public float width;

    public rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float area(float length,float width) {
        float v;
        v = length * width;
        return v;
    }

    public float perimeter(float length,float width) {
        float x;
        x = length * width;
       x*=2;
       return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float length= sc.nextFloat();
        float width= sc.nextFloat();
        rectangle r = new rectangle(length,width);
        System.out.println(r.area(length,width));
        System.out.println(r.perimeter(length,width));

    }
}