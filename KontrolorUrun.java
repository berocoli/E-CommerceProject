
/**
 * Write a description of class KontrolorUrun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KontrolorUrun
{
    private UrunBilgileriModel modelUrun;
    private UrunBilgileriGUI guiUrun;  
    public KontrolorUrun()
    {
      guiUrun = new UrunBilgileriGUI(this);
      modelUrun = new UrunBilgileriModel();
    }
    public void UrunBilgileriKayit (String p_urunID, String p_urunFiyati, 
    String p_urunStok)
    {
        modelUrun.setUrunID(p_urunID);
        modelUrun.setUrunFiyati(p_urunFiyati);
        modelUrun.setUrunStok(p_urunStok);
 
        String preparedStatementText =  "UPDATE T_urun "
                                      + "SET    ID    ='" + modelUrun.getUrunID() +"'"
                                      + "       FIYATI ='" + modelUrun.getUrunFiyati() +"'"  
                                      + "       STOK ='" + modelUrun.getUrunStok() +"'"    
                                      + "WHERE  URUNID  ="  + modelUrun.getUrunID();
        modelUrun.dbVeriGuncelle(preparedStatementText); 
        System.out.println(p_urunID  + "ID numaralı ürünün \n" 
                                        + "Ürün Fiyatı   = " +  modelUrun.getUrunFiyati() + "\n"
                                        + "Stok Durumu = " +  modelUrun.getUrunStok() + "\n"
                                        + "olarak güncellenmiştir.");
    }
}
