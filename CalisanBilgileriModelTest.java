import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CalisanBilgileriModelTest
{
    public CalisanBilgileriModelTest()
    {
    }
    @BeforeEach
    public void setUp()
    {
    }
    @AfterEach
    public void tearDown()
    {
    }
    @Test
    public void testSetSifre()
    {
        CalisanBilgileriModel calisanB1 = new CalisanBilgileriModel();
        calisanB1.setSifre("Baskent_Uni");
        assertEquals("Baskent", calisanB1.getSifre());
        assertEquals(7, (calisanB1.getSifre()).length());
    }
    @Test
    public void testSetCalisanNo()
    {
        CalisanBilgileriModel calisanB1 = new CalisanBilgileriModel();
        calisanB1.setCalisanNo("100");
        assertEquals("100", calisanB1.getCalisanNo());
        assertEquals(3, (calisanB1.getCalisanNo()).length());
    }
    @Test
    public void testSetKullaniciDurumu()
    {
        CalisanBilgileriModel calisanB1 = new CalisanBilgileriModel();
        calisanB1.setKullaniciDurumu("true");
        assertEquals("true", calisanB1.getKullaniciDurumu());
    }
}





