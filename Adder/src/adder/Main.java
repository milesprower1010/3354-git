package adder;

public class Main {

    public static void main(String[] args) {
        try {
            if(args.length == 0){
                System.out.println("Please provide some integers to add");
                return;
            }
            int result = addArguments(args);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.err.println("Please provide only integers to add");
        }
    }

    private static int addArguments(String[] args) {
        int sum = 0;
        if(args.length < 1)
            return 0;
        else if (args[0].equals("-"))
            for (int i = 1; i < args.length; i++)
                sum -= Integer.valueOf(args[i]);
        else
            for (String arg : args)
                sum += Integer.valueOf(arg);
        return sum;
    }
}
