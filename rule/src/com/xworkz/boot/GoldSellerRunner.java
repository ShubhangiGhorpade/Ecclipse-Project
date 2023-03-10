package com.xworkz.boot;

import com.xworkz.implementor.Abharan;
import com.xworkz.implementor.DevendraSetu;
import com.xworkz.implementor.Mahalaxmi;
import com.xworkz.implementor.Malabar;
import com.xworkz.rule.GoldSeller;
import com.xworkz.usage.Anita;
import com.xworkz.usage.Bhairavi;
import com.xworkz.usage.Priyanka;
import com.xworkz.usage.Shruti;

public class GoldSellerRunner {

	public static void main(String[] args) {
		GoldSeller gold = new Mahalaxmi();

		Anita anita = new Anita(gold);
		anita.buyGold();
		System.out.println("   ");

		GoldSeller gold1 = new Malabar();

		Priyanka priyanka = new Priyanka(gold1);
		priyanka.purchaseGold();

		System.out.println("   ");
		GoldSeller gold2 = new DevendraSetu();

		Shruti shruti = new Shruti(gold2);
		shruti.chinnaTago();
		System.out.println("   ");
		GoldSeller gold3 = new Abharan();

		Bhairavi bhairavi = new Bhairavi(gold3);
		bhairavi.bangaraKaridi();
	}

}
