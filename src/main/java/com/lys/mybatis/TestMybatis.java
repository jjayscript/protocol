package com.lys.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class TestMybatis {

    public static void main(String[] args) {


        try{
            SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
            InputStream iStream=TestMybatis.class.getClassLoader().getResourceAsStream("static/mapper/mapperConfig.xml");
            SqlSessionFactory sFactory=builder.build(iStream);
            SqlSession sqlSession = sFactory.openSession();

            //sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
