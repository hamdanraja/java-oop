public class animales {
    public void speak()
    {
        System.out.println("animals dont speak");
    }
    public void eat()
    {
        System.out.println("animals can eat and drink");
    }
    public static class dogs extends animales
    {
        public void hair()
        {
            System.out.println("dogs have long hair");
        }
    }
    public static class birds extends animales
    {
        public void colour()
        {
            System.out.println("birds have beautiful colour");
        }
    }
    public static void main(String[] args)
    {
        animales a=new animales();
        dogs b=new dogs();
        birds r=new birds();
        a.eat();
        b.hair();
        r.colour();
        animales animales=(animales) a;
        animales.speak();



    }
}
