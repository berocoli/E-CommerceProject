import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class UrunBilgileriGUI
{
    private JFrame pencere; 
    private Container bilesenKonteyneri; 
    private JPanel p_Panel;
    private JTextField t_urunID, t_urunFiyati,t_urunStok;
    private JLabel  l_urunID, l_urunFiyati,l_urunStok;
    private JComboBox  c_Cinsiyet;
    private JButton    b_Kayit;
    private OlayDinleyicisi olayDinleyici;
    private KontrolorUrun kontrolor;
    public UrunBilgileriGUI (KontrolorUrun p_kontrolor)
    {
      kontrolor = p_kontrolor ;
      olayDinleyici = new OlayDinleyicisi();    
      pencereHazirla (pencere);
      menuBarHazirla (pencere);   
      panelHazirla   (pencere); 
      pencere.setVisible (true); 
    }     
    public UrunBilgileriGUI()
    {
      olayDinleyici = new OlayDinleyicisi();      
      pencereHazirla (pencere);
      menuBarHazirla (pencere);   
      panelHazirla   (pencere); 
      pencere.setVisible (true); 
    }       
    private void pencereHazirla (JFrame p_Pencere )
    {
      pencere = new JFrame ("Ürün Bilgileri Portalı");
      pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pencere.setSize(800, 600);
    }    
    private void menuBarHazirla (JFrame p_Pencere )
    {
        JMenuBar menuBar = new JMenuBar();
        JMenu m_UrunID = new JMenu("Ürün Bilgileri");
        JMenu m_UrunFiyat = new JMenu("Ürün Fiyatı");
        JMenu m_UrunStok = new JMenu("Ürün Stok");
        menuBar.add(m_UrunID);
        menuBar.add(m_UrunFiyat);
        menuBar.add(m_UrunStok);
        p_Pencere.setJMenuBar(menuBar);
    }
    public void panelHazirla (JFrame p_Pencere)
    {
      p_Panel     = new JPanel(); 
      
      b_Kayit    = new JButton ("KAYIT");
      b_Kayit.addActionListener(olayDinleyici);
      
      l_urunID  = new JLabel ("Ürün ID:"); 
      t_urunID  = new JTextField (10);  
      l_urunFiyati       = new JLabel ("Ürün Fiyatı :"); 
      t_urunFiyati       = new JTextField (10);
      l_urunStok    = new JLabel ("Ürün Stoku :"); 
      t_urunStok    = new JTextField (10); 

      p_Panel.add(l_urunID);
      p_Panel.add(t_urunID);
      p_Panel.add(l_urunFiyati);
      p_Panel.add(t_urunFiyati);
      p_Panel.add(l_urunStok);
      p_Panel.add(t_urunStok);
      p_Panel.add(b_Kayit);
      
      p_Pencere.add( p_Panel);
    } 
    private class OlayDinleyicisi implements ActionListener
    {
       public void actionPerformed  (ActionEvent event)
       {
         if(event.getSource() == b_Kayit)// Eğer butona tıklanmışsa
          {
              kontrolor.UrunBilgileriKayit(t_urunID.getText(), 
                                              t_urunFiyati.getText(),
                                              t_urunStok.getText()
                                              )
                                            ;
          }
        }
    }   
}
