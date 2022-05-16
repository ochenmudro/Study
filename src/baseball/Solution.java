package baseball;

import java.util.Stack;

public class Solution {
    public static boolean isNumeric(String str) {
        try {
            int d = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public int calPoints(String[] ops) {
        Stack<Integer> score = new Stack<>();
        for (String op : ops) {
            if (isNumeric(op)) {
                score.push(Integer.parseInt(op));
            }
            Integer x = plus(score, op);
            if (x != null) return x;

            Integer x1 = D(score, op);
            if (x1 != null) return x1;

            Integer x2 = C(score, op);
            if (x2 != null) return x2;
        }

        int result = 0;
        int size = score.size();
        for (int i = 0; i < size; i++) {
            result += score.pop();
        }
        return result;
    }

    private Integer C(Stack<Integer> score, String op) {
        if (op.equals("C")) {
            try {
                if (score.size() < 1) throw new Exception("Wrong number of value");
                score.pop();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return 0;
            }
        }
        return null;
    }

    private Integer D(Stack<Integer> score, String op) {
        if (op.equals("D")) {
            try {
                if (score.size() < 1) throw new Exception("Wrong number of value");
                int temp = score.peek();
                score.push(temp * 2);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return 0;
            }
        }
        return null;
    }

    private Integer plus(Stack<Integer> score, String op) {
        if (op.equals("+")) {
            try {
                if (score.size() < 2) throw new Exception("Wrong number of value");
                int temp = score.pop();
                int temp2 = score.peek() + temp;
                score.push(temp);
                score.push(temp2);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return 0;
            }
        }
        return null;
    }
}

