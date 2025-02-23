import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = Integer::sum;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) ->  {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println("No zero division");
        }
        return 0;
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

    @FunctionalInterface
    public interface Supplier<T> {
        T get();
    }
}
