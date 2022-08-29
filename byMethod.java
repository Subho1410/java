//Creating object by using Method---->>
public class byMethod {
    String name;
    int age;
    void dog(String n, int a){
        name=n;
        age=a;
    }void display(){
        System.out.println(name+" "+age);
    }

    public static void main(String[]args){
        byMethod s=new byMethod();
        s.dog("Lalu", 42);
        s.display();
    }
}
