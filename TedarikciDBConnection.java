
/**
 * Write a description of class TedarikciDBConnection here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class TedarikciDBConnection
{
   private static Connection con  = null;
   private static String calisanNo = "your_mysql_username";
   private static String sifre = "your_mysql_password";
   private static String Tedarikci_Bilgileri   = "com.mysql.jdbc.Tedarikci_Bilgileri";
   private static String URL      = "jdbc:mysql://localhost:3306/eticaret";   
   
   public static Connection getDatabaseConnection()
   {
     try 
     {
         Class.forName(Tedarikci_Bilgileri);
         return con = DriverManager.getConnection(URL,calisanNo,sifre);
     }
     catch (Exception e)
     {
          e.printStackTrace();
          return null;
     }
   }
}
