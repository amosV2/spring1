package cn.demo.spring.transaction.xml;


public class BookShopServiceImpl implements BookShopService {

	private BookShopDao bookShopDao;

	public void setBookShopDao(BookShopDao bookShopDao) {
		this.bookShopDao = bookShopDao;
	}

	@Override
	public void puchase(String name, String isbn) {
		int price = bookShopDao.finBookPriceByIsbn(isbn);
		bookShopDao.updateBookStock(isbn);
		bookShopDao.updateUserAccount(name,price);


	}
}
