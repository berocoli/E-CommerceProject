/**
 * Ürün bilgileri için.
 */
public class UrunBilgileriModel extends DBAbstractUrun
{   
    private String urunID;
    private String urunFiyati;
    private String urunStok;
    
  public UrunBilgileriModel(){
        
  }
  public UrunBilgileriModel(String p_urunID, String p_urunFiyati, String p_urunStok){urunID      = p_urunID; urunFiyati  = p_urunFiyati; 
      urunStok    = p_urunStok; }
  public String getUrunID(){return urunID;}
  public void setUrunID(String p_urunID){urunID = p_urunID;}
  public String getUrunFiyati(){return urunFiyati;}
  public void setUrunFiyati(String p_urunFiyati){urunFiyati = p_urunFiyati;}
  public String getUrunStok(){return urunStok;}
  public void setUrunStok(String p_urunStok){urunStok    = p_urunStok;}
  public void dbConnection (){UrunDBConnection.getDatabaseConnection();}
  public UrunBilgileriModel  dbVeriSorgula (String p_SelectKomutu){return this; }  
  public boolean  dbVeriEkle    (String p_InsertKomutu){return true; }  
  public boolean  dbVeriSil     (String p_DeleteKomutu) {return true; }   
  public boolean  dbVeriGuncelle (String p_UpdateKomutu)  {return true; }
}
