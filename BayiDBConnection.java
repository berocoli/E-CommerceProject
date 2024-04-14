
/**
 * Write a description of class BayiDBConnection here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class BayiDBConnection
{
   private static Connection con  = null;
   private static String calisanNo = "your_mysql_username";
   private static String sifre = "your_mysql_password";
   private static String Bayi_Bilgileri   = "com.mysql.jdbc.Bayi_Bilgileri";
   private static String URL      = "jdbc:mysql://localhost:3306/eticaret";   
   
   public static Connection getDatabaseConnection()
   {
     try 
     {
         Class.forName(Bayi_Bilgileri);
         return con = DriverManager.getConnection(URL,calisanNo,sifre);
     }
     catch (Exception e)
     {
          e.printStackTrace();
          return null;
     }
   }
}
