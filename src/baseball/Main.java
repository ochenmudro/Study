package baseball;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        int s = solution.calPoints(ops);
        System.out.println(s);
    }
}

