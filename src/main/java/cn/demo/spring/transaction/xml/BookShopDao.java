package cn.demo.spring.transaction.xml;

public interface BookShopDao {

	int finBookPriceByIsbn(String isbn);

	void updateBookStock(String isbn);

	void updateUserAccount(String username, int price);

}
