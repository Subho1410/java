public class emp {
    String name;
    int id;
    emp(String name, int id){
        this.name=name;
        this.id=id;
    } void display(){
        System.out.println(name+" "+id);
    }

    public static void main (String[]args){
        emp n1 = new emp("Gonesh",00245);
        emp n2 = new emp("Kartik",00224);
        n1.display();
        n2.display();
        
    }
    
}
