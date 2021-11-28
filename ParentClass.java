public class ParentClass {

    public void parentmethod(){
        System.out.println("This is parent class.");
    }
}

class ChildClass extends ParentClass{
    public void childmethod(){
        System.out.println("This is child class.");
    }
}

class Ans{
    public static void main(String[] args){
        ParentClass m = new ParentClass();
        ChildClass n = new ChildClass();
        m.parentmethod();
        n.childmethod();
        n.parentmethod();
    }
}
