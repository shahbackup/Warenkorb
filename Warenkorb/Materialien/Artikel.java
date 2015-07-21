package Materialien;
public class Artikel
{
    public String _name;
    public int _preis;
    public int _anfangsBestand;
    public int _aktuellerBestand;

    public Artikel(String name, int preis, int anfangsBestand)
    {
        _name = name;
        _preis = preis;
        _anfangsBestand = anfangsBestand;
        _aktuellerBestand = _anfangsBestand;
    }
    
    public Artikel(String name, int preis)
    {
        _name = name;
        _preis = preis;
        _anfangsBestand = 0;
        _aktuellerBestand = _anfangsBestand;
    }

    public String getName()
    {
        return _name;
    }

    public int getPreis()
    {
        return _preis;
    }
   
    public boolean istVerfŸgbar()
    {
        return (_aktuellerBestand <= 1);
    }
    
    public int getBestand()
    {
         return _aktuellerBestand;
    }
    
    public void setBestand(int bestandPlus)
    {
        _aktuellerBestand += bestandPlus;
    }
    
    public boolean equals(Artikel artikel)
    {
        return true; // TODO Sinvolle RŸckgabe in equals() implementieren!
    }
}
