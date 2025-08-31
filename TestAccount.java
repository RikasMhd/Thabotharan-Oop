public class TestAccount{
	public static void main(String [] args){
		Account acc1=new Account("r2k","Alice",1000);
		Account acc2=new Account("r12s","Bob",500);
		
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println();
		
		System.out.println("Transfer Alice to Bob 300");
		acc1.transferTo(acc2,300);
		System.out.println(acc1);
		System.out.println(acc2);
		
		System.out.println("Tranfser Alice to Bob 800");
		
		acc1.transferTo(acc2,800);
		System.out.println(acc1);
		System.out.println(acc2);
		
	}
}