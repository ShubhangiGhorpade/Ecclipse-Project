package com.xworkz.usingBean.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.usingBean.configuration.ComponentConfiguration;
import com.xworkz.usingBean.thing.Beach;
import com.xworkz.usingBean.thing.Burger;
import com.xworkz.usingBean.thing.BussinessProposal;
import com.xworkz.usingBean.thing.Chicken;
import com.xworkz.usingBean.thing.DiamondRing;
import com.xworkz.usingBean.thing.Dog;
import com.xworkz.usingBean.thing.KajuKatli;
import com.xworkz.usingBean.thing.Music;
import com.xworkz.usingBean.thing.Noodles;
import com.xworkz.usingBean.thing.Party;
import com.xworkz.usingBean.thing.PeriPeri;
import com.xworkz.usingBean.thing.RealMe;
import com.xworkz.usingBean.thing.TheHeir;

public class ComponentRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(
				ComponentConfiguration.class);

		System.out.println(spring.getBeanDefinitionCount());
		Stream.of(spring.getBeanDefinitionNames())
				.forEach(System.out::println);

		Beach bean = spring.getBean(Beach.class);
		String beachs = bean.beachs();
		System.out.println(beachs);

		Burger bean2 = spring.getBean(Burger.class);
		String fan = bean2.fan();
		System.out.println(fan);

		BussinessProposal bean3 = spring
				.getBean(BussinessProposal.class);
		String proposal = bean3.proposal();
		System.out.println(proposal);

		Chicken bean4 = spring.getBean(Chicken.class);
		String hick = bean4.hick();
		System.out.println(hick);

		DiamondRing bean5 = spring
				.getBean(DiamondRing.class);
		String ring = bean5.ring();
		System.out.println(ring);

		Dog bean6 = spring.getBean(Dog.class);
		String pet = bean6.pet();
		System.out.println(pet);

		KajuKatli bean7 = spring.getBean(KajuKatli.class);
		String kaju = bean7.kaju();
		System.out.println(kaju);

		Music bean8 = spring.getBean(Music.class);
		String song = bean8.song();
		System.out.println(song);

		Noodles bean9 = spring.getBean(Noodles.class);
		String maggie = bean9.maggie();
		System.out.println(maggie);

		Party bean10 = spring.getBean(Party.class);
		String dance = bean10.dance();
		System.out.println(dance);

		PeriPeri bean11 = spring.getBean(PeriPeri.class);
		String chips = bean11.chips();
		System.out.println(chips);

		RealMe bean12 = spring.getBean(RealMe.class);
		String mobile = bean12.mobile();
		System.out.println(mobile);

		TheHeir bean13 = spring.getBean(TheHeir.class);
		String serial = bean13.serial();
		System.out.println(serial);
	}

}
