import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TedarikciGUI
{
    private JFrame pencere; 
    private Container bilesenKonteyneri; 
    private JPanel p_Panel;
    private JTextField t_idTedarikci, t_tedarikciAdi;
    private JLabel  l_idTedarikci, l_tedarikciAdi;
    private JComboBox  c_Cinsiyet;
    private JButton    b_Kayit;
    private OlayDinleyicisi olayDinleyici;
    private KontrolorTedarikci kontrolor;
    public TedarikciGUI (KontrolorTedarikci p_kontrolor)
    {
      kontrolor = p_kontrolor ;
      olayDinleyici = new OlayDinleyicisi();    
      pencereHazirla (pencere);
      menuBarHazirla (pencere);   
      panelHazirla   (pencere); 
      pencere.setVisible (true); 
    }     
    public TedarikciGUI()
    {
      olayDinleyici = new OlayDinleyicisi();      
      pencereHazirla (pencere);
      menuBarHazirla (pencere);   
      panelHazirla   (pencere); 
      pencere.setVisible (true); 
    }       
    private void pencereHazirla (JFrame p_Pencere )
    {
      pencere = new JFrame ("Tedarikçi Bilgileri Portalı");
      pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pencere.setSize(800, 600);
    }    
    private void menuBarHazirla (JFrame p_Pencere )
    {
        JMenuBar menuBar = new JMenuBar();
        JMenu m_IDTedarikci = new JMenu("Tedarikçi Bilgileri");
        JMenu m_TedarikciAdi = new JMenu("Tedarikçi Adı");
        menuBar.add(m_IDTedarikci);
        menuBar.add(m_TedarikciAdi);
        p_Pencere.setJMenuBar(menuBar);
    }
    public void panelHazirla (JFrame p_Pencere)
    {
      p_Panel     = new JPanel(); 
    
      b_Kayit    = new JButton ("KAYIT");
      b_Kayit.addActionListener(olayDinleyici);
      
      l_idTedarikci  = new JLabel ("Tedarikçi ID:"); 
      t_idTedarikci  = new JTextField (10);  
      l_tedarikciAdi       = new JLabel ("Tedarikçi Adı :"); 
      t_tedarikciAdi       = new JTextField (10); 
      
      p_Panel.add(l_idTedarikci);
      p_Panel.add(t_idTedarikci);
      p_Panel.add(l_tedarikciAdi);
      p_Panel.add(t_tedarikciAdi);
      p_Panel.add(b_Kayit);
      
      p_Pencere.add( p_Panel);
    }  
    private class OlayDinleyicisi implements ActionListener
    {
       public void actionPerformed  (ActionEvent event)
       {
         if(event.getSource() == b_Kayit)// Eğer butona tıklanmışsa
          {
              // KontrollorOgrenciBilgisi Nesnesine Bilgi Veriliyor!
              kontrolor.TedarikciBilgileriKayit(t_idTedarikci.getText(), 
                                              t_tedarikciAdi.getText()
                                              )
                                            ;
          }
        }
    }   
}
