package jdbc;

import java.sql.SQLException;
import java.util.List;

public class App {

    public static void main(String[] args) throws SQLException {
        AuthorsDao authorsDao = new AuthorsDao();
        List<Author> listAuth = authorsDao.findName("ann");

        System.out.println(listAuth);

        for (Author author : listAuth) {
            System.out.println(author.getName().getFullName());
        }
    }
}
