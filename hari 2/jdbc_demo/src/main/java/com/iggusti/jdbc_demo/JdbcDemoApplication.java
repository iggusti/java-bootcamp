package com.iggusti.jdbc_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

@SpringBootApplication
public class JdbcDemoApplication implements CommandLineRunner {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

//	@Autowired
//	BookDao dao;

	public static void main(String[] args) {
		SpringApplication.run(JdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Start Application...");
//		jdbcTemplate.execute("DROP TABLE books;");
//		jdbcTemplate.execute("CREATE TABLE books ( "
//				+ " id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, "
//				+ " name VARCHAR(100) NOT NULL, "
//				+ " price BIGINT NOT NULL "
//				+ ");");
//
//		String query = "INSERT INTO books " +
//				"(name, price) " +
//				"VALUES(:name, :price);";
//		MapSqlParameterSource parameterSource = new MapSqlParameterSource();
//		parameterSource.addValue("name", "JAVA 2019");
//		parameterSource.addValue("price", 40000);
//		int update = namedParameterJdbcTemplate.update(query, parameterSource);

//		String query = "SELECT id, name, price FROM books;";
//		List<Book> query1 = namedParameterJdbcTemplate.query(query, new HashMap<>(), new RowMapper<Book>() {
//			@Override
//			public Book mapRow(ResultSet resultSet, int i) throws SQLException {
//				Book book = new Book();
//				book.setId(resultSet.getLong("id"));
//				book.setName(resultSet.getString("name"));
//				book.setPrice(BigInteger.valueOf(resultSet.getInt("price")));
//				return book;
//			}
//		});
//
//		System.out.println("Result List : " + query1);

//		String query2 = "SELECT id, name, price FROM books WHERE id = :id;";
//		MapSqlParameterSource parameterSource2 = new MapSqlParameterSource();
//		parameterSource2.addValue("id", 1);
//		Book book = namedParameterJdbcTemplate.queryForObject(query2, parameterSource2, new RowMapper<Book>() {
//			@Override
//			public Book mapRow(ResultSet resultSet, int i) throws SQLException {
//				Book book = new Book();
//				book.setId(resultSet.getLong("id"));
//				book.setName(resultSet.getString("name"));
//				book.setPrice(BigInteger.valueOf(resultSet.getInt("price")));
//				return book;
//			}
//		});
//
//		System.out.println("Name : " + book.getName());
//		System.out.println("Price : " + book.getPrice());

//		String queryDelete = "DELETE FROM books WHERE id = :id;";
//		MapSqlParameterSource parameterSource = new MapSqlParameterSource();
//		parameterSource.addValue("id", 1);
//		int delete = namedParameterJdbcTemplate.update(queryDelete, parameterSource);
//		System.out.println("Query Delete : " + delete);

		String queryUpdate = "UPDATE books SET name = :name WHERE id = :id;";
		MapSqlParameterSource parameterUpdate = new MapSqlParameterSource();
		parameterUpdate.addValue("id", 2);
		parameterUpdate.addValue("name", "PHP 2019");
		int update = namedParameterJdbcTemplate.update(queryUpdate, parameterUpdate);
		System.out.println("Query Update : " + update);
	}

//	void runJDBC() {
//		System.out.println("Creating tables for testing...");
//
//		jdbcTemplate.execute("DROP TABLE books");
//		jdbcTemplate.execute("")
//				+ "CREATE TABLE books "
//	}

}
