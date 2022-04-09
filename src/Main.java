public class Main {
    public static void main(String[] args) {
        try {
            if (args.length != 3) throw new Exception("Wrong number of parameters");
            String name = args[0];
            String country = args[1];
            String date = args[2];
            System.out.println("Привет, " + name + " как погода в " + country + " ? Сегодня " + date);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
