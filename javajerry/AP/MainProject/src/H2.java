package AP.MainProject.src;

public class H2 {

    public static void main(StringLesson[] args) {
        boolean x;
        for(int i=2;i<999;i++){
            x = true;
            for(int j=2;j<i;j++){
                if (i % j == 0){
                    x = false;
                    
                }
            }
                if (x){
                    System.out.println(i);
                }
        }
        
    }
    
}
