package com.cg.pb.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.cg.pb.bean.Passbook;

public class PassbookServiceImplementation implements PassbookService {

	static ArrayList<Passbook> list = new ArrayList<>();

	@Override
	public void accountSummary(double accNo, LocalDate startdate, LocalDate enddate) {

		long numOfDaysBetween = ChronoUnit.DAYS.between(startdate, enddate);
//	    return IntStream.iterate(0, i -> i + 1).limit(numOfDaysBetween).mapToObj(i -> startdate.plusDays(i)).collect(Collectors.toList());

	}

	public static void getAllTransactions(double actNO) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccNo() == actNO) {
				System.out.println(list.get(i).getPassBook());
			} else {
				System.out.println("Invalid Account No / No Transaction Found");
				break;
			}

		}
	}

	public void storeTransaction(Passbook pb) {
		list.add(pb);
	}

}
