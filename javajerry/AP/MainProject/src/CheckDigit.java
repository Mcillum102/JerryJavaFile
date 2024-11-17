public class CheckDigit {
    
    public static int getCheck(int num) {
        int x = 1;
        int y = 0;
        while (x <= getNumberOfDigits(num)){
            y += getDigit(num,x)*(8-x);
            x = x + 1;
        }
        return y % 10;
        
    }

    public static boolean isValid(int numWithCheckDigit) {
        int x = numWithCheckDigit % 10;
        int y = numWithCheckDigit / 10;
        return x == getCheck(y);
    }

    public static int getNumberOfDigits(int num) {
        String numString = Integer.toString(num);

        return numString.length();
    }

    public static int getDigit(int num, int n) {
        String numString = Integer.toString(num);
        String digitString = numString.substring(n-1, n);

        int digit = Integer.parseInt(digitString);
        
        return digit;
    }

    public static void main(String[] args) {

        System.out.println(getCheck(159));
        System.out.println(isValid(1592));
    }
}
