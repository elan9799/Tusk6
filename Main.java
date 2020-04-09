import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //static public Scanner sc = new Scanner(System.in); // я не понял почему из за этого сканера вылазили проблемы, крч я сделал их локальными

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            operation();
        }
    }

    private static void operation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("выбери опирацию крч");
        System.out.println(1 + " = Дана строка, проверить, что она состоит из строчных букв" + "\n" +
                2 + " = Дан массив, посчитать количество положительрных элементов в нём" + "\n" +
                3 + " = Даны два числа, проверить, что число a делится на число b" + "\n" +
                4 + " = Заменить все отрицательные элементы на ноль в массива" +  "\n" +
                5 + " = Проверить, что строка является палиндромом" + "\n" +
                6 + " = exit");
        int flag = sc.nextInt();
        switch (flag){
            case 1: { StrlovCas(); } return;
            case 2: { arrayPosiEl(); } return;
            case 3: { twoNum(); } return;
            case 4: { negativeInArrayToZero();} return;
            case 5: { strPolindrom(); } return;
            case 6: { System.exit(0);} return;
        }

    }

    private static void strPolindrom() {
        System.out.println("введи стрк");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = 0; i < str.length() / 2; i++) {
            if (!(str.charAt(i) == str.charAt(str.length() - 1 - i))){
                System.out.println("nope");
                return;
            }
        }
        System.out.println("yep");

    }

    private static void negativeInArrayToZero() {
        System.out.println("введите массив через пробел ");
        Scanner sc = new Scanner(System.in);

        String aray = sc.nextLine();
        int lenght = 0;
        for (String vr: aray.split(" ")) {
            lenght += 1;
        }
        String [] num;
        int [] num2 = new int[lenght];
        num = aray.split(" ");
        for (int i = 0; i < lenght; i++) {
            num2[i] = Integer.parseInt((num[i]));
        }
        System.out.println(Arrays.toString(num2));
        for (int i = 0; i < lenght; i++) {
            if (num2[i] < 0){
                num2[i] = 0;
            }
        }
        System.out.println(Arrays.toString(num2));
    }

    private static void twoNum() {
        System.out.println("введите 2 числа");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a % b == 0){
            System.out.println("делится");
        }else {
            System.out.println("нет");
        }

    }

    private static void arrayPosiEl() {
        System.out.println("введи массив через пробел");
        Scanner sc = new Scanner(System.in);
        String ar = sc.nextLine();
        String [] num;
        int lenght = 0;
        for (String vr: ar.split(" ")) {
            lenght += 1;
        }
        int num2[] = new int[lenght];
        int counter = 0;
        num = ar.split(" ");
        for (int i = 0; i < lenght; i++) {
            num2[i] = Integer.parseInt((num[i]));
            if (num2[i] > 0){
                counter += 1;
            }
        }
        System.out.println("число положительных элементов = " + counter + "\n");
    }

    private static void StrlovCas() {
        System.out.println("введи строку");
        Scanner sc = new Scanner(System.in);
        String variable = sc.next();
        int x = 0;
        for (int i = 0; i < variable.length(); i++) {
            x = variable.charAt(i);
            if (x >= 65 && x<= 90 || x >= 1040 && x<= 1071){
                System.out.println("has upper case" + "\n");
                return;
            }
        }
        System.out.println("has no up cs" + "\n");
        return;
    }
}
