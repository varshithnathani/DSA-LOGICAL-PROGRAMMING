public class TypeConversion {
    public static void main(String[] args) {
        String test1 = "20";
        int n1 = Integer.parseInt(test1); // to convert string to Integer
        System.out.println(n1+2);// verfying by adding val 2 return 22

        // Integer to String
        int n2 = 123;
        String str1 = Integer.toString(n2);
        System.out.println(str1+20); // adding vlue to verfy it shoud print 12320

        // String to char
        String dummy = "Hello";
        char ch = dummy.charAt(0);
        System.out.println(ch);
        for(int i=0; i<dummy.length(); i++){
            System.out.print(dummy.charAt(i)+" ");
        }
        System.out.println();

        // char to string
        char ch2 = 'a';
        String cs = Character.toString(ch2);
        System.out.println(cs);
        char[] arr1 = {'A','L','P','H','A'};
        String test2 = "";
        for(int i=0; i<arr1.length; i++){
            test2 += Character.toString(arr1[i]);
        }
        System.out.println(test2);


        // char to Int
        char ch3 = '1';
        int n3 = Character.getNumericValue(ch3);
        System.out.println(n3);

        char ch4 = 'a';
        int n4 = (int) ch4;
        System.out.println(n4);

        
    }
}
