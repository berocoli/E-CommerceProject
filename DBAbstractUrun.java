
/**
 * Write a description of class DBAbstractUrun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class DBAbstractUrun
{
    protected abstract void     dbConnection ();
    protected abstract Object   dbVeriSorgula (String p_SelectKomutu);
    protected abstract boolean  dbVeriEkle    (String p_InsertKomutu);
    protected abstract boolean  dbVeriSil     (String p_DeleteKomutu);  
    protected abstract boolean  dbVeriGuncelle (String p_UpdateKomutu); 
}
