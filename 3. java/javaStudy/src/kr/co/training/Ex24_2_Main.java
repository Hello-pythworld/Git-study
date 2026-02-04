package kr.co.training;

public class Ex24_2_Main {

	public static void main(String[] args) {

		Ex24_2_Login l = new Ex24_2_Login();
		System.out.println(l.login("id", "qwer1234"));
		System.out.println(l.wrongId("Id", "qwer1234"));
		System.out.println(l.wrongPwd("Id", "er1234"));

	}

}
