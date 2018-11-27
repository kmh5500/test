package member;

import java.util.List;

public class MemberTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberDAO dao = new MemberDAO();
		//create(dao);
		//read(dao);
		bookread(dao);
	}

	private static void bookread(MemberDAO dao) {
		// TODO Auto-generated method stub
		List<MemberBookDTO> list = dao.bookread("yogi");
		for (int i = 0; i < list.size(); i++) {
			MemberBookDTO bdto = list.get(i);

			p(bdto);
		}
	}

	private static void p(MemberBookDTO bdto) {
		// TODO Auto-generated method stub
		p(bdto.getHname());
		p(bdto.getPtype());
		p(bdto.getStartdate());
		p(bdto.getEnddate());
		System.out.println(bdto.getRprice());
	}

	private static void read(MemberDAO dao) {
		// TODO Auto-generated method stub
		MemberDTO dto = dao.read("yogi");
		p(dto.getName());
		p(dto.getId());
	}

	private static void create(MemberDAO dao) {
		// TODO Auto-generated method stub
		MemberDTO dto = new MemberDTO();
		dto.setId("yogi");
		dto.setEmail("email");
		dto.setGrade('A');
		dto.setName("name");
		dto.setPass("1234");
		dto.setPhone("010-010-010");

		if (dao.create(dto)) {
			p("등록 성공");
		} else {
			p("등록 실패");
		}

		
		
	}
	private static void p(String string) {
		System.out.println(string);
	}

	
}
