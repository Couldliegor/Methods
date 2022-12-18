package Main;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void yearLeapCounting(int some) {
        if (some % 4 == 0 && some % 100 != 0 || some % 400 == 0) {
            System.out.println(some + " year is leap");
        } else {
            System.out.println(some + " year is not leap");
        }
    }

    public static void oCAndYearChecking(int oS, int year) {
        boolean goodVersion = year >= 2015;
        boolean earlyVersion = year < 2015;
        if (goodVersion) {
            if (oS == 0) {
                System.out.println("Download version for iOS from this link: ");
            } else if (oS == 1) {
                System.out.println("Download version for Android from this link: ");
            } else {
                System.out.println("Sorry, we haven't done a website for your OS yet!");
            }
        if (earlyVersion) {
            if (oS == 0) {
                System.out.println("Download light version from this link: ");
            } else if (oS == 1) {
                System.out.println("Download light version for Android from this link: ");
            } else {
                System.out.println("Sorry, we haven't done a website for your OS yet!");
            }
            }
        }
    }

    public static int totalDaysCountingByDistance(int distance) {
        boolean deliverable = distance <= 100;
        if (deliverable) {
            if (distance <= 20 && distance > 0) {
                return 1;
            } else if (20 < distance && distance <= 60) {
                return 1 + 1;
            } else if (60 < distance && distance <= 100) {
                return 1 + 1 + 1;
            }
        } else {
            return 0;
        }
        return distance;
    }

    public static void task1() {
        System.out.println("TASK1");
        int currentYear = (int) (Math.random() * 4000); // enter year here
        yearLeapCounting(currentYear);
    }

    public static void task2() {
        System.out.println("\nTASK2");
        int version = 1;//enter version here
        int minYear = 1900;
        int maxYear = 2100;
        int middleYear = maxYear - minYear;
        int year = (int) (Math.random() * ++middleYear) + minYear;
        System.out.println(year);
        oCAndYearChecking(version, year);
    }

    //    hardly done, actually donno how to change an int version in method OC, to massive int[] smth = new int[1]; smth[0] = 0;//or 1 if you want ))
    public static void task3() {
        System.out.println("\nTASK3");
        int deliveryDistance = 95;
        int totalDays = totalDaysCountingByDistance(deliveryDistance);
        if (totalDays == 0) {
            throw new RuntimeException("ERROR CAN'T DELIVER!");
        } else if (totalDays >=  2 || totalDays <=  3) {
            System.out.println("The deliver will take " + totalDays + " days.");
        } else if (totalDays == 1) {
            System.out.println("The deliver will take " + totalDays + " day.");
        }
    }
    //done, and it was really fun!!!!
}