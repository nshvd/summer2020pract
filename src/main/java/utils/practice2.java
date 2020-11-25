package utils;

public class practice2 {
    public static void main(String[] args) {
        String name ="Product";
        String name2 ="apple";
        String name3 ="bread";

        String name1 = "Quantity";
        int productApple = 2;
        int productBread = 3;

        String name4 = "Price";
        double priceApple = 3.4;
        double priceBread = 4.5;


        System.out.printf("%-15s%-15s%-15s\n",name,name1,name4);
        System.out.printf("%-15s%-15d%-15.2f\n",name2,productApple,priceApple);
        System.out.printf("%-15s%-15d%-15.2f\n",name3,productBread,priceBread);


    }

}
