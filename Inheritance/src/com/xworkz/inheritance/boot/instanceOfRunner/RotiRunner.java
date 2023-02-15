package com.xworkz.inheritance.boot.instanceOfRunner;

import com.xworkz.inheritance.thing.instanceOf.ButterRoti;
import com.xworkz.inheritance.thing.instanceOf.JowarRoti;
import com.xworkz.inheritance.thing.instanceOf.Kulcha;
import com.xworkz.inheritance.thing.instanceOf.Naan;
import com.xworkz.inheritance.thing.instanceOf.OnionMasalaRagiRoti;
import com.xworkz.inheritance.thing.instanceOf.OnionRagiRoti;
import com.xworkz.inheritance.thing.instanceOf.RagiRoti;
import com.xworkz.inheritance.thing.instanceOf.Roti;

public class RotiRunner {

	public static void main(String[] args) {
//OnionMasalaRagiRoti

		OnionMasalaRagiRoti masala = new OnionMasalaRagiRoti();
		String shape6 = masala.getShape();
		int calories4 = masala.getCalories();
		int weight3 = masala.getWeight();
		int thickness1 = masala.getThickness();
		System.out.println("shape in OnionMasalaRagiRoti: " + shape6);
		System.out.println("calories in OnionMasalaRagiRoti: " + calories4);
		System.out.println("weight in OnionMasalaRagiRoti: " + weight3);
		System.out.println("thickness in OnionMasalaRagiRoti: " + thickness1);

		OnionRagiRoti onion1 = new OnionMasalaRagiRoti();
		String shape7 = onion1.getShape();
		int calories5 = onion1.getCalories();
		int weight4 = onion1.getWeight();
		System.out.println("shape in OnionMasalaRagiRoti using OnionRagiRoti: " + shape7);
		System.out.println("calories in OnionMasalaRagiRoti using OnionRagiRoti: " + calories5);
		System.out.println("weight in OnionMasalaRagiRoti using OnionRagiRoti: " + weight4);
		if (onion1 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti casted1 = (OnionMasalaRagiRoti) masala;
			int thickness2 = casted1.getThickness();
			System.out.println(thickness2);
		} else {
			System.err.println("Not ref to onion1");
		}

		RagiRoti ragi4 = new OnionMasalaRagiRoti();
		System.out.println(ragi4.getShape());
		System.out.println(ragi4.getCalories());
		if (ragi4 instanceof OnionRagiRoti) {
			OnionRagiRoti casted6 = (OnionRagiRoti) ragi4;
			System.out.println(casted6.getWeight());
		}
		if (ragi4 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti casted7 = (OnionMasalaRagiRoti) ragi4;
			System.out.println(casted7.getThickness());
		}

		Roti roti4 = new OnionMasalaRagiRoti();
		System.out.println(roti4.getShape());
		if (roti4 instanceof RagiRoti) {
			RagiRoti casted5 = (RagiRoti) roti4;
			System.out.println(casted5.getCalories());
		}
		if (roti4 instanceof OnionRagiRoti) {
			OnionRagiRoti casted6 = (OnionRagiRoti) roti4;
			System.out.println(casted6.getWeight());
		}
		if (roti4 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti casted7 = (OnionMasalaRagiRoti) roti4;
			System.out.println(casted7.getThickness());
		}

//OnionRagiRoti

		OnionRagiRoti onion = new OnionRagiRoti();
		String shape4 = onion.getShape();
		System.out.println("Shape4 in OnionRoti: " + shape4);
		int calories2 = onion.getCalories();
		System.out.println("Calories2 in OnionRagiRoti: " + calories2);
		int weight = onion.getWeight();
		System.out.println("Weight in OnionRagiRoti: " + weight);

		RagiRoti ragi2 = new OnionRagiRoti();
		String shape5 = ragi2.getShape();
		System.out.println("Shape1 in OnionRagiRoti using  ragi roti: " + shape5);
		int calories3 = ragi2.getCalories();
		System.out.println("Calories3 in OnionRagiRoti using ragi roti: " + calories3);
		if (ragi2 instanceof RagiRoti) {
			OnionRagiRoti casted2 = (OnionRagiRoti) ragi2;
			System.out.println(casted2.getWeight());
		} else {
			System.out.println("null");
		}
		if (ragi2 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti casted7 = (OnionMasalaRagiRoti) ragi2;
			System.out.println(casted7.getThickness());
		}

		Roti roti5 = new OnionRagiRoti();
		System.out.println(roti5.getShape());
		if (roti5 instanceof RagiRoti) {
			RagiRoti casted5 = (RagiRoti) roti5;
			System.out.println(casted5.getCalories());
		}
		if (roti5 instanceof OnionRagiRoti) {
			OnionRagiRoti casted6 = (OnionRagiRoti) roti5;
			System.out.println(casted6.getWeight());
		}
		if (roti5 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti casted7 = (OnionMasalaRagiRoti) roti5;
			System.out.println(casted7.getThickness());
		}
//RagiRoti
		RagiRoti ragi = new RagiRoti();
		System.out.println(ragi.getShape());
		System.out.println(ragi.getCalories());
		if (ragi instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti casted7 = (OnionMasalaRagiRoti) ragi;
			System.out.println(casted7.getThickness());
		}
		if (ragi instanceof OnionRagiRoti) {
			OnionRagiRoti casted6 = (OnionRagiRoti) ragi;
			System.out.println(casted6.getWeight());
		}

		Roti roti6 = new RagiRoti();
		roti6.getShape();
		if (roti6 instanceof RagiRoti) {
			RagiRoti casted5 = (RagiRoti) roti6;
			System.out.println(casted5.getCalories());
		}
		if (roti6 instanceof OnionRagiRoti) {
			OnionRagiRoti casted6 = (OnionRagiRoti) roti6;
			System.out.println(casted6.getWeight());
		}
		if (roti6 instanceof OnionMasalaRagiRoti) {
			OnionMasalaRagiRoti casted7 = (OnionMasalaRagiRoti) roti6;
			System.out.println(casted7.getThickness());
		}
//JowarRoti

		JowarRoti jowar = new JowarRoti();
		System.out.println(jowar.getShape());
		System.out.println(jowar.getLength());
		System.out.println(jowar.getPrice());

		ButterRoti butter = new JowarRoti();
		System.out.println(butter.getShape());
		System.out.println(butter.getLength());
		if (butter instanceof JowarRoti) {
			JowarRoti casted8 = (JowarRoti) butter;
			System.out.println(casted8.getPrice());
		}
		Roti roti7 = new JowarRoti();
		System.out.println(roti7.getShape());
		if (roti7 instanceof JowarRoti) {
			JowarRoti casted8 = (JowarRoti) butter;
			System.out.println(casted8.getPrice());
		}
		if (roti7 instanceof ButterRoti) {
			ButterRoti casted9 = (ButterRoti) roti7;
			System.out.println(casted9.getLength());
		}

// ButterRoti

		ButterRoti butter1 = new ButterRoti();
		butter1.getShape();
		butter1.getLength();
		if (butter1 instanceof JowarRoti) {
			JowarRoti casted10 = (JowarRoti) butter1;
			System.out.println(casted10.getPrice());
		}

		Roti roti8 = new ButterRoti();
		System.out.println(roti7.getShape());
		if (roti8 instanceof JowarRoti) {
			JowarRoti casted11 = (JowarRoti) butter;
			System.out.println(casted11.getPrice());
		}
		if (roti8 instanceof ButterRoti) {
			ButterRoti casted12 = (ButterRoti) roti7;
			System.out.println(casted12.getLength());
		}

//Kulcha
		Kulcha kulcha = new Kulcha();
		kulcha.getShape();
		kulcha.getLength();

		Naan naan1 = new Kulcha();
		naan1.getShape();
		naan1.getLength();

		ButterRoti butter2 = new Kulcha();
		butter2.getShape();
		butter2.getLength();

		Roti roti9 = new Kulcha();
		roti9.getShape();
		if (roti9 instanceof ButterRoti) {
			ButterRoti casted13 = (ButterRoti) roti9;
			System.out.println(casted13.getLength());
		}

//Naan
		Naan naan2 = new Naan();
		naan2.getShape();
		naan2.getLength();

		ButterRoti butter3 = new Naan();
		butter3.getShape();
		butter3.getLength();

		Roti roti10 = new Roti();
		roti10.getShape();
		if (roti10 instanceof ButterRoti) {
			ButterRoti casted14 = (ButterRoti) roti10;
			System.out.println(casted14.getLength());
		}

	}

}
