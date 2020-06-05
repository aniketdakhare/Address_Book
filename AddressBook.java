import java.io.FileWriter;
import java.util.*;

public class AddressBook
{
	AddressBookDetails ad=new AddressBookDetails();
	Scanner sc=new Scanner(System.in);
	ArrayList<AddressBookDetails> al2 = new ArrayList<AddressBookDetails>();

	void work()
	{
		boolean val=true;
		ad.al=al2;
		while(val==true)
		{
			System.out.println("Select and enter the task you want to do \n1: Add details \n2: Display details \n3: Edit details \n4: Delete details \n5: Exit");
			int num=sc.nextInt();
			switch (num)
			{
				case 1:
					AddressBookDetails ab= AddressBookDetails.addName();
					ad.al.add(ab);
					System.out.println("==============================================================================================");
					break;
				case 2:
					ad.display();
					System.out.println("==============================================================================================");
					break;
				case 3:
					ad.edit();
					System.out.println("==============================================================================================");
					break;
				case 4:
					ad.delete();
					System.out.println("==============================================================================================");
					break;
				case 5:
					val=false;
					break;
				default:
					System.out.println("Invalid Input");
					System.out.println("==============================================================================================");
			}
		}
	}

	public static void main(String[] args) throws Exception
	{
		AddressBook ab=new AddressBook();
		ab.work();
		FileWriter writer = new FileWriter("AddressBook.txt");
        for(AddressBookDetails a : ab.al2) {
        	writer.write(String.valueOf(a.fname+"  "+a.lname+"  "+a.address+"  "+a.city+"  "+a.state+"  "+a.zip+"  "+a.phn+"\n"));

        }
        writer.close();
	}

}
