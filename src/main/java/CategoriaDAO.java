import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoriaDAO {
    private Connection connection;
    private ResultSet rs;
    private PreparedStatement ps;
    private String sql;

    public CategoriaDAO() {
        this.connection = new Conexao().conectar();
    }

    public void inserir(Categoria categoria) {
        sql = "insert into java_categoria(categoria) values (?)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, categoria.getCategoria());
            ps.execute();
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void listar() {
        sql = "select * from java_categoria";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                System.out.print("ID: " + rs.getInt("id"));
                System.out.println("Categoria: " + rs.getString("categoria"));
            }
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public String pesquisar(int id) {
        sql = "select * from java_categoria where id = ?";
    }

}
