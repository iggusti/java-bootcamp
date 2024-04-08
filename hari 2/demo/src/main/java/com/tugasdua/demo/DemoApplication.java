package com.tugasdua.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.awt.print.Book;
import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import static java.math.BigInteger.valueOf;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Start Application...");

//		jdbcTemplate.execute("DROP TABLE bio;");

//		jdbcTemplate.execute("CREATE TABLE bio ( " +
//				"id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
//				"nama VARCHAR(50) NOT NULL, " +
//				"alamat VARCHAR(250) NOT NULL, " +
//				"nohp BIGINT NOT NULL " +
//				");");

//		String queryInsert = "INSERT INTO bio " +
//				"(nama, alamat, nohp) " +
//				"VALUES(:nama, :alamat, :nohp);";
//		MapSqlParameterSource parameterInsert = new MapSqlParameterSource();
//		parameterInsert.addValue("nama", "Ilham");
//		parameterInsert.addValue("alamat", "Bandung");
//		parameterInsert.addValue("nohp", 82126258);
//		int insert = namedParameterJdbcTemplate.update(queryInsert, parameterInsert);

//		String queryUpdate = "UPDATE bio SET alamat = :alamat WHERE id = :id;";
//		MapSqlParameterSource parameterUpdate = new MapSqlParameterSource();
//		parameterUpdate.addValue("id", 2);
//		parameterUpdate.addValue("alamat", "Lampung");
//		int update = namedParameterJdbcTemplate.update(queryUpdate, parameterUpdate);
//		System.out.println("Query Update : " + update);

//		String querySelectById = "SELECT id, nama, alamat, nohp FROM bio WHERE id = :id;";
//		MapSqlParameterSource parameterSelectById = new MapSqlParameterSource();
//		parameterSelectById.addValue("id", 2);
//		Biodata selectById = namedParameterJdbcTemplate.queryForObject(querySelectById, parameterSelectById, new RowMapper<Biodata>() {
//			@Override
//			public Biodata mapRow(ResultSet resultSet, int i) throws SQLException {
//				Biodata selectById = new Biodata();
//				selectById.setId(resultSet.getLong("id"));
//				selectById.setNama(resultSet.getString("nama"));
//				selectById.setAlamat(resultSet.getString("alamat"));
//				selectById.setNohp(valueOf(resultSet.getInt("nohp")));
//				return selectById;
//			}
//		});
//
//		System.out.println("Nama : " + selectById.getNama());
//		System.out.println("Alamat : " + selectById.getAlamat());
//		System.out.println("No. HP : " + selectById.getNohp());

//		String queryDelete = "DELETE FROM bio WHERE id = :id;";
//		MapSqlParameterSource parameterDelete = new MapSqlParameterSource();
//		parameterDelete.addValue("id", 2);
//		int delete = namedParameterJdbcTemplate.update(queryDelete, parameterDelete);
//		System.out.println("Query Delete : " + delete);

		String querySelectAll = "SELECT id, nama, alamat, nohp FROM bio;";
		List<Biodata> SelectAll = namedParameterJdbcTemplate.query(querySelectAll, new HashMap<>(), new RowMapper<Biodata>() {
			@Override
			public Biodata mapRow(ResultSet resultSet, int i) throws SQLException {
				Biodata SelectAll = new Biodata();
				SelectAll.setId(resultSet.getLong("id"));
				SelectAll.setNama(resultSet.getString("nama"));
				SelectAll.setAlamat(resultSet.getString("alamat"));
				SelectAll.setNohp(BigInteger.valueOf(resultSet.getInt("nohp")));
				return SelectAll;
			}
		});

		System.out.println("Result List : " + SelectAll);

	}
}