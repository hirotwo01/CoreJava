package Inheritance.BankAccount;

public class CorporateCostumer extends Costumer{
    String companyRegNo;
    String companyName;
    CorporateCostumer(int id, String name, String contact, String companyName, String companyRegNo) {
        super(id, name, contact);
        this.companyName = companyName;
        this.companyRegNo = companyRegNo;
    }
        void displayCorporateCostumer(){
            displayCostumer();
            System.out.println("Company Name:"+companyName);
            System.out.println("Company Reg number:"+companyRegNo);

        }
}
