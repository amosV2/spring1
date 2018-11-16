package cn.demo.spring.transaction;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class APP {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-tx.xml");
/*		BookShopDao bookShopDao = ctx.getBean(BookShopDao.class);
		int price = bookShopDao.finBookPriceByIsbn("1001");
		System.out.println(price);
		System.out.println("*****************************");
		bookShopDao.updateBookStock("1001");
		bookShopDao.updateUserAccount("lin",100);*/

//		BookShopService bookShopService = ctx.getBean(BookShopService.class);
//		bookShopService.puchase("lin","1001");

		Cashier cashier = ctx.getBean(Cashier.class);
		cashier.checkout("lin",Arrays.asList(new String[]{"1001","1002"}));
	}


}
