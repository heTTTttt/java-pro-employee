package hillel;

import hillel.models.Car;
import hillel.models.Employee;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Tom, ","Engineer, ","coolmetaldude@gmail.com,"," +38012345678" , 21 );
        System.out.println(employee);// launch Employee class

        System.out.println();

        Car car = new Car();// launch Car class
        car.start();

    }
}
