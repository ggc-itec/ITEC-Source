package week12;

import java.io.File;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

public class CreateExample {

	public static void main(String[] args) throws Exception {
		File dbFile = new File("db/books.db");
		dbFile.delete();

		// create database, table and two indices:
		SqlJetDb db = SqlJetDb.open(dbFile, true);
		// set DB option that have to be set before running any transactions:
		db.getOptions().setAutovacuum(true);
		// set DB option that have to be set in a transaction:
		db.runTransaction(new ISqlJetTransaction() {
			public Object run(SqlJetDb db) throws SqlJetException {
				db.getOptions().setUserVersion(1);
				return true;
			}
		}, SqlJetTransactionMode.WRITE);

		db.beginTransaction(SqlJetTransactionMode.WRITE);
		try {
			String createTableQuery = "CREATE TABLE " + "BOOKS" + " ("
					+ "TITLE" + " TEXT NOT NULL PRIMARY KEY , " + "AUTHOR"
					+ " TEXT NOT NULL, " + "YEAR" + " INTEGER NOT NULL)";
			System.out.println();
			System.out.println(">DB schema queries:");
			System.out.println();
			System.out.println(createTableQuery);

			db.createTable(createTableQuery);
		} finally {
			db.commit();
		}

	}

}
