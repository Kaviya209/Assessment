package Assesment2Q3;

import java.util.Random;

interface Certification {
int standardFee();
int calculateFee(int admissionTestMarks, int courseDuration);
}


class RRTechnicalCertification {
private String studentName;
private String courseName;
private int admissionTestMarks;
private int courseDuration;
private int registrationId;

public RRTechnicalCertification(String studentName, String courseName, int admissionTestMarks, int courseDuration) {
 this.studentName = studentName;
 this.courseName = courseName;
 this.admissionTestMarks = admissionTestMarks;
 this.courseDuration = courseDuration;
}


public int generateRegistrationId() {
 Random rand = new Random();
 int id = rand.nextInt(9999) + 1;
 if (id % 2 == 0) {
   this.registrationId = id;
 } else {
   this.registrationId = id + 1;
 }
 return this.registrationId;
}

public String getStudentName() {
 return studentName;
}

public String getCourseName() {
 return courseName;
}

public int getAdmissionTestMarks() {
 return admissionTestMarks;
}

public int getCourseDuration() {
 return courseDuration;
}

public int getRegistrationId() {
 return registrationId;
}
}

class RegularCourseCertification extends RRTechnicalCertification implements Certification {
private static final int STANDARD_FEE = 2000;

public RegularCourseCertification(String studentName, String courseName, int admissionTestMarks, int courseDuration) {
 super(studentName, courseName, admissionTestMarks, courseDuration);
}


public int calculateFee(int admissionTestMarks, int courseDuration) {
 int fee = courseDuration * STANDARD_FEE;
 int discount = 0;
 if (admissionTestMarks >= 90) {
   discount = (10 * fee) / 100;
 } else if (admissionTestMarks >= 75 && admissionTestMarks <= 89) {
   discount = (5 * fee) / 100;
 }
 return fee - discount;
}

public int standardFee() {
 return getCourseDuration() * STANDARD_FEE;
}
}

//CrashCourseCertification class
class CrashCourseCertification extends RRTechnicalCertification implements Certification {
private static final int STANDARD_FEE = 5000;
private static final double SERVICE_TAX = 12.36;

public CrashCourseCertification(String studentName, String courseName, int admissionTestMarks, int courseDuration) {
 super(studentName, courseName, admissionTestMarks, courseDuration);
}

// calculateFee method
public int calculateFee(int admissionTestMarks, int courseDuration) {
 int fee = courseDuration * STANDARD_FEE;
 int discount = 0;
 if (admissionTestMarks >= 90) {
	 discount = (10 * fee) / 100;
	 }

 else if( admissionTestMarks >= 75 ){
	 
	 discount = (5 * fee) / 100;
}
 return discount;
}

@Override
public int standardFee() {
	// TODO Auto-generated method stub
	return 0;
}
}
