package com.xworkz.association.boot;

import com.xworkz.association.thing.Money;
import com.xworkz.association.thing.Wallet;

public class WalletRunner {

	public static void main(String[] args) {
		Wallet wallet = new Wallet();
		wallet.init("Black", 2000);
		Money money = new Money();
		money.init(true, false);
		wallet.init(money);
		wallet.show();
	}

}
