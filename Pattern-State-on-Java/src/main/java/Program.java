import calculator.Calculator;

import java.io.IOException;

public class Program {

    public static void main(String[] args) throws IOException
    {

        Calculator calc = new Calculator();
        char key = '1';
        System.out.println("Чтобы закончить вычисления введите символ !");
        while (true && key != '!') {
            key = (char) System.in.read();
            if (key >=' ') {
                calc.press(key);
                System.out.println(calc);
            }

        }
        System.out.println(calc.answer());
    }
}
