package com.cg.pb.pl;

import java.util.Scanner;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Customer;
import com.cg.pb.service.CustomerServiceImplementation;
import com.cg.pb.service.TransactionServiceImplementation;

public class BankDemo {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		Customer customer=new Customer();
		Account account=new Account();
		CustomerServiceImplementation csi = new CustomerServiceImplementation();
		TransactionServiceImplementation tsi = new TransactionServiceImplementation();
		while(true) {
			System.out.println("1. Account\n"
					+ "2. Transaction\n"
					+ "3. Passbook\n"
					+ "4. Loan");
			int opt=scr.nextInt();
			switch(opt) {
			case 1:
				System.out.println("1. add Customer\n"
						+ "2. View Customer\n"
						+ "3. For Update");
				int opt1=scr.nextInt();
				switch(opt1) {
					case 1:
						System.out.println("Enter Customer Name");
						String name=scr.next();
						System.out.println("Enter Customer Aadhar");
						String aadhar=scr.next();
						System.out.println("Enter Customer DOB");
						String dob=scr.next();
						System.out.println("Enter Customer PAN");
						String pan=scr.next();
						System.out.println("Enter Customer Gender");
						String gender=scr.next();
						System.out.println("Enter Customer Address line 1");
						String address1=scr.next();
						System.out.println("Enter Customer Address line 2");
						String address2=scr.next();
						System.out.println("Enter Customer Account Number");
						String accNo=scr.next();
						System.out.println("Enter Customer Balance");
						String balance=scr.next();
						
						customer.setName(name);
						customer.setAadhar(aadhar);
						customer.setDOB(dob);
						customer.setPAN(pan);
						customer.setGender(gender);
						customer.setAddressLine1(address1);
						customer.setAddressLine2(address2);
						account.setAccNo(Double.parseDouble(accNo));
						account.setBalance(Integer.parseInt(balance));
						csi.addCustomerDetails(customer);
						break;
					case 2:
						csi.getCustomer();
						break;
					case 3:
						System.out.println("Enter Name:");
						String name1=scr.next();
						customer.setName(name1);
						csi.updateCustomer(account, customer);
						}
				break;
			case 2:
					System.out.println("1.credit amount using slip\n"
							+ "2.debit amount using slip \n"
							+ "3. credit amount using cheque\n"
							+ "4.dedit amount using cheque\n"
							+ "5.check balance");
					System.out.println("enter option");
					int opt2=scr.nextInt();
					switch(opt2) {
					case 1:
						  
						  System.out.println("enter account number..");
						  Double actNo=scr.nextDouble();
						  System.out.println("enter amount you want to deposite");
						  int amount=scr.nextInt();
						  
						  tsi.creditUsingSlip(account.getBalance());
						  break;
					case 2:
						  System.out.println("enter account number..");
						  Double actNo2=scr.nextDouble();
						  System.out.println("enter amount to deposite");
						  Double amount2=scr.nextDouble();
						  
						  
						  
						  tsi.debitUsingSlip(account.getBalance());
						  break;
					case 3:
						  System.out.println("enter account number..");
						  Double actNo3=scr.nextDouble();
						  System.out.println("enter beneficiary account number..");
						  Double beneficiaryAcNo=scr.nextDouble();
						  System.out.println("enter amount to deposite");
						  Double amount3=scr.nextDouble();
						  System.out.println("enter check number ");
						  int checkNum=scr.nextInt();
						  System.out.println("enter bank name");
						  String bankname=scr.next();
						  System.out.println("enter ifsc code");
						  int ifsc=scr.nextInt();
						  System.out.println("cheque issue date");
						  String chequeIssuedate=scr.next();
						  
						  tsi.creditUsingCheque();
						  break;
						  
					case 4:
						  System.out.println("enter account number..");
						  Double actNo4=scr.nextDouble();
						  
						  System.out.println("enter amount to deposite");
						  Double amount4=scr.nextDouble();
						  System.out.println("enter check number ");
						  int checkNum2=scr.nextInt();
						  System.out.println("enter bank name");
						  String bankname2=scr.next();
						  System.out.println("enter ifsc code");
						  int ifsc2=scr.nextInt();
						  System.out.println("cheque issue date");
						  String chequeIssuedate2=scr.next();
						  
						  tsi.debitUsingCheque();
						  
					
						default:
							System.out.println("Thanks for using");
						  
						  
						  scr.close();
						  
						  
					}
				
			}
		}
	}
}
