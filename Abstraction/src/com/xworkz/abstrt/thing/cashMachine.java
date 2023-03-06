package com.xworkz.abstrt.thing;

public class cashMachine extends Atm {

	@Override
	public void checkBalance() {

		System.out.println("CheckBalance method...");
	}

	@Override
	public void language() {
		System.out.println("Language Method...");

	}

	@Override
	public void account() {
		System.out.println("account method");

	}

	@Override
	public void withdraw() {
		System.out.println("withdraw method...");
	}

	@Override
	public void password() {
		System.out.println("Password method....");
	}

	@Override
	public void miniStatement() {
		System.out.println("mini Statement method....");
	}

	@Override
	public void cancel() {
		System.out.println("Cancel Method....");
	}

	@Override
	public void accountType() {
		System.out.println("Account type method....");
	}

	@Override
	public void debit() {
		System.out.println("Debit method...");
	}

	@Override
	public void credit() {
		System.out.println("Credit method...");
	}
}
