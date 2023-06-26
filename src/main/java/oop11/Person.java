package oop11;

public class Person {
    private String name;
    Person(String name){
        this.name = name;
    }
    public void setAccount(String password) {
        class Account {
            void display() {
                System.out.println(name + "" + password);
            }
        }
        Account account = new Account();
        account.display();
    }

}
