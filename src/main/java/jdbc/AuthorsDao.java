package jdbc;

import jdbc.author.Name;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class AuthorsDao {
    private Connection connection;


    public AuthorsDao() {
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pubs?serverTimezone=UTC", "root", "root");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Author> findName(String searchTerm) throws SQLException {

        List<Author> authorList = new LinkedList<>();

        PreparedStatement statement = connection.prepareStatement("SELECT * FROM authors WHERE AU_FNAME LIKE ?");
        statement.setString(1, "%"+searchTerm+"%");

//        ResultSet result = statement.executeQuery("SELECT * FROM authors WHERE AU_FNAME LIKE '%" + searchTerm + "%'");

        ResultSet result = statement.executeQuery();

        while (result.next()) {
            String n = result.getString("AU_FNAME");
            String l = result.getString("AU_LNAME");
            String a = result.getString("address");
            String i = result.getString("AU_ID");
//            System.out.println(n + " | "+l+ " | "+a);

            Author a1 = new Author();
            a1.setAddress(a);
            a1.setId(i);
            a1.setName(new Name(n, l));

            authorList.add(a1);


        }
        return authorList;
    }


}
