package kr.co.training;

import java.util.Scanner;

public class Ex24_2_Login implements Ex24_2_LoginInterface {

	private String memberId = "id";
	private String memberPwd = "qwer1234";
	
	// login() 을 여기서 구현! (오버라이딩)
	@Override
	public String login(String id, String pwd) {
		if(memberId.equals(id) && memberPwd.equals(pwd)) {
			return "로그인 되었습니다!";
		}
		return null;
	}
	@Override
	public String wrongId(String id, String pwd) {
		if(!memberId.equals(id)) {
			return "아이디가 틀렸습니다!";
			}
		return null;
	}
	@Override
	public String wrongPwd(String id, String pwd) {
		if(!memberPwd.equals(pwd)) {
			return "비밀번호가 틀렸습니다!";
				}
		return null;
}
}
