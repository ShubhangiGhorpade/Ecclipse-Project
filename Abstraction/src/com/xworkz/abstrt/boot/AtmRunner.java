package com.xworkz.abstrt.boot;

import com.xworkz.abstrt.thing.cashMachine;

public class AtmRunner {

	public static void main(String[] args) {
		cashMachine cash = new cashMachine();
		cash.account();
		cash.accountType();
		cash.cancel();
		cash.checkBalance();
		cash.credit();
		cash.debit();
		cash.language();
		cash.miniStatement();
		cash.password();
		cash.withdraw();

	}

}
