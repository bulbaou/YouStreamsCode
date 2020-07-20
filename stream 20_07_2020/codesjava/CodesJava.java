package codesjava;

import java.util.Scanner;

/**
 * @author Александр Ермаков
 */
public class CodesJava {
     public static void sortStringArray(String[] strArr) {
        String tempString;
        for (int i = strArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (strArr[j].length() > strArr[j + 1].length()) {
                    tempString = strArr[j + 1];
                    strArr[j + 1] = strArr[j];
                    strArr[j] = tempString;
                }
            }
        }
    }

    public static void main(String[]args) {
        int lines, i;
        char ch;
        System.out.println("Введите число строк: ");
        Scanner scanner = new Scanner(System.in);
        lines = scanner.nextInt();
        scanner.nextLine();
        String[] str = new String[lines];
        System.out.println("Введите строки: \n");
        for (i = 0; i < lines; i++) {
            str[i] = scanner.nextLine();
        }
        sortStringArray(str);
        System.out.println("Результат сортировки строк: \n");
        for (String s:str) {
            System.out.println(s);
        }
    }
}
