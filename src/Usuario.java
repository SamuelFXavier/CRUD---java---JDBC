import java.sql.Connection;

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




}
