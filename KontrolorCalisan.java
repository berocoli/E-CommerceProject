
/**
 * Write a description of class KontrolorCalisan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KontrolorCalisan
{
    private CalisanBilgileriModel modelCalisan;
    private CalisanBilgileriGUI guiCalisan;     
    public KontrolorCalisan()
    {
      guiCalisan = new CalisanBilgileriGUI(this);
      modelCalisan = new CalisanBilgileriModel();
    }
    public void calisanBilgileriKayit (String p_calisanNo, String p_sifre, 
    String p_kullaniciDurumu)
    {
        modelCalisan.setCalisanNo(p_calisanNo);
        modelCalisan.setSifre(p_sifre);
        modelCalisan.setKullaniciDurumu(p_kullaniciDurumu);
 
        String preparedStatementText =  "UPDATE T_Calisan "
                                      + "SET    NO    ='" + modelCalisan.getCalisanNo() +"'"
                                      + "       SIFRE ='" + modelCalisan.getSifre() +"'"  
                                      + "       KULLANICIDURUMU ='" + modelCalisan.getKullaniciDurumu() +"'"    
                                      + "WHERE  CALISANNO  ="  + modelCalisan.getCalisanNo();
        modelCalisan.dbVeriGuncelle(preparedStatementText); 
        System.out.println(p_calisanNo  + "ID numaralı çalışanın \n" 
                                        + "Şifresi   = " +  modelCalisan.getSifre() + "\n"
                                        + "Kullanıcı Durumu = " +  modelCalisan.getKullaniciDurumu() + "\n"
                                        + "olarak güncellenmiştir.");
    }
}
