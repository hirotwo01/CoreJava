package Inheritance.BankAccount;

public class Costumer {
    String costumerName;
    int costumerID;
    String costumerContact;
    Costumer(int id,String name,String contact){
        costumerID=id;
        costumerName=name;
        costumerContact=contact;
    }
    void displayCostumer(){
        System.out.println("Costumer id:"+costumerID);
        System.out.println("Costumer name:"+costumerName);
        System.out.println("Costumer Contact:"+costumerContact);
    }
}
