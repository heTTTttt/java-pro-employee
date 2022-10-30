package hillel;

public class CarAndEmployee {
    public static void main(String[] args) {

        Employee employee = new Employee("Tom, ","Engineer, ","coolmetaldude@gmail.com, ",675437992 , 21 );
        employee.questionnaire();// launch Employee class

        System.out.println();

        Car car = new Car("","","");// launch Car class
        car.start();

    }
}
