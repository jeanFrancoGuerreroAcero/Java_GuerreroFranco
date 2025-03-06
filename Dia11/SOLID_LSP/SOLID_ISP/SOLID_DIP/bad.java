
package SOLID_DIP;


public class bad {
    class MySQLDatabase{
        public void Connect(){
            System.out.println("conectando a Mysql...");
        }
    }
    
    class Datamanager{
        private MySQLDatabase database;
        
        public Datamanager(){
            this.database = new MySQLDatabase();
        }
        
        public void connect(){
            database.Connect();
        }
    }
}
