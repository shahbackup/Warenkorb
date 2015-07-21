package Services;


import java.util.LinkedList;
import java.util.List;

import Fachwerte.Artikelnummer;
import Materialien.Artikel;

public class ArtikelBestand
{
    List<Artikel> _artikelBestand;

    public ArtikelBestand()
    {
        _artikelBestand = new LinkedList<Artikel>();
    }

    public void addArtikel(Artikel artikel)
    {
        _artikelBestand.add(artikel);
    }
    
    public Artikel getArtikel(Artikelnummer artikelnummer)
    {
        return null; // TODO Richtigen RŸckgabewert bilden
        
       
    }

    public void removeArtikel(Artikel artikel)
    {
        _artikelBestand.remove(artikel);
    }

    public int getAnzahlArtikel()
    {
        return _artikelBestand.size();
    }

    public boolean istEnthalten(Artikel artikel)
    {
        return _artikelBestand.contains(artikel);
    }
    
    public List<Artikel> getArtikelBestand()
    {
        return _artikelBestand;
    }
    
    
    
}
