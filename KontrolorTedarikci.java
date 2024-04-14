
/**
 * Write a description of class KontrolorTedarikci here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KontrolorTedarikci 
{
    private TedarikciModel modelTedarikci;
    private TedarikciGUI guiTedarikci;    
    public KontrolorTedarikci(){
        modelTedarikci = new TedarikciModel();
        guiTedarikci = new TedarikciGUI(this);
    }
    public void TedarikciBilgileriKayit (String p_idTedarikci, String p_tedarikciAdi)
    {
       //View(GUIOgrenciBilgisi)'nden bilgi alınıp DBOgrenciModel (Model)'i Güncelliyor!
        modelTedarikci.setIDTedarikci(p_idTedarikci);
        modelTedarikci.setTedarikciAdi(p_tedarikciAdi);
 
        // MySQL veritabanına güncellemle komutu gönderiliyor
        String preparedStatementText =  "UPDATE T_tedarikci "
                                      + "SET    ID    ='" + modelTedarikci.getIDTedarikci() +"'"
                                      + "       FIYATI ='" + modelTedarikci.getTedarikciAdi() +"'"      
                                      + "WHERE  URUNID  ="  + modelTedarikci.getIDTedarikci();
        modelTedarikci.dbVeriGuncelle(preparedStatementText); 
        // Kullanıcya bilgi veriliyor
        System.out.println(p_idTedarikci  + "ID numaralı ürünün \n" 
                                        + "Tedarikci adi   = " +  modelTedarikci.getTedarikciAdi() + "\n"
                                        + "olarak güncellenmiştir.");
    }
}
