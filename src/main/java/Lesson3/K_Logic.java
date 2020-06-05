package main.java.Lesson3;

public class K_Logic {
    public static void main(String[] args) {
        String name = "Vova";
        int age = 50;
//        String name = "Vova3";
//        int age = 2;

        //if (50 > 18) {
        //if (1 > 18) {
        //if (age > 18) {
        //if (age > 18 && name == "Vova") {
//        if (age > 18 || name == "Vova") {
//            System.out.println("Hello user");
//        } else if (age > 10) {
//            System.out.println("User age is more that 10");
//        } else {
//            System.out.println("Access denied");
//        }
//        if (age == 18) {
//             System.out.println("Your age is 18");
//        }
//        String status;
//        if(age > 18) {
//            status = "Worker";
//        } else {
//            status = "Student";
//        }
        String status = (age > 18) ? "Worker" : "Student";

        if (age > 18) status = "Worker";
        else status = "Student";
        int dayOfWeek = 1;
//          if(dayOfWeek == 0) {
//              System.out.println("Monday");
//          } else if(dayOfWeek == 1) {
//              System.out.println("Thursday");
//          }
//        switch (dayOfWeek) {
//            case 0:
//                System.out.println("Monday");
//                break;
//            case 1:
//                System.out.println("Thursday");
//                break;
//            case 2:
//                System.out.println("Wednesday");
//                break;
//            default:
//                System.out.println("No such day");
//        }
        switch (dayOfWeek) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Weekday");
                break;
            case 5:
            case 6:
                System.out.println("Holiday");
                break;
            default:
                System.out.println("No such day");
        }
    }
}
