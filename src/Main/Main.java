package Main;

public class Main {
    public static int year(int some) {
        if (some % 100 == 0 && some % 400 != 0) {
            System.out.println(some + " year is not leap");
        } else if (some % 4 == 0) {
            System.out.println(some + " year is leap!");
        } else {
            System.out.println(some + " year is not leap");
        }
        return some;
    }

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        int i = 2100; // enter year here
        year(i);
    }
}