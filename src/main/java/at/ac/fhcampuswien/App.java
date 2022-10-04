package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {
    Scanner scanner = new Scanner(System.in);
    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");

    }

    //todo Task 3
    public void sumOfLiterals(){
        char a = 'Z';   //Ascii
        int b = 0xface;
        int c = 10;
        long d = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;

        int d1 = (int) d;
        int e1 = (int) e;
        int f1 = (int) f;
        int g1 = (int) g;
        int h1 = (int) h;

        int sum = (a+b+c+d1+e1+f1+g1+h1);
        System.out.println(sum);




    }

    //todo Task 4
    public void addTwoNumbers(){
        int x;
        int y;
        x = scanner.nextInt();
        y = scanner.nextInt();
        int sum = x + y;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        System.out.print("Before Swap:" + System.lineSeparator());
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();
        x = x * y;
        y = x / y;
        x = x / y;
        System.out.print("After Swap:" + System.lineSeparator());
        System.out.print("x: " +x + System.lineSeparator());
        System.out.print("y: " +y + System.lineSeparator());
    }

    //todo Task 6
    public void compareTwoNumbers(){

            System.out.print("n1: ");
            int num1 = scanner.nextInt();
            System.out.print("n2: ");
            int num2 = scanner.nextInt();
            if (num1 > num2) {
                System.out.print("n1 > n2" + System.lineSeparator());
            } else if (num2 > num1) {
                System.out.print("n2 > n1" + System.lineSeparator());
            } else {
                System.out.print("n1 == n2" + System.lineSeparator());
            }

    }

    //todo Task 7
    public void ratingSalesPerson(){
        for (int i = 0; i < 1; i++) {
            System.out.print("Enter annual Revenue: ");
            int revenue1 = scanner.nextInt();
            if (revenue1 >= 0 && revenue1 < 20000)
            {
                System.out.print("Poor Sales Revenue" + System.lineSeparator());
            }
            else if (revenue1 >= 20000 && revenue1 < 50000)
            {
                System.out.print("Average Sales Revenue" + System.lineSeparator());
            }
            else if ( revenue1 >= 50000 && revenue1 < 80000)
            {
                System.out.print("Good Sales Revenue" + System.lineSeparator());
            }
            else if (revenue1 >= 80000 && revenue1 < 100000)
            {
                System.out.print("Excellent Sales Revenue" + System.lineSeparator());
            }
            else
            {
                System.out.print("Invalid Revenue" + System.lineSeparator());
            }
        }



    }

    //todo Task 8
    public void getCommissionRate(){
        System.out.print("Enter CommissionClass: ");
        int x = scanner.nextInt();
        switch (x) {
            case 1:
                System.out.print("Your Commission Rate was set to 0.01" + System.lineSeparator());
                break;
            case 2:
                System.out.print("Your Commission Rate was set to 0.02" + System.lineSeparator());
                break;
            case 3:
                System.out.print("Your Commission Rate was set to 0.03" + System.lineSeparator());
                break;
            case 4:
                System.out.print("Your Commission Rate was set to 0.04" + System.lineSeparator());
                break;
            default:
                System.out.print("Your Commission Rate was set to 0.0" + System.lineSeparator());
        }
    }

    //todo Task 9
    public void leapyear(){
        System.out.print("Year: ");
        int year = scanner.nextInt();
        if(year % 4 != 0)
            {
                System.out.println("Not a Leapyear");
            }
        else if(year % 400 == 0)
            {
                System.out.println("Leapyear");
            }
        else if(year % 100 != 0)
            {
                System.out.println("Leapyear");
            }
        else
            {
                System.out.println("Not a Leapyear");
            }
    }

    //todo Task 10
    public void transposedNumbers(){
        System.out.print("Number: ");
        int num = scanner.nextInt();
        int reverse = 0;
        while (num != 0)
             {
                int remain = num % 10;
                reverse = reverse * 10 + remain;
                num = num / 10;
             }
                    {
                        System.out.println( reverse); // Ergebnis
                    }

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}