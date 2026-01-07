import java.util.*;

public class PhoneDirectory {

    static String[] names = {"Amit", "Ravi", "Zara"};
    static String[] phones = {"1111", "2222", "3333"};

    // Binary Search
    public static String search(String key) {
        int low = 0, high = names.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (names[mid].equalsIgnoreCase(key))
                return phones[mid];
            else if (names[mid].compareToIgnoreCase(key) < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Result: " + search(name));
    }
}
