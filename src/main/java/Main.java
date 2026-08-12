import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();
        Connection connection = conexao.getConnection();
        String sql;
        PreparedStatement ps;
        ResultSet rs;

        // inserir um registro na tabela java_categoria


        // listagem das categorias

    }
}
