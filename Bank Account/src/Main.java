
public class Main {
    public static void main(String[] args) {

        Account A1 = new Account();
        A1.setAccount_balance(8000);
        A1.setAccount_number(6272);
        A1.setCustomer_name("Kirzteen Marie Uy");
        A1.setEmail("kirzteenuy27@gmail.com");
        A1.setPhone_number(9668704300);

        System.out.println(A1.toString());

        A1.deposit(500);
        System.out.println(A1.toString());

        A1.withdraw(3000);
        System.out.println(A1.toString());

        A1.withdraw(200);
        System.out.println(A1.toString());


    }
}