package com.cg.pb.pl;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;
import com.cg.pb.service.AccountServiceImplementation;
import com.cg.pb.service.CustomerServiceImplementation;
import com.cg.pb.service.TransactionServiceImplementation;
import com.cg.pb.utilities.Utilities;

public class BankDemo {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		AccountServiceImplementation asi = new AccountServiceImplementation();
		CustomerServiceImplementation csi = new CustomerServiceImplementation();
		TransactionServiceImplementation tsi = new TransactionServiceImplementation();
		while(true) {
			Customer customer=new Customer();
			Account account=new Account();
			Address address=new Address();
			System.out.println("1. Account\n"
					+ "2. Transaction\n"
					+ "3. Passbook\n"
					+ "4. Loan");
			int opt=scr.nextInt();
			switch(opt) {
			case 1:
				System.out.println("1. add Customer\n"
						+ "2. View Customer\n"
						+ "3. For Update\n"
						+ "4. Delete Customer Account");
				int opt1=scr.nextInt();
				switch(opt1) {
					case 1:
						while(true) {
							System.out.println("Enter Customer Name");
							String name=scr.next();
							boolean flag = Utilities.nameValidate(name);
							if(!flag)
								System.out.println("Only 3-10 digit alphabet allowed");
							else
								break;
							customer.setName(name);
						}
						while(true) {
							System.out.println("Enter Customer Aadhar");
							String aadhar=scr.next();
							boolean flag = Utilities.aadharValidate(aadhar);
							if(!flag)
								System.out.println("Only 12 digit number allowed");
							else
								break;
							customer.setAadhar(Double.parseDouble(aadhar));
							
						}
						
						
						System.out.println("Enter Customer DOB");
						String dob=scr.next();
						
						customer.setDOB(dob);
						
						while(true) {
							System.out.println("Enter Customer PAN");
							String pan=scr.next();
							boolean flag = Utilities.panValidate(pan);
							if(!flag)
								System.out.println("Wrong Pan Detail");
							else
								break;
							customer.setPAN(pan);
							
						}
						
						System.out.println("Enter Customer Gender");
						String gender=scr.next();
						System.out.println("Enter Customer Address line 1");
						String addressline1=scr.next();
						System.out.println("Enter Customer Address line 2");
						String addressline2=scr.next();
						System.out.println("Enter City");
						String city=scr.next();
						System.out.println("Enter State");
						String state=scr.next();
						System.out.println("Enter ZipCode");
						String zipcode=scr.next();
						while(true) {
							System.out.println("Enter Account No");
							String accNo = scr.next();
							boolean flag = Utilities.accNoValidate(accNo);
							if(!flag)
								System.out.println("Only 12 digit number allowed");
							else
								break;
							account.setAccNo(Double.parseDouble(accNo));
						}
						System.out.println("Enter Customer Balance");
						String balance=scr.next();
						
						
						
						
						customer.setGender(gender);
						address.setAddressline1(addressline1);
						address.setAddressline2(addressline2);
						address.setCity(city);
						address.setState(state);
						address.setZipcode(zipcode);
						
						account.setBalance(Integer.parseInt(balance));
						account.setCustomer(customer);
						account.setAddress(address);
						asi.addAccount(account,customer,address);
						break;
					case 2:
						System.out.println("Enter Account Number");
						int accNo1=scr.nextInt();
						asi.getAccount(accNo1);
						break;
					case 3:
						System.out.println("Enter Account Number You want to make change:");
						String updAccNo=scr.next();
						account.setAccNo(Double.parseDouble(updAccNo));
						System.out.println("Choose the following you want to change:\n"
								+ "1. Name\n"
								+ "2. Contact\n"
								+ "3. Address");
						int opt3=scr.nextInt();
						switch(opt3) {
						case 1:
							System.out.println("Enter Name:");
							String name1=scr.next();
							customer.setName(name1);
							csi.updateCustomerName(account, customer);
							break;
						case 2:
							System.out.println("Enter Contact:");
							String contact1=scr.next();
							customer.setContact(Double.parseDouble(contact1));
							csi.updateCustomerContact(account, customer);
							break;
						case 3:
							System.out.println("Enter Address Line 1:");
							String address1=scr.next();
							System.out.println("Enter Address Line 2:");
							String address2=scr.nextLine();
							System.out.println("Enter City:");
							String city1=scr.nextLine();
							System.out.println("Enter State:");
							String state1=scr.nextLine();
							System.out.println("Enter Zipcode:");
							String zipcode1=scr.nextLine();
							address.setAddressline1(address1);
							address.setAddressline2(address2);
							address.setCity(city1);
							address.setState(state1);
							address.setZipcode(zipcode1);
							csi.updateCustomerAddress(account, address);
							break;
						default:
							System.out.println("Choose appropiate value");
							break;
						}
						break;
						
						
					case 4:
						System.out.println("Enter Account Number");
						int delAccNo=scr.nextInt();
						System.out.println(asi.deleteAccount(delAccNo));
						break;
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
