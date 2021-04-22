package OOP;

public interface DatabaseConnection {
    public String getConnection();
}

class OracleConnection implements DatabaseConnection{
    String dataSouce;
    @Override
    public String getConnection(){
        dataSouce = "Oracle";
        return "OracleConnection";
    }
}
class MySqlConnection implements DatabaseConnection{
    String dataSouce;
    @Override
    public String getConnection(){
        dataSouce = "MySql";
        return "MySqlConnection";
    }
}
class SqlServerConnection implements DatabaseConnection{
    String dataSouce;
    @Override
    public String getConnection(){
        dataSouce = "Sql";
        return "SqlServerConnection";
    }
}