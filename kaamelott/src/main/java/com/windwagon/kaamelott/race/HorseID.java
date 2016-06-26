package com.windwagon.kaamelott.race;

import java.util.Date;
import java.util.Iterator;

public interface HorseID {

    /**
     * @return the name
     */
    public String getName();

    /**
     * @return l'historique
     */
    public Iterator<Horse> getHistory();

    /**
     * @return le p�re
     */
    public HorseID getFather();

    /**
     * @return la m�re
     */
    public HorseID getMother();

    /**
     * @return la date de naissance
     */
    public Date getBirth();

    /**
     * @return the sex
     */
    public Sex getSex();

    /**
     * @return la date de la premi�re course castr�
     */
    public Date getGeldingDate();

    /**
     * @return the breed
     */
    public Breed getBreed();

    /**
     * @return the coat
     */
    public Coat getCoat();

}
