package ua.intita.qa.functionalInterfaces;

import lombok.AllArgsConstructor;
import lombok.Data;
import ua.intita.qa.app.entity.User;

import java.util.Locale;

public class DemoFunctionslInterfaces {
    public static void main(String[] args) {
        Calculator plus = (x, y) -> x+y;
        Calculator minus = (x, y) -> x+y;

        int res = plus.calculate(2, 5);
        int res2 = minus.calculate(10, 5);


        new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a+b;
            }
        };


        Printable printable = x -> System.out.println(x.toUpperCase());
        printable.printUp("upper");

        Car user = new Car(1, "Sasha");

        Copyable<Car> copy = new Copyable<Car>() {
            @Override
            public Car copy(Car entity) {
                return new Car(entity.getId(), entity.getName());
            }
        };

       Car newUser = copy.copy(user);
       user.setName("Andrii");
       System.out.println(newUser);

        System.out.println(user.hashCode());
        System.out.println(newUser.hashCode());

        Copyable<Car> userCopyable = entity -> new Car(newUser.getId(), newUser.getName());

        final int result = getResult(20, 30, (x, y) -> x * y * x * y);
        System.out.println(result);

        final int result2 = getResult(20, 30, (x, y) -> x * y * y * y);
        System.out.println(result2);
    }

    public static int getResult(int x, int y, Calculator calculator){
        return calculator.calculate(x, y);
    }

    @Data
    @AllArgsConstructor
    private static class Car{
        private int id;
        private String name;

//        public User(User user){
//            id = user.getUserId()
//        }
    }
}
