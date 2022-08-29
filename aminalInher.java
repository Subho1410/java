// inheretence class -->>
public class aminalInher 
{
    void eat()
    {
        System.out.println("Dog is eating.");
    }
}
    class dog extends aminalInher
    {
    public static void main(String[]args)
    {
       dog d = new dog();
       d.eat(); 
    }    
    }
