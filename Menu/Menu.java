package Task3.Menu;

import Task3.Commands.Commands;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    private boolean flag;
    Commands commands=new Commands();

    public Menu() {
        //VIEW
        System.out.println("Display patients - 1");
        System.out.println("Sort patients by surname - 2");
        System.out.println("Sort patients by number medical card - 3");
        System.out.println("Get diagnosis patient  - 4");
        System.out.println("Get medical cards in diapason - 5");
        System.out.println("Get highest medical card - 6");
        System.out.println("Save patients in file - 7");
        System.out.println("Get patients from file - 8");
        System.out.println("Comeback to menu - 0");
        System.out.println();

        while (true) {
            System.out.print("Input command : ");
            if (flag==true) {
                scanner.close();
                break;
            }else {
                commands.operation(scanner.nextByte());
            }
        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
