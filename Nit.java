package NIT;

import java.util.Scanner;
public class Nit
{
	static String UserID = "gk123"; 
	static String password = "1234";
	static String lastName = "Patil";
	static String firstName = "Shivam";
	static char gender = 'M';
	static int age = 22;
	static String number = "75******43";
	static String city = "Nagpur";
	static String pincode = "4*****";
	static String sub[] = new String[100];
	static String teacher[] = new String[100];
	static int fee[] = new int[100];
	static int c = 0;
	static int totalfee[] = new int[100];
	static String location[] = new String[100];

		public static void main(String[] args) throws InterruptedException 
	    { 
	    	System.out.println("\u001B[33m"+"\r\n"
					+ "\t     ▄█    ▄████████  ▄█    █▄     ▄████████       ▄█     ▄████████         ▄████████  ▄█     █▄     ▄████████    ▄████████  ▄██████▄     ▄▄▄▄███▄▄▄▄      ▄████████ \r\n"
					+ "\t    ███   ███    ███ ███    ███   ███    ███      ███    ███    ███        ███    ███ ███     ███   ███    ███   ███    ███ ███    ███  ▄██▀▀▀███▀▀▀██▄   ███    ███ \r\n"
					+ "\t    ███   ███    ███ ███    ███   ███    ███      ███▌   ███    █▀         ███    ███ ███     ███   ███    █▀    ███    █▀  ███    ███  ███   ███   ███   ███    █▀  \r\n"
					+ "\t    ███   ███    ███ ███    ███   ███    ███      ███▌   ███               ███    ███ ███     ███  ▄███▄▄▄       ███        ███    ███  ███   ███   ███  ▄███▄▄▄     \r\n"
					+ "\t    ███ ▀███████████ ███    ███ ▀███████████      ███▌ ▀███████████      ▀███████████ ███     ███ ▀▀███▀▀▀     ▀███████████ ███    ███  ███   ███   ███ ▀▀███▀▀▀     \r\n"
					+ "\t    ███   ███    ███ ███    ███   ███    ███      ███           ███        ███    ███ ███     ███   ███    █▄           ███ ███    ███  ███   ███   ███   ███    █▄  \r\n"
					+ "\t    ███   ███    ███ ███    ███   ███    ███      ███     ▄█    ███        ███    ███ ███ ▄█▄ ███   ███    ███    ▄█    ███ ███    ███  ███   ███   ███   ███    ███ \r\n"
					+ "\t█▄ ▄███   ███    █▀   ▀██████▀    ███    █▀       █▀    ▄████████▀         ███    █▀   ▀███▀███▀    ██████████  ▄████████▀   ▀██████▀    ▀█   ███   █▀    ██████████ \r\n"
					+ "\t▀▀▀▀▀▀                                                                                                                                                               \r\n");
			
	    	System.out.println("\u001B[32m"+"____________________________________________________________________________________________________________________________________________________________________________________________________________________");
			
	    	System.out.println("\u001B[36m"+"\r\n"
					+ "\t░██╗░░░░░░░██╗███████╗██╗░░░░░░█████╗░░█████╗░███╗░░░███╗███████╗    ████████╗░█████╗░\r\n"
					+ "\t░██║░░██╗░░██║██╔════╝██║░░░░░██╔══██╗██╔══██╗████╗░████║██╔════╝    ╚══██╔══╝██╔══██╗\r\n"
					+ "\t░╚██╗████╗██╔╝█████╗░░██║░░░░░██║░░╚═╝██║░░██║██╔████╔██║█████╗░░    ░░░██║░░░██║░░██║\r\n"
					+ "\t░░████╔═████║░██╔══╝░░██║░░░░░██║░░██╗██║░░██║██║╚██╔╝██║██╔══╝░░    ░░░██║░░░██║░░██║\r\n"
					+ "\t░░╚██╔╝░╚██╔╝░███████╗███████╗╚█████╔╝╚█████╔╝██║░╚═╝░██║███████╗    ░░░██║░░░╚█████╔╝\r\n"
					+ "\t░░░╚═╝░░░╚═╝░░╚══════╝╚══════╝░╚════╝░░╚════╝░╚═╝░░░░░╚═╝╚══════╝    ░░░╚═╝░░░░╚════╝░\r\n"
					+ "\r\n"
					+ "\t\t\t\t\t\t\t███╗░░██╗░█████╗░██████╗░███████╗░██████╗██╗░░██╗      ██╗\r\n"
					+ "\t\t\t\t\t\t\t████╗░██║██╔══██╗██╔══██╗██╔════╝██╔════╝██║░░██║      ██║\r\n"
					+ "\t\t\t\t\t\t\t██╔██╗██║███████║██████╔╝█████╗░░╚█████╗░███████║      ██║\r\n"
					+ "\t\t\t\t\t\t\t██║╚████║██╔══██║██╔══██╗██╔══╝░░░╚═══██╗██╔══██║      ██║\r\n"
					+ "\t\t\t\t\t\t\t██║░╚███║██║░░██║██║░░██║███████╗██████╔╝██║░░██║      ██║\r\n"
					+ "\t\t\t\t\t\t\t╚═╝░░╚══╝╚═╝░░╚═╝╚═╝░░╚═╝╚══════╝╚═════╝░╚═╝░░╚═╝      ╚═╝\r\n"
					+ "\r\n"
					+ "\t\t\t\t\t\t\t\t\t\t\t\t████████╗███████╗░█████╗░██╗░░██╗███╗░░██╗░█████╗░██╗░░░░░░█████╗░░██████╗░██╗░░░██╗\r\n"
					+ "\t\t\t\t\t\t\t\t\t\t\t\t╚══██╔══╝██╔════╝██╔══██╗██║░░██║████╗░██║██╔══██╗██║░░░░░██╔══██╗██╔════╝░╚██╗░██╔╝\r\n"
					+ "\t\t\t\t\t\t\t\t\t\t\t\t░░░██║░░░█████╗░░██║░░╚═╝███████║██╔██╗██║██║░░██║██║░░░░░██║░░██║██║░░██╗░░╚████╔╝░\r\n"
					+ "\t\t\t\t\t\t\t\t\t\t\t\t░░░██║░░░██╔══╝░░██║░░██╗██╔══██║██║╚████║██║░░██║██║░░░░░██║░░██║██║░░╚██╗░░╚██╔╝░░\r\n"
					+ "\t\t\t\t\t\t\t\t\t\t\t\t░░░██║░░░███████╗╚█████╔╝██║░░██║██║░╚███║╚█████╔╝███████╗╚█████╔╝╚██████╔╝░░░██║░░░\r\n"
					+ "\t\t\t\t\t\t\t\t\t\t\t\t░░░╚═╝░░░╚══════╝░╚════╝░╚═╝░░╚═╝╚═╝░░╚══╝░╚════╝░╚══════╝░╚════╝░░╚═════╝░░░░╚═╝░░░");
			
	    	System.out.println("\u001B[32m"+"____________________________________________________________________________________________________________________________________________________________________________________________________________________");
			
	    	mainPage();
	
	      System.out.println(" ");
	       
	    }
		public static void mainPage() throws InterruptedException 
	    {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("\u001B[33m");
	        
	        System.out.println("\t\t\t\t\t\t|--------------------------------------------------|\r\n"
					+ "\t\t\t\t\t\t|                       MAIN MENU                  | \r\n"
					+ "\t\t\t\t\t\t|--------------------------------------------------| \r\n"
					+ "\t\t\t\t\t\t|         1]   LOGIN                               | \r\n"
					+ "\t\t\t\t\t\t|         2]   REGISTRATION                        | \r\n"
					+ "\t\t\t\t\t\t|         3]   CONTACT                             | \r\n"
					+ "\t\t\t\t\t\t|         4]   EXIT                                | \r\n"
					+ "\t\t\t\t\t\t|--------------------------------------------------|");
	        
	        System.out.print("\u001B[34m"+"Enter Your Option to Choose Option : ");
	        String opt = sc.next();
	        // sc.close();
	        switch (opt) 
	        {
	            case "1":
	                Login();
	                break;
	                
	            case "2":
	            	Registration();
	            	break;
	            	
	            case "3":
	            	Contacts();
	            	break;
	            	
	            case "4":
	            	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	            	Exit();
	            	break;
	            	
	            default:
	                System.out.println("\u001B[31m"+"Invalid Input !!");
	                mainPage();	                
	        }
//	        sc.close();
	    }
	   	public static void Login() throws InterruptedException 
	    {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("\u001B[33m");
	        
	        System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
	                + " \t\t\t\t\t\t|             LOGIN                  |\r\n"
	                + " \t\t\t\t\t\t|------------------------------------|\r\n"
	                + "\t\t\t\t\t\t|        Enter UserID   :            |");

	        System.out.print("\t\t\t\t\t\t\t  ");
	        String uid = sc.nextLine();
	        
	        System.out.println("\u001B[33m");
	        
	        System.out.println("\t\t\t\t\t\t|------------------------------------|");
	        System.out.println("\n");
	        
	        System.out.println(
	                " \t\t\t\t\t\t|------------------------------------|\r\n"
	                        + "\t\t\t\t\t\t|        Enter PassWord :            |");

	        System.out.print("\t\t\t\t\t\t\t  ");
	        
	        String pwd = sc.nextLine();
	        
	        System.out.println("\t\t\t\t\t\t|------------------------------------|");
	        
	        pwdcheck(uid, pwd);
	        
	        System.out.println("\n\n\n\t\t\t\t\t First Create your Account !!!\n\n\n ");
	        
	        System.out.println("\u001B[32m"+"Press 1 to Create Account");
	        System.out.println("\u001B[32m"+"Press 2 to Back Main Menu");
	        
