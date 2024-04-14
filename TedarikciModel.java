/**
 * Tedarikçi bilgileri için.
 */
public class TedarikciModel extends DBAbstractTedarikci
{
    // instance variables - replace the example below with your own
    private String idTedarikci;
    private String tedarikciAdi;

    public TedarikciModel(){
        
    }

    public TedarikciModel(String p_idTedarikci, String p_tedarikciAdi){
        idTedarikci     = p_idTedarikci;
        tedarikciAdi    = p_tedarikciAdi;
    }
    public String getIDTedarikci(){
        return idTedarikci;
    }
    public void setIDTedarikci(String p_idTedarikci){
        idTedarikci = p_idTedarikci;
    }
    public String getTedarikciAdi(){
        return tedarikciAdi;
    }
    public void setTedarikciAdi(String p_tedarikciAdi){
        tedarikciAdi    = p_tedarikciAdi;
    }
    public void dbConnection ()
  {
     TedarikciDBConnection.getDatabaseConnection();
  }
  public TedarikciModel  dbVeriSorgula (String p_SelectKomutu)
  {
     return this; 
  }  
  public boolean  dbVeriEkle    (String p_InsertKomutu)
  {
     return true; 
  }  
  public boolean  dbVeriSil     (String p_DeleteKomutu) 
  {
     return true; 
  }   
  public boolean  dbVeriGuncelle (String p_UpdateKomutu)  
  {
     return true; 
  }
}
