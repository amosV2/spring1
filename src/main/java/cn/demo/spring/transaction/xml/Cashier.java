package cn.demo.spring.transaction.xml;

import java.util.List;

public interface Cashier {

	void checkout(String username, List<String> isbns);

}
