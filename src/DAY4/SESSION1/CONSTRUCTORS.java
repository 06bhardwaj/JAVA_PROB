/* package DAY4.SESSION1;


class student{

    student(){

    }

    int USN;
    String name;
    void display(){
        System.out.println("ID: "+ USN);
        System.out.println("Name: "+ name);
    }
}

public class CONSTRUCTORS {
    public static void main(String[] args){
        //student s = new student();
        System.out.println();
    }
}*/

package DAY4.SESSION1;


class student{
    int USN;
    String name;
     student(int USN, String name){
        this.USN=USN;
        this.name=name;
    }
    void display(){
        System.out.println("ID: "+ USN);
        System.out.println("Name: "+ name);
    }
}

public class CONSTRUCTORS {
    public static void main(String[] args){
        student s = new student(101,"ashok");
        s.display();
    }
}




