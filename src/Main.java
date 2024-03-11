
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        MyScanner scanner = new MyScanner(System.in);
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);
    }
}
