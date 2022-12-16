package Main;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

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

    public static int OC(int OS, int year) {
        boolean goodVersion = year >= 2015;
        boolean earlyVersion = year < 2015;
        if (goodVersion) {
            switch (OS) {
                case 0:
                    System.out.println("Download version for iOS from this link: ");
                    break;
                case 1:
                    System.out.println("Download version for Android from this link: ");
                    break;
                default:
                    System.out.println("Sorry, we haven't done a website for your OS yet!");
            }
        } else if (earlyVersion) {
            switch (OS) {
                case 0:
                    System.out.println("Download light version from this link: ");
                    break;
                case 1:
                    System.out.println("Download light version for Android from this link: ");
                    break;
                default:
                    System.out.println("Sorry, we haven't done a website for your OS yet!");
                    //push
            }
        }
        return OS;
    }

    public static int Delivery(int distance) {
        boolean OK = distance <= 100;
        int deliveryInDays;
        if (OK) {
            if (distance <= 20 && distance > 0) {
                deliveryInDays = 1;
                return deliveryInDays;
            } else if (20 < distance && distance <= 60) {
                deliveryInDays = 1 + 1;
                return deliveryInDays;
            } else if (60 < distance && distance <= 100) {
                deliveryInDays = 1 + 1 + 1;
                return deliveryInDays;
            }
        } else {
            return 0;
        }
        return distance;
    }

    public static void task1() {
        System.out.println("TASK1");
        int i = (int) (Math.random() * 4000); // enter year here
        year(i);
    }

    public static void task2() {
        System.out.println("\nTASK2");
        int version = 1;//enter version here
        int minYear = 1975;
        int maxYear = 2125;
        int middleYear = maxYear - minYear;
        int year = (int) (Math.random() * ++middleYear) + minYear;
        System.out.println(year);
        //enter 0 or 1 here
        OC(version, year);
    }

    //    hardly done, actually donno how to change an int version in method OC, to massive int[] smth = new int[1]; smth[0] = 0;//or 1 if you want ))
    public static void task3() {
        System.out.println("\nTASK3");
        int deliveryDistance = 95;
        if (Delivery(deliveryDistance) == 0) {
            throw new RuntimeException("ERROR CAN'T DELIVER!");
        } else if (Delivery(deliveryDistance) >=  2 || Delivery(deliveryDistance) <=  3) {
            System.out.println("The deliver will take " + Delivery(deliveryDistance) + " days.");
        } else if (Delivery(deliveryDistance) == 1) {
            System.out.println("The deliver will take " + Delivery(deliveryDistance) + " day.");
        }
    }
    //done, and it was really fun!!!!
}