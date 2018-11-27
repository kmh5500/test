package info;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import sqlmap.MyAppSqlConfig;

public class InfoDAO {

	private static SqlSessionFactory sqlMapper;
	private static SqlSession session;
	
	static {
		
		sqlMapper = MyAppSqlConfig.getSqlMapInstance();
		session = sqlMapper.openSession(true);
	}
	
	public boolean create(InfoDTO dto) {
		boolean flag = false;
		int cnt = session.insert("info.create", dto);
		if(cnt>0)flag= true;
		
		
		return flag;
	}

	public InfoDTO read(String string) {
		// TODO Auto-generated method stub
		return null;
	}



}
