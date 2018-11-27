package member;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import sqlmap.MyAppSqlConfig;
import www.utility.LogWriter;

public class MemberDAO {

private static SqlSessionFactory sqlMapper;
private static SqlSession session;

	static{
	
		sqlMapper = MyAppSqlConfig.getSqlMapInstance();
		session = sqlMapper.openSession(true);
	}
	
	public boolean create(MemberDTO dto) {
		
		
		boolean flag = false;
		
		
		int cnt = session.insert("member.create", dto);
		
		
		
		if(cnt>0)flag= true;
		
		
		return flag;
	}
	
	public MemberDTO read(String id) {
		
		MemberDTO dto = session.selectOne("member.read", id);
		 LogWriter.logWrite("test", "info", "session.selectOne(\"member.read\", id);",  " read 성공", null);
		
		 
		return dto;
		
		
	}
	public List<MemberBookDTO> bookread(String id) {
		
		List<MemberBookDTO> list = session.selectList("member.bookread", id);
		LogWriter.logWrite("test", "info", "session.selectList(\"member.bookread\", id);",  " list 성공", null);
		
		
		return list;
		
		
	}
	
	public boolean update(MemberDTO dto) {
		boolean flag = false;
		int cnt = session.insert("member.update", dto);
		if(cnt>0)flag= true;
		return flag;
	}
	public boolean updatepass(Map map) {
		
		boolean flag=false;
		int cnt = session.update("member.updatePass", map);
		if(cnt>0)flag= true;
		return flag;
	}
	public boolean delete(String id) {
		
		boolean flag= false;
		int cnt = session.delete("member.delete", id);
		if(cnt>0)flag= true;
		return flag;
	}
	public boolean passcheck(Map map) {
		boolean flag= false;
		int cnt = session.selectOne("member.passCheck", map);
		return flag;
	}
	
	
	
	
	
	
	
	
}
