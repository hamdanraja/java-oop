public class Animal {
    public static class Dog extends Animal
    {
        public void speak()
        {
            System.out.println("dogs can bark");
        }
        public void run()
        {
            System.out.println("dogs can run");
        }
    }
    public static void main(String[] args)
    {
        Animal a =new Animal();
        Dog d=new Dog();
        d.speak();
    }

}
