import java.util.Scanner;

public class ValueArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's student :");
        String name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Position of the students in the List: " + name + " " + "is" + " " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (isExist == false) {
            System.out.println("Not found" + name + "in the List.");
        }

    }
}
