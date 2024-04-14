import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BayiBilgileriGUI
{
    private JFrame pencere; 
    private Container bilesenKonteyneri; 
    private JPanel p_Panel;
    private JTextField t_idSube;
    private JLabel  l_idSube;
    private JComboBox  c_Cinsiyet;
    private JButton    b_Kayit;
    private OlayDinleyicisi olayDinleyici;
    private KontrolorBayi kontrolor;
    public BayiBilgileriGUI (KontrolorBayi p_kontrolor)
    {
      kontrolor = p_kontrolor ;
      olayDinleyici = new OlayDinleyicisi();    
      pencereHazirla (pencere);   
      panelHazirla   (pencere); 
      pencere.setVisible (true); 
    }     
    public BayiBilgileriGUI()
    {
      olayDinleyici = new OlayDinleyicisi();      
      pencereHazirla (pencere);  
      panelHazirla   (pencere); 
      pencere.setVisible (true); 
    }       
    private void pencereHazirla (JFrame p_Pencere )
    {
      pencere = new JFrame ("Bayi Bilgileri Portalı");
      pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pencere.setSize(800, 600);
    }    
    public void panelHazirla (JFrame p_Pencere)
    {
      p_Panel     = new JPanel(); 
      
      b_Kayit    = new JButton ("KAYIT");
      b_Kayit.addActionListener(olayDinleyici);
      
      l_idSube  = new JLabel ("Şube ID:"); 
      t_idSube  = new JTextField (10);  
 
      p_Panel.add(l_idSube);
      p_Panel.add(t_idSube);
      p_Panel.add(b_Kayit);

      
      p_Pencere.add( p_Panel);
    }
    private class OlayDinleyicisi implements ActionListener
    {
       public void actionPerformed  (ActionEvent event)
       {
         if(event.getSource() == b_Kayit)
          {
              kontrolor.BayiBilgileriKayit(t_idSube.getText()
                                              )
                                            ;
          }
        }
    }   
}