	        String opt = sc.next();
	        switch (opt) 
	        {
	            case "1":
	                Registration(); 
	                break;
	                
	            case "2":
	                mainPage();
	                break;
	                
	            default:
	                System.out.println("\u001B[31m"+"Invalid Option");
	                mainPage();
	        }
//	        sc.close();
	    }
	    public static void pwdcheck(String uid, String pwd) throws InterruptedException 
	    {
	        boolean uid_confirm = uid.equals(UserID);
	        boolean pwd_confirm = pwd.equals(password);

	        if (uid_confirm && pwd_confirm) 
	        {
	            System.out.println("\u001B[32m"+"\n\n\n\t\t\t\t\t\t!!! Login Succusefull,Welcome TO Naresh It !!!\n\n\n");
	            Home();
	        } 
	        else
	            System.out.println("\u001B[31m"+"Account not found!!!!");	      
	    }
	    public static boolean checkDetails(char gen, int ag, String numb, String pinc)
		{
			Scanner sc = new Scanner(System.in);
			
			boolean check = false;

			if (gender == 'm' || gender == 'f' || gender == 'M' || gender == 'F')
			{
				if (age > 0 && age < 120)
				{
					if ((number.startsWith("6") || number.startsWith("7") || number.startsWith("8")
							|| number.startsWith("9")) && number.length() == 10)
					{
						if (pincode.length() == 6)
						 {
							return check = true;
						 } 
					    else
						{
					    	System.out.println("\u001B[31m"+"\t\t\t\tInvalid Pincode");
							System.out.println("\u001B[34m"+"Please Enter Vaild Pincode");
							
							pincode = sc.next();
						}
					} 
					else
					{
						System.out.println("\u001B[31m"+"\t\t\t\tInvalid Phone Number");
						System.out.println("\u001B[34m"+"Please Enter Vaild Number");
						
						number = sc.next();
					}
				}
				else
				{
					System.out.println("\u001B[31m"+"\t\t\t\tInvalid Age");
					System.out.println("\u001B[34m"+"Please Enter Vaild Age");
					
					age = sc.nextInt();
				}

			}
			else
			{
				System.out.println("\u001B[31m"+"\t\t\t\tInvalid Gender");
				System.out.println("\u001B[34m"+"Please Enter Vaild Gender");
				
				gender = sc.next().charAt(0);
			}
			
			return check;
		}
	    public static void Registration() throws InterruptedException
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println(" !!! Enter Your Details !!!" + "\n\n");

			System.out.print("\033[1;33m" + "FirstName : ");
			firstName = sc.next();

			System.out.print("LastName  : ");
			lastName = sc.next();

			System.out.print("Gender    : ");
			gender = sc.next().charAt(0);
			while(true) {
				System.out.print("Age       : ");
				try {
	                age = sc.nextInt();
	                break;
	            } catch (Exception e) {
	                System.out.print("\033[1;31m"+"Please Enter Valid Age !"+"\033[1;33m");
	                sc.nextLine();
	                System.out.println("\n");
	            }
	        }


			System.out.print("Phone     : ");
			sc.nextLine();
			number = sc.next();

			System.out.print("City      : ");
			city = sc.next();

			System.out.print("Pincode   : ");
			pincode = sc.next();

			System.out.println("\u001B[32m" + "\t\t\t\t" + "Check Details...");
			
			for (int i = 10; i <= 100; i = i + 10)
			{
				System.out.println(i + "%......");
				Thread.sleep(350);
			}

			boolean check = checkDetails(gender, age, number, pincode);
			
			while (check != true)
			{
				check=checkDetails(gender, age, number, pincode);

					if (check == true)
					break;
			}

		

		System.out.println("\n\n");System.out.println("\u001B[32m"+"\t\t\t\t!!! Account Created Successfully !!!");System.out.println("\n\n");
		//
		// System.out.println("Name : " + firstName + lastName + "\t\t" + "Age : " + age
		// + "\n");
		//
		// System.out.println("Gender : " + age + "\t\t\t" + "Moblie_Num : " + number +
		// "\n");
		//
		// System.out.println("City : " + city + "\t\t\t" + "Pincode: " + pincode +
		// "\n");

		//String str1 = firstName;
		//String str2 = lastName.substring(0, 3);
		//String str3 = number.substring(0, 3);
		//UserID=str1+str2+str3;
		
	     UserID=firstName+age+"@Nit";
	     
		UserID=UserID.toLowerCase();

		System.out.println("USER_ID : "+UserID);
		sc.nextLine();
         while(true) {
		 System.out.print("\u001B[34m"+"Create Password : ");
		
		 
		 password = sc.nextLine();
		 
		 System.out.print("\u001B[34m"+"Confirm Password : ");
		 
		 String confirm_password = sc.nextLine();
		 
		 boolean checkpwd = password.equals(confirm_password);
		 
		 if (checkpwd)
		 {
			 System.out.println("\u001B[32m"+"Password Created Successfully...");
			 Login();
			break; 
		 }
		 else
		 {
			 System.out.println("\u001B[31m"+"Password Don't Match");
		 }
         }
		// sc.close();
		// sc.close();
	}
	    public static void profile() throws InterruptedException
		{
            Scanner sc=new Scanner(System.in);
            
            System.out.println("\u001B[33m");
            
	    	System.out.println("\t\t\t\t\t=====================================================\r\n"
					+ "\t\t\t\t\t||                       PROFILE                     ||\r\n"
					+ "\t\t\t\t\t=====================================================\r\n"
					+ "\t\t\t\t\t\t                                  \r\n"
					+ "\t\t\t\t\t  NAME         :"+firstName+" "+lastName       +"\r\n"      
					+ "\t\t\t\t\t  GENDER       :"+gender                   +"\r\n"     
					+ "\t\t\t\t\t  AGE          :"+age                      +"\r\n"     
					+ "\t\t\t\t\t  PHONE NO     :+91 "+number                   +"\r\n"    
					+ "\t\t\t\t\t  CITY         :"+city                     +"\r\n"    
					+ "\t\t\t\t\t  PINCODE      :"+pincode                  +"\r\n"   
					+ "\t\t\t\t\t\t                                    \r\n"
					+ "\t\t\t\t\t=====================================================");
	    	
			System.out.println("\r\n"
					+ "\"◢◤◣◥◤◢◤◆◥◣◥◤◢◤◇◥◣◢◤◇◥◣◥◤◢◤◆◥◣◥◤◢◤◇◥◣◢◤◇◥◣◥◤◢◤◆◥◣◥◤◢◤◇◥◣◢◤◇◥◣◥◤◢◤◆◥◣◥◤◢◤◇◥◣◢◤◇◥◣◥◤◢◤◆◥◆◥◣◥◤◢◤◇◥◣◢◤◇◥◣◥◤◢◤◆◥◆◥◣◥◤◢◤◇◥◣◢◤◇◥◣◥◤◢◤◆◥");
		
			System.out.println("\t\t\t\t\t"+"\u001B[34m"+"Press 1 For Back ");
			
			System.out.println("\n");
			
			System.out.println("\t\t\t\t\t"+"\u001B[34m"+"Press 2 For Check Course Details ");
			String op=sc.next();
			
			switch(op)
			{
				case "1":	
					
					Home();
					break;
					
				case "2":
					
					Payment(); 
					break;
			
			default:				
				System.out.println("\u001B[31m"+"!! Invaild Option !!");
				
				profile();				
			}
			 // sc.close();
		}
	    public static void Hyderabad() throws InterruptedException
		{
		    System.out.println("\u001B[34m");
		    
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.println("\t\t\t\t\t  _               _                _               _  \r\n"
					+ "\t\t\t\t\t | |             | |              | |             | | \r\n"
					+ "\t\t\t\t\t | |__  _   _  __| | ___ _ __ __ _| |__   __ _  __| | \r\n"
					+ "\t\t\t\t\t | '_ \\| | | |/ _` |/ _ \\ '__/ _` | '_ \\ / _` |/ _` | \r\n"
					+ "\t\t\t\t\t | | | | |_| | (_| |  __/ | | (_| | |_) | (_| | (_| | \r\n"
					+ "\t\t\t\t\t |_| |_|\\__, |\\__,_|\\___|_|  \\__,_|_.__/ \\__,_|\\__,_| \r\n"
					+ "\t\t\t\t\t         __/ |                                        \r\n"
					+ "\t\t\t\t\t        |___/                                          ");
			System.out.println("  ");
			
			System.out.println("\u001B[33m");
			
			System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
			+ "\t\t\t\t\t\t|         1)HOME                     |\r\n"
			+ "\t\t\t\t\t\t|         2)ALL COURSES              |\r\n"
			+ "\t\t\t\t\t\t|         3)SOFTWARE TRAINING        |\r\n"
			+ "\t\t\t\t\t\t|         4)PROJECTS                 |\r\n"
			+ "\t\t\t\t\t\t|         5)ABOUT                    |\r\n"
			+ "\t\t\t\t\t\t|         6)Exit                     |\r\n"
			+ "\t\t\t\t\t\t--------------------------------------");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\u001B[34m"+"Enter option : ");
			String opt=sc.next();
			
			switch(opt)
			{
			case "1":
				Home();
				break;
				
			case "2":
				selectCourse();
				break;
				
			case "3":
				software_traninig();
				break;
				
			case "4":
				Project();
				break;
				
			case "5":
				AboutHYD();
				break;
				
			case "6":
				Location();
				break;
				
			default : 
				System.out.println("\u001B[31m"+"Invalid input !!");
						Hyderabad();
			
			}
			 // sc.close();
		}
	    public static void Chennai() throws InterruptedException
		{
	    	System.out.println("\u001B[34m");
	    	
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.println("\r\n"
					+ "\t\t\t\t\t\t _____  _                                 _ \r\n"
					+ "\t\t\t\t\t\t/  __ \\| |                               (_)\r\n"
					+ "\t\t\t\t\t\t| /  \\/| |__    ___  _ __   _ __    __ _  _ \r\n"
					+ "\t\t\t\t\t\t| |    | '_ \\  / _ \\| '_ \\ | '_ \\  / _` || |\r\n"
					+ "\t\t\t\t\t\t| \\__/\\| | | ||  __/| | | || | | || (_| || |\r\n"
					+ "\t\t\t\t\t\t \\____/|_| |_| \\___||_| |_||_| |_| \\__,_||_|\r\n"
					+ "\t\t\t\t\t\t                                            \r\n"
					+ "\t\t\t\t\t\t                                            \r\n"
					+ "");
			
			System.out.println("\u001B[33m");
			
			System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
			+ "\t\t\t\t\t\t|         1)HOME                     |\r\n"
			+ "\t\t\t\t\t\t|         2)ALL COURSES              |\r\n"
			+ "\t\t\t\t\t\t|         3)SOFTWARE TRAINING        |\r\n"
			+ "\t\t\t\t\t\t|         4)PROJECTS                 |\r\n"
			+ "\t\t\t\t\t\t|         5)ABOUT                    |\r\n"
			+ "\t\t\t\t\t\t|         6)Exit                     |\r\n"
			+ "\t\t\t\t\t\t--------------------------------------");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\u001B[34m"+"Enter option : ");
			String opt=sc.next();
			
			switch(opt)
			{
			case "1":
				Home();
				break;
				
			case "2":
				Chennai_selectCourse();
				break;
				
			case "3":
				Chennai_software_traninig();
				break;
				
			case "4":
				Chennai_Project();
				break;
				
			case "5":
				AboutCHENNAI();
				break;
				
			case "6":
				Location();
				break;
				
			default : 
				System.out.println("\u001B[31m"+"Invalid input !!");
				Chennai();
			}
			 // sc.close();
		}
	    public static void Usa() throws InterruptedException
		{
	    	System.out.println("\u001B[34m");
	    	
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.println("\r\n"
					+ "\t\t\t\t\t\t\t                   \r\n"
					+ "\t\t\t\t\t\t\t                   \r\n"
					+ "\t\t\t\t\t\t\t _   _  ___   __ _ \r\n"
					+ "\t\t\t\t\t\t\t| | | |/ __| / _` |\r\n"
					+ "\t\t\t\t\t\t\t| |_| |\\__ \\| (_| |\r\n"
					+ "\t\t\t\t\t\t\t \\__,_||___/ \\__,_|\r\n"
					+ "\t\t\t\t\t\t\t                   \r\n"
					+ "\t\t\t\t\t\t\t                   \r\n"
					+ "");
			
			System.out.println("\u001B[33m");
			
			System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
			+ "\t\t\t\t\t\t|         1)HOME                     |\r\n"
			+ "\t\t\t\t\t\t|         2)ALL COURSES              |\r\n"
			+ "\t\t\t\t\t\t|         3)SOFTWARE TRAINING        |\r\n"
			+ "\t\t\t\t\t\t|         4)PROJECTS                 |\r\n"
			+ "\t\t\t\t\t\t|         5)ABOUT                    |\r\n"
			+ "\t\t\t\t\t\t|         6)Exit                     |\r\n"
			+ "\t\t\t\t\t\t--------------------------------------");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\u001B[34m"+"Enter option : ");
			String opt=sc.next();
			
			switch(opt)
			{
			case "1":
				Home();
				break;
				
			case "2":
				Usa_selectCourse();
				break;
				
			case "3":
				Usa_software_traninig();
				break;
				
			case "4":
				Usa_Project();
				break;
				
			case "5":
				AboutUSA();
				break;
				
			case "6":
				Location();
				break;
				
			default : 
				System.out.println("\u001B[31m"+"Invalid input !!");
				Usa();
			}
			 // sc.close();
		}
	    public static void Contacts() throws InterruptedException
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\u001B[33m"+"\t\t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|          CONTACT DETAILS           |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+ "\t\t\t\t\t\t|             1)HYDERABAD            |\r\n"
					+ "\t\t\t\t\t\t|                                    |\r\n"
					+ "\t\t\t\t\t\t|             2)CHENNAI              |\r\n"
					+ "\t\t\t\t\t\t|                                    |\r\n"
					+ "\t\t\t\t\t\t|             3)USA                  |\r\n"
					+ "\t\t\t\t\t\t|                                    |\r\n"
					+ "\t\t\t\t\t\t|             4)ONLINE TRAINING      |\r\n"
					+ "\t\t\t\t\t\t|                                    |\r\n"
					+" \t\t\t\t\t\t|             5)EXIT                 |\r\n"
					+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.print("\u001B[34m"+"\t\t\t\t\t ENTER BRANCH CODE TO SHOW CONTACT DETAILS : ");
			String a=sc.nextLine();
			
			switch(a)
			{
			case "1" :
				hyderabad_contact();
				break;
				
			case "2" :
				chennai_contact();
				break;
				
			case "3" :
				usa_contact();
				break;
				
			case "4" :
				online_training_contact();
				break;
				
			case "5" : 
				mainPage();
				break;
				
			default : 
				System.out.println("\u001B[31m"+"Invalid input !!");
				Contacts();
				
			}
			 // 	sc.close();
		}
		public static void hyderabad_contact() throws InterruptedException
		{
			System.out.println("\u001B[33m");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\u001B[33m"+"\t\t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|             HYDERABAD              |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+ "\t\t\t\t\t\t| India – Hyderabad Office           |\r\n"
					+ "\t\t\t\t\t\t|                                    |\r\n"
					+ "\t\t\t\t\t\t| ADDRESS :                          |\r\n"
					+ "\t\t\t\t\t\t|     2nd Floor, Durga Bhavani Plaza,|\r\n"
					+ "\t\t\t\t\t\t|         Ameerpet, Hyderabad        |\r\n"
					+ "\t\t\t\t\t\t|                                    |\r\n"
					+ "\t\t\t\t\t\t| EMAIL :                            |\r\n"
					+ "\t\t\t\t\t\t|     info@nareshit.com              |\r\n"
					+ "\t\t\t\t\t\t|                                    |\r\n"
					+ "\t\t\t\t\t\t| TEL :                              |\r\n"
					+ "\t\t\t\t\t\t|     +91 4023746666 (IN– Hyderabad) |\r\n"
					+ "\t\t\t\t\t\t|     +91 4023734842 (IN– Hyderabad) |\r\n"
					+ "\t\t\t\t\t\t|     +91 9000994007                 |\r\n"
					+ "\t\t\t\t\t\t|     +91 9000994008                 |\r\n"
					+ "\t\t\t\t\t\t|                                    |\r\n"
					+ "\t\t\t\t\t\t| FOR PROJECT :                      |\r\n"
					+ "\t\t\t\t\t\t|     +91 9000994005                 |\r\n"
					+ "\t\t\t\t\t\t|                                    |\r\n"
					+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.print("\u001B[34m"+"\t\t\t\t\t PRESS 1 TO EXIT : ");
			String a=sc.nextLine();
			
			switch(a)
			{
			case "1" :
				Contacts();
				break;
			
			default : 
				System.out.println("\u001B[31m"+"Invalid input");
				hyderabad_contact();
			}
			 // sc.close();
		}
		public static void chennai_contact() throws InterruptedException	
		{
			System.out.println("\u001B[33m");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\u001B[33m"+"\t\t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|              CHENNAI               |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+ "\t\t\t\t\t\t| India – Chennai Office             |\r\n"
					+ "\t\t\t\t\t\t|                                    |\r\n"
					+ "\t\t\t\t\t\t| ADDRESS :                          |\r\n"
					+ "\t\t\t\t\t\t|       2nd Floor Plot No.172 & 173, |\r\n"
					+ "\t\t\t\t\t\t|     Above Axis Bank, Behind PTC Bus|\r\n"
					+ "\t\t\t\t\t\t|     Stop,OMR,Thoraipakkam,TamilNadu|\r\n"
					+ "\t\t\t\t\t\t|       Chennai – 600097.            |\r\n"
					+ "\t\t\t\t\t\t|                                    |\r\n"
					+ "\t\t\t\t\t\t| EMAIL :                            |\r\n"
					+ "\t\t\t\t\t\t|     chennai@nareshit.com           |\r\n"
					+ "\t\t\t\t\t\t|                                    |\r\n"
					+ "\t\t\t\t\t\t| MOB/WAPP :                         |\r\n"
					+ "\t\t\t\t\t\t|     +91 9566042345                 |\r\n"
					+ "\t\t\t\t\t\t|                                    |\r\n"
					+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.print("\u001B[34m"+"\t\t\t\t\t PRESS 1 TO EXIT : ");
			String a=sc.nextLine();
			
			switch(a)
			{
				case "1" :
					Contacts();
					break;
					
				default : 
					System.out.println("\u001B[31m"+"Invalid input");
					chennai_contact();
				}
			 // sc.close();
		}
		public static void usa_contact() throws InterruptedException	
		{
			System.out.println("\u001B[33m");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\u001B[33m"+"\t\t\t\t\t\t\t--------------------------------------\r\n"
						+" \t\t\t\t\t\t|                USA                 |\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+ "\t\t\t\t\t\t| USA Office                         |\r\n"
						+ "\t\t\t\t\t\t|                                    |\r\n"
						+ "\t\t\t\t\t\t| ADDRESS :                          |\r\n"
						+ "\t\t\t\t\t\t|     5007 Arbor View Pkwy NW Acworth|\r\n"
						+ "\t\t\t\t\t\t|           ,GA, 30101               |\r\n"
						+ "\t\t\t\t\t\t|                                    |\r\n"
						+ "\t\t\t\t\t\t| EMAIL :                            |\r\n"
						+ "\t\t\t\t\t\t|     sriram@nareshit.com            |\r\n"
						+ "\t\t\t\t\t\t|                                    |\r\n"
						+ "\t\t\t\t\t\t| TEL :                              |\r\n"
						+ "\t\t\t\t\t\t|     +1 404-232-9879                |\r\n"
						+ "\t\t\t\t\t\t|     +1 248-522-6925                |\r\n"
						+ "\t\t\t\t\t\t|                                    |\r\n"
						+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
				System.out.print("\u001B[34m"+"\t\t\t\t\t PRESS 1 TO EXIT : ");
				String a=sc.nextLine();
				
				switch(a)
				{
					case "1" :
						Contacts();
						break;
						
					default : 
						System.out.println("\u001B[31m"+"Invalid input");
						usa_contact();
					}
				 // 	sc.close();
			}
		public static void online_training_contact() throws InterruptedException
		{
			System.out.println("\u001B[33m");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\u001B[33m"+"\t\t\t\t\t\t\t--------------------------------------\r\n"
						+" \t\t\t\t\t\t|           ONLINE TRAINING          |\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+ "\t\t\t\t\t\t|                                    |\r\n"
						+ "\t\t\t\t\t\t| EMAIL :                            |\r\n"
						+ "\t\t\t\t\t\t|     sriram@nareshit.com            |\r\n"
						+ "\t\t\t\t\t\t|                                    |\r\n"
						+ "\t\t\t\t\t\t| TEL :                              |\r\n"
						+ "\t\t\t\t\t\t|     +91 8179191999                 |\r\n"
						+ "\t\t\t\t\t\t|     +91 9293226789                 |\r\n"
						+ "\t\t\t\t\t\t|                                    |\r\n"
						+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
				System.out.print("\u001B[34m"+"\t\t\t\t\t PRESS 1 TO EXIT : ");
				String a=sc.nextLine();
				
				switch(a)
				{
					case "1" :
						Contacts();
						break;
						
					default : 
						System.out.println("\u001B[31m"+"Invalid input");
						online_training_contact();
				}
				 // sc.close();
		}
		public static void selectCourse() throws InterruptedException
		{
			System.out.println("\u001B[33m");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|ENTER THE COURSE YOU WANT TO SELECT |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+ "\t\t\t\t\t\t|         1)FULL STACK               |\r\n"
					+ "\t\t\t\t\t\t|         2)JAVA                     |\r\n"
					+ "\t\t\t\t\t\t|         3)DSA                      |\r\n"
					+ "\t\t\t\t\t\t|         4)ORACLE                   |\r\n"
					+ "\t\t\t\t\t\t|         5)UI                       |\r\n"
					+ "\t\t\t\t\t\t|         6)EXIT                     |\r\n"
					+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.print("\u001B[34m"+"WRITE NAME OF THE COURSE WHICH YOU WANT TO SELECT : ");
			String s=sc.next();
			
			String str=s.toLowerCase();
			
			switch(str)
			{
			case "fullstack","1" :
				System.out.println("\u001B[32m"+"\t\t\t\t\t      You Selected FULL STACK developement Course");
				fullStack();
				break;
				
			case "java" ,"2"  : 
				System.out.println("\t\t\t\t\t\t\tYou Selected JAVA Course");
				java();				
				break;
				
			case "dsa" ,"3"  : 
				System.out.println("\t\t\t\t\t\t\tYou Selected DSA Course");
				dsa();
				break;
				
			case "oracle","4" : 
				System.out.println("\t\t\t\t\t\t\tYou Selected Oracle Course");
				oracle();
				break;
				
			case "ui" ,"5"    : 
				System.out.println("\t\t\t\t\t\t\tYou Selected UI course");
				ui();
				break;
				
			case "exit","6"   :
				Hyderabad();
				break;
				
			default:
				System.out.println("\u001B[31m"+"\t\t\t\t\t\t       Course is not available");
				selectCourse();
				break;
			}
			 // sc.close();
		}
		public static void fullStack() throws InterruptedException
		{
			 System.out.println("\u001B[33m");
			 
			 Scanner sc=new Scanner (System.in);
			 
				System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
						+" \t\t\t\t\t\t|         FULL STACK JAVA            |\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+" \t\t\t\t\t\t--------------------------------------\r\n"
						+" \t\t\t\t\t\t| 1)              JOIN               |\r\n"
						+" \t\t\t\t\t\t|                         RS-27,000/-|\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+" \t\t\t\t\t\t| 2)    COURSE & TEACHERS DETAILS    |\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+" \t\t\t\t\t\t| 3)             EXIT                |\r\n"
						+ "\t\t\t\t\t\t--------------------------------------\r\n");
				
				System.out.print("\u001B[34m"+"\u001B[33m"+"\t\t\t\t\t\tOptions : \r\n");
				String a=sc.next();
				
				switch(a)
				{
				case "1" :
				{
					System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
					String an=sc.next();
					
					char s=an.charAt(0);
					
					if( s=='y' || s=='Y' )
					{						
						sub [c]="java";
						teacher [c]="SPECIAL TEACHER       ";
						totalfee[c]=27000;
						location[c] = "Hyderabad";
						
						System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED JAVA COURSE**");
						c++;
						
						selectCourse();
					}
					else if( s=='n' || s=='N' )
						selectCourse();
					else 
					{
						System.out.println("\u001B[31m"+"Invalid Input !!!");
						
						fullStack();
					}
					
					break;
				}
				case "2" :
					view_fs_details();
					break;
					
				case "3" :
					selectCourse();
					break;
					
				default :
						System.out.println("\u001B[31m"+"Invalid input !!!");
						fullStack();
						
				}
				 // 	sc.close();
		}
		public static void java() throws InterruptedException
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.println("\u001B[33m"+"\t\t\t\tThe word Core describes the basic concept of something, and here,\r\n"
					+ "\t\t\t the phrase 'Core Java' defines the basic Java that covers the basic concept of \r\n"
					+ "\t\tJava programming language.The principle followed by Java is WORA that says Write Once, Run Anywhere.\r\n"+"\u001B[37m");
			
			System.out.println("\u001B[33m");
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|          FACULTY FOR JAVA          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)       HARI KRISHNA SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)    VENKATESH MAIPATHI SIR       |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 3)          NATRAJ SIR             |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 4)       SATISH GUPTA SIR          |\r\n"
					+ "\t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                                    |\r\n"
					+" \t\t\t\t\t\t| 5)             EXIT                |\r\n"
					+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.print("\u001B[34m"+"\t\t\t\t\t\tWHICH FACULTY YOU WANT TO JOIN : \r\n");
			String a=sc.next();
			
			switch(a)
			{
			case "1":
			{
				System.out.println("\u001B[33m");
				
				System.out.println(" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)       HARI KRISHNA SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="JAVA";
					teacher [c]="HARI KRISHNA SIR      ";
					totalfee[c]=7000;
					location[c] = "Hyderabad";
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED JAVA COURSE**");
					c++;
					
					selectCourse();
				}
				else if( s=='n' || s=='N' )
					selectCourse();
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					java();
				}
				
				break;
			}
			
			case "2":
			{
				System.out.println("\u001B[33m");
				
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)    VENKATESH MAIPATHI SIR       |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
								
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="JAVA";
					teacher [c]="VENKATESH MAIPATHI SIR";
					totalfee[c]=7000;
					location[c] = "Hyderabad";
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED JAVA COURSE**");
					c++;
					
					selectCourse();
				}
				else if( s=='n' || s=='N' )
					selectCourse();
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					java();
				}
				
				break;
			}
			
			case "3":
			{
				System.out.println("\u001B[33m");
				
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 3)          NATRAJ SIR             |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="JAVA";
					teacher [c]="NATRAJ SIR            ";
					totalfee[c]=7000;
					location[c] = "Hyderabad";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED JAVA COURSE**");
					c++;
					
					selectCourse();
				}
				else if( s=='n' || s=='N' )
					selectCourse();
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					java();
				}
				
				break;
			}
						
			case "4":
			{
				System.out.println("\u001B[33m");
				
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 4)       SATISH GUPTA SIR          |\r\n"
					+ "\t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="JAVA";
					teacher [c]="SATISH GUPTA SIR      ";
					totalfee[c]=7000;
					location[c] = "Hyderabad";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED JAVA COURSE**");
					c++;
					
					selectCourse();
				}
				else if( s=='n' || s=='N' )
					selectCourse();
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					java();
				}
				
				break;
			}
			case "5":
				selectCourse();
				break;
				
			default :
				{
					System.out.println("\u001B[31m"+"\t\t\t\t\t\t INVALID OPTION ");
					java();
				}
			
			}
			 // sc.close();
		}
		public static void dsa() throws InterruptedException
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.println("\u001B[33m"+"\t\t\t   A data structure is a named location that can be used to store and organize data.\r\n"
					+ "\t\t\tAnd, an algorithm is a collection of steps to solve a particular problem. Learning data\r\n"
					+ "\t\t\t structures and algorithms allow us to write efficient and optimized computer programs.\r\n"+"\u001B[37m");
			
			System.out.println("\u001B[33m");
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|          FACULTY FOR DSA           |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)       SERAVANA KUMAR SIR        |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)    VENKATESH MAIPATHI SIR       |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 3)          NATRAJ SIR             |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 4)       SATISH GUPTA SIR          |\r\n"
					+ "\t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                                    |\r\n"
					+" \t\t\t\t\t\t| 5)             EXIT                |\r\n"
					+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.print("\u001B[34m"+"\t\t\t\t\t\tWHICH FACULTY YOU WANT TO JOIN : \r\n");
			String a=sc.next();
			
			switch(a)
			{
			case "1":
			{
				System.out.println("\u001B[33m");
				
				System.out.println(" \t\t\t\t\t\t--------------------------------------\r\n"
						+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
						+" \t\t\t\t\t\t| 1)       SERAVANA KUMAR SIR        |\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="DSA";
					teacher [c]="SERAVANA KUMAR SIR    ";
					totalfee[c]=5000;
					location[c] = "Hyderabad";
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED JAVA COURSE**");
					c++;
					
					selectCourse();
				}
				else if( s=='n' || s=='N' )
					selectCourse();
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					dsa();
				}
				
				break;
			}
			
			case "2":
			{
				System.out.println("\u001B[33m");
				
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)    VENKATESH MAIPATHI SIR       |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="DSA";
					teacher [c]="VENKATESH MAIPATHI SIR";
					totalfee[c]=7000;
					location[c] = "Hyderabad";
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED DSA COURSE**");
					c++;
					
					selectCourse();
				}
				else if( s=='n' || s=='N' )
					selectCourse();
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					dsa();
				}
				
				break;
			}
			
			case "3":
			{
				System.out.println("\u001B[33m");
				
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 3)          NATRAJ SIR             |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="DSA";
					teacher [c]="NATRAJ SIR            ";
					totalfee[c]=7000;
					location[c] = "Hyderabad";
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED DSA COURSE**");
					c++;
					
					selectCourse();
				}
				else if( s=='n' || s=='N' )
					selectCourse();
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					dsa();
				}
				
				break;
			}
			
			case "4":
			{
				System.out.println("\u001B[33m");
				
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 4)       SATISH GUPTA SIR          |\r\n"
					+ "\t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="DSA";
					teacher [c]="SATISH GUPTA SIR      ";
					totalfee[c]=7000;
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED DSA COURSE**");
					c++;
					
					selectCourse();
				}
				else if( s=='n' || s=='N' )
					selectCourse();
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					dsa();
				}
				
				break;
			}
			case "5":
				selectCourse();
				break;
				
			default :
			{
				System.out.println("\u001B[31m"+"\t\t\t\t\t\t INVALID OPTION ");
				dsa();
			}
			
			}
			 // sc.close();
		}
		public static void oracle() throws InterruptedException
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.println("\u001B[33m"+"\t\t\t\tOracle is one of the biggest database technology assets in the world.\r\n"
					+ "\t\t\tAn Oracle database uses memory structures and processes to manage and access the database.\r\n"+"\u001B[37m");
			
			System.out.println("\u001B[33m");
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|          FACULTY FOR ORACLE        |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)        SHIVA KUMAR SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)        VIJAY KUMAR SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 3)          MURALI SIR             |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                                    |\r\n"
					+" \t\t\t\t\t\t| 4)             EXIT                |\r\n"
					+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.print("\u001B[34m"+"\t\t\t\t\t\tWHICH FACULTY YOU WANT TO JOIN : \r\n");
			String a=sc.next();
			
			switch(a)
			{
			case "1":
			{
				System.out.println("\u001B[33m");
				
				System.out.println(" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)        SHIVA KUMAR SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="ORACLE";
					teacher [c]="SHIVA KUMAR SIR       ";
					totalfee[c]=5000;
					location[c] = "Hyderabad";
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED ORACLE COURSE**");
					c++;
					
					selectCourse();
				}
				else if( s=='n' || s=='N' )
					selectCourse();
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					oracle();
				}
				break;
			}
			
			case "2":
			{
				System.out.println("\u001B[33m");
				
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)        VIJAY KUMAR SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="ORACLE";
					teacher [c]="VIJAY KUMAR SIR       ";
					totalfee[c]=5000;
					location[c] = "Hyderabad";
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED ORACLE COURSE**");
					c++;
					
					selectCourse();
					
				}
				else if( s=='n' || s=='N' )
					selectCourse();
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					oracle();
				}
				
				break;
			}
			
			case "3":
			{
				System.out.println("\u001B[33m");
				
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 3)          MURALI SIR             |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
								
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="ORACLE";
					teacher [c]="MURALI SIR            ";
					totalfee[c]=5000;
					location[c] = "Hyderabad";
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED ORACLE COURSE**");
					c++;
					
					selectCourse();
				}
				else if( s=='n' || s=='N' )
					selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					oracle();
				}
				
				break;
			}
			case "4":
				selectCourse();
				break;
				
			default :
			{
				System.out.println("\u001B[31m"+"\t\t\t\t\t\t INVALID OPTION ");
				oracle();
			}
			
			}
			 // sc.close();
		}
		public static void ui() throws InterruptedException
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.println("\u001B[33m"+"\t\t\t\tHTML (the Hypertext Markup Language) and CSS (Cascading Style Sheets)\r\n"
					+ "\t\t\t are two of the core technologies for building Web pages.HTML provides the structure of the\r\n"
					+ "\t\t\t\t page, CSS the (visual and aural) layout, for a variety of devices. "+"\u001B[37m");
			
			System.out.println("\u001B[33m");
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|            FACULTY FOR UI          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)        SHIVA KUMAR SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)        SUBBA RAJU SIR           |\r\n"
					+ "\t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                                    |\r\n"
					+" \t\t\t\t\t\t| 3)             EXIT                |\r\n"
					+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.print("\u001B[34m"+"\t\t\t\t\t\tWHICH FACULTY YOU WANT TO JOIN : \r\n");
			String a=sc.next();
			
			switch(a)
			{
			case "1":
			{
				System.out.println("\u001B[33m");
				
				System.out.println(" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)        SHIVA KUMAR SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="UI";
					teacher [c]="SHIVA KUMAR SIR       ";
					totalfee[c]=5000;
					location[c] = "Hyderabad";
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED UI COURSE**");
					c++;
					
					selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					ui();
				}
				
				break;
			}
			
			case "2":
			{
				System.out.println("\u001B[33m");
								
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)        SUBBA RAJU SIR           |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="UI";
					teacher [c]="SUBBA RAJU SIR        ";
					totalfee[c]=5000;
					location[c] = "Hyderabad";
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED UI COURSE**");
					c++;
					
					selectCourse();
					
				}
				else if( s=='n' || s=='N' )
					selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					ui();
				}
				
				break;
			}
			
			case "3":
				selectCourse();
				break;
				
			default :
			{
				System.out.println("\u001B[31m"+"\t\t\t\t\t\t INVALID OPTION ");
				ui();
			}
			
			}
			 // 	sc.close();
		}
		public static void Home() throws InterruptedException 
		{
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("\u001B[33m");
		  
		  System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
				+" \t\t\t\t\t\t|                 NIT                |\r\n"
				+" \t\t\t\t\t\t|------------------------------------|\r\n"
				+ "\t\t\t\t\t\t|         1)Profile                  |\r\n"
				+ "\t\t\t\t\t\t|         2)Location                 |\r\n"
				+ "\t\t\t\t\t\t|         3)Main Menu                |\r\n"
				+ "\t\t\t\t\t\t|         4)Exit                     |\r\n"
				+ "\t\t\t\t\t\t--------------------------------------");
	
	    System.out.println("\u001B[34m"+"Enter Option: ");
	    String opt=sc.next();
	    
	    switch(opt)
	    {
	    case "1": 
	    	profile();
	    	break;
	    	
	    case "2":
	       Location();
	       break;
	       
	    case "3":
	       mainPage();
	        break;
	        
	    case "4":
	    	Exit();
	        break;
	        
	        default :
	        	System.out.println("\u001B[31m"+"Invalid Ipunt !!");
	        	Home();
	    }
	    //    sc.close();
		}
		public static void Location() throws InterruptedException
		{ 
			Scanner sc=new Scanner(System.in);	
			
			System.out.println("\u001B[33m");
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
				+" \t\t\t\t\t\t|         Select Your Location       |\r\n"
				+" \t\t\t\t\t\t|------------------------------------|\r\n"
				+ "\t\t\t\t\t\t|         1)Hyderabad                |\r\n"
				+ "\t\t\t\t\t\t|         2)Chennai                  |\r\n"
				+ "\t\t\t\t\t\t|         3)USA                      |\r\n"
				+ "\t\t\t\t\t\t|         4)Exit                     |\r\n"
				+ "\t\t\t\t\t\t--------------------------------------");
			
			System.out.print("\u001B[34m"+"Enter Your Option to Choose location : ");
			String op=sc.next();
			
			switch(op)
			{
				case "1":
					Hyderabad();
					break;
				
				case "2":
					Chennai();
					break;
				
				case "3":
					Usa();
					break;
				
				case "4":
					Home();
					break;
				
				
				default :
					System.out.println("\u001B[31m"+"Invalid Input !!");
					Location();
					
			}
			//sc.close();
		 }
		public static void software_traninig() throws InterruptedException
		 {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\n\n");
			
			System.out.println("\t\t\t\t\t\t\tSoftware Training");
			
			System.out.println("\n\n");
			System.out.println(
					"\t\t\t\tIn line with vision of the Founder Shri. N. Naresh in offering Job oriented technical education, \r\n"
					+"\t\t\t\thas started unique and intensive short term courses in Java, NET, WCF, Asp.Net MVC, Silverlight,\r\n"
					 +"\t\t\t\tHadoop, MSBI, PHP, Oracle, Android, iOS arena which complement each other.\r\n");
			System.out.println("\t\tSoftware Training Courses\n");
			System.out.println(
					"\t\t\t\tIn this era of globalization and free trade, India has to be as competitive as any other country \r\n"
					+"\t\t\t\tin the world in the areas of technology,quality, cost and service. As such the Software Companies \r\n"
					 +"\t\t\t\tare forced toadopt modern technology and concepts in order to be competitive globally.\r\n");
			
			System.out.println("\t\t\t\tTo surge with the leaps in technology, offers unique & intensive short term courses in Java, \r\n"
					+ "\t\t\t\tNET, WCF, Asp.Net MVC, Silverlight, Hadoop, MSBI, PHP, Oracle, Android, iOS that would bring the \r\n"
					+ "\t\t\t\t best in engineering student and software aspirants.\n");
			System.out.println("\t\tCourse Material & Certificate\n");
			System.out.println("\t\t\t\tWe provide Authorized certificates for the successful candidates completing the courses.All \r\n"
					+ "\t\t\t\tthe courses well prepared and simple course material\n\n");
			System.out.println("\t\tPlacement Assistance\n");
			System.out.println("\t\t\t\tAs there is a great shortage of qualified and trained professionals in J2EE,.NET and PHP platform\r\n "
					+ "\t\t\t\t unlimited employment opportunities are awaiting the successful candidates in India and abroad.\n\n");
			System.out.println("\t\t\t\tWe extend Placement Assistance for the candidates after completion of their training by referring  \r\n"
					+ "\t\t\t\tto the various Software Companies all over India. So many students had completed our various Software \r\n"
					+ "\t\t\t\tTraining Courses and most of them are placed in leading Software/Telecom Companies in India and Abroad.\r\n");
			
			System.out.println("\n\n");
			
			System.out.println("\u001B[34m"+"\t\t\t\t\t\tPress 1 For Exit !!!!");
			String s=sc.next();
			switch(s)
			{
			case "1":
				Hyderabad();
				break;
				
			default:
				System.out.println("\u001B[31m"+"INVALID INPUT !!!!");
				software_traninig();
			}
//			sc.close();
		 }
		public static void Chennai_software_traninig() throws InterruptedException
		 {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\n\n");
			
			System.out.println("\t\t\t\t\t\t\tSoftware Training");
			
			System.out.println("\n\n");
			System.out.println(
					"\t\t\t\tIn line with vision of the Founder Shri. N. Naresh in offering Job oriented technical education, \r\n"
					+"\t\t\t\thas started unique and intensive short term courses in Java, NET, WCF, Asp.Net MVC, Silverlight,\r\n"
					 +"\t\t\t\tHadoop, MSBI, PHP, Oracle, Android, iOS arena which complement each other.\r\n");
			System.out.println("\t\tSoftware Training Courses\n");
			System.out.println(
					"\t\t\t\tIn this era of globalization and free trade, India has to be as competitive as any other country \r\n"
					+"\t\t\t\tin the world in the areas of technology,quality, cost and service. As such the Software Companies \r\n"
					 +"\t\t\t\tare forced toadopt modern technology and concepts in order to be competitive globally.\r\n");
			
			System.out.println("\t\t\t\tTo surge with the leaps in technology, offers unique & intensive short term courses in Java, \r\n"
					+ "\t\t\t\tNET, WCF, Asp.Net MVC, Silverlight, Hadoop, MSBI, PHP, Oracle, Android, iOS that would bring the \r\n"
					+ "\t\t\t\t best in engineering student and software aspirants.\n");
			System.out.println("\t\tCourse Material & Certificate\n");
			System.out.println("\t\t\t\tWe provide Authorized certificates for the successful candidates completing the courses.All \r\n"
					+ "\t\t\t\tthe courses well prepared and simple course material\n\n");
			System.out.println("\t\tPlacement Assistance\n");
			System.out.println("\t\t\t\tAs there is a great shortage of qualified and trained professionals in J2EE,.NET and PHP platform\r\n "
					+ "\t\t\t\t unlimited employment opportunities are awaiting the successful candidates in India and abroad.\n\n");
			System.out.println("\t\t\t\tWe extend Placement Assistance for the candidates after completion of their training by referring  \r\n"
					+ "\t\t\t\tto the various Software Companies all over India. So many students had completed our various Software \r\n"
					+ "\t\t\t\tTraining Courses and most of them are placed in leading Software/Telecom Companies in India and Abroad.\r\n");
			
			System.out.println("\n\n");
			
			System.out.println("\u001B[34m"+"\t\t\t\t\t\tPress 1 For Exit !!!!");
			String s=sc.next();
			
			switch(s)
			{
			case "1":
				Chennai();
				break;
				
			default:
				System.out.println("\u001B[31m"+"INVALID INPUT !!!!");
				Chennai_software_traninig();
			}
//			sc.close();
		 }
		public static void Usa_software_traninig() throws InterruptedException
		 {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\n\n");
			
			System.out.println("\t\t\t\t\t\t\tSoftware Training");
			System.out.println("\n\n");
			System.out.println(
					"\t\t\t\tIn line with vision of the Founder Shri. N. Naresh in offering Job oriented technical education, \r\n"
					+"\t\t\t\thas started unique and intensive short term courses in Java, NET, WCF, Asp.Net MVC, Silverlight,\r\n"
					 +"\t\t\t\tHadoop, MSBI, PHP, Oracle, Android, iOS arena which complement each other.\r\n");
			System.out.println("\t\tSoftware Training Courses\n");
			System.out.println(
					"\t\t\t\tIn this era of globalization and free trade, India has to be as competitive as any other country \r\n"
					+"\t\t\t\tin the world in the areas of technology,quality, cost and service. As such the Software Companies \r\n"
					 +"\t\t\t\tare forced toadopt modern technology and concepts in order to be competitive globally.\r\n");
			
			System.out.println("\t\t\t\tTo surge with the leaps in technology, offers unique & intensive short term courses in Java, \r\n"
					+ "\t\t\t\tNET, WCF, Asp.Net MVC, Silverlight, Hadoop, MSBI, PHP, Oracle, Android, iOS that would bring the \r\n"
					+ "\t\t\t\t best in engineering student and software aspirants.\n");
			System.out.println("\t\tCourse Material & Certificate\n");
			System.out.println("\t\t\t\tWe provide Authorized certificates for the successful candidates completing the courses.All \r\n"
					+ "\t\t\t\tthe courses well prepared and simple course material\n\n");
			System.out.println("\t\tPlacement Assistance\n");
			System.out.println("\t\t\t\tAs there is a great shortage of qualified and trained professionals in J2EE,.NET and PHP platform\r\n "
					+ "\t\t\t\t unlimited employment opportunities are awaiting the successful candidates in India and abroad.\n\n");
			System.out.println("\t\t\t\tWe extend Placement Assistance for the candidates after completion of their training by referring  \r\n"
					+ "\t\t\t\tto the various Software Companies all over India. So many students had completed our various Software \r\n"
					+ "\t\t\t\tTraining Courses and most of them are placed in leading Software/Telecom Companies in India and Abroad.\r\n");
			
			System.out.println("\n\n");
			
			System.out.println("\u001B[34m"+"\t\t\t\t\t\tPress 1 For Exit !!!!");
			String s=sc.next();
			
			switch(s)
			{
			case "1":
				Usa();
				break;
				
			default:
				System.out.println("\u001B[31m"+"INVALID INPUT !!!!");
				Usa_software_traninig();
			}
//			sc.close();
		 }
		public static void view_fs_details() throws InterruptedException
		 {
			 Scanner sc=new Scanner(System.in);
			 
			  System.out.println("\u001B[33m");
			  
				System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
						+" \t\t\t\t\t\t|      ABOUT SUBJECT AND TEACHER     |\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+ "\t\t\t\t\t\t|         1)C PROGRAMMING            |\r\n"
						+ "\t\t\t\t\t\t|         2)CORE JAVA                |\r\n"
						+ "\t\t\t\t\t\t|         3)ADVANCE JAVA             |\r\n"
						+ "\t\t\t\t\t\t|         4)ORACLE                   |\r\n"
						+ "\t\t\t\t\t\t|         5)UI                       |\r\n"
						+ "\t\t\t\t\t\t|         6)DSA                      |\r\n"
						+ "\t\t\t\t\t\t|         7)COMMUNICATION            |\r\n"
						+ "\t\t\t\t\t\t|         8)EXIT                     |\r\n"
						+ "\t\t\t\t\t\t--------------------------------------");
				
				System.out.println("\u001B[34m"+"Enter Option: ");
				String a=sc.next();
				
				switch(a) 
				{
				case "1":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					System.out.println("\u001B[33m"+"\t\t\t\t\tOne thing we can speak without C Knowledge there is no Programming\r\n"
							+ "\t\t\t Logics to learn any language. There is no interviews for a Fresher without C language.\r\n"
							+ "\t\t\t To learn Java, .Net, Databases the list continues so many we require “C” Knowledge  for\r\n"
							+ "\t\t\t a student  Finally to tell many languages are internally Programmed by only C Language.\r\n"+"\u001B[37m");
					  
					System.out.println("\u001B[33m");
					  
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|             KISHOR SIR             |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+ "\t\t\t\t\t\t| Mr.Kishore P.S.S.N is a leading C  |\r\n"
							+ "\t\t\t\t\t\t|       C++ and ORACLE faculty       |\r\n"
							+ "\t\t\t\t\t\t|He is having 10+ years of experience|\r\n"
							+ "\t\t\t\t\t\t|in teaching and Software development|\r\n"
							+ "\t\t\t\t\t\t|His main intention is to improve the|\r\n"
							+ "\t\t\t\t\t\t|students Logical, programming skills|\r\n"
							+ "\t\t\t\t\t\t|   and motivate them to think the   |\r\n"
							+ "\t\t\t\t\t\t| reality of software industry needs |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t PRESS ANY KEY TO EXIT : ");
					String b1=sc.next();
					
					if(b1==b1)
						 view_fs_details();							
						break;
				case "2":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					System.out.println("\u001B[33m"+"\t\t\t\tThe word Core describes the basic concept of something, and here,\r\n"
							+ "\t\t\t the phrase 'Core Java' defines the basic Java that covers the basic concept of \r\n"
							+ "\t\tJava programming language.The principle followed by Java is WORA that says Write Once, Run Anywhere.\r\n"+"\u001B[37m");
					 
					System.out.println("\u001B[33m");
					  
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|             KISHAN SIR             |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+ "\t\t\t\t\t\t|  Mr.Kishan is a leading Core Java  |\r\n"
							+ "\t\t\t\t\t\t|He is having 10+ years of experience|\r\n"
							+ "\t\t\t\t\t\t|in teaching and Software development|\r\n"
							+ "\t\t\t\t\t\t|His main intention is to improve the|\r\n"
							+ "\t\t\t\t\t\t|students Logical, programming skills|\r\n"
							+ "\t\t\t\t\t\t|   and motivate them to think the   |\r\n"
							+ "\t\t\t\t\t\t| reality of software industry needs |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t FOR EXIT PRESS 0 : ");
					String b2=sc.next();
					
					if(b2==b2)
						 view_fs_details();
				case "3":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					System.out.println("\u001B[33m"+"\t\t\t\tThe word Core describes the basic concept of something, and here,\r\n"
							+ "\t\t\t the phrase 'Core Java' defines the basic Java that covers the basic concept of \r\n"
							+ "\t\tJava programming language.The principle followed by Java is WORA that says Write Once, Run Anywhere.\r\n"+"\u001B[37m");
					 
					System.out.println("\u001B[33m");
					  
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|            MAHIPATI SIR            |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+ "\t\t\t\t\t\t|Mr.Mahipati is a leading Core Java  |\r\n"
							+ "\t\t\t\t\t\t|He is having 10+ years of experience|\r\n"
							+ "\t\t\t\t\t\t|in teaching and Software development|\r\n"
							+ "\t\t\t\t\t\t|His main intention is to improve the|\r\n"
							+ "\t\t\t\t\t\t|students Logical, programming skills|\r\n"
							+ "\t\t\t\t\t\t|   and motivate them to think the   |\r\n"
							+ "\t\t\t\t\t\t| reality of software industry needs |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t FOR EXIT PRESS 0 : ");
					String b3=sc.next();
					
					if(b3==b3)
						 view_fs_details();
					
					break;
				case "4":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					System.out.println("\u001B[33m"+"\t\t\t\tOracle is one of the biggest database technology assets in the world.\r\n"
							+ "\t\t\tAn Oracle database uses memory structures and processes to manage and access the database.\r\n"+"\u001B[37m");
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|         SIVA CHAITANYA SIR         |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+ "\t\t\t\t\t\t| Mr.Siva Chaitanya is leading whole |\r\n"
							+ "\t\t\t\t\t\t|Database System in Oracle and PlSQL |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t FOR EXIT PRESS 0 : ");
					String b4=sc.next();
					
					if(b4==b4)
						 view_fs_details();
						break;
				case "5":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					
					System.out.println("\u001B[33m"+"\t\t\t\tHTML (the Hypertext Markup Language) and CSS (Cascading Style Sheets)\r\n"
							+ "\t\t\t are two of the core technologies for building Web pages.HTML provides the structure of the\r\n"
							+ "\t\t\t\t\t page, CSS the (visual and aural) layout, for a variety of devices. "+"\u001B[37m");
					 
					System.out.println("\u001B[33m");
					  
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|           SHIVA KUMAR SIR          |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+ "\t\t\t\t\t\t| Mr.Shiva is leading HTML , css and |\r\n"
							+ "\t\t\t\t\t\t|             JavaScript             |\r\n"
							+ "\t\t\t\t\t\t| He has 5+ years of rich experience |\r\n"
							+ "\t\t\t\t\t\t|         in Corporate Training.     |\r\n"
							+ "\t\t\t\t\t\t| He expertise in both class room and|\r\n"
							+ "\t\t\t\t\t\t|           online training.         |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t FOR EXIT PRESS 0 : ");
					String b5=sc.next();
					
					if(b5==b5)
						 view_fs_details();
						break;
				case "6":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					System.out.println("\u001B[33m"+"\t\t\t\tThe word Core describes the basic concept of something, and here,\r\n"
							+ "\t\t\t the phrase 'Core Java' defines the basic Java that covers the basic concept of \r\n"
							+ "\t\tJava programming language.The principle followed by Java is WORA that says Write Once, Run Anywhere.\r\n"+"\u001B[37m");
					 
					System.out.println("\u001B[33m");
					  
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|            SARAVAN SIR             |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+ "\t\t\t\t\t\t| Mr.Saravan is a leading Core Java  |\r\n"
							+ "\t\t\t\t\t\t|He is having 10+ years of experience|\r\n"
							+ "\t\t\t\t\t\t|in teaching and Software development|\r\n"
							+ "\t\t\t\t\t\t|His main intention is to improve the|\r\n"
							+ "\t\t\t\t\t\t|students Logical, programming skills|\r\n"
							+ "\t\t\t\t\t\t|   and motivate them to think the   |\r\n"
							+ "\t\t\t\t\t\t| reality of software industry needs |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t FOR EXIT PRESS 0 : ");
					String b6=sc.next();
					
					if(b6==b6)
						 view_fs_details();
					
				case "7":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					
					System.out.println("\u001B[33m"+"\t\t\t\tIt improves your CommunicationSkills with your body language and gestures\r\n"
							+ "\t\t\t CS also takes part in your Training and Placement , it also contains Presentation Skills \r\n"
							+ "\t\t\t\t\t Email writing , Facing Interview Problems , GD , Listening and Mock also.\r\n "+"\u001B[37m");
					
					System.out.println("\u001B[33m");
					
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|             DIPALI MAM             |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+" \t\t\t\t\t\t|           AMIT PANDEY SIR          |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+" \t\t\t\t\t\t|             BHATIA MAM             |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t FOR EXIT PRESS 0 : ");
					String b7=sc.next();
					
					if(b7==b7)
						 view_fs_details();
						break;
				case "8":
					selectCourse();
					break;
				default :
					System.out.println("\u001B[31m"+"Invalid Input !!");
					 view_fs_details();
				}
				//sc.close();
			
		 }
		public static void Chennai_view_fs_details() throws InterruptedException
		 {
			 Scanner sc=new Scanner(System.in);
			 
			  System.out.println("\u001B[33m");
			  
				System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
						+" \t\t\t\t\t\t|      ABOUT SUBJECT AND TEACHER     |\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+ "\t\t\t\t\t\t|         1)C PROGRAMMING            |\r\n"
						+ "\t\t\t\t\t\t|         2)CORE JAVA                |\r\n"
						+ "\t\t\t\t\t\t|         3)ADVANCE JAVA             |\r\n"
						+ "\t\t\t\t\t\t|         4)ORACLE                   |\r\n"
						+ "\t\t\t\t\t\t|         5)UI                       |\r\n"
						+ "\t\t\t\t\t\t|         6)DSA                      |\r\n"
						+ "\t\t\t\t\t\t|         7)COMMUNICATION            |\r\n"
						+ "\t\t\t\t\t\t|         8)EXIT                     |\r\n"
						+ "\t\t\t\t\t\t--------------------------------------");
				
				System.out.println("\u001B[34m"+"Enter Option: ");
				String a=sc.next();
				
				switch(a) 
				{
				case "1":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					System.out.println("\u001B[33m"+"\t\t\t\t\tOne thing we can speak without C Knowledge there is no Programming\r\n"
							+ "\t\t\t Logics to learn any language. There is no interviews for a Fresher without C language.\r\n"
							+ "\t\t\t To learn Java, .Net, Databases the list continues so many we require “C” Knowledge  for\r\n"
							+ "\t\t\t a student  Finally to tell many languages are internally Programmed by only C Language.\r\n"+"\u001B[37m");
					  
					System.out.println("\u001B[33m");
					  
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|             KISHOR SIR             |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+ "\t\t\t\t\t\t| Mr.Kishore P.S.S.N is a leading C  |\r\n"
							+ "\t\t\t\t\t\t|       C++ and ORACLE faculty       |\r\n"
							+ "\t\t\t\t\t\t|He is having 10+ years of experience|\r\n"
							+ "\t\t\t\t\t\t|in teaching and Software development|\r\n"
							+ "\t\t\t\t\t\t|His main intention is to improve the|\r\n"
							+ "\t\t\t\t\t\t|students Logical, programming skills|\r\n"
							+ "\t\t\t\t\t\t|   and motivate them to think the   |\r\n"
							+ "\t\t\t\t\t\t| reality of software industry needs |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t PRESS ANY KEY TO EXIT : ");
					String b1=sc.next();
					
					if(b1==b1)
						Chennai_view_fs_details();							
						break;
				case "2":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					System.out.println("\u001B[33m"+"\t\t\t\tThe word Core describes the basic concept of something, and here,\r\n"
							+ "\t\t\t the phrase 'Core Java' defines the basic Java that covers the basic concept of \r\n"
							+ "\t\tJava programming language.The principle followed by Java is WORA that says Write Once, Run Anywhere.\r\n"+"\u001B[37m");
					 
					System.out.println("\u001B[33m");
					  
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|             KISHAN SIR             |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+ "\t\t\t\t\t\t|  Mr.Kishan is a leading Core Java  |\r\n"
							+ "\t\t\t\t\t\t|He is having 10+ years of experience|\r\n"
							+ "\t\t\t\t\t\t|in teaching and Software development|\r\n"
							+ "\t\t\t\t\t\t|His main intention is to improve the|\r\n"
							+ "\t\t\t\t\t\t|students Logical, programming skills|\r\n"
							+ "\t\t\t\t\t\t|   and motivate them to think the   |\r\n"
							+ "\t\t\t\t\t\t| reality of software industry needs |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t FOR EXIT PRESS 0 : ");
					String b2=sc.next();
					
					if(b2==b2)
						Chennai_view_fs_details();
				case "3":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					System.out.println("\u001B[33m"+"\t\t\t\tThe word Core describes the basic concept of something, and here,\r\n"
							+ "\t\t\t the phrase 'Core Java' defines the basic Java that covers the basic concept of \r\n"
							+ "\t\tJava programming language.The principle followed by Java is WORA that says Write Once, Run Anywhere.\r\n"+"\u001B[37m");
					 
					System.out.println("\u001B[33m");
					  
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|            MAHIPATI SIR            |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+ "\t\t\t\t\t\t|Mr.Mahipati is a leading Core Java  |\r\n"
							+ "\t\t\t\t\t\t|He is having 10+ years of experience|\r\n"
							+ "\t\t\t\t\t\t|in teaching and Software development|\r\n"
							+ "\t\t\t\t\t\t|His main intention is to improve the|\r\n"
							+ "\t\t\t\t\t\t|students Logical, programming skills|\r\n"
							+ "\t\t\t\t\t\t|   and motivate them to think the   |\r\n"
							+ "\t\t\t\t\t\t| reality of software industry needs |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t FOR EXIT PRESS 0 : ");
					String b3=sc.next();
					
					if(b3==b3)
						Chennai_view_fs_details();
					
					break;
				case "4":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					System.out.println("\u001B[33m"+"\t\t\t\tOracle is one of the biggest database technology assets in the world.\r\n"
							+ "\t\t\tAn Oracle database uses memory structures and processes to manage and access the database.\r\n"+"\u001B[37m");
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|         SIVA CHAITANYA SIR         |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+ "\t\t\t\t\t\t| Mr.Siva Chaitanya is leading whole |\r\n"
							+ "\t\t\t\t\t\t|Database System in Oracle and PlSQL |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t FOR EXIT PRESS 0 : ");
					String b4=sc.next();
					
					if(b4==b4)
						Chennai_view_fs_details();
						break;
				case "5":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					
					System.out.println("\u001B[33m"+"\t\t\t\tHTML (the Hypertext Markup Language) and CSS (Cascading Style Sheets)\r\n"
							+ "\t\t\t are two of the core technologies for building Web pages.HTML provides the structure of the\r\n"
							+ "\t\t\t\t\t page, CSS the (visual and aural) layout, for a variety of devices. "+"\u001B[37m");
					 
					System.out.println("\u001B[33m");
					  
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|           SHIVA KUMAR SIR          |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+ "\t\t\t\t\t\t| Mr.Shiva is leading HTML , css and |\r\n"
							+ "\t\t\t\t\t\t|             JavaScript             |\r\n"
							+ "\t\t\t\t\t\t| He has 5+ years of rich experience |\r\n"
							+ "\t\t\t\t\t\t|         in Corporate Training.     |\r\n"
							+ "\t\t\t\t\t\t| He expertise in both class room and|\r\n"
							+ "\t\t\t\t\t\t|           online training.         |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t FOR EXIT PRESS 0 : ");
					String b5=sc.next();
					
					if(b5==b5)
						Chennai_view_fs_details();
						break;
				case "6":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					System.out.println("\u001B[33m"+"\t\t\t\tThe word Core describes the basic concept of something, and here,\r\n"
							+ "\t\t\t the phrase 'Core Java' defines the basic Java that covers the basic concept of \r\n"
							+ "\t\tJava programming language.The principle followed by Java is WORA that says Write Once, Run Anywhere.\r\n"+"\u001B[37m");
					 
					System.out.println("\u001B[33m");
					  
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|            SARAVAN SIR             |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+ "\t\t\t\t\t\t| Mr.Saravan is a leading Core Java  |\r\n"
							+ "\t\t\t\t\t\t|He is having 10+ years of experience|\r\n"
							+ "\t\t\t\t\t\t|in teaching and Software development|\r\n"
							+ "\t\t\t\t\t\t|His main intention is to improve the|\r\n"
							+ "\t\t\t\t\t\t|students Logical, programming skills|\r\n"
							+ "\t\t\t\t\t\t|   and motivate them to think the   |\r\n"
							+ "\t\t\t\t\t\t| reality of software industry needs |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t FOR EXIT PRESS 0 : ");
					String b6=sc.next();
					
					if(b6==b6)
						Chennai_view_fs_details();
					
				case "7":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					
					System.out.println("\u001B[33m"+"\t\t\t\tIt improves your CommunicationSkills with your body language and gestures\r\n"
							+ "\t\t\t CS also takes part in your Training and Placement , it also contains Presentation Skills \r\n"
							+ "\t\t\t\t\t Email writing , Facing Interview Problems , GD , Listening and Mock also.\r\n "+"\u001B[37m");
					
					System.out.println("\u001B[33m");
					
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|             DIPALI MAM             |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+" \t\t\t\t\t\t|           AMIT PANDEY SIR          |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+" \t\t\t\t\t\t|             BHATIA MAM             |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t FOR EXIT PRESS 0 : ");
					String b7=sc.next();
					
					if(b7==b7)
						Chennai_view_fs_details();
						break;
				
				case "8":
					Chennai_selectCourse();
					break;
					default :
						System.out.println("\u001B[31m"+"Invalid Input !!");
						Chennai_view_fs_details();
				}
				//sc.close();
			
		 }
		public static void Usa_view_fs_details() throws InterruptedException
		 {

			 Scanner sc=new Scanner(System.in);
			 
			  System.out.println("\u001B[33m");
			  
				System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
						+" \t\t\t\t\t\t|      ABOUT SUBJECT AND TEACHER     |\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+ "\t\t\t\t\t\t|         1)C PROGRAMMING            |\r\n"
						+ "\t\t\t\t\t\t|         2)CORE JAVA                |\r\n"
						+ "\t\t\t\t\t\t|         3)ADVANCE JAVA             |\r\n"
						+ "\t\t\t\t\t\t|         4)ORACLE                   |\r\n"
						+ "\t\t\t\t\t\t|         5)UI                       |\r\n"
						+ "\t\t\t\t\t\t|         6)DSA                      |\r\n"
						+ "\t\t\t\t\t\t|         7)COMMUNICATION            |\r\n"
						+ "\t\t\t\t\t\t|         8)EXIT                     |\r\n"
						+ "\t\t\t\t\t\t--------------------------------------");
				
				System.out.println("\u001B[34m"+"Enter Option: ");
				String a=sc.next();
				
				switch(a) 
				{
				case "1":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					System.out.println("\u001B[33m"+"\t\t\t\t\tOne thing we can speak without C Knowledge there is no Programming\r\n"
							+ "\t\t\t Logics to learn any language. There is no interviews for a Fresher without C language.\r\n"
							+ "\t\t\t To learn Java, .Net, Databases the list continues so many we require “C” Knowledge  for\r\n"
							+ "\t\t\t a student  Finally to tell many languages are internally Programmed by only C Language.\r\n"+"\u001B[37m");
					  
					System.out.println("\u001B[33m");
					  
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|             KISHOR SIR             |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+ "\t\t\t\t\t\t| Mr.Kishore P.S.S.N is a leading C  |\r\n"
							+ "\t\t\t\t\t\t|       C++ and ORACLE faculty       |\r\n"
							+ "\t\t\t\t\t\t|He is having 10+ years of experience|\r\n"
							+ "\t\t\t\t\t\t|in teaching and Software development|\r\n"
							+ "\t\t\t\t\t\t|His main intention is to improve the|\r\n"
							+ "\t\t\t\t\t\t|students Logical, programming skills|\r\n"
							+ "\t\t\t\t\t\t|   and motivate them to think the   |\r\n"
							+ "\t\t\t\t\t\t| reality of software industry needs |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t PRESS ANY KEY TO EXIT : ");
					String b1=sc.next();
					
					if(b1==b1)
						 Usa_view_fs_details();							
						break;
				case "2":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					System.out.println("\u001B[33m"+"\t\t\t\tThe word Core describes the basic concept of something, and here,\r\n"
							+ "\t\t\t the phrase 'Core Java' defines the basic Java that covers the basic concept of \r\n"
							+ "\t\tJava programming language.The principle followed by Java is WORA that says Write Once, Run Anywhere.\r\n"+"\u001B[37m");
					 
					System.out.println("\u001B[33m");
					  
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|             KISHAN SIR             |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+ "\t\t\t\t\t\t|  Mr.Kishan is a leading Core Java  |\r\n"
							+ "\t\t\t\t\t\t|He is having 10+ years of experience|\r\n"
							+ "\t\t\t\t\t\t|in teaching and Software development|\r\n"
							+ "\t\t\t\t\t\t|His main intention is to improve the|\r\n"
							+ "\t\t\t\t\t\t|students Logical, programming skills|\r\n"
							+ "\t\t\t\t\t\t|   and motivate them to think the   |\r\n"
							+ "\t\t\t\t\t\t| reality of software industry needs |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t FOR EXIT PRESS 0 : ");
					String b2=sc.next();
					
					if(b2==b2)
						 Usa_view_fs_details();
				case "3":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					System.out.println("\u001B[33m"+"\t\t\t\tThe word Core describes the basic concept of something, and here,\r\n"
							+ "\t\t\t the phrase 'Core Java' defines the basic Java that covers the basic concept of \r\n"
							+ "\t\tJava programming language.The principle followed by Java is WORA that says Write Once, Run Anywhere.\r\n"+"\u001B[37m");
					 
					System.out.println("\u001B[33m");
					  
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|            MAHIPATI SIR            |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+ "\t\t\t\t\t\t|Mr.Mahipati is a leading Core Java  |\r\n"
							+ "\t\t\t\t\t\t|He is having 10+ years of experience|\r\n"
							+ "\t\t\t\t\t\t|in teaching and Software development|\r\n"
							+ "\t\t\t\t\t\t|His main intention is to improve the|\r\n"
							+ "\t\t\t\t\t\t|students Logical, programming skills|\r\n"
							+ "\t\t\t\t\t\t|   and motivate them to think the   |\r\n"
							+ "\t\t\t\t\t\t| reality of software industry needs |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t FOR EXIT PRESS 0 : ");
					String b3=sc.next();
					
					if(b3==b3)
						 Usa_view_fs_details();
					
					break;
				case "4":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					System.out.println("\u001B[33m"+"\t\t\t\tOracle is one of the biggest database technology assets in the world.\r\n"
							+ "\t\t\tAn Oracle database uses memory structures and processes to manage and access the database.\r\n"+"\u001B[37m");
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|         SIVA CHAITANYA SIR         |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+ "\t\t\t\t\t\t| Mr.Siva Chaitanya is leading whole |\r\n"
							+ "\t\t\t\t\t\t|Database System in Oracle and PlSQL |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t FOR EXIT PRESS 0 : ");
					String b4=sc.next();
					
					if(b4==b4)
						 Usa_view_fs_details();
						break;
				case "5":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					
					System.out.println("\u001B[33m"+"\t\t\t\tHTML (the Hypertext Markup Language) and CSS (Cascading Style Sheets)\r\n"
							+ "\t\t\t are two of the core technologies for building Web pages.HTML provides the structure of the\r\n"
							+ "\t\t\t\t\t page, CSS the (visual and aural) layout, for a variety of devices. "+"\u001B[37m");
					 
					System.out.println("\u001B[33m");
					  
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|           SHIVA KUMAR SIR          |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+ "\t\t\t\t\t\t| Mr.Shiva is leading HTML , css and |\r\n"
							+ "\t\t\t\t\t\t|             JavaScript             |\r\n"
							+ "\t\t\t\t\t\t| He has 5+ years of rich experience |\r\n"
							+ "\t\t\t\t\t\t|         in Corporate Training.     |\r\n"
							+ "\t\t\t\t\t\t| He expertise in both class room and|\r\n"
							+ "\t\t\t\t\t\t|           online training.         |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t FOR EXIT PRESS 0 : ");
					String b5=sc.next();
					
					if(b5==b5)
						Chennai_view_fs_details();
						break;
				case "6":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					System.out.println("\u001B[33m"+"\t\t\t\tThe word Core describes the basic concept of something, and here,\r\n"
							+ "\t\t\t the phrase 'Core Java' defines the basic Java that covers the basic concept of \r\n"
							+ "\t\tJava programming language.The principle followed by Java is WORA that says Write Once, Run Anywhere.\r\n"+"\u001B[37m");
					 
					System.out.println("\u001B[33m");
					  
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|            SARAVAN SIR             |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+ "\t\t\t\t\t\t| Mr.Saravan is a leading Core Java  |\r\n"
							+ "\t\t\t\t\t\t|He is having 10+ years of experience|\r\n"
							+ "\t\t\t\t\t\t|in teaching and Software development|\r\n"
							+ "\t\t\t\t\t\t|His main intention is to improve the|\r\n"
							+ "\t\t\t\t\t\t|students Logical, programming skills|\r\n"
							+ "\t\t\t\t\t\t|   and motivate them to think the   |\r\n"
							+ "\t\t\t\t\t\t| reality of software industry needs |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t FOR EXIT PRESS 0 : ");
					String b6=sc.next();
					
					if(b6==b6)
						 Usa_view_fs_details();
					
				case "7":
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
					
					System.out.println("\u001B[33m"+"\t\t\t\tIt improves your CommunicationSkills with your body language and gestures\r\n"
							+ "\t\t\t CS also takes part in your Training and Placement , it also contains Presentation Skills \r\n"
							+ "\t\t\t\t\t Email writing , Facing Interview Problems , GD , Listening and Mock also.\r\n "+"\u001B[37m");
					
					System.out.println("\u001B[33m");
					
					System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
							+" \t\t\t\t\t\t|             DIPALI MAM             |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+" \t\t\t\t\t\t|           AMIT PANDEY SIR          |\r\n"
							+" \t\t\t\t\t\t|------------------------------------|\r\n"
							+" \t\t\t\t\t\t|             BHATIA MAM             |\r\n"
							+ "\t\t\t\t\t\t--------------------------------------");
					
					System.out.print("\u001B[34m"+"\t\t\t\t\t\t FOR EXIT PRESS 0 : ");
					String b7=sc.next();
					
					if(b7==b7)
						 Usa_view_fs_details();
						break;
				
				case "8":
					 Usa_selectCourse();
					break;
					default :
						System.out.println("\u001B[31m"+"Invalid Input !!");
						 Usa_view_fs_details();
				}
				//sc.close();
			
		 }
		public static void Project() throws InterruptedException 
		 {
			 Scanner sc=new Scanner(System.in);
			 
			 System.out.println("\u001B[33m");
			 
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
						+" \t\t\t\t\t\t|              PROJECTS              |\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+ "\t\t\t\t\t\t|        ==> MINI BANK PROJECT       |\r\n"
						+ "\t\t\t\t\t\t|        ==> IRCTC PROJECT           |\r\n"
						+ "\t\t\t\t\t\t|        ==> MANAGMENTS SYSTEM       |\r\n"
						+ "\t\t\t\t\t\t|        ==> ELE-BILL                |\r\n"
						+ "\t\t\t\t\t\t|        ==> WORD GAME               |\r\n"
						+ "\t\t\t\t\t\t|        ==> QUIZ                    |\r\n"
						+ "\t\t\t\t\t\t|        ==> D-MART                  |\r\n"
						+ "\t\t\t\t\t\t|   !!!    PRESS KEY TO EXIT    !!!  |\r\n"
						+ "\t\t\t\t\t\t--------------------------------------");
			
				String a=sc.next();
				
				switch(a) 
				{
				default :
					Hyderabad();
				}
				//sc.close();
		 }
		public static void Chennai_Project() throws InterruptedException 
		 {
			 Scanner sc=new Scanner(System.in);
			 
			 System.out.println("\u001B[33m");
			 
			 System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
						+" \t\t\t\t\t\t|              PROJECTS              |\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+ "\t\t\t\t\t\t|        ==> MINI BANK PROJECT       |\r\n"
						+ "\t\t\t\t\t\t|        ==> IRCTC PROJECT           |\r\n"
						+ "\t\t\t\t\t\t|        ==> MANAGMENTS SYSTEM       |\r\n"
						+ "\t\t\t\t\t\t|        ==> ELE-BILL                |\r\n"
						+ "\t\t\t\t\t\t|        ==> WORD GAME               |\r\n"
						+ "\t\t\t\t\t\t|        ==> QUIZ                    |\r\n"
						+ "\t\t\t\t\t\t|        ==> D-MART                  |\r\n"
						+ "\t\t\t\t\t\t|   !!!    PRESS KEY TO EXIT    !!!  |\r\n"
						+ "\t\t\t\t\t\t--------------------------------------");
			 
				String a=sc.next();
				
				switch(a) 
				{
				default :
					Chennai();
				}
				//sc.close();
		 }
		public static void Usa_Project() throws InterruptedException 
		 {
			 Scanner sc=new Scanner(System.in);
			 
			 System.out.println("\u001B[33m");
			 
			 System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
						+" \t\t\t\t\t\t|              PROJECTS              |\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+ "\t\t\t\t\t\t|        ==> MINI BANK PROJECT       |\r\n"
						+ "\t\t\t\t\t\t|        ==> IRCTC PROJECT           |\r\n"
						+ "\t\t\t\t\t\t|        ==> MANAGMENTS SYSTEM       |\r\n"
						+ "\t\t\t\t\t\t|        ==> ELE-BILL                |\r\n"
						+ "\t\t\t\t\t\t|        ==> WORD GAME               |\r\n"
						+ "\t\t\t\t\t\t|        ==> QUIZ                    |\r\n"
						+ "\t\t\t\t\t\t|        ==> D-MART                  |\r\n"
						+ "\t\t\t\t\t\t|   !!!    PRESS KEY TO EXIT    !!!  |\r\n"
						+ "\t\t\t\t\t\t--------------------------------------");
			 
				String a=sc.next();
				
				switch(a) 
				{
				default :
					Usa();
				}
				//sc.close();
		 }
		public static void Chennai_selectCourse() throws InterruptedException
		{
			System.out.println("\u001B[33m");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|ENTER THE COURSE YOU WANT TO SELECT |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+ "\t\t\t\t\t\t|         1)FULL STACK               |\r\n"
					+ "\t\t\t\t\t\t|         2)JAVA                     |\r\n"
					+ "\t\t\t\t\t\t|         3)DSA                      |\r\n"
					+ "\t\t\t\t\t\t|         4)ORACLE                   |\r\n"
					+ "\t\t\t\t\t\t|         5)UI                       |\r\n"
					+ "\t\t\t\t\t\t|         6)EXIT                     |\r\n"
					+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.print("\u001B[34m"+"WRITE NAME OF THE COURSE WHICH YOU WANT TO SELECT : ");
			String s=sc.next();
			
			String str=s.toLowerCase();
			
			switch(str)
			{
			case "fullstack","1" :
				System.out.println("\u001B[32m"+"\t\t\t\t\t      You Selected FULL STACK developement Course");
				Chennai_fullStack();
				break;
				
			case "java" ,"2"  : 
				System.out.println("\t\t\t\t\t\t\tYou Selected JAVA Course");
				Chennai_java();
				break;
				
			case "dsa" ,"3"  : 
				System.out.println("\t\t\t\t\t\t\tYou Selected DSA Course");
				Chennai_dsa();
				break;
				
			case "oracle","4" : 
				System.out.println("\t\t\t\t\t\t\tYou Selected Oracle Course");
				Chennai_oracle();
				break;
				
			case "ui" ,"5"    : 
				System.out.println("\t\t\t\t\t\t\tYou Selected UI course");
				Chennai_ui();
				break;
				
			case "exit","6"   :
				Chennai();
				break;
				
			default:
				System.out.println("\u001B[31m"+"\t\t\t\t\t\t       Course is not available");
				Chennai_selectCourse();
				break;
				
			}
			 // sc.close();
		}
		public static void Chennai_fullStack() throws InterruptedException
		{
			 System.out.println("\u001B[33m");
			 
			 Scanner sc=new Scanner (System.in);
			 
			 System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
						+" \t\t\t\t\t\t|         FULL STACK JAVA            |\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+" \t\t\t\t\t\t--------------------------------------\r\n"
						+" \t\t\t\t\t\t| 1)              JOIN               |\r\n"
						+" \t\t\t\t\t\t|                         RS-27,000/-|\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+" \t\t\t\t\t\t| 2)    COURSE & TEACHERS DETAILS    |\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+" \t\t\t\t\t\t| 3)             EXIT                |\r\n"
						+ "\t\t\t\t\t\t--------------------------------------\r\n");
				System.out.print("\u001B[34m"+"\u001B[33m"+"\t\t\t\t\t\tOptions : \r\n"+"\u001B[37m");
				String a=sc.next();
				switch(a)
				{
				case "1" :
				{
					System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
					String an=sc.next();
					char s=an.charAt(0);
					
					if( s=='y' || s=='Y' )
					{
						
						sub [c]="java";
						teacher [c]="SPECIAL TEACHER       ";
						totalfee[c]=27000;
						location[c] = "Chennai";
						System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED JAVA COURSE**");
						c++;
						
						Chennai_selectCourse();
					}
					else if( s=='n' || s=='N' )
						Chennai_selectCourse();
					
					else 
					{
						System.out.println("\u001B[31m"+"Invalid Input !!!");
						Chennai_fullStack();
					}
					break;
					
				}
				case "2" :
					Chennai_view_fs_details();
					break;
					
				case "3" :
					Chennai_selectCourse();
					break;
					
				default :
						System.out.println("\u001B[31m"+"Invalid input !!!");
						Chennai_fullStack();
					
				}
				 // 	sc.close();
		}
		public static void Chennai_java() throws InterruptedException
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.println("\u001B[33m"+"\t\t\t\tThe word Core describes the basic concept of something, and here,\r\n"
					+ "\t\t\t the phrase 'Core Java' defines the basic Java that covers the basic concept of \r\n"
					+ "\t\tJava programming language.The principle followed by Java is WORA that says Write Once, Run Anywhere.\r\n"+"\u001B[37m");
			  System.out.println("\u001B[33m");
			  
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|          FACULTY FOR JAVA          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)       HARI KRISHNA SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)    VENKATESH MAIPATHI SIR       |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 3)          NATRAJ SIR             |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 4)       SATISH GUPTA SIR          |\r\n"
					+ "\t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                                    |\r\n"
					+" \t\t\t\t\t\t| 5)             EXIT                |\r\n"
					+ "\t\t\t\t\t\t--------------------------------------\r\n");
			System.out.print("\u001B[34m"+"\t\t\t\t\t\tWHICH FACULTY YOU WANT TO JOIN : \r\n");
			String a=sc.next();
			
			switch(a)
			{
			case "1":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)       HARI KRISHNA SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="JAVA";
					teacher [c]="HARI KRISHNA SIR      ";
					totalfee[c]=7000;
					location[c] = "Chennai";
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED JAVA COURSE**");
					c++;
					
					Chennai_selectCourse();
				}
				else if( s=='n' || s=='N' )
					selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Chennai_java();
				}
				break;
			}
			
			case "2":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)    VENKATESH MAIPATHI SIR       |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="JAVA";
					teacher [c]="VENKATESH MAIPATHI SIR";
					totalfee[c]=7000;
					location[c] = "Chennai";
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED JAVA COURSE**");
					c++;
					
					Chennai_selectCourse();
				}
				else if( s=='n' || s=='N' )
					Chennai_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Chennai_java();
				}
				break;
				
			}
			
			case "3":
			{
				System.out.println("\u001B[33m");
				
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 3)          NATRAJ SIR             |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="JAVA";
					teacher [c]="NATRAJ SIR            ";
					totalfee[c]=7000;
					location[c] = "Chennai";
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED JAVA COURSE**");
					c++;
					
					Chennai_selectCourse();
				}
				else if( s=='n' || s=='N' )
					Chennai_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Chennai_java();
				}
				break;
			}
			
			
			case "4":
			{
				 System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 4)       SATISH GUPTA SIR          |\r\n"
					+ "\t\t\t\t\t\t|------------------------------------|\r\n");
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="JAVA";
					teacher [c]="SATISH GUPTA SIR      ";
					totalfee[c]=7000;
					location[c] = "Chennai";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED JAVA COURSE**");
					c++;
					Chennai_selectCourse();
				}
				else if( s=='n' || s=='N' )
					Chennai_selectCourse();
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Chennai_java();
				}
				break;
			}
			case "5":
				Chennai_selectCourse();
				break;
			default :
				{
					System.out.println("\u001B[31m"+"\t\t\t\t\t\t INVALID OPTION ");
					Chennai_java();
				}
			
			}
			 // sc.close();
		}
		public static void Chennai_dsa() throws InterruptedException
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
			System.out.println("\u001B[33m"+"\t\t\t   A data structure is a named location that can be used to store and organize data.\r\n"
					+ "\t\t\tAnd, an algorithm is a collection of steps to solve a particular problem. Learning data\r\n"
					+ "\t\t\t structures and algorithms allow us to write efficient and optimized computer programs.\r\n"+"\u001B[37m");
			
			System.out.println("\u001B[33m");
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|          FACULTY FOR DSA           |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)       SERAVANA KUMAR SIR        |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)    VENKATESH MAIPATHI SIR       |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 3)          NATRAJ SIR             |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 4)       SATISH GUPTA SIR          |\r\n"
					+ "\t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                                    |\r\n"
					+" \t\t\t\t\t\t| 5)             EXIT                |\r\n"
					+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.print("\u001B[34m"+"\t\t\t\t\t\tWHICH FACULTY YOU WANT TO JOIN : \r\n");
			String a=sc.next();
			
			switch(a)
			{
			case "1":
			{
				System.out.println("\u001B[33m");
				
				System.out.println(" \t\t\t\t\t\t--------------------------------------\r\n"
						+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
						+" \t\t\t\t\t\t| 1)       SERAVANA KUMAR SIR        |\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="DSA";
					teacher [c]="SERAVANA KUMAR SIR    ";
					totalfee[c]=5000;
					location[c] = "Chennai";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED JAVA COURSE**");
					c++;
					
					Chennai_selectCourse();
				}
				else if( s=='n' || s=='N' )
					Chennai_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Chennai_dsa();
				}
				break;
			}
			
			case "2":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)    VENKATESH MAIPATHI SIR       |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="DSA";
					teacher [c]="VENKATESH MAIPATHI SIR";
					totalfee[c]=7000;
					location[c] = "Chennai";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED DSA COURSE**");
					c++;
					
					selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					selectCourse();
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Chennai_dsa();
				}
				break;
			}
			
			case "3":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 3)          NATRAJ SIR             |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="DSA";
					teacher [c]="NATRAJ SIR            ";
					totalfee[c]=7000;
					location[c] = "Chennai";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED DSA COURSE**");
					c++;
					
					Chennai_selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					Chennai_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Chennai_dsa();
				}
				break;
			}
			
			
			case "4":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 4)       SATISH GUPTA SIR          |\r\n"
					+ "\t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="DSA";
					teacher [c]="SATISH GUPTA SIR      ";
					totalfee[c]=7000;
					location[c] = "Chennai";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED DSA COURSE**");
					c++;
					Chennai_selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					Chennai_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Chennai_dsa();
				}
				break;
			}
			case "5":
				Chennai_selectCourse();
				break;
				
			default :
			{
				System.out.println("\u001B[31m"+"\t\t\t\t\t\t INVALID OPTION ");
				Chennai_dsa();
			}
			}
			 // sc.close();
		}
		public static void Chennai_oracle() throws InterruptedException
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
			System.out.println("\u001B[33m"+"\t\t\t\tOracle is one of the biggest database technology assets in the world.\r\n"
					+ "\t\t\tAn Oracle database uses memory structures and processes to manage and access the database.\r\n"+"\u001B[37m");
			
			System.out.println("\u001B[33m");
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|          FACULTY FOR ORACLE        |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)        SHIVA KUMAR SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)        VIJAY KUMAR SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 3)          MURALI SIR             |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                                    |\r\n"
					+" \t\t\t\t\t\t| 4)             EXIT                |\r\n"
					+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
			String a=sc.next();
			
			switch(a)
			{
			case "1":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)        SHIVA KUMAR SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="ORACLE";
					teacher [c]="SHIVA KUMAR SIR       ";
					totalfee[c]=5000;
					location[c] = "Chennai";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED ORACLE COURSE**");
					c++;
					
					Chennai_selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					Chennai_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Chennai_oracle();
				}
				break;
			}
			
			case "2":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)        VIJAY KUMAR SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="ORACLE";
					teacher [c]="VIJAY KUMAR SIR       ";
					totalfee[c]=5000;
					location[c] = "Chennai";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED ORACLE COURSE**");
					c++;
					
					Chennai_selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					Chennai_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Chennai_oracle();
				}
				break;
			}
			
			case "3":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 3)          MURALI SIR             |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="ORACLE";
					teacher [c]="MURALI SIR            ";
					totalfee[c]=5000;
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED ORACLE COURSE**");
					c++;
					
					Chennai_selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					Chennai_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Chennai_oracle();
				}
				break;
			}
			case "4":
				Chennai_selectCourse();
				break;
				
			default :
			{
				System.out.println("\u001B[31m"+"\t\t\t\t\t\t INVALID OPTION ");
				Chennai_oracle();
			}
			}
			 // sc.close();
		}
		public static void Chennai_ui() throws InterruptedException
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
			System.out.println("\u001B[33m"+"\t\t\t\tHTML (the Hypertext Markup Language) and CSS (Cascading Style Sheets)\r\n"
					+ "\t\t\t are two of the core technologies for building Web pages.HTML provides the structure of the\r\n"
					+ "\t\t\t\t page, CSS the (visual and aural) layout, for a variety of devices. "+"\u001B[37m");
			
			System.out.println("\u001B[33m");
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|            FACULTY FOR UI          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)        SHIVA KUMAR SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)        SUBBA RAJU SIR           |\r\n"
					+ "\t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                                    |\r\n"
					+" \t\t\t\t\t\t| 3)             EXIT                |\r\n"
					+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
			String a=sc.next();
			
			switch(a)
			{
			case "1":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)        SHIVA KUMAR SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="UI";
					teacher [c]="SHIVA KUMAR SIR       ";
					totalfee[c]=5000;
					location[c] = "Chennai";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED UI COURSE**");
					c++;
					
					Chennai_selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					Chennai_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Chennai_ui();
				}
				break;
			}
			
			case "2":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)        SUBBA RAJU SIR           |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="UI";
					teacher [c]="SUBBA RAJU SIR        ";
					totalfee[c]=5000;
					location[c] = "Chennai";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED UI COURSE**");
					c++;
					
					Chennai_selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					Chennai_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Chennai_ui();
				}
				break;
			}
			case "3":
				Chennai_selectCourse();
				break;
				
			default :
			{
				System.out.println("\u001B[31m"+"\t\t\t\t\t\t INVALID OPTION ");
				Chennai_ui();
			}
			}
			 // 	sc.close();
		}
		public static void Usa_selectCourse() throws InterruptedException
		{
			System.out.println("\u001B[33m");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|ENTER THE COURSE YOU WANT TO SELECT |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+ "\t\t\t\t\t\t|         1)FULL STACK               |\r\n"
					+ "\t\t\t\t\t\t|         2)JAVA                     |\r\n"
					+ "\t\t\t\t\t\t|         3)DSA                      |\r\n"
					+ "\t\t\t\t\t\t|         4)ORACLE                   |\r\n"
					+ "\t\t\t\t\t\t|         5)UI                       |\r\n"
					+ "\t\t\t\t\t\t|         6)EXIT                     |\r\n"
					+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.print("\u001B[34m"+"WRITE NAME OF THE COURSE WHICH YOU WANT TO SELECT : ");
			String s=sc.next();
			
			String str=s.toLowerCase();
			switch(str)
			{
			case "fullstack","1" :
				System.out.println("\u001B[32m"+"\t\t\t\t\t      You Selected FULL STACK developement Course");
				Usa_fullStack();
				break;
				
			case "java" ,"2"  : 
				System.out.println("\t\t\t\t\t\t\tYou Selected JAVA Course");
				Usa_java();
				break;
				
			case "dsa" ,"3"  : 
				System.out.println("\t\t\t\t\t\t\tYou Selected DSA Course");
				Usa_dsa();
				break;
				
			case "oracle","4" : 
				System.out.println("\t\t\t\t\t\t\tYou Selected Oracle Course");
				Usa_oracle();
				break;
				
			case "ui" ,"5"    : 
				System.out.println("\t\t\t\t\t\t\tYou Selected UI course");
				Usa_ui();
				break;
				
			case "exit","6"   :
				Usa();
				break;
				
			default:
				System.out.println("\u001B[31m"+"\t\t\t\t\t\t       Course is not available");
				Usa_selectCourse();
				break;
				
			}
			 // sc.close();
		}
		public static void Usa_fullStack() throws InterruptedException
		{
			 System.out.println("\u001B[33m");
			 
			 Scanner sc=new Scanner (System.in);
			 System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
						+" \t\t\t\t\t\t|         FULL STACK JAVA            |\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+" \t\t\t\t\t\t--------------------------------------\r\n"
						+" \t\t\t\t\t\t| 1)              JOIN               |\r\n"
						+" \t\t\t\t\t\t|                         RS-27,000/-|\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+" \t\t\t\t\t\t| 2)    COURSE & TEACHERS DETAILS    |\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+" \t\t\t\t\t\t| 3)             EXIT                |\r\n"
						+ "\t\t\t\t\t\t--------------------------------------\r\n");
			 
				System.out.print("\u001B[34m"+"\u001B[33m"+"\t\t\t\t\t\tOptions : \r\n"+"\u001B[37m");
				String a=sc.next();
				
				switch(a)
				{
				case "1" :
				{
					System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
					String an=sc.next();
					
					char s=an.charAt(0);
					
					if( s=='y' || s=='Y' )
					{
						
						sub [c]="java";
						teacher [c]="SPECIAL TEACHER       ";
						totalfee[c]=27000;
						location[c] = "USA";
						
						System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED JAVA COURSE**");
						c++;
						
						Usa_selectCourse();
					}
					
					else if( s=='n' || s=='N' )
						Usa_selectCourse();
					
					else 
					{
						System.out.println("\u001B[31m"+"Invalid Input !!!");
						Usa_fullStack();
					}
					break;
				}
				case "2" :
					Usa_view_fs_details();
					break;
					
				case "3" :
					Usa_selectCourse();
					break;
					
				default :
						System.out.println("\u001B[31m"+"Invalid input !!!");
						Usa_fullStack();
					
				}
				 // 	sc.close();
		}
		public static void Usa_java() throws InterruptedException
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
			System.out.println("\u001B[33m"+"\t\t\t\tThe word Core describes the basic concept of something, and here,\r\n"
					+ "\t\t\t the phrase 'Core Java' defines the basic Java that covers the basic concept of \r\n"
					+ "\t\tJava programming language.The principle followed by Java is WORA that says Write Once, Run Anywhere.\r\n"+"\u001B[37m");
			
			System.out.println("\u001B[33m");
			  
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|          FACULTY FOR JAVA          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)       HARI KRISHNA SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)    VENKATESH MAIPATHI SIR       |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 3)          NATRAJ SIR             |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 4)       SATISH GUPTA SIR          |\r\n"
					+ "\t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                                    |\r\n"
					+" \t\t\t\t\t\t| 5)             EXIT                |\r\n"
					+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.print("\u001B[34m"+"\t\t\t\t\t\tWHICH FACULTY YOU WANT TO JOIN : \r\n");
			String a=sc.next();
			
			switch(a)
			{
			case "1":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)       HARI KRISHNA SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="JAVA";
					teacher [c]="HARI KRISHNA SIR      ";
					totalfee[c]=7000;
					location[c] = "USA";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED JAVA COURSE**");
					c++;
					
					Usa_selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					Usa_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Usa_java();
				}
				break;
			}
			
			case "2":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)    VENKATESH MAIPATHI SIR       |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="JAVA";
					teacher [c]="VENKATESH MAIPATHI SIR";
					totalfee[c]=7000;
					location[c] = "USA";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED JAVA COURSE**");
					c++;
					
					Usa_selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					Usa_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Usa_java();
				}
				break;
			}
			
			case "3":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 3)          NATRAJ SIR             |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="JAVA";
					teacher [c]="NATRAJ SIR            ";
					totalfee[c]=7000;
					location[c] = "USA";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED JAVA COURSE**");
					c++;
					
					Usa_selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					Usa_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Usa_java();
				}
				break;
			}
			
			
			case "4":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 4)       SATISH GUPTA SIR          |\r\n"
					+ "\t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="JAVA";
					teacher [c]="SATISH GUPTA SIR      ";
					totalfee[c]=7000;
					location[c] = "USA";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED JAVA COURSE**");
					c++;
					
					Usa_selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					Usa_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Usa_java();
				}
				break;
			}
			case "5":
				Usa_selectCourse();
				break;
				
			default :
				{
					System.out.println("\u001B[31m"+"\t\t\t\t\t\t INVALID OPTION ");
					Usa_java();
				}
			
			}
			 // sc.close();
		}
		public static void Usa_dsa() throws InterruptedException
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
			System.out.println("\u001B[33m"+"\t\t\t   A data structure is a named location that can be used to store and organize data.\r\n"
					+ "\t\t\tAnd, an algorithm is a collection of steps to solve a particular problem. Learning data\r\n"
					+ "\t\t\t structures and algorithms allow us to write efficient and optimized computer programs.\r\n"+"\u001B[37m");
			System.out.println("\u001B[33m");
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|          FACULTY FOR DSA           |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)       SERAVANA KUMAR SIR        |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)    VENKATESH MAIPATHI SIR       |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 3)          NATRAJ SIR             |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 4)       SATISH GUPTA SIR          |\r\n"
					+ "\t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                                    |\r\n"
					+" \t\t\t\t\t\t| 5)             EXIT                |\r\n"
					+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.print("\u001B[34m"+"\t\t\t\t\t\tWHICH FACULTY YOU WANT TO JOIN : \r\n");
			String a=sc.next();
			
			switch(a)
			{
			case "1":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t--------------------------------------\r\n"
						+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
						+" \t\t\t\t\t\t| 1)       SERAVANA KUMAR SIR        |\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="DSA";
					teacher [c]="SERAVANA KUMAR SIR    ";
					totalfee[c]=5000;
					location[c] = "USA";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED JAVA COURSE**");
					c++;
					
					Usa_selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					Usa_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Usa_dsa();
				}
				break;
			}
			
			case "2":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)    VENKATESH MAIPATHI SIR       |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="DSA";
					teacher [c]="VENKATESH MAIPATHI SIR";
					totalfee[c]=7000;
					location[c] = "USA";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED DSA COURSE**");
					c++;
					
					Usa_selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					Usa_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Usa_dsa();
				}
				break;
			}
			
			case "3":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 3)          NATRAJ SIR             |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="DSA";
					teacher [c]="NATRAJ SIR            ";
					totalfee[c]=7000;
					location[c] = "USA";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED DSA COURSE**");
					c++;
					
					Usa_selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					Usa_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Usa_dsa();
				}
				break;
			}
			
			
			case "4":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-7,000/-|\r\n"
					+" \t\t\t\t\t\t| 4)       SATISH GUPTA SIR          |\r\n"
					+ "\t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="DSA";
					teacher [c]="SATISH GUPTA SIR      ";
					totalfee[c]=7000;
					location[c] = "USA";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED DSA COURSE**");
					c++;
					
					Usa_selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					Usa_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Usa_dsa();
				}
				break;
			}
			case "5":
				Usa_selectCourse();
				break;
				
			default :
			{
				System.out.println("\u001B[31m"+"\t\t\t\t\t\t INVALID OPTION ");
				Usa_dsa();
			}
			}
			 // sc.close();
		}
		public static void Usa_oracle() throws InterruptedException
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
			System.out.println("\u001B[33m"+"\t\t\t\tOracle is one of the biggest database technology assets in the world.\r\n"
					+ "\t\t\tAn Oracle database uses memory structures and processes to manage and access the database.\r\n"+"\u001B[37m");
			
			System.out.println("\u001B[33m");
			  
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|          FACULTY FOR ORACLE        |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)        SHIVA KUMAR SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)        VIJAY KUMAR SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 3)          MURALI SIR             |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                                    |\r\n"
					+" \t\t\t\t\t\t| 4)             EXIT                |\r\n"
					+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
			String a=sc.next();
			
			switch(a)
			{
			case "1":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)        SHIVA KUMAR SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="ORACLE";
					teacher [c]="SHIVA KUMAR SIR       ";
					totalfee[c]=5000;
					location[c] = "USA";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED ORACLE COURSE**");
					c++;
					
					Usa_selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					Usa_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Usa_oracle();
				}
				break;
			}
			
			case "2":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)        VIJAY KUMAR SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="ORACLE";
					teacher [c]="VIJAY KUMAR SIR       ";
					totalfee[c]=5000;
					location[c] = "USA";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED ORACLE COURSE**");
					c++;
					
					Usa_selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					Usa_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Usa_oracle();
				}
				break;
			}
			
			case "3":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 3)          MURALI SIR             |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="ORACLE";
					teacher [c]="MURALI SIR            ";
					totalfee[c]=5000;
					location[c] = "USA";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED ORACLE COURSE**");
					c++;
					
					Usa_selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					Usa_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Usa_oracle();
				}
				break;
			}
			case "4":
				Usa_selectCourse();
				break;
				
			default :
			{
				System.out.println("\u001B[31m"+"\t\t\t\t\t\t INVALID OPTION ");
				Usa_oracle();
			}
			}
			 // sc.close();
		}
		public static void Usa_ui() throws InterruptedException
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n");
			System.out.println("\u001B[33m"+"\t\t\t\tHTML (the Hypertext Markup Language) and CSS (Cascading Style Sheets)\r\n"
					+ "\t\t\t are two of the core technologies for building Web pages.HTML provides the structure of the\r\n"
					+ "\t\t\t\t page, CSS the (visual and aural) layout, for a variety of devices. "+"\u001B[37m");
			
			System.out.println("\u001B[33m");
			
			System.out.println("\t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|            FACULTY FOR UI          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)        SHIVA KUMAR SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)        SUBBA RAJU SIR           |\r\n"
					+ "\t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                                    |\r\n"
					+" \t\t\t\t\t\t| 3)             EXIT                |\r\n"
					+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
			String a=sc.next();
			
			switch(a)
			{
			case "1":
			{
				 System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 1)        SHIVA KUMAR SIR          |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="UI";
					teacher [c]="SHIVA KUMAR SIR       ";
					totalfee[c]=5000;
					location[c] = "USA";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED UI COURSE**");
					c++;
					
					Usa_selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					Usa_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Usa_ui();
				}
				break;
			}
			
			case "2":
			{
				System.out.println("\u001B[33m");
				System.out.println(" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|                          RS-5,000/-|\r\n"
					+" \t\t\t\t\t\t| 2)        SUBBA RAJU SIR           |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n");
				
				System.out.print("\u001B[34m"+"\t\t\t\t\tYOU WANT TO JOIN THE COURSE : press YES or NO  : ");
				String an=sc.next();
				
				char s=an.charAt(0);
				
				if( s=='y' || s=='Y' )
				{
					
					sub [c]="UI";
					teacher [c]="SUBBA RAJU SIR        ";
					totalfee[c]=5000;
					location[c] = "USA";
					
					System.out.println("\u001B[32m"+"\t\t\t\t\t\t   **YOU PURCHASED UI COURSE**");
					c++;
					
					Usa_selectCourse();
				}
				
				else if( s=='n' || s=='N' )
					Usa_selectCourse();
				
				else 
				{
					System.out.println("\u001B[31m"+"Invalid Input !!!");
					Usa_ui();
				}
				break;
			}
			case "3":
				Usa_selectCourse();
				break;
				
			default :
			{
				System.out.println("\u001B[31m"+"\t\t\t\t\t\t INVALID OPTION ");
				Usa_ui();
			}
			}
			 // 	sc.close();
		}
		public static void AboutHYD() throws InterruptedException
		{   
			Scanner sc= new Scanner(System.in);
			
			System.out.println("\u001B[33m");
			System.out.println("\u001B[33m"+"\t\t\t\t\t\t\t--------------------------------------\r\n"
						+" \t\t\t\t\t\t|             HYDERABAD              |\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+ "\t\t\t\t\t\t| India – Hyderabad Office           |\r\n"
						+ "\t\t\t\t\t\t|                                    |\r\n"
						+ "\t\t\t\t\t\t| ADDRESS :                          |\r\n"
						+ "\t\t\t\t\t\t|     2nd Floor, Durga Bhavani Plaza,|\r\n"
						+ "\t\t\t\t\t\t|         Ameerpet, Hyderabad        |\r\n"
						+ "\t\t\t\t\t\t|                                    |\r\n"
						+ "\t\t\t\t\t\t| EMAIL :                            |\r\n"
						+ "\t\t\t\t\t\t|     info@nareshit.com              |\r\n"
						+ "\t\t\t\t\t\t|                                    |\r\n"
						+ "\t\t\t\t\t\t| TEL :                              |\r\n"
						+ "\t\t\t\t\t\t|     +91 4023746666 (IN– Hyderabad) |\r\n"
						+ "\t\t\t\t\t\t|     +91 4023734842 (IN– Hyderabad) |\r\n"
						+ "\t\t\t\t\t\t|     +91 9000994007                 |\r\n"
						+ "\t\t\t\t\t\t|     +91 9000994008                 |\r\n"
						+ "\t\t\t\t\t\t|                                    |\r\n"
						+ "\t\t\t\t\t\t| FOR PROJECT :                      |\r\n"
						+ "\t\t\t\t\t\t|     +91 9000994005                 |\r\n"
						+ "\t\t\t\t\t\t|                                    |\r\n"
						+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
				System.out.print("\u001B[34m"+"\t\t\t\t\t PRESS 1 TO EXIT : ");
				String a=sc.next();
				
				switch(a)
				{
					case "1": 				
						 Hyderabad();
						 break;
						 
					default:
					{
					 System.out.println("\u001B[31m"+"Invalid input !!");
					 AboutHYD();
					}
				}
				//	sc.close();
		}
		public static void AboutCHENNAI() throws InterruptedException	
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\u001B[33m");			
			System.out.println("\u001B[33m"+"\t\t\t\t\t\t\t--------------------------------------\r\n"
					+" \t\t\t\t\t\t|              CHENNAI               |\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+" \t\t\t\t\t\t|------------------------------------|\r\n"
					+ "\t\t\t\t\t\t| India – Chennai Office             |\r\n"
					+ "\t\t\t\t\t\t|                                    |\r\n"
					+ "\t\t\t\t\t\t| ADDRESS :                          |\r\n"
					+ "\t\t\t\t\t\t|       2nd Floor Plot No.172 & 173, |\r\n"
					+ "\t\t\t\t\t\t|     Above Axis Bank, Behind PTC Bus|\r\n"
					+ "\t\t\t\t\t\t|     Stop,OMR,Thoraipakkam,TamilNadu|\r\n"
					+ "\t\t\t\t\t\t|       Chennai – 600097.            |\r\n"
					+ "\t\t\t\t\t\t|                                    |\r\n"
					+ "\t\t\t\t\t\t| EMAIL :                            |\r\n"
					+ "\t\t\t\t\t\t|     chennai@nareshit.com           |\r\n"
					+ "\t\t\t\t\t\t|                                    |\r\n"
					+ "\t\t\t\t\t\t| MOB/WAPP :                         |\r\n"
					+ "\t\t\t\t\t\t|     +91 9566042345                 |\r\n"
					+ "\t\t\t\t\t\t|                                    |\r\n"
					+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
			System.out.print("\u001B[34m"+"\t\t\t\t\t PRESS 1 TO EXIT : ");
			String a=sc.nextLine();
			
			switch(a)
			{
				case "1": 				
					Chennai();
					break;
					
				default:
				{
				 System.out.println("\u001B[31m"+"Invalid input !!");
				 AboutCHENNAI();
				}
			}
			//sc.close();
		}
		public static void AboutUSA() throws InterruptedException	
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("\u001B[33m");
			System.out.println("\u001B[33m"+"\t\t\t\t\t\t\t--------------------------------------\r\n"
						+" \t\t\t\t\t\t|                USA                 |\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+" \t\t\t\t\t\t|------------------------------------|\r\n"
						+ "\t\t\t\t\t\t| USA Office                         |\r\n"
						+ "\t\t\t\t\t\t|                                    |\r\n"
						+ "\t\t\t\t\t\t| ADDRESS :                          |\r\n"
						+ "\t\t\t\t\t\t|     5007 Arbor View Pkwy NW Acworth|\r\n"
						+ "\t\t\t\t\t\t|           ,GA, 30101               |\r\n"
						+ "\t\t\t\t\t\t|                                    |\r\n"
						+ "\t\t\t\t\t\t| EMAIL :                            |\r\n"
						+ "\t\t\t\t\t\t|     sriram@nareshit.com            |\r\n"
						+ "\t\t\t\t\t\t|                                    |\r\n"
						+ "\t\t\t\t\t\t| TEL :                              |\r\n"
						+ "\t\t\t\t\t\t|     +1 404-232-9879                |\r\n"
						+ "\t\t\t\t\t\t|     +1 248-522-6925                |\r\n"
						+ "\t\t\t\t\t\t|                                    |\r\n"
						+ "\t\t\t\t\t\t--------------------------------------\r\n");
			
				System.out.print("\u001B[34m"+"\t\t\t\t\t PRESS 1 TO EXIT : ");
				String a=sc.nextLine();
				
				switch(a)
				{
				case "1": 				
					Usa();
					break;
					
				default:
					{
					 System.out.println("\u001B[31m"+"Invalid input !!");
					 AboutUSA();
					}
				}
				//	sc.close();
			}
		public static void Payment() throws InterruptedException
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------\r\n"
    				+ "-------------------------------------------------------Welcome to Naresh IT Fee Potal------------------------------------------------------------------\r\n"
    				+ "----------------------------------------------------------------------------------------------------------------------------------------------------");
	    	System.out.println();
	    	System.out.println("Student Name : "+firstName+ " "+lastName);
	    	System.out.println("S.no \t\t\tCourse\t\t\tTeachers    \t\t\tTotalPrice  \t\t\tLocation");
	    	System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
	    	int total=0;
	    	
	    	for(int i=0;i<c;i++)
	    	{
	    		System.out.println("");
	    		Thread.sleep(700);
	    		
	    		System.out.println(i+1+"\t\t\t"+sub[i]+"\t\t\t"+teacher[i]+"\t\t"+totalfee[i]+"    \t\t\t"+location[i]);
	    		
	    		total=total+totalfee[i];
	    		
	    		System.out.println("");
	    		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
	    		
	    	}
	    	
	    	System.out.println("\t\t\t\t\t\t\t\t    TOTAL FEE = "+total);
	    	System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------");
	    	System.out.println();
	    	System.out.println("\t\t\t======================================< ƭɦαɳҡ ყσµ >======================================");
	    	System.out.println("\t\t\t======================================< 𝙑𝙞𝙨𝙞𝙩 𝘼𝙜𝙖𝙞𝙣 >======================================");
	    	
	    	System.out.println("-------------------------------------------------------------------------------------------------------------------------");
	    	System.out.println("============================================= █▓▒▒░░░  𝒯𝒽𝒶𝓃𝓀 𝒴𝑜𝓊 𝒰𝓈𝒾𝓃𝑔  𝒢𝒮𝒢  ░░░▒▒▓█ ====================================");
	    	
	    	System.out.println("\u001B[34m"+"Press 1 For Back ");
	    	String op=sc.next();
	    	
	    	switch(op)
			{
			case "1":	
				profile(); 
				break;
			
			default:
				System.out.println("\u001B[31m"+"!! Invaild Option !!");
				Payment();
			}
	    	//sc.close();
	    	//System.out.println(name+"     "+address+"     "+mobile);
			}
		public static void Exit() throws InterruptedException
			 {
				System.out.println("\u001B[31m"+"$$$$$$$$\\ $$\\   $$\\  $$$$$$\\  $$\\   $$\\ $$\\   $$\\                                                                                                        \r\n"
						+ "\\__$$  __|$$ |  $$ |$$  __$$\\ $$$\\  $$ |$$ | $$  |                                                                                                       \r\n"
						+ "   $$ |   $$ |  $$ |$$ /  $$ |$$$$\\ $$ |$$ |$$  /                                                                                                        \r\n"
						+ "   $$ |   $$$$$$$$ |$$$$$$$$ |$$ $$\\$$ |$$$$$  /                                                                                                         \r\n"
						+ "   $$ |   $$  __$$ |$$  __$$ |$$ \\$$$$ |$$  $$<                                                                                                          \r\n"
						+ "   $$ |   $$ |  $$ |$$ |  $$ |$$ |\\$$$ |$$ |\\$$\\                                                                                                         \r\n"
						+ "   $$ |   $$ |  $$ |$$ |  $$ |$$ | \\$$ |$$ | \\$$\\                                                                                                        \r\n"
						+ "   \\__|   \\__|  \\__|\\__|  \\__|\\__|  \\__|\\__|  \\__|    ");
				
				Thread.sleep(700);
				System.out.println("\u001B[36m"+"                                                                                                                                                         \r\n"
						+ "                                    $$\\     $$\\  $$$$$$\\  $$\\   $$\\                                                                                      \r\n"
						+ "                                    \\$$\\   $$  |$$  __$$\\ $$ |  $$ |                                                                                     \r\n"
						+ "                                     \\$$\\ $$  / $$ /  $$ |$$ |  $$ |                                                                                     \r\n"
						+ "                                      \\$$$$  /  $$ |  $$ |$$ |  $$ |                                                                                     \r\n"
						+ "                                       \\$$  /   $$ |  $$ |$$ |  $$ |                                                                                     \r\n"
						+ "                                        $$ |    $$ |  $$ |$$ |  $$ |                                                                                     \r\n"
						+ "                                        $$ |     $$$$$$  |\\$$$$$$  |                                                                                     \r\n"
						+ "                                        \\__|     \\______/  \\______/   ");
				
				Thread.sleep(700);
				System.out.println("\u001B[32m"+"                                                                                                                                                         \r\n"
						+ "                                                                                                                                                         \r\n"
						+ "                                                                                                                                                         \r\n"
						+ "                                                            $$$$$$$$\\  $$$$$$\\  $$$$$$$\\                                                                 \r\n"
						+ "                                                            $$  _____|$$  __$$\\ $$  __$$\\                                                                \r\n"
						+ "                                                            $$ |      $$ /  $$ |$$ |  $$ |                                                               \r\n"
						+ "                                                            $$$$$\\    $$ |  $$ |$$$$$$$  |                                                               \r\n"
						+ "                                                            $$  __|   $$ |  $$ |$$  __$$<                                                                \r\n"
						+ "                                                            $$ |      $$ |  $$ |$$ |  $$ |                                                               \r\n"
						+ "                                                            $$ |       $$$$$$  |$$ |  $$ |                                                               \r\n"
						+ "                                                            \\__|       \\______/ \\__|  \\__|                                                               \r\n"
						+ "");
				
				Thread.sleep(700);
				System.out.println("\u001B[33m"+"                                                                                                                                                         \r\n"
						+ "                                                                               /$$    /$$ /$$$$$$  /$$$$$$  /$$$$$$ /$$$$$$$$ /$$$$$$ /$$   /$$  /$$$$$$ \r\n"
						+ "                                                                              | $$   | $$|_  $$_/ /$$__  $$|_  $$_/|__  $$__/|_  $$_/| $$$ | $$ /$$__  $$\r\n"
						+ "                                                                              | $$   | $$  | $$  | $$  \\__/  | $$     | $$     | $$  | $$$$| $$| $$  \\__/\r\n"
						+ "                                                                              |  $$ / $$/  | $$  |  $$$$$$   | $$     | $$     | $$  | $$ $$ $$| $$ /$$$$\r\n"
						+ "                                                                               \\  $$ $$/   | $$   \\____  $$  | $$     | $$     | $$  | $$  $$$$| $$|_  $$\r\n"
						+ "                                                                                \\  $$$/    | $$   /$$  \\ $$  | $$     | $$     | $$  | $$\\  $$$| $$  \\ $$\r\n"
						+ "                                                                                 \\  $/    /$$$$$$|  $$$$$$/ /$$$$$$   | $$    /$$$$$$| $$ \\  $$|  $$$$$$/\r\n"
						+ "                                                                                  \\_/    |______/ \\______/ |______/   |__/   |______/|__/  \\__/ \\______/ \r\n"
						+ "                                                                                                                                                         ");
				
				Thread.sleep(700);
				System.out.println("\n\n\n");
				System.out.println("\u001B[36m"+" ██████   ██████  ██    ██ ██████   █████  ██    ██                                                \r\n"
						+ "██       ██    ██ ██    ██ ██   ██ ██   ██ ██    ██                                                \r\n"
						+ "██   ███ ██    ██ ██    ██ ██████  ███████ ██    ██                                                \r\n"
						+ "██    ██ ██    ██ ██    ██ ██   ██ ██   ██  ██  ██                                                 \r\n"
						+ " ██████   ██████   ██████  ██   ██ ██   ██   ████                                                  \r\n"
						+ "                                                                                                   ");
				
				Thread.sleep(700);
				System.out.println("\u001B[35m"+"                                                                                                   \r\n"
						+ "                             ██████  ██    ██ ███    ██      ██ ██ ████████                        \r\n"
						+ "                            ██       ██    ██ ████   ██      ██ ██    ██                           \r\n"
						+ "                            ██   ███ ██    ██ ██ ██  ██      ██ ██    ██                           \r\n"
						+ "                            ██    ██ ██    ██ ██  ██ ██ ██   ██ ██    ██                           \r\n"
						+ "                             ██████   ██████  ██   ████  █████  ██    ██                           \r\n"
						+ "                                                                                                   ");
				
				Thread.sleep(700);
				System.out.println("\u001B[33m"+"                                                                                                  \r\n"
						+ "                                                    ███████ ██   ██ ██ ██    ██  █████  ███    ███ \r\n"
						+ "                                                    ██      ██   ██ ██ ██    ██ ██   ██ ████  ████ \r\n"
						+ "                                                    ███████ ███████ ██ ██    ██ ███████ ██ ████ ██ \r\n"
						+ "                                                         ██ ██   ██ ██  ██  ██  ██   ██ ██  ██  ██ \r\n"
						+ "                                                    ███████ ██   ██ ██   ████   ██   ██ ██      ██ \r\n"
						+ "                                                                                                   \r\n"
						+ "                                                                                                   ");
	
	//			Thread.sleep(700);			
	//			Thread.sleep(700);
	//			System.out.println("\n\n\n");
	//			System.out.println("──────▄▀▀▄────────────────▄▀▀▄────\r\n"
	//					+ "─────▐▒▒▒▒▌──────────────▌▒▒▒▒▌───\r\n"
	//					+ "─────▌▒▒▒▒▐─────────────▐▒▒▒▒▒▐───\r\n"
	//					+ "────▐▒▒▒▒▒▒▌─▄▄▄▀▀▀▀▄▄▄─▌▒▒▒▒▒▒▌──\r\n"
	//					+ "───▄▌▒▒▒▒▒▒▒▀▒▒▒▒▒▒▒▒▒▒▀▒▒▒▒▒▒▐───\r\n"
	//					+ "─▄▀▒▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌───\r\n"
	//					+ "▐▒▒▒▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▐───\r\n"
	//					+ "▌▒▒▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌──\r\n"
	//					+ "▒▒▐▒▒▒▒▒▒▒▒▒▄▀▀▀▀▄▒▒▒▒▒▄▀▀▀▀▄▒▒▐──\r\n"
	//					+ "▒▒▌▒▒▒▒▒▒▒▒▐▌─▄▄─▐▌▒▒▒▐▌─▄▄─▐▌▒▒▌─\r\n"
	//					+ "▒▐▒▒▒▒▒▒▒▒▒▐▌▐█▄▌▐▌▒▒▒▐▌▐█▄▌▐▌▒▒▐─\r\n"
	//					+ "▒▌▒▒▒▒▒▒▒▒▒▐▌─▀▀─▐▌▒▒▒▐▌─▀▀─▐▌▒▒▒▌\r\n"
	//					+ "▒▌▒▒▒▒▒▒▒▒▒▒▀▄▄▄▄▀▒▒▒▒▒▀▄▄▄▄▀▒▒▒▒▐\r\n"
	//					+ "▒▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▄▄▄▒▒▒▒▒▒▒▒▒▒▒▐\r\n"
	//					+ "▒▌▒▒▒▒▒▒▒▒▒▒▒▒▀▒▀▒▒▒▀▒▒▒▀▒▀▒▒▒▒▒▒▐\r\n"
	//					+ "▒▌▒▒▒▒▒▒▒▒▒▒▒▒▒▀▒▒▒▄▀▄▒▒▒▀▒▒▒▒▒▒▒▐\r\n"
	//					+ "▒▐▒▒▒▒▒▒▒▒▒▒▀▄▒▒▒▄▀▒▒▒▀▄▒▒▒▄▀▒▒▒▒▐\r\n"
	//					+ "▒▓▌▒▒▒▒▒▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒▐\r\n"
	//					+ "▒▓▓▌▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌\r\n"
	//					+ "▒▒▓▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌─\r\n"
	//					+ "▒▒▓▓▀▀▄▄▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▐──\r\n"
	//					+ "▒▒▒▓▓▓▓▓▀▀▄▄▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▄▄▀▀▒▌─\r\n"
	//					+ "▒▒▒▒▒▓▓▓▓▓▓▓▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▒▒▒▒▒▐─\r\n"
	//					+ "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▌\r\n"
	//					+ "▒▒▒▒▒▒▒█▒█▒█▀▒█▀█▒█▒▒▒█▒█▒█▒▒▒▒▒▒▐\r\n"
	//					+ "▒▒▒▒▒▒▒█▀█▒█▀▒█▄█▒▀█▒█▀▒▀▀█▒▒▒▒▒▒▐\r\n"
	//					+ "▒▒▒▒▒▒▒▀▒▀▒▀▀▒▀▒▀▒▒▒▀▒▒▒▀▀▀▒▒▒▒▒▒▐\r\n"
	//					+ "█▀▄▒█▀▄▒█▀▒█▀█▒▀█▀▒█▒█▒█▒█▄▒█▒▄▀▀▐\r\n"
	//					+ "█▀▄▒█▀▄▒█▀▒█▄█▒▒█▒▒█▀█▒█▒█▀██▒█▒█▐\r\n"
	//					+ "▀▀▒▒▀▒▀▒▀▀▒▀▒▀▒▒▀▒▒▀▒▀▒▀▒▀▒▒▀▒▒▀▀▐");
	//			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
	//			
				Thread.sleep(700);
				System.out.println("\u001B[32m"+"                                                                                                              ▄▌▐▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀​▀▀▀▀▀▀▌ \r\n"
						+ "                                                                                                             ██▌█ Bye Bye \r\n"
						+ "                                                                                                        ▄▄▄▌▐██▌█ JAVA IS AWESOME \r\n"
						+ "                                                                                                        ███████▌█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄​▄▄▄▄▄▄▌ \r\n"
						+ "                                                                                                        ▀(@)▀▀▀▀▀▀▀(@)(@)▀▀▀▀▀▀▀▀▀▀▀▀▀​▀▀▀▀(@)▀");
				
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
				Thread.sleep(9);
				System.out.println("");
			}
}
