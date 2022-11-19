public class Main {
    public static void main(String[] args) {
        System.out.println(num (21, 17));
        System.out.println(num(46, 69));
        System.out.println(num(15, 30));
        System.out.println(num(34, 28));
        System.out.println(num(57, 46));

    }



    public static String num (int age, int temperature){
        String num1 = "Можно идти гулять";
        String num2 = "Оставайтесь дома";
        if(age >= 20 && age <=45 && temperature>= -20 && temperature <=30){
            return num1;
        } else if (age <20 && temperature >=0 && temperature <= 28) {
            return num1;
        } else if (age >45 && temperature >= -10 && temperature <=25) {
            return num1;
        } else
            return num2;

    }
    }


