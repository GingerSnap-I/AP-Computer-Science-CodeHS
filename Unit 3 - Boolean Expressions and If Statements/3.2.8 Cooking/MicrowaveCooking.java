public class MicrowaveCooking
{
    public static void main(String[] args)
    {
       int number = (int) Math.round((Math.random() * 150)+90);

       System.out.println("Microwaving for " + number + " seconds");
       
       if (number > 120) {
           System.out.println("Rolls will be boiling hot!");
       } else {
           System.out.println("Rolls will be the right temperature!");
       }
    }
}
