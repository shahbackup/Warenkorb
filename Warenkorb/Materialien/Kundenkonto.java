package Materialien;
import Fachwerte.Passwort;
import Werkzeuge.ArtikelListe;

public class Kundenkonto
{
    public int _saldo;
    public ArtikelListe _aktuellerWarenkorb;
    public Passwort _passwort;
    public String _benutzerName;
    
    public Kundenkonto(ArtikelListe warenkorb)
    {
        _aktuellerWarenkorb = warenkorb;
        _saldo = warenkorb.getGesamtpreisAllerArtikel();
    }

    
}
