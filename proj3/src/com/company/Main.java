package com.company;

import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; // require
import java.util.Arrays;
import java.util.Locale;
import java.util.StringTokenizer;

public class Main {

    public static String getName() {
        return "Shlomo";
    }

    public static void main(String[] args) {

        //                  01234567
        String my_string = "I Love JAVA!";
        System.out.println("the length of The String is : " + my_string.length());

        String true_str = my_string.valueOf(true); // "true"

        System.out.println(my_string.toUpperCase(Locale.ROOT));
        System.out.println(my_string.toLowerCase(Locale.ROOT));

        System.out.println("index of JAVA " + my_string.indexOf("JAVA"));

        String concat1 = "Hello " + "Java";
        System.out.println(concat1);
        String concat2 = concat1.concat(" !!");
        System.out.println(concat2);

        System.out.println("String.valueOf(20) = " + String.valueOf(20));
        System.out.println("String.valueOf(true) = " + String.valueOf(true));

        String name = "Danny";
        int age_of_danny = 20;
        System.out.println(name + " is " + age_of_danny + " years old.");
        //System.out.println(`${name} is ${age_of_danny} years old.`);
        System.out.println(String.format("%s is %d years old.", name, age_of_danny));
        System.out.printf("%s is %d years old.\n", name, age_of_danny);
        System.out.printf("%s is %d years old.\n", getName(), age_of_danny);
        System.out.printf("%s is %s years old.\n", getName(), age_of_danny);
        System.out.println("we are called \"Vikings\"");
        String full_name = "john.Kennedy";
        String[] parts = full_name.split("\\.");
        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(full_name.substring(0, full_name.indexOf(".")));
        System.out.println(full_name.substring(full_name.indexOf(".") + 1));

        //String full_name = "john.Kennedy.123.456.789";
        StringTokenizer tokenizer = new StringTokenizer(full_name, ".");
        while (tokenizer.hasMoreElements()) {
            System.out.println(tokenizer.nextToken());
        }

        System.out.println(full_name.replace("john", ""));

        System.out.println((String)LocalDateTime.now().toString());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(LocalDateTime.now().format(formatter));

        int[] numbers = new int[10];
        System.out.println(numbers[9]);
        numbers[5] = 5;
        System.out.println(numbers); // [I@5bcab519
        int x = 5;
        //var y = 5; // changes the var to the most correct type -- not recommended in these cases
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(numbers));

        String cars[] = new String[3];
        cars[0] = "Mitsubishi";
        cars[1] = "Honda";
        cars[2] = "Fiat";
        String cars2[] = {"Mitsubishi", "Honda", "Fiat"};
        System.out.println(Arrays.toString((cars2)));
        System.out.println();
        System.out.println("{\"Mitsubishi\", \"Honda\", \"Fiat\"} length = " + new String[] {"Mitsubishi", "Honda", "Fiat"}.length);
        System.out.println(Arrays.toString(new int[] { 1, 4, 7}));

        int[][] seats = new int[2][];
        seats[0] = new int[] { 1, 2, 4};
        seats[1] = new int[] { 1 };

        int[][] seats2 = {
                {1, 2, 4},
                {1}
        };

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();

        for(int number: new int[] {1,2,3}) {

        }
        Arrays.stream((new int[]{1, 2, 3})).forEach(y -> System.out.print(y));
        System.out.println();
        Arrays.stream(new int[]{0, 1, 2, 3, 4}).filter(y -> y > 2).forEach(y -> System.out.print(y));
        System.out.println();
        Arrays.stream(new int[]{0, 1, 2, 3, 4, 5}).map(y -> y * y).forEach(y -> System.out.print(y + " "));
        System.out.println();

    }
}
