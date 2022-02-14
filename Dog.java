import java.util.ArrayList;



class animal{
    Integer legs;
    public animal(){
        System.out.println("wow a new animal");
    }
    public void sound(){
        System.out.println("bark");
    }
}
class dog extends animal{
    private String name;
    public dog(String n){this.name = n;}
    public String getName(){ return name; }
}

class chihuahua extends dog{
    ArrayList<String> belongings = new ArrayList<>();

    public chihuahua(String name){
        super(name);
    }

    public void addItem(String Item){
        belongings.add(Item);
    }
}