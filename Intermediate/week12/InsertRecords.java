package week12;

import java.io.File;

import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

public class InsertRecords {

	public static void main(String[] args) throws Exception {
		File dbFile = new File("db/books.db");
		// dbFile.delete();

		// create database, table and two indices:
		SqlJetDb db = SqlJetDb.open(dbFile, true);
		// insert rows:
		db.beginTransaction(SqlJetTransactionMode.WRITE);
		try {
			ISqlJetTable table = db.getTable("BOOKS");
			table.insert("Big Java", "Cay", 2009);
			table.insert("Small C++", "Jay", 2012);
			table.insert("Medium Objective C", "Fay", 2013);
		} finally {
			db.commit();
		}

	}
}
