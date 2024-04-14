
/**
 * Bayi bilgileri için.
 */
public class BayiBilgileriModel extends DBAbstractBayi
{
  private String idSube;
  public BayiBilgileriModel(){ }
  public BayiBilgileriModel(String p_idSube){idSube = p_idSube;}
  public String getIDSube(){return idSube;}
  public void setIDSube(String p_idSube){idSube = p_idSube;}
  public void dbConnection (){BayiDBConnection.getDatabaseConnection();}
  public BayiBilgileriModel  dbVeriSorgula (String p_SelectKomutu){return this;}  
  public boolean  dbVeriEkle    (String p_InsertKomutu){return true;}  
  public boolean  dbVeriSil     (String p_DeleteKomutu) {return true;}   
  public boolean  dbVeriGuncelle (String p_UpdateKomutu){return true;}
}
