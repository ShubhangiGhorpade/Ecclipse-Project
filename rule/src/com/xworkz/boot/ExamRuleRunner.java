package com.xworkz.boot;

import com.xworkz.implementor.Examiner;
import com.xworkz.rule.ExamRule;
import com.xworkz.usage.Student;

public class ExamRuleRunner {

	public static void main(String[] args) {
		ExamRule rule = new Examiner();

		Student student = new Student(rule);
		student.checkExamRule();

	}

}
