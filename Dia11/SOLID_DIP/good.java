
package aa;

public class good {
    interface Database{
        void Connect();
    }
    
    class MySQLDatabase implements Database{
        public void Connect(){
            System.out.println("conectanco a MySQL...");
        }
    }
    
    class PostgrestSQLDatabase implements Database{
        public void Connect(){
            System.out.println("conectando a Postgrest...");
        }
    }
    
    
    class Datamanager {
        private Database database = new PostgrestSQLDatabase();
        
        public Datamanager(Database database) {
            this.database = database;
        }
        
        public void connect(){
            database.Connect();
        }
    }
}
