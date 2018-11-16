package cn.demo.spring.transaction;

public interface BookShopDao {

	int finBookPriceByIsbn(String isbn);

	void updateBookStock(String isbn);

	void updateUserAccount(String username,int price);

}
