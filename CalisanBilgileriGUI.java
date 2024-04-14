import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalisanBilgileriGUI
{
    private JFrame pencere; 
    private Container bilesenKonteyneri; 
    private JPanel p_Panel;
    private JTextField t_calisanNo, t_sifre,t_kullaniciDurumu;
    private JLabel  l_calisanNo, l_sifre,l_kullaniciDurumu;
    private JComboBox  c_Cinsiyet;
    private JButton    b_Kaydet;
    private OlayDinleyicisi olayDinleyici;
    private KontrolorCalisan kontrolor;
    public CalisanBilgileriGUI (KontrolorCalisan p_kontrolor)
    {
      kontrolor = p_kontrolor ;
      olayDinleyici = new OlayDinleyicisi();    
      pencereHazirla (pencere);
      menuBarHazirla (pencere);   
      panelHazirla   (pencere); 
      pencere.setVisible (true); 
    }     
    public CalisanBilgileriGUI()
    {
      olayDinleyici = new OlayDinleyicisi();      
      pencereHazirla (pencere);
      menuBarHazirla (pencere);   
      panelHazirla   (pencere); 
      pencere.setVisible (true); 
    }       
    private void pencereHazirla (JFrame p_Pencere )
    {
      pencere = new JFrame ("Çalışan Bilgileri Portalı");
      pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pencere.setSize(800, 600);
    }    
    private void menuBarHazirla (JFrame p_Pencere )
    {
        JMenuBar menuBar = new JMenuBar();
        JMenu m_CalisanBilgi = new JMenu("Çalışan Bilgileri");
        JMenu m_SifreBilgi = new JMenu("Şifre");
        JMenu m_KullaniciDurumu = new JMenu("Kullanıcı Durumu");
        menuBar.add(m_CalisanBilgi);
        menuBar.add(m_SifreBilgi);
        menuBar.add(m_KullaniciDurumu);
        p_Pencere.setJMenuBar(menuBar);
    }
    public void panelHazirla (JFrame p_Pencere)
    {
      p_Panel     = new JPanel(); 
      
      b_Kaydet    = new JButton ("KAYDET");
      b_Kaydet.addActionListener(olayDinleyici);
      
      l_calisanNo  = new JLabel ("Calisan No:"); 
      t_calisanNo  = new JTextField (10);  
      l_sifre       = new JLabel ("Sifreniz :"); 
      t_sifre       = new JTextField (10);
      l_kullaniciDurumu    = new JLabel ("Kullanıcı Durumu (true veya false) :"); 
      t_kullaniciDurumu    = new JTextField (10); 
     
      p_Panel.add(l_calisanNo);
      p_Panel.add(t_calisanNo);
      p_Panel.add(l_sifre);
      p_Panel.add(t_sifre);
      p_Panel.add(l_kullaniciDurumu);
      p_Panel.add(t_kullaniciDurumu);
      p_Panel.add(b_Kaydet);
      
      p_Pencere.add( p_Panel);
    }   
    private class OlayDinleyicisi implements ActionListener
    {
       public void actionPerformed  (ActionEvent event)
       {
         if(event.getSource() == b_Kaydet)// Eğer butona tıklanmışsa
          {
                kontrolor.calisanBilgileriKayit(t_calisanNo.getText(), 
                                              t_sifre.getText(),
                                              t_kullaniciDurumu.getText()
                                              )
                                            ;
          }
        }
    }   
}