package utils;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Substring {
    public static void main(String[] args) {

        String s ="WelcomeToDevxSchool";
        String s1 = s.substring(9,13);
        System.out.println(s1);

        hello(s);

    }
    public static void hello(String name){
        System.out.println("Hello: " + name);
        System.out.println("======================");
    }


}
