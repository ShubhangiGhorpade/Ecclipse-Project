package com.xworkz.rule.thing;

public class Developer implements CodingRule {

	@Override
	public String syntax() {

		return "class";
	}

	@Override
	public int primitiveData() {

		return 0;
	}

	@Override
	public String nonPrimitiveData() {

		return null;
	}

	@Override
	public String staticVar() {

		return null;
	}

	@Override
	public String enumClass() {

		return "Constant";
	}

	@Override
	public String methods() {

		return "Static,NonStatic";
	}

	@Override
	public String className() {

		return null;
	}

	@Override
	public boolean navigator() {

		return true;
	}

	@Override
	public boolean source() {

		return true;
	}

	@Override
	public boolean window() {

		return true;
	}

	@Override
	public int hashCode() {

		return 500;
	}

	@Override
	public String toString() {
		return "Developer [syntax()=" + syntax() + ", primitiveData()=" + primitiveData() + ", nonPrimitiveData()="
				+ nonPrimitiveData() + ", staticVar()=" + staticVar() + ", enumClass()=" + enumClass() + ", methods()="
				+ methods() + ", className()=" + className() + ", navigator()=" + navigator() + ", source()=" + source()
				+ ", window()=" + window() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

}
