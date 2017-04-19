package design_pattern.ch01_check02;

public class TestMain {

	public static void main(String[] args) {
		//Phone phone1 = new Phone("010-000-1111", "010-000-2222");
		Phone phone1 = new Phone();
		phone1.setHomephones("111");
		phone1.setOfficePhone("222");
		
		
		Person p = new Person();
		Phone[] phoneArr = new Phone[1];
		phoneArr[0] = phone1;
		
		p.setPhones(phoneArr);
		
		System.out.println(p);
	}

}
