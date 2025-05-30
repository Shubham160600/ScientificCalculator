package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,bpi,bequals,badd,bsubtract,bmultiply,bdivide,binverse,bsqrt,bsquare,bfactorial,bln,blog,btan,bcos,bsin,bb1,bb2,bc,bac;
    TextView tvmain, tvsec;
    String pi = "3.14159263";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        bdot = findViewById(R.id.bdot);
        bpi = findViewById(R.id.bpi);
        bequals = findViewById(R.id.bequals);
        badd = findViewById(R.id.badd);
        bsubtract = findViewById(R.id.bsubtract);
        bmultiply = findViewById(R.id.bmultiply);
        bdivide = findViewById(R.id.bdivide);
        binverse = findViewById(R.id.binverse);
        bsqrt = findViewById(R.id.bsqrt);
        bsquare = findViewById(R.id.bsquare);
        bfactorial = findViewById(R.id.bfactorial);
        bln = findViewById(R.id.bln);
        blog = findViewById(R.id.blog);
        btan = findViewById(R.id.btan);
        bcos = findViewById(R.id.bcos);
        bsin = findViewById(R.id.bsin);
        bb1 = findViewById(R.id.bb1);
        bb2 = findViewById(R.id.bb2);
        bc = findViewById(R.id.bc);
        bac = findViewById(R.id.bac);

        // Initialize TextViews
        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "0");
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + ".");
            }
        });

        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + pi);
            }
        });

        bequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = tvmain.getText().toString();
                String result = calculate(value);
                tvsec.setText(value + " = " + result);
                tvmain.setText(result);
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "+");
            }
        });

        bsubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "-");
            }
        });

        bmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "*");
            }
        });

        bdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "/");
            }
        });

        binverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String current = tvmain.getText().toString();
                    if (!current.isEmpty()) {
                        double value = Double.parseDouble(current);
                        if (value != 0) {
                            double result = 1.0 / value;
                            tvmain.setText(String.valueOf(result));
                        } else {
                            tvmain.setText("Error");
                        }
                    }
                } catch (NumberFormatException e) {
                    tvmain.setText("Error");
                }
            }
        });

        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String current = tvmain.getText().toString();
                    if (!current.isEmpty()) {
                        double value = Double.parseDouble(current);
                        if (value >= 0) {
                            double result = Math.sqrt(value);
                            tvmain.setText(String.valueOf(result));
                        } else {
                            tvmain.setText("Error");
                        }
                    }
                } catch (NumberFormatException e) {
                    tvmain.setText("Error");
                }
            }
        });

        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String current = tvmain.getText().toString();
                    if (!current.isEmpty()) {
                        double value = Double.parseDouble(current);
                        double result = value * value;
                        tvmain.setText(String.valueOf(result));
                    }
                } catch (NumberFormatException e) {
                    tvmain.setText("Error");
                }
            }
        });

        bfactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String current = tvmain.getText().toString();
                    if (!current.isEmpty()) {
                        int value = Integer.parseInt(current);
                        if (value >= 0 && value <= 20) { // Limit to prevent overflow
                            long result = factorial(value);
                            tvmain.setText(String.valueOf(result));
                        } else {
                            tvmain.setText("Error");
                        }
                    }
                } catch (NumberFormatException e) {
                    tvmain.setText("Error");
                }
            }
        });

        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String current = tvmain.getText().toString();
                    if (!current.isEmpty()) {
                        double value = Double.parseDouble(current);
                        if (value > 0) {
                            double result = Math.log10(value);
                            tvmain.setText(String.valueOf(result));
                        } else {
                            tvmain.setText("Error");
                        }
                    }
                } catch (NumberFormatException e) {
                    tvmain.setText("Error");
                }
            }
        });

        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String current = tvmain.getText().toString();
                    if (!current.isEmpty()) {
                        double value = Double.parseDouble(current);
                        if (value > 0) {
                            double result = Math.log(value);
                            tvmain.setText(String.valueOf(result));
                        } else {
                            tvmain.setText("Error");
                        }
                    }
                } catch (NumberFormatException e) {
                    tvmain.setText("Error");
                }
            }
        });

        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String current = tvmain.getText().toString();
                    if (!current.isEmpty()) {
                        double value = Double.parseDouble(current);
                        double result = Math.sin(Math.toRadians(value));
                        tvmain.setText(String.valueOf(result));
                    }
                } catch (NumberFormatException e) {
                    tvmain.setText("Error");
                }
            }
        });

        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String current = tvmain.getText().toString();
                    if (!current.isEmpty()) {
                        double value = Double.parseDouble(current);
                        double result = Math.cos(Math.toRadians(value));
                        tvmain.setText(String.valueOf(result));
                    }
                } catch (NumberFormatException e) {
                    tvmain.setText("Error");
                }
            }
        });

        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String current = tvmain.getText().toString();
                    if (!current.isEmpty()) {
                        double value = Double.parseDouble(current);
                        double result = Math.tan(Math.toRadians(value));
                        tvmain.setText(String.valueOf(result));
                    }
                } catch (NumberFormatException e) {
                    tvmain.setText("Error");
                }
            }
        });

        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + "(");
            }
        });

        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText(tvmain.getText() + ")");
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String current = tvmain.getText().toString();
                if (!current.isEmpty()) {
                    tvmain.setText(current.substring(0, current.length() - 1));
                }
            }
        });

        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmain.setText("");
                tvsec.setText("");
            }
        });
    }

    // Calculate method using expression evaluation
    private String calculate(String expression) {
        try {
            if (expression.isEmpty()) {
                return "0";
            }

            // Handle special functions and operations
            expression = preprocessExpression(expression);

            // Evaluate the expression
            double result = evaluateExpression(expression);

            // Format the result
            if (result == (long) result) {
                return String.valueOf((long) result);
            } else {
                return String.valueOf(result);
            }
        } catch (Exception e) {
            return "Error";
        }
    }

    // Preprocess expression to handle functions
    private String preprocessExpression(String expr) {
        // Replace pi with actual value
        expr = expr.replace(pi, String.valueOf(Math.PI));

        // Handle functions - these would need more sophisticated parsing
        // For now, this is a simplified version

        return expr;
    }

    // Simple expression evaluator using stacks
    private double evaluateExpression(String expression) throws Exception {
        Stack<Double> values = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == ' ') continue;

            if (Character.isDigit(c) || c == '.') {
                StringBuilder sb = new StringBuilder();
                while (i < expression.length() &&
                        (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    sb.append(expression.charAt(i++));
                }
                i--; // Back up one since the loop will increment
                values.push(Double.parseDouble(sb.toString()));
            }
            else if (c == '(') {
                operators.push(c);
            }
            else if (c == ')') {
                while (operators.peek() != '(') {
                    values.push(applyOperation(operators.pop(), values.pop(), values.pop()));
                }
                operators.pop(); // Remove the '('
            }
            else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!operators.empty() && hasPrecedence(c, operators.peek())) {
                    values.push(applyOperation(operators.pop(), values.pop(), values.pop()));
                }
                operators.push(c);
            }
        }

        while (!operators.empty()) {
            values.push(applyOperation(operators.pop(), values.pop(), values.pop()));
        }

        return values.pop();
    }

    // Check if operator1 has precedence over operator2
    private boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) return false;
        return true;
    }

    // Apply operation
    private double applyOperation(char op, double b, double a) throws Exception {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) throw new Exception("Division by zero");
                return a / b;
        }
        return 0;
    }

    // Calculate factorial
    private long factorial(int n) {
        if (n <= 1) return 1;
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}