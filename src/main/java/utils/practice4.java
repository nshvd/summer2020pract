package utils;

public class practice4 {
    public static void main(String[] args) {
        String a = "text";
        String b = "text";
        a +="1";
        b +="1";
        System.out.println(a!=b);//true
        System.out.println(b);
        a ="text1";
        b ="text1";
        System.out.println(a!=b);//false



        int k,j;
         k = 10;
         j = 20;
         while(++k < --j);
             System.out.println(k);

            String x = "Java";
            x = x.concat(" Ruls!");
        System.out.println("x=" +x);

           x = x.toUpperCase();
        System.out.println("x=" +x);
        x = x.replace('A','X');
        System.out.println("x=" +x);







        System.out.println(twoChar("hello", 2));



    }

    public static String twoChar(String str, int index) {

        if(index <= str.length()-3 && index >= 0){
            return str.substring(index,index + 3);
        }
        return str.substring(0,3);

    }
    public String nTwice(String str, int n) {
        return str;

    }
}
