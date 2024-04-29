package youtube.task1_fizzbuzz;

public class FizzBuzz {

    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";

    public static void fizzBuzz() {
        for(int i = 1; i <=100; i++) {
            StringBuilder output = new StringBuilder();
            if(i % 3 == 0) output.append(FIZZ);
            if(i % 5 == 0) output.append(BUZZ);
            System.out.println(output.length() > 0 ? output.toString() : i);
        }
    }

}
