package DAY4.SESSION3;

public class multiple {


    interface father{
        default void skill(){
            System.out.println("driving");
        }
    }
    static class mother{
        void skill(){
            System.out.println("cooking");
        }
    }


    static class child extends mother implements father{
        public void skill(){
            father.super.skill();
            super.skill();
        }

        void display(){
            skill();
        }
    }
    public static void main(String[] args) {
        child c = new child();
        c.display();
    }
}