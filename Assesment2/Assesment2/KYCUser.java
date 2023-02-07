package Assesment2;

class KYCUser extends User {
    private double rewardPoints;

    public KYCUser(int id, String username, String email, double walletBalance) {
        super(id, username, email, walletBalance);
    }

    public double getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(double rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	@Override
    public boolean makePayment(double billAmount) {
        boolean paymentSuccess = super.makePayment(billAmount);
        if (paymentSuccess) {
            rewardPoints += billAmount * 0.1;
        }
        return paymentSuccess;
    }

}
