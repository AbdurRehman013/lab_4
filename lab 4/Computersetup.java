package lab.computersetup;
import java.util.Scanner;

class Computer {
    private String name;
    private String type;
    private String processor;
    private String ram;
    private String hardDisk;
    private String motherboard;
    private String opticalDrive;

    // Constructor
    public Computer(String name, String type, String processor, String ram, String hardDisk, String motherboard, String opticalDrive) {
        this.name = name;
        this.type = type;
        this.processor = processor;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.motherboard = motherboard;
        this.opticalDrive = opticalDrive;
    }

    // Method to display computer details
    public void displayDetails() {
        System.out.println("Computer Details:");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram);
        System.out.println("Hard Disk: " + hardDisk);
        System.out.println("Motherboard: " + motherboard);
        System.out.println("Optical Drive: " + opticalDrive);
        System.out.println();
    }

    // Update methods
    public void updateName(String name) {
        this.name = name;
    }

    public void updateType(String type) {
        this.type = type;
    }

    public void updateProcessor(String processor) {
        this.processor = processor;
    }

    public void updateRam(String ram) {
        this.ram = ram;
    }

    public void updateHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void updateMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public void updateOpticalDrive(String opticalDrive) {
        this.opticalDrive = opticalDrive;
    }
}

public class Computersetup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Collect computer details from user
        System.out.println("Enter computer name:");
        String name = scanner.nextLine();
        System.out.println("Enter computer type:");
        String type = scanner.nextLine();
        System.out.println("Enter processor specification:");
        String processor = scanner.nextLine();
        System.out.println("Enter RAM:");
        String ram = scanner.nextLine();
        System.out.println("Enter hard disk drive:");
        String hardDisk = scanner.nextLine();
        System.out.println("Enter motherboard:");
        String motherboard = scanner.nextLine();
        System.out.println("Enter optical drive:");
        String opticalDrive = scanner.nextLine();
        
        // Create a Computer object
        Computer computer = new Computer(name, type, processor, ram, hardDisk, motherboard, opticalDrive);
        
        // Display details
        computer.displayDetails();

        // Option to update details
        String choice;
        do {
            System.out.println("Do you want to update any details? (yes/no)");
            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                System.out.println("Enter the field you want to update (name/type/processor/ram/hardDisk/motherboard/opticalDrive):");
                String field = scanner.nextLine();

                System.out.println("Enter the new value:");
                String newValue = scanner.nextLine();

                switch (field.toLowerCase()) {
                    case "name":
                        computer.updateName(newValue);
                        break;
                    case "type":
                        computer.updateType(newValue);
                        break;
                    case "processor":
                        computer.updateProcessor(newValue);
                        break;
                    case "ram":
                        computer.updateRam(newValue);
                        break;
                    case "harddisk":
                        computer.updateHardDisk(newValue);
                        break;
                    case "motherboard":
                        computer.updateMotherboard(newValue);
                        break;
                    case " opticaldrive":
                        computer.updateOpticalDrive(newValue);
                        break;
                    default:
                        System.out.println("Invalid field.");
                        continue;
                }
                
                // Display updated details
                computer.displayDetails();
            }
        } while (choice.equalsIgnoreCase("yes"));

        scanner.close();
    }
}