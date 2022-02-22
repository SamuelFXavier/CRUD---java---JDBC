import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;


public class Usuario {

    private static final String SQL_CREATETABLE = "DROP TABLE IF EXISTS USUARIO; CREATE TABLE USUARIO"
            + "("
            + "ID INT PRIMARY,"
            + "NOME VARCHAR(100) NOT NULL,"
            + "SOBRENOME VARCHAR(100) NOT NULL,"
            + "IDADE INT NOT NULL,"
            + "EMAIL VARCHAR(100) NOT NULL"
            + ")"
            ;

    // Create
    private static  final String SQL_INSERT_1 = "INSERT INTO USUARIO (ID, NOME, SOBRENOME, IDADE, EMAIL) VALUES (1, 'Arthur', 'Augusto', 25, 'arthuraugusto@gmail.com')";
    private static  final String SQL_INSERT_2 = "INSERT INTO USUARIO (ID, NOME, SOBRENOME, IDADE, EMAIL) VALUES (2, 'Pablo', 'Medeiros', 22, 'pablo.medeiros@gmail.com')";
    private static  final String SQL_INSERT_3 = "INSERT INTO USUARIO (ID, NOME, SOBRENOME, IDADE, EMAIL) VALUES (3, 'João', 'Pedro', 19, 'joaopedro01@gmail.com')";

    // Read
    private static final String SQL_SELECT = "SELECT * FROM USUARIO";

    // Delete
    private static final String SQL_DELETE = "DELETE FROM USUARIO WHERE ID = 2";

    // Update
    private static  final  String SQL_UPDATE_1 = "UPDATE USUARIO SET NOME = 'Arthur' WHERE USUARIO.ID = 2 ";
    private static  final  String SQL_UPDATE_2 = "UPDATE USUARIO SET SOBRENOME = 'Pedro' WHERE USUARIO.ID = 3 ";


    public static void main(String[] args) throws Exception{

        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();

            statement.execute(SQL_CREATETABLE);

            statement.execute(SQL_INSERT_1);
            statement.execute(SQL_INSERT_2);
            statement.execute(SQL_INSERT_3);

            statement.execute(SQL_SELECT);

            statement.execute(SQL_DELETE);

            statement.execute(SQL_UPDATE_1);
            statement.execute(SQL_UPDATE_2);

            statement.execute(SQL_SELECT);

        }catch(SQLIntegrityConstraintViolationException e){
            e.printStackTrace();
        }finally {
            connection.close();
        }
    }

    private static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "test","1234");
    }
}
