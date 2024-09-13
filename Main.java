public class Main
{ 
    public static void main(String[] args)
    {
        String animal = "cat";
        double weight = 13.0;
        int weightGained = 4;
        weight = weight + weightGained;
        final double goal = 11;
        if(weight > 12){
            System.out.println("Your " + animal + " is overweight, and currently weighs " + weight + " lbs");
            System.out.print("Try to aim for " + goal + "lbs");
        }
        else{
            System.out.println("Your" + animal + "is purrfect, and currently weighs" + weight);
        }

    }

}
