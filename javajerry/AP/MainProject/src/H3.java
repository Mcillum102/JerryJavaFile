package AP.MainProject.src;

public class H3 {

    public static void printNumbersBetween(int a, int b) {
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");  
        }
    
    }
    
    public static void main(String[] args) {
     printNumbersBetween(2, 7);

    }
     
}
