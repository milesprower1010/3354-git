package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide a number of integers to add");
        }
    }

    private static int addArguments(String[] args) {
        int sum = 0;
        if(args.length < 1)
            return 0;
        else if (args[0].equals("-"))
        else
            for (String arg : args)
                sum += Integer.valueOf(arg);
        return sum;
    }
}
