package DAY4.SESSION1;

class student{
    private String name;
    private int balance;
    
    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name = name;
    }

    public int getbalance(){
        return balance;
    }

    public void setbalance(int balance){
        this.balance=balance;

    }
}

public class gettersandsetters {
    public static void main(String[] args) {
        student s = new student();
        System.out.println(s.getname());

        System.out.println(s.getbalance());
        
    }
}
