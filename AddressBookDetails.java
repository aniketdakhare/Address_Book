import java.util.*;

public class AddressBookDetails
{
	String fname;
	String lname;
	String address;
	String city;
	String state;
	int zip;
	long phn;
	ArrayList<AddressBookDetails> al;
	Scanner scan =new Scanner(System.in);


	static AddressBookDetails addName()
	{
		AddressBookDetails ad=new AddressBookDetails();
		System.out.println("Enter your First Name");
		ad.fname = ad.scan.nextLine();
		System.out.println("Enter your Last Name");
		ad.lname= ad.scan.nextLine();
		addDetails(ad);
		return ad;
	}

	static public void addDetails(AddressBookDetails ad)
	{
		ad.scan.nextLine();
		System.out.println("Enter your Address");
		ad.address = ad.scan.nextLine();
		System.out.println("Enter your City");
		ad.city = ad.scan.nextLine();
		System.out.println("Enter your State");
		ad.state = ad.scan.nextLine();
		System.out.println("Enter your Zip code");
		ad.zip = ad.scan.nextInt();
		int length = (int)(Math.log10(ad.zip)+1);
    	while(length != 6)
    	{
            System.out.println("enter 6 digit number");
            ad.zip = ad.scan.nextInt();
            length = (int)(Math.log10(ad.zip)+1);
            	if(length==6)
            	{
                    ad.zip=ad.zip;
                    break;
            	}
     	}
		System.out.println("Enter your 10 digit Phone Number");
		ad.phn = ad.scan.nextLong();
		length = (int)(Math.log10(ad.phn)+1);
		while(length != 10)
		{
			System.out.println("Enter 10 digit number");
            ad.phn = ad.scan.nextLong();
            length = (int)(Math.log10(ad.phn)+1);
                	if(length==10)
                	{
                		ad.phn=ad.phn;
                        break;
                	}
         	}

	}

	public void edit()
	{
		boolean check=true;
    			System.out.println("Enter your First name");
    			String namef = scan.nextLine();
    			System.out.println("Enter your Last name");
    			String namel = scan.nextLine();
    			for ( AddressBookDetails a : al )
    			{
	    			if( a.fname.equals(namef) )
	            	{
	            		if(a.lname.equals(namel))
	            		{
	            			check=false;
	            			addDetails(a);
	                   		break;
	            		}
	            	}
	            	if(check)
	            	{
	            		System.out.println("Record not exist");
	            	}
    			}
	}

	public void delete()
	{
		boolean check=true;
    			System.out.println("Enter your First name");
    			String dnamef = scan.nextLine();
    			System.out.println("Enter your Last name");
    			String dnamel = scan.nextLine();
    			for ( AddressBookDetails a : al )
    			{
	            	if( a.fname.equals(dnamef) )
	            	{
	            		if(a.lname.equals(dnamel))
	            		{
	            			check=false;
	            			al.remove(a);
	                   		break;
	            		}
	            	}
    			}
            	if(check)
            	{
            		System.out.println("Record not exist");
            	}
	}

	public void display()
	{
		System.out.println("ADDRESS BOOK DETAILS : ");
		System.out.println("-----------------------------------------------------------------------------------------------------");
       			for ( AddressBookDetails a : al )
       			{
            			System.out.println("NAME: "+a.fname+" "+a.lname+"  "+"ADDRESS: "+a.address+"  "+"CITY: "+a.city+"  "+"STATE: "+a.state+"  "+"ZIPCODE: "+a.zip+"  "+"PHONE NO.: "+a.phn);
       			}
	}
}
