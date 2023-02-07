package Assesment2;

class Tester {
    public static void main(String[] args) {
        User user = new User(101, "Jack", "jack@dxc.com", 1000);
        KYCUser kycuser = new KYCUser(201, "Jill", "jill@dxc.com", 3000);
        
        EPayWallet.processPaymentByUser(user, 700);
        EPayWallet.processPaymentByUser(kycuser, 1500);
        EPayWallet.processPaymentByUser(kycuser, 800);
        EPayWallet.processPaymentByUser(kycuser, 1200);
    }
}
