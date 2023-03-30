public class Animali {
    public void speak()
    {
        System.out.println("Animals cant speak they bark");
    }
    public static class dogs extends Animali
    {
        public void speak()
        {
            System.out.println("Dogs can  bark");
        }

    }
    public static void main(String[] args)
    {
        Animali i=new Animali();
        dogs d=new dogs();
        i.speak();
        d.speak();
    }
}
