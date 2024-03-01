package Taskmanage;

import java.util.Scanner;

import static TaskManager.Application.sc;

public class Application {
    private static final Scanner scanner = new Scanner(System.in);
    private static final TaskManager taskManager = new BaseTaskManager();

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        while (true) {
            displayMenu();
            int option = getUserOption();
            handleUserInput(option);
        }
    }

    private static void displayMenu() {
        System.out.println("""
            Menu:
            1. Add task
            2. Show all tasks
            3. Edit status of task
            4. Show completed tasks
            5. Show tasks in process
            6. Remove task
            0. Exit
            """);
    }

    private static int getUserOption() {
        System.out.print("Enter the option (0-6): ");
        return scanner.nextInt();
    }

    private static void handleUserInput(int option) {
        switch (option) {
            case 1 -> addTask();
            case 2 -> taskManager.printAllTasks();
            case 3 -> editTaskStatus();
            case 4 -> taskManager.printDoneTasks();
            case 5 -> taskManager.printInProcessTasks();
            case 6 -> removeTask();
            case 0 -> exit();
            default -> System.out.println("Invalid option. Please try again.");
        }
    }

    private static void addTask() {
        System.out.println("Please enter title of task: ");
        String title = sc.next();
        System.out.println("Please enter description of task: ");
        String description = sc.next();
        System.out.println("Please enter deadline of task: ");
        String deadline = sc.next();
        String Status = "In process";
        TaskManager.addTask(title, description, deadline, Status);
        System.out.println("The task was successfully added!");
    }

    private static void editTaskStatus() {
        System.out.println("Please enter title of task: ");
        String title = sc.next();
        System.out.println("Please choose status for task (Done/In progress): ");
        String newStatus = sc.next();
        TaskManager.editStatus(title, newStatus);
        System.out.println("Status successfully updated!");
    }

    private static void removeTask() {
        System.out.println("Please enter title of task: ");
        String title = sc.next();
        TaskManager.removeTask(title);
    }

    private static void exit() {
        System.out.println("Exiting application.");
        System.exit(0);
    }
}
