package com.Me_and_U.project.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.Me_and_U.project.dao.IMemberDAO;
import com.Me_and_U.project.model.MemberVO;

@Service
public class MemberService implements IMemberService {
	@Autowired
	@Qualifier("IMemberDAO")
	IMemberDAO dao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	// 암호화된 비밀번호로 로그인 체크
	@Override
	public String loginCheck(HashMap<String, Object> map) {		
		// 전달된 아이디로 암호화된 비밀번호 알아온 후
		String encodedPw = dao.loginCheck((String)map.get("id"));
		
		String result = "fail";
		// 암호화된 비밀번호와 입력해서 전달된 비밀번호와 일치하는지 확인
		if(encodedPw != null && passwordEncoder.matches((String)map.get("pw"), encodedPw)) {
			result = "success";
		}
		// matches() : 평문과 암호화된 문장 비교
		return result;
	}

	@Override
	public void insertMember(MemberVO vo) {
		
		// 입력한 비밀번호를 암호화해서 저장
		// vo에서 비밀번호 가져와서 암호화한 후
		String encodedPassword = passwordEncoder.encode(vo.getMemPw());
		
		// 암호화된 비밀번호로 vo에 저장한 후 vo를 mapper에 보내서 db에 저장
		vo.setMemPw(encodedPassword); // vo에 암호화된 비밀번호 저장
		dao.insertMember(vo);
	}

	@Override
	public String memJoinIdCheck(String memId) {
		// TODO Auto-generated method stub
		return dao.memJoinIdCheck(memId);
	}

	@Override
	public String memInfoSearchNameCheck(String memName, String memEmail) {
		// TODO Auto-generated method stub
		return dao.memInfoSearchNameCheck(memName, memEmail);
	}

	@Override
	public MemberVO memIdInfo(String memName, String memEmail) {
		// TODO Auto-generated method stub
		return dao.memIdInfo(memName, memEmail);
	}

	@Override
	public void pwChage(MemberVO vo) {
		// 입력한 비밀번호를 암호화해서 저장
		// vo에서 비밀번호 가져와서 암호화한 후
		String encodedPassword = passwordEncoder.encode(vo.getMemPw());
		
		// 암호화된 비밀번호로 vo에 저장한 후 vo를 mapper에 보내서 db에 저장
		vo.setMemPw(encodedPassword); 
		dao.pwChage(vo);
	}

	@Override
	public String memPwSearchInfoCheck(String memId, String memName, String memEmail) {
		// TODO Auto-generated method stub
		return dao.memPwSearchInfoCheck(memId, memName, memEmail);
	}

	@Override
	public void memInfoChange(MemberVO vo) {
		// TODO Auto-generated method stub
		dao.memInfoChange(vo);
	}

	@Override
	public MemberVO getMemInfo(String memId) {
		// TODO Auto-generated method stub
		return dao.getMemInfo(memId);
	}

	@Override
	public void MyInfoPwChange(MemberVO vo) {
		String encodedPassword = passwordEncoder.encode(vo.getMemPw());
		
		// 암호화된 비밀번호로 vo에 저장한 후 vo를 mapper에 보내서 db에 저장
		vo.setMemPw(encodedPassword); 
		dao.MyInfoPwChange(vo);
	}

	@Override
	public String myInfoPwCheck(MemberVO vo) {
		// id값에 맞는 암호화된 pw값을 가져옴
		String encodedPw = dao.myInfoPwCheck(vo);
		String result = "fail";
		// 가져온 pw값을 입력한 pw값과 비교
		if(passwordEncoder.matches(vo.getMemPw(), encodedPw)) {
			result = "success";
		}
		return result;
	}

}
