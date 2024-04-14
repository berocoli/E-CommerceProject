
/**
 * Write a description of class KontrolorBayi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KontrolorBayi 
{
    private BayiBilgileriModel modelBayi;
    private BayiBilgileriGUI guiBayi;
    public KontrolorBayi()
    {
      guiBayi = new BayiBilgileriGUI(this);
      modelBayi = new BayiBilgileriModel();
    }
    public void BayiBilgileriKayit (String p_idSube)
    {
        modelBayi.setIDSube(p_idSube);
        String preparedStatementText =  "UPDATE T_sube "
                                      + "SET    ID    ='" + modelBayi.getIDSube() +"'"   
                                      + "WHERE  SUBEID  ="  + modelBayi.getIDSube();
        modelBayi.dbVeriGuncelle(preparedStatementText); 
        System.out.println(p_idSube  + "ID numaralı şubenin \n" 
                                        + "Şube Kodu   = " +  modelBayi.getIDSube() + "\n"
                                        + "olarak güncellenmiştir.");
    }
}
