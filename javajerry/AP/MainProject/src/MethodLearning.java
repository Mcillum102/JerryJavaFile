public class MethodLearning {

    public static void main(String[] args){

        String str1 = "你好";
        System.out.println(str1);
    
        String greeting = "Hello";

        Class currClass = greeting.getClass();
        System.out.println(currClass);
        Class parentClass = currClass.getSuperclass();
        System.out.println(parentClass);

        String str3 = "This is a test";
        System.out.println(str1.length());
        System.out.println(str1.indexOf(""));
        System.out.println(str1.substring(1,6));
        System.out.println(str1.compareTo(""));
        System.out.println(str1.equals("This is a test"));

        if (str1.substring(0,1).equals("T"))
            System.out.println("Yes");
    }
}