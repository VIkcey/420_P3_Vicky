package InterfaceChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

//        POUR QUESTION UN
        Cargo cargo1 = new Cargo(500.5);
        Cargo cargo2 = new Cargo(200.2);
        Person person1 = new Person(75.0);
        Person person2 = new Person(82.3);
        Luggage luggage1 = new Luggage(20.0);
        Luggage luggage2 = new Luggage(15.5);

        Airplane airplane = new Airplane();
        airplane.addItem(cargo1);
        airplane.addItem(cargo2);
        airplane.addItem(person1);
        airplane.addItem(person2);
        airplane.addItem(luggage1);
        airplane.addItem(luggage2);

        // Print the total weight
        airplane.printTotalWeight();

         // POUR QUESTION DEUX

        List<Book> books = new ArrayList<>();
        books.add(new Book("The Catcher in the Rye", "J.D. Salinger"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("Moby Dick", "Herman Melville"));
        books.add(new Book("Pride and Prejudice", "Jane Austen"));


        System.out.println("Original List of Books:");
        for (Book book : books) {
            System.out.println(book);
        }


        Collections.sort(books);


        System.out.println("\nSorted List of Books (by Title):");
        for (Book book : books) {
            System.out.println(book);
        }

        // POUR TROISIÈME QUESTION

        Player player = new Player(100);
        Wall wall = new Wall(50);
        Trap trap = new Trap();

        Bullet bullet = new Bullet(20);

        System.out.println("Firing at Player:");
        bullet.fire(player);

        System.out.println("\nFiring at Wall:");
        bullet.fire(wall);

        System.out.println("\nFiring at Trap:");
        bullet.fire(trap);

        System.out.println("\nFiring again at Trap:");
        bullet.fire(trap);

        // POUR QUATRIÈME QUESTION

        Employee employee1 = new Employee(5000.0);
        Employee employee2 = new Employee(6000.0);

        Freelancer freelancer1 = new Freelancer(120, 50.0);
        Freelancer freelancer2 = new Freelancer(80, 75.0);


        PayrollSystem payrollSystem = new PayrollSystem();


        payrollSystem.addEmployee(employee1);
        payrollSystem.addEmployee(employee2);
        payrollSystem.addEmployee(freelancer1);
        payrollSystem.addEmployee(freelancer2);


        payrollSystem.calculateTotalPayroll();

//        code

    }
}