package com.xworkz.usage;

import com.xworkz.rule.ExamRule;

public class Student {
	public ExamRule examRule;

	public Student(ExamRule examRule) {
		this.examRule = examRule;
	}

	public void checkExamRule() {
		System.out.println("CheckExamRule method .....");
		boolean hall = this.examRule.hallTicket(251);
		boolean copy = this.examRule.copyCheat();

		if (copy == true && hall) {
			System.out.println("Copy cheat is present");
		} else {
			System.out.println("copy cheat is absent");
		}
	}
}
