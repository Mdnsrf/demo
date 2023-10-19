
public class Student {
	private int rollno, mark1,mark2,mark3;
	String grade;
	int total;
	double percentage;

	public void acceptInfo(int rollno, int mark1, int mark2, int mark3) {
		
		
		this.rollno = rollno;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	
	
	public void display()
	{
		total=mark1+mark2+mark3;
		percentage=total/3.0;
		
		if(percentage>=75)
			grade="A";
		else if(percentage<75 && percentage>=35)
			grade="B";
		else
			grade="F";
		
		System.out.println("rollno:"+rollno+" marks1:"+mark1+" mark2:"+mark2+" mark3:"+mark3+" total:"+total+" percentage:"+percentage+ " grade:"+grade);
		
		
	}
	
	
	

}
