package com.company;

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

        //String full_name = "john.Kennedy";
        StringTokenizer tokenizer = new StringTokenizer(full_name, ".");
        while (tokenizer.hasMoreElements()) {
            System.out.println(tokenizer.nextToken());
        }

        System.out.println();
    }
}
