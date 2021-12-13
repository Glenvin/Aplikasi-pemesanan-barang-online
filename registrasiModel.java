package registrasi;

import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import method.dataForAllMethod;

public class registrasiModel extends dataForAllMethod{
    public void insertUser(String uname, String pass) {
        boolean status = false;
        try{
           
            Class.forName(JDBC_DRIVER);  
            conn = DriverManager.getConnection(URL_WITH_DB, username, password);  
            query = "INSERT INTO LOGIN VALUES('"+uname+"','"+pass+"')";
            PreparedStatement stat =(PreparedStatement) conn.prepareStatement(query);
            stat.executeUpdate();
            conn.close();
        }

        catch(CommunicationsException e) {
            notifErrorTryCatch(e);
        }

        catch(HeadlessException | ClassNotFoundException | SQLException e){
            notifErrorTryCatch(e);
        }
    }
}
