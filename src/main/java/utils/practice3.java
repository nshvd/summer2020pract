package utils;
/*Given a string, return a “rotated left 2” version where the first 2 chars are moved to the end.
The string length will be at least 2.
left2(“Hello”) → “lloHe”
left2(“java”) → “vaja”
left2(“Hi”) → “Hi”
*/


public class practice3 {

    public static String withoutEnd (String name){
        String res = "";
        res = name.substring(1,name.length()-1);
        return res;
    }
    public static String comboString(String name1, String name2){
        String res ="";
        if(name1.length() > name2.length()){
            res = name2.concat(name1).concat(name2);
        }else if(name1.length() < name2.length()){
            res = name1.concat(name2).concat(name1);
        }
        return res;
    }
    public static String nonStart(String name, String name2){
        String res = "";
        res = name.substring(1).concat(name2.substring(1));
        return res;
    }
    public static String left2(String name){
        String firstTwo = name.substring(0,2);
        String rest = name.substring(2);
        return rest+firstTwo;
    }
    public static String right2(String name){
        return name;
    }
    public static boolean endsLy(String str) {
        int len = str.length();
        String name ="ly";
        if(len < 2){
            return false;
        }else if(name.equals(str.substring(len-2,len))){
            return true;
        }else{
            return false;
        }
    }

    /*Given a string of even length, return a string made of the middle two chars, so the string “string” yields “ri”.
    The string length will be at least 2.
middleTwo(“string”) → “ri”
middleTwo(“code”) → “od”
middleTwo(“Practice”) → “ct*/

    public static String theEnd(String name, boolean isTrue){
        String res = "";

        if(isTrue == true){
            res = name.substring(0,1);

   }else{
            res = name.substring(name.length()-1);

        }
        return res;

    }
    public static String middleTwo(String name){

        int a = name.length()/2-1;//0
        return name.substring(a, a + 2);
    }
    public static void main(String[] args) {
        System.out.println(right2("hello"));
        System.out.println(middleTwo("hello"));
        System.out.println(theEnd("Hello", false));
        System.out.println(withoutEnd("ab"));
        System.out.println(comboString("Hello", "hi"));
        System.out.println(nonStart("hello", "code"));
        System.out.println(left2("hellohi"));
    }





}
