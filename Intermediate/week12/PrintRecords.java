package week12;

import java.io.File;

import org.tmatesoft.sqljet.core.SqlJetException;
import org.tmatesoft.sqljet.core.SqlJetTransactionMode;
import org.tmatesoft.sqljet.core.table.ISqlJetCursor;
import org.tmatesoft.sqljet.core.table.ISqlJetTable;
import org.tmatesoft.sqljet.core.table.ISqlJetTransaction;
import org.tmatesoft.sqljet.core.table.SqlJetDb;

public class PrintRecords {

	private static void printRecords(ISqlJetCursor cursor) throws SqlJetException {
        try {
            if (!cursor.eof()) {
                do {
                    System.out.println(cursor.getRowId() + " : " + 
                            cursor.getString("question") + " " + 
                            cursor.getString("answer"));
                } while(cursor.next());
            }
        } finally {
            cursor.close();
        }
    }
	
	public static void main(String[] args) throws Exception {
		File dbFile = new File("db/questions.db");

		SqlJetDb db = SqlJetDb.open(dbFile, true);
		// set DB option that have to be set before running any transactions:
		//db.getOptions().setAutovacuum(true);
        db.beginTransaction(SqlJetTransactionMode.READ_ONLY);
        ISqlJetTable table = db.getTable("questiontable");

        printRecords(table.order(table.getPrimaryKeyIndexName()));

	}
}
