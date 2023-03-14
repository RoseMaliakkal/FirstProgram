package Oops.Polymorphism.MethodOverridding;

public class CalculateInterest {
    public static void main(String[] args) {
        ICICI icici = new ICICI();
        SBI sbi = new SBI();
        Bank bn = new SBI();
        System.out.println("ICICI interest: " + icici.getInterest());
        System.out.println("SBI interest: " + sbi.getInterest());
        System.out.println("SBI interest called using Bank object: " + bn.getInterest());
    }
}
