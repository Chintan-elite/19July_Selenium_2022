package oops;

public class O005_Encaptulation {
		
	public static void main(String[] args) {
		
		
		Emp e = new Emp();
		e.setId(10);
		e.setName("Deepak");
		//e.setEmail("deepak@gmail.com");
		
		System.out.println(e.getId()+" "+e.getName()+" "+e.getEmail());
		
		
	}
	
}
