
public class Registration {
	
	private String name, email, address; 
	private int phone;
	
	public void Register (String name, String email)
	{
		this.name-name;
		this.email=email;
		
		System.out.println("Name: " + name + "Email:" + email);
	}
	public void Register (String name, String email, String address)
	{
		System.out.println("Name: " + name + "Email:" + email + "Address:" + address);
	}
	public void Register (String name, String email, String address, int phone)
	{
		System.out.println("Name: " + name + "Email:" + email + "Address:" + address + "Phone:" + phone );
	}
	public void Register (String name, String email, int phone)
	{
		System.out.println("Name: " + name + "Email:" + email + "Phone:" + phone );
	}
}
