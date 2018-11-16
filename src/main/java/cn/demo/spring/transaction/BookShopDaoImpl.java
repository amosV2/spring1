package cn.demo.spring.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("bookShopDao")
public class BookShopDaoImpl implements BookShopDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int finBookPriceByIsbn(String isbn) {
		String sql = "select price from book where isbn = ?";
		Integer price = jdbcTemplate.queryForObject(sql, Integer.class,isbn);
		return price;
	}

	@Override
	public void updateBookStock(String isbn) {
		String sql = "select stock from book_stock where isbn=?";
		Integer stock = jdbcTemplate.queryForObject(sql, Integer.class, isbn);
		if (stock == 0) {
			System.out.println("库存不足!!");
			throw new RuntimeException();
		}
		sql = "update book_stock set stock=stock-1 where isbn=?";
		jdbcTemplate.update(sql,isbn);
	}

	@Override
	public void updateUserAccount(String username, int price) {
		String sql = "select balance from account where username=?";
		Integer balance = jdbcTemplate.queryForObject(sql, Integer.class, username);
		if (balance < price) {
			System.out.println("余额不足!!");
			throw new RuntimeException();
		}
		sql = "update account set balance=balance-? where username=?";
		jdbcTemplate.update(sql,price,username);
	}
}
