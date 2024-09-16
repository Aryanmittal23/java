class DemoClass {
         static void staticMethod() {
            System.out.println("Static method executed.");
        }
    }
    public class Solution3 {
        static {
            System.out.println("Static block executed. This runs before the main method.");
        }
        public static void main(String[] args) {
            System.out.println("Main method starts.");
            DemoClass demo = new DemoClass();
            DemoClass.staticMethod();
            System.out.println("Main method ends.");
        }
    }
    