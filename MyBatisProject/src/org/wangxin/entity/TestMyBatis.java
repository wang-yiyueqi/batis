package org.wangxin.entity;
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



/** 
* @author : wangxin
* @date 创建时间：2020/05/06 16:32:26 
* @version 1.0 
* @parameter  
* @since  
* @return  
*/
public class TestMyBatis {
	public static void main(String[] args) throws IOException {
//		加载mybatis配置文件 连接数据库
		Reader reader = Resources.getResourceAsReader("conf.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		
//		session - connection
		SqlSession session = sessionFactory.openSession();
		String statement = "org.wangxin.entity.personMapper.queryPersonById";
		Person person = session.selectOne(statement,1);
		System.out.println(person);
		session.close();
	}

}
