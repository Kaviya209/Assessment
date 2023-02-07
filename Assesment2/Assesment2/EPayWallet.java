package Assesment2;

class EPayWallet {
    public static void processPaymentByUser(User user, double billAmount) {
        boolean paymentSuccess = user.makePayment(billAmount);
        if (paymentSuccess) {
            System.out.println("Congrats " +user.getUsername() + "Payment of "+ billAmount +" processed successfully");
            System.out.println("Email: " + user.getEmail());
        }
        
         else {
                System.out.println("Sorry "+user.getUsername() +"you dont have enough  balance to make payment");
            }
                       System.out.println("Your wallet balance: " + user.getWalletBalance());
                       
                      
       
            if (user instanceof KYCUser) {
                KYCUser kycUser = (KYCUser) user;
                System.out.println("You have" + kycUser.getRewardPoints()+"Ponits!");
            }
            System.out.println("****************************************");
        } 
         }

