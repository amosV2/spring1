package cn.demo.spring.transaction.xml;

import java.util.Arrays;

import javafx.application.Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc-tx-xml.xml");
//		BookShopService bookShopService = ctx.getBean(BookShopService.class);
//		bookShopService.puchase("amos","1001");

		Cashier cashier = ctx.getBean(Cashier.class);
		cashier.checkout("amos", Arrays.asList(new String[]{"1001","1002"}));

	}

}
