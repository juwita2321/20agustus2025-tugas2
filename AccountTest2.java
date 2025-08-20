public class AccountTest2 {
    // Class utama untuk menguji SavingsAccount
    public static void main(String[] args) {
        // Membuat objek dari SavingsAccount
        SavingsAccount2 sa1 = new SavingsAccount2();

        // Mengisi nilai untuk field balance dan name
        sa1.name = "Damien";
        sa1.balance = 1000;

        // Menampilkan hasil data akun
        sa1.displayCustomer();
    }
}
