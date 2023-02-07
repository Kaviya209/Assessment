package Assesment2Q3;
public  class regularcoursecertification extends RRT_technical_certification implements certificate {
    private int duration;
	public regularcoursecertification(String studentname, String coursename, int admissiontestmark,int duration) {
		super(studentname, coursename, admissiontestmark);
		this.duration=duration;
		// TODO Auto-generated constructor stub
	}
	

	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	@Override
	public double calculate(double total) {
		if(super.getAdmissiontestmark()>=90)
		{
			int amount=2000*getDuration();
		    total=amount-amount*10/100;
		}
		else if(super.getAdmissiontestmark()>75 && super.getAdmissiontestmark()<89)
		{
			int amount=2000*getDuration();
		    total=amount-amount*5/100;
		}
		else
		{
			int amount=2000*getDuration();
		    total=amount;
		}
	
		return total;
	}

	

	

}