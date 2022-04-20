package cmd;


public class Main {

    public static void main(String[] args) {
        try {
            if (args.length != 4 || !isNumeric(args[3])) throw new WrongArgsException("Wrong  values ", args.length);
            String name = args[0];
            String country = args[1];
            String date = args[2];
            int hight = Integer.parseInt(args[3]);
            System.out.println("Привет, " + name + " как погода в " + country + " ? Сегодня " + date + "рост" + hight);
        } catch (WrongArgsException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static boolean isNumeric(String arg) {
        try {
            int d = Integer.parseInt(arg);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}

