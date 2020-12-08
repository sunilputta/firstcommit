package day1;
import java.util.Scanner;
class employe {
	//class variables or Member variables
		int empno;
		String ename;
		double basic;
		//Member Functions
		void accept(){
			Scanner S=new Scanner(System.in);
			empno=S.nextInt();
			ename=S.next();
			
			basic=S.nextDouble();
			
		}
		void dispaly(){
			System.out.println(empno+" "+ename+" "+basic);
			
		}
}
