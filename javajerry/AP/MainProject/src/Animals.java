package AP.MainProject.src;


public class Animals {
    private String type;
    private int age;
    private String color;

    public Animals(String theType, int theAge, String theColor){
        this.type = theType;
        this.age = theAge;
        this.color = theColor;
    }
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public static void main(String[] args) {
        Animals pig = new Animals("pig",100,"pink");
        System.out.println(pig.getType());
        pig.setAge(18);
        System.out.println(pig.getAge());
    }
}
