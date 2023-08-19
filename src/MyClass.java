public class MyClass {

    //equality printer
    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("invalid value");
            return;
        }
        if (a == b && b == c) {
            System.out.println("all numbers are equal");
            return;
        }
        if (a != b && b != c) {
            System.out.println("all numbers are different");
            return;
        }
        System.out.println("neither all are equal or different");
    }

    //teen number checker
    public static boolean hasTeen(int age1, int age2, int age3) {
        if (age1 >= 13 && age1 <= 19) {
            return true;
        } else if (age2 >= 13 && age2 <= 19) {
            return true;
        } else if (age3 >= 13 && age3 <= 19) {
            return true;
        } else
            return false;
    }

    public static boolean isTeen(int age) {
        if (age >= 13 && age <= 19) {
            return true;
        }
            return false;
    }

    //equal sum checker
    public static boolean hasEqualSum(int p1, int p2, int p3) {
        if (p1 + p2 == p3) {
            return true;
        }
            return false;
    }

    //barking dog
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if (hourOfDay<0||hourOfDay>23){
            return false;
        }
        if (barking){
            if (hourOfDay<=8||hourOfDay>=22){
                return true;
            }
        }
        return false;
    }
    //area calculator

    /**
     * represent circles area
     */
    public static double area(double radius){
        if (radius<0){
            return -1d;
        }
        return radius*radius*Math.PI;
    }

    /**
     * represent area of rectangle
     */
    public static double area(double x,double y){
        if (x<0||y<0){
            return -1d;
        }
        return x*y;
    }

}


