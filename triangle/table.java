public class table {
    public void chair()
    {
        System.out.println("This is a chair");
    }
    public static class Theme extends table
    {
        public void colour()
        {
            System.out.println("It has brown colour");
        }
    }

    public static void main(String[] args) {
        Theme t=new Theme();
        Theme obj=(Theme) t;
        obj.chair();
        obj.colour();
    }
}
