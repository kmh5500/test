package info;

import java.util.List;

public class InfoTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InfoDAO dao = new InfoDAO();
		create(dao);
		//read(dao);
		
	}


	private static void read(InfoDAO dao) {
		// TODO Auto-generated method stub
		InfoDTO dto = dao.read("yogi");
		p(dto.getTitle());
		p(dto.getContent());
	}

	private static void create(InfoDAO dao) {
		// TODO Auto-generated method stub
		InfoDTO dto = new InfoDTO();
		
		dto.setContent("11일부터 서비스 시작합니다.");
	
		dto.setWname("name");
		dto.setTitle("공지사항");
		

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
