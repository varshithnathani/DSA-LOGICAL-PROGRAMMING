import java.util.*;
class Basics{
    public static void main(String[] args) {
        
        // Initialization of strings
        String str = "Hello";
        String str2 = new String("Hello");

        System.out.println(str.length());

        // Concatination
        System.out.println(str.concat("World"));
        // or
        System.out.println(str+"World");

        // comparig to strings
        String str3 = "Hello";
        if(str.equals(str3)){
            System.out.println("Both are same ");
            System.out.println(str.equals(str3));
        }else{
            System.out.println("Not same");
            System.out.println(str.equals(str3));
        }

        // compare to 
        System.out.println(str.compareTo(str3)); // if both same = 0; if str greater = >0 else <0

        // substring
        System.out.println(str.substring(0,4));

        // Trim
        String str4 = " HELLO ";
        System.out.println(str4);
        System.out.println(str4.trim());

        // Replacing a character
        System.out.println(str4.replace('H','A'));

        // searching a string
        String text = "Hello I am practing Java , i hope i can make it ";
        String Search = "Java";
        System.out.println(text.indexOf(Search)); // it will give me the index of the first char. if not there then -1

        // converting cases

        String newText = "Hello";
        System.out.println(newText.toUpperCase());
        System.out.println(newText.toLowerCase());

        // Empty String
        String str5 = "";
        if(str5.isEmpty()){
            System.out.println("Its Emplty");
        }else{
            System.out.println("Not Empty");
        }

        // char arr[] to string
        char[] ch1 = {'a','b','c'};
        String conv = new String(ch1);
        System.out.println(conv);

        // String to char[] arr
        String conv1 = "Morning";
        char[] ch = conv1.toCharArray();
        for(char c: ch){
            System.out.print(c+" ");
        }
        System.out.println();


        // contains
        System.out.println(text.contains("Java"));
        System.out.println(text.contains("JAVA"));

        // .split()
        System.out.println(text);
        String[] strarr = text.split(" ");
        // for(String a : strarr){
        //     System.out.println(a);
        // }
        System.out.println(Arrays.toString(strarr));
        

    }
}