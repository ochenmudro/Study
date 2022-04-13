package baseball;


import java.util.Stack;

public class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> score = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            try {
                score.push(Integer.parseInt(ops[i]));
            } catch (NumberFormatException exception) {
                if (ops[i].equals("+")) {
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

                if (ops[i].equals("D")) {
                    try {
                        if (score.size() < 1) throw new Exception("Wrong number of value");
                        int temp = score.peek();
                        score.push(temp * 2);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        return 0;
                    }
                }

                if (ops[i].equals("C")) {
                    try {
                        if (score.size() < 1) throw new Exception("Wrong number of value");
                        score.pop();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        return 0;
                    }
                } else {

                }
            }
        }
        int result = 0;
        int size = score.size();
        for (int i = 0; i < size; i++) {
            result += score.pop();
        }
        return result;
    }
}

