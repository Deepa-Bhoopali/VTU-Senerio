package in.kletech.vtu;

public interface VTU {
	 int noOfStud ();
	

	class Department{
	    String sDepName;
	    int noOfstudents;
	    int noOfFaculties;
	    float avgCredits;

	    public Department(String sDepName, int noOfstudents, int noOfFaculties, float avgCredits) {
	            this.sDepName = sDepName;
	            this.noOfstudents = noOfstudents;
	            this.avgCredits = avgCredits;
	            this.noOfFaculties = noOfFaculties;
	    }
	}

	public abstract class College implements VTU{
	    String collCode;
	    String collName;
	    Department[] departments = new Department[10];
	    int noOfDepts=0;

	    @Override // Implementing methods present in interface
	    public int noOfStud(){
	        int sum=0;
	        for(int j=0;j<noOfDepts;j++)
	        {
	            if(departments[j]!=null)
	                sum=sum+departments[j].noOfstudents;
	        }
	        return sum;
	    }

	    public College(String collCode, String collName) {
	        this.collCode = collCode;
	        this.collName = collName;
	    }

	    void createDept (String sDepName, int noOfstudents,	int noOfFaculties, float avgCredits ){
	        departments[noOfDepts++]=new Department(sDepName, noOfstudents, noOfFaculties, avgCredits);
	    }
	    
	    void displayInfo()
	    {
	        System.out.println("College Details:");
	        System.out.println("\tCollege Name: "+collName+"\n\tCollege code: "+collCode+"\n\tNo. of Departments: "+noOfDepts);
	        for(int i=0; i<noOfDepts; i++)
	            System.out.println("\tDepartment Name: "+departments[i].sDepName+", Faculties: "+departments[i].noOfFaculties+", Students: "+departments[i].noOfstudents+" Average credits: "+departments[i].avgCredits);
	    }
	}

	class autonomousCollege extends College // Inheritance
	{
	    Department[] splDepts = new Department[10]; //additional depts for autonomous colleges
	    int noOfsplDepts=0;

	    public autonomousCollege(String collCode, String collName) {
	        super(collCode, collName);
	    }
	    public void CreateSplDept(String sDepName, int NoOfstudents, int NoOfFaculties, float AvgCredits ){
	        splDepts[noOfsplDepts++]=new Department(sDepName, NoOfstudents, NoOfFaculties, AvgCredits);
	    }
	    @Override // Overriding base class method
	    void displayInfo()
	    {
	        System.out.println("Autonomous College Details:");
	        System.out.println("\tCollege Name: "+collName+"\n\tCollege code: "+collCode+"\n\tNo. of Departments: "+(noOfDepts+noOfsplDepts));
	        for(int i=0; i<noOfDepts; i++)
	            System.out.println("\tDepartment Name: "+departments[i].sDepName+", Faculties: "+departments[i].noOfFaculties+", Students: "+departments[i].noOfstudents+" Average credits: "+departments[i].avgCredits);
	        for(int i=0; i<noOfsplDepts; i++)
	            System.out.println("\tDepartment Name: "+splDepts[i].sDepName+", Faculties: "+splDepts[i].noOfFaculties+", Students: "+splDepts[i].noOfstudents+" Average credits: "+splDepts[i].avgCredits);
	    }
	}

	class nonautonomousCollege extends College // Inheritance
	{
	    public nonautonomousCollege(String collCode, String collName) {
	        super(collCode, collName);
	    }
	}
	}


