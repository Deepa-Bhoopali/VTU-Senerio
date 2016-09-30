package in.kletech.vtu;

import in.kletech.vtu.VTU.autonomousCollege;
import in.kletech.vtu.VTU.nonautonomousCollege;

public class VTUdemo {

	public static void main(String[] args) {
		   autonomousCollege bvb  = new autonomousCollege("BVB123","BVB");
	        nonautonomousCollege kle2 = new nonautonomousCollege("KLE123", "KLE2");

	        bvb.createDept("BVB_CS", 250, 4, 19.5f);
	        bvb.createDept("BVB_EC", 300, 5, 18.78f);
	        bvb.createDept("BVB_EE", 150, 10, 12.78f);
	        bvb.createDept("BVB_BT", 150, 6, 12.78f);
	        bvb.createDept("BVB_ME", 300, 8, 19.78f);
	        ((autonomousCollege)bvb).CreateSplDept("SocialInnovation", 400, 10, 10.00f);
	        ((autonomousCollege)bvb).CreateSplDept("ProfessionalCommunication", 200, 8, 6.00f);

	        kle2.createDept("KLE2_CS", 250, 8, 18.5f);
	        kle2.createDept("KLE2_EC", 300, 12, 17.68f);
	        kle2.createDept("KLE2_EE", 150, 9, 17.78f);
	        kle2.createDept("KLE2_BT", 120, 6, 21.45f);
	        kle2.createDept("KLE2_ME", 300, 13, 17.23f);
	        
	        ((autonomousCollege)bvb).displayInfo();
	        System.out.println("Total number of students in college "+bvb.collName+" are "+bvb.noOfStud());
	        System.out.println("\n\n");
	        kle2.displayInfo();
	        System.out.println("Total number of students in college "+kle2.collName+" are "+kle2.noOfStud());        
	

}
}
