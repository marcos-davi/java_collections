package nivel3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== PERSON MANAGEMENT MENU ===");
            System.out.println("1. Add person");
            System.out.println("2. Show people sorted by name (A-Z)");
            System.out.println("3. Show people sorted by name (Z-A)");
            System.out.println("4. Show people sorted by surname (A-Z)");
            System.out.println("5. Show people sorted by surname (Z-A)");
            System.out.println("6. Show people sorted by DNI (A-Z)");
            System.out.println("7. Show people sorted by DNI (Z-A)");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine().trim();
                    System.out.print("Enter surname: ");
                    String surname = scanner.nextLine().trim();
                    System.out.print("Enter DNI: ");
                    String dni = scanner.nextLine().trim();

                    personList.add(new Person(name, surname, dni));
                    System.out.println("Person added successfully!");
                    break;

                case "2":
                    personList.sort(PersonComparator.sortByNameAsc());
                    printList(personList);
                    break;

                case "3":
                    personList.sort(PersonComparator.sortByNameDesc());
                    printList(personList);
                    break;

                case "4":
                    personList.sort(PersonComparator.sortBySurnameAsc());
                    printList(personList);
                    break;

                case "5":
                    personList.sort(PersonComparator.sortBySurnameDesc());
                    printList(personList);
                    break;

                case "6":
                    personList.sort(PersonComparator.sortByDniAsc());
                    printList(personList);
                    break;

                case "7":
                    personList.sort(PersonComparator.sortByDniDesc());
                    printList(personList);
                    break;

                case "0":
                    running = false;
                    System.out.println("Exiting application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }

    private static void printList(List<Person> list) {
        if (list.isEmpty()) {
            System.out.println("\nNo people registered yet.");
            return;
        }
        System.out.println("\n-----------------------------------------");
        System.out.println(String.format("%-15s | %-15s | %-10s", "Name", "Surname", "DNI"));
        System.out.println("-----------------------------------------");
        for (Person p : list) {
            System.out.println(p);
        }
        System.out.println("-----------------------------------------");
    }
}