package Werkzeuge;

import java.util.LinkedList;
import java.util.List;


import Materialien.Artikel;
import Services.ArtikelBestand;

public class ArtikelListe
{
    public List<Artikel> _artikelBestand;
    public List<Artikel> _artikelListe;
    public int _anzahlArtikel;
    public int _gesamtPreis;
    
    public ArtikelListe(ArtikelBestand artikelBestand)
    {
        _artikelBestand = artikelBestand.getArtikelBestand();
        _artikelListe = new LinkedList<Artikel>();
        _anzahlArtikel = 0;
        _gesamtPreis = 0;         
    }
    
    
    public void addArtikel(int artikelnummer)// TODO Sinvolle Artikelnummer Ÿbergeben
    {
        _artikelListe.add(_artikelBestand.get(artikelnummer));
    }
    
    public void removeArtikel(Artikel artikel)
    {
        _artikelListe.remove(artikel);
    }
    
    public int getAnzahlArtikel()
    {
        return _artikelListe.size();
    }
    
    public int getGesamtpreisAllerArtikel()
    {
        for (Artikel artikel : _artikelListe)
        {
            _gesamtPreis += artikel.getPreis();
        }
        return _gesamtPreis;
    }
    
    public void resetWarenkorb()
    {
        _artikelListe.removeAll(_artikelListe);
    }
}
