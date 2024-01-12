package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.service.*;

import com.demo.model.Myuser;
import com.demo.service.UserServiceImpl;

public class TestCrudDemo {

	public static void main(String[] args) {
		
		int choice=0;
		Scanner sc=new Scanner(System.in);
		UserServiceImpl us=new UserServiceImpl();
		do
		{
			System.out.println("1.Add new User \n 2.Display all user \n 3. Dispaly by id");
			System.out.println("4.Delete by id \n 5. Update by id \n 6.Sort by id \n 7.exit");
			System.out.println("Choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1: us.addnewUser();
			break;
			
			case 2:
				List<Myuser> ulist=us.getAllUser();
				ulist.forEach(System.out::println);
				break;
				
			case 3: 
				System.out.println("enter userid to search");
				int uid=sc.nextInt();
				Myuser u=us.getById(uid);
				if(u!=null)
				{
					System.out.println(u);
				}
				else
				{
					System.out.println("not found");
				}
				break;
				
			case 4:
				
				
				System.out.println("enter userid to search");
				uid=sc.nextInt();
				boolean status=us.removeById(uid);
				if(status)
				{
					System.out.println("deleted successfully");
				}
				else
				{
					System.out.println("id not found");
				}
				break;
				
			case 5:
				
		
				System.out.println("enter userid to update");
				uid=sc.nextInt();
				System.out.println("enter username to update");
				String unm=sc.next();
				System.out.println("enter street");
				String street=sc.next();
				status=us.modifyById(uid,unm,street);
				if(status)
				{
					System.out.println("modified successfully");
				}
				else
				{
					System.out.println("not found");
				}
				break;
				
			case 6:
				ulist=us.sortById();
				ulist.forEach(System.out::println);
				break;
				
			case 7:
				us.closeMySessionFactory();
				System.out.println("thank you for visiting!!");
				break;
				
				
				default:
					System.out.println("wrong choice");
				
			}
		}
		while(choice!=7);
		
		
		
		
		
	}

}
