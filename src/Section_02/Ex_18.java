package Section_02;

class Machine{
    private String name;
    private int code;
    public Machine(){
        this("Arnie", 0);
        System.out.println("Constructor running!");
    }

    public  Machine(String name){
        this(name,0);
        System.out.println("Second constructor running!");
        this.name = name;
    }

    public Machine(String name, int code){
        System.out.println("Third Constructor running!");
        this.code = code;
        this.name = name;
    }
}

public class Ex_18 {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Machine machine2 = new Machine("Bertie");
        Machine machine3 = new Machine("Chalky", 7);
    }
}
