ackage lab04;

public class MySQLConnector extends DBConnector{
    @Override
    public boolean connect() {
        return false;
    }
    @Override
    public void close() {
    }
    public static void main(String[] args) {
        DBConnector dbcConnector= new MySQLConnector();
        dbcConnector.close();
        dbcConnector.connect();
        dbcConnector.executeQuery();
        dbcConnector.executeUpdate();

    }
}
