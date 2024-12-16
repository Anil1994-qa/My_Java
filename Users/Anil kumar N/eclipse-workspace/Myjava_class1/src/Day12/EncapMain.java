package Day12;

public class EncapMain {

	public static void main(String[] args) {
		
      Encapaccount acc=new Encapaccount();
    		  
      acc.setAcno(1852);
      acc.setBal(5000.30);
      acc.setName("Anil");
      
      System.out.println(acc.getAcno());
      System.out.println(acc.getBal());
      System.out.println(acc.getName());
	}

}
