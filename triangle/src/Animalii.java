public class Animalii {
    public void speak()
    {
        System.out.println("Animals cant speak they bark");
    }
    public static class dogs extends Animalii
    {
        public void speak()
        {
            System.out.println("Dogs can  bark");
        }

    }
    public static void main(String[] args)
    {
        Animalii i=new Animalii();
        dogs d=new dogs();
        i.speak();
        d.speak();
        dogs dogs=(dogs)d;
        dogs.speak();
    }
}


