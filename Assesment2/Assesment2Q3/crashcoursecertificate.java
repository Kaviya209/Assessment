package Assesment2Q3;

	public class crashcoursecertificate extends RRT_technical_certification implements certificate {

		
		public crashcoursecertificate(String studentname, String coursename, int admissiontestmark) {
			super(studentname, coursename, admissiontestmark);
			// TODO Auto-generated constructor stub
		}

		@Override
		public double calculate(double total) {
			if(super.getAdmissiontestmark()>=90)
			{
				double amount=5000-5000*12.36/100;
			    total=amount-amount*10/100;
			}
			else if(super.getAdmissiontestmark()>75 && super.getAdmissiontestmark()<89)
			{
				double amount=5000-5000*12.36/100;
			    total=amount-amount*5/100;
			}
			else
			{
				total=5000+5000*12.36/100;
			}
		
			return total;
		}

	}
}
