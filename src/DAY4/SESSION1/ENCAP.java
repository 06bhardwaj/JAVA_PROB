package DAY4.SESSION1;

class country{
    String name;
    void display(){
        System.out.println(name);
    }    
}

public class ENCAP {

    public static class car{
        String brand;
        String color;
        void display(){
            System.out.println(brand + " " + color);
        }
    }
    public static void main(String[] args) {

        car c= new car();
        c.brand="BMW";
        c.color="Black";
        c.display();

        country c1=new country();
        c1.name="Germany";
        c1.display();
        
    }
}
