public class Program {
    public static void main(String[] args){
        Person sergei = new  Person(name: "Sergei");
        System.out.println(sergei.getName());
        changeName(sergei);
        System.out.println(sergei.getName());
    }
    static void changeName(Person p){
        p.setName("Anton");
    }

}
