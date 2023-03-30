import java.sql.SQLOutput;
import java.util.Scanner;
public class Person {
    public String name;
    public int age;
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public static void main(String[] args)
    {
        Person a=new Person("hamdan ",18);
        System.out.print(a.getName());
        System.out.println(a.getAge());


    }
}
