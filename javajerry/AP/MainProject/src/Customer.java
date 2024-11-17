package AP.MainProject.src;

public class Customer {

    private String name;
    private int idNum;

    public Customer(String name, int idNum){
        this.name = name;
        this.idNum = idNum;
    }

    public String getName(){
        return this.name;
    }
    public int getID(){
        return this.idNum;
    }
    public int compareCustomer(Customer other){
        int compareName = this.getName().compareTo(other.getName());
        if (compareName != 0){
            return compareName;
        }
        return this.getID() - other.getID();
    }

    public static void main(String[] args) {
        Customer c1 = new Customer("Smith",1001);
        Customer c2 = new Customer("Anderson",1002);
        Customer c3 = new Customer("Smith",1003);

        System.out.println(c1.compareCustomer(c3));
    }

}
