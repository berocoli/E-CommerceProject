/**
 * Çalışan bilgileri için.
 */
public class CalisanBilgileriModel extends DBAbstractCalisan
{   
  private String calisanNo;
  private String sifre;
  private String kullaniciDurumu;
  public CalisanBilgileriModel(){    }
  public CalisanBilgileriModel(String p_calisanNo, String p_sifre, 
  String p_kullaniciDurumu){
        calisanNo       = p_calisanNo;
        sifre           = p_sifre;
        kullaniciDurumu = p_kullaniciDurumu;
  }
  public String getCalisanNo(){return calisanNo;}
  public void setCalisanNo(String p_calisanNo){calisanNo = p_calisanNo;}
  public String getSifre(){return sifre;}
  public void setSifre(String p_sifre){sifre   = p_sifre;}
  public String getKullaniciDurumu(){return kullaniciDurumu;}
  public void setKullaniciDurumu(String p_kullaniciDurumu){kullaniciDurumu = p_kullaniciDurumu;}
  public void dbConnection (){CalisanDBConnection.getDatabaseConnection();}
  public CalisanBilgileriModel  dbVeriSorgula (String p_SelectKomutu){return this; }  
  public boolean  dbVeriEkle    (String p_InsertKomutu){return true; }  
  public boolean  dbVeriSil     (String p_DeleteKomutu) {return true; }   
  public boolean  dbVeriGuncelle (String p_UpdateKomutu)  {return true;}
}
