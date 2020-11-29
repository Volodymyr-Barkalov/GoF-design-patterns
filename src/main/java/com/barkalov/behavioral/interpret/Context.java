package com.barkalov.behavioral.interpret;

public class Context {
    Expression evaluate(String expression) {
        int pos = expression.length() - 1;
        while (pos > 0) {
            if (Character.isDigit(expression.charAt(pos))) {
                pos--;
            } else {
                Expression left = evaluate(expression.substring(0, pos));
                Expression right = new NumberExpression(
                        Integer.parseInt(expression.substring(pos + 1)));
                char operator = expression.charAt(pos);
                switch (operator) {
                    case '-':
                        return new MinusExpression(left, right);
                    case '+':
                        return new PlusExpression(left, right);
                }
            }
        }
        int result = Integer.parseInt(expression);
        return new NumberExpression(result);
    }
}
