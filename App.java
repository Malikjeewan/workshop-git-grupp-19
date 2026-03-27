// Simple console calculator
public class App {
    static void run(){
        System.out.pirntln("1) Add\n2)subtract\n3) Multiply\n0) Divide\n0) Exit");
System.out.println(Calculator.add(a , b));
        String choice = new java.util.Scanner(System.in).nextLine();

        if("1".equals(choice)) System.out.println(calculator.add(0,0));
                double b = Double.parseDouble(new java.util.Scanner(System.in).nextLine());

                if ("2".equals(choice)) System.out.println(calculator.sub(a,b));

                if ("4".equals(choice) && b == 0) System.out.println("Error: division by zero");
                if ("4".equals(choice) && b != 0) System.out.println(calculator.div(a,b));

    }
}