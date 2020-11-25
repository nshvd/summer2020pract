package utils;
/*Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
extraEnd(“Hello”) → “lololo”
extraEnd(“ab”) → “ababab”
extraEnd(“Hi”) → “HiHiHi”
*/


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class practice {

    public static String helloName(String name){
        String greeting = "Hello " + name + "!";
        return greeting;
    }
  public static String makeAbba(String a , String b){
        String result = a + b + b + a ;
        return result;
    }
    public static String nameTags(String a, String b ){
        String open = "<";
        String close =">";
        String slash = "/";
        String result = open + a + close + b + open + slash + a + close;
        return result;
    }
    public static int sum(int a, int b){
        int sum = a + b;
        return sum;

    }
    public static int difference(int a , int b){
        int dif = a- b;
        return dif;
    }
    public static String makeOutWord(String a , String b){
        String con = a.substring(0,2).concat(b).concat(a.substring(2));
        return con;
    }
    public static String extraEnd(String name){
        String res = name.substring(name.length()-2);
        String result = res.concat(res).concat(res);
        return result;

    }
    /*Given a string of even length, return the first half. So the string “WooHoo” yields “Woo”.
firstHalf(“WooHoo”) → “Woo”
firstHalf(“HelloThere”) → “Hello”
firstHalf(“abcdef”) → “abc”*/

    public static String firstTwo(String name){
        String res = "";
        if(name.length() == 2){
           res += name;
        }else if(name.length() > 2){
            res += name.substring(0,2);
        }else{
            res += name;
        }
        return res;

    }
    public static String firstHalf(String name){
        int a = name.length()/2;

        String res = name.substring(a);
        return res;

    }
    public static void main(String[] args) {
//        System.out.println(helloName("Bob"));
//        System.out.println(makeAbba("Hi", "Bye"));
//        System.out.println(nameTags("hi", "hello"));
//        System.out.println(sum(23,34));
//        System.out.println(difference(3,-1));
//        System.out.println(makeOutWord("<<>>", "hey"));
//        System.out.println(extraEnd("hello"));
        System.out.println(firstTwo("a"));
        System.out.println(firstHalf("woohoo"));


    }





}
