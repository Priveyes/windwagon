package com.windwagon.kaamelott.race;

public enum RaceType {

    /**
     * Course internationale.
     */
    INTERNATIONALE,

    /**
     * Course europ�enne.
     */
    EUROPEENNE,

    /**
     * Course nationale.
     */
    NATIONALE,

    /**
     * Course de groupe I.
     */
    GROUPE_I,

    /**
     * Course de groupe II.
     */
    GROUPE_II,

    /**
     * Course de groupe III.
     */
    GROUPE_III,

    /**
     * Course classique.
     */
    CLASSIQUE,

    /**
     * Course semi-classique.
     */
    SEMI_CLASSIQUE,

    /**
     * D�part � l'autostart.
     */
    AUTOSTART,

    /**
     * Course � handicap.
     *
     * @see RaceType#CATEGORIE
     * @see RaceType#DEDOUBLE
     * @see RaceType#DIVISE
     * @see RaceType#LIMITE
     * @see RaceType#REQUALIFICATION
     */
    HANDICAP,

    /**
     * Course � r�clamer.
     *
     * @see RaceType#MIXTE
     */
    RECLAMER,

    /**
     * Course � handicap de cat�gorie. Obligatoirement associ� avec {@link RaceType#HANDICAP}.
     *
     * @see RaceType#HANDICAP
     */
    CATEGORIE,

    /**
     * Course � handicap d�doubl�. Obligatoirement associ� avec {@link RaceType#HANDICAP}.
     *
     * @see RaceType#HANDICAP
     */
    DEDOUBLE,

    /**
     * Course � handicap divis�. Obligatoirement associ� avec {@link RaceType#HANDICAP}.
     *
     * @see RaceType#HANDICAP
     */
    DIVISE,

    /**
     * Course � handicap limit�. Obligatoirement associ� avec {@link RaceType#HANDICAP}.
     *
     * @see RaceType#HANDICAP
     */
    LIMITE,

    /**
     * Course � handicap de requalification. Obligatoirement associ� avec {@link RaceType#HANDICAP}.
     *
     * @see RaceType#HANDICAP
     */
    REQUALIFICATION,

    /**
     * Course � conditions.
     *
     * @see RaceType#QUALIF_HP
     */
    CONDITIONS,

    /**
     * Course � conditions "qualif HP". Obligatoirement associ� avec {@link RaceType#CONDITIONS}.
     *
     * @see RaceType#CONDITIONS
     */
    QUALIF_HP,

    /**
     * Course mixte. Signifie qu'une partie seulement des chevaux sont �
     * r�clamer. Obligatoirement associ� avec {@link RaceType#RECLAMER}.
     *
     * @see RaceType#RECLAMER
     */
    MIXTE,

    /**
     * Course amateur.
     *
     * @see RaceType#PROPRIETAIRES
     * @see RaceType#DAMES
     */
    AMATEURS,

    /**
     * Course amateur avec priorit� aux propri�taires. Obligatoirement associ�
     * avec {@link RaceType#AMATEURS}.
     *
     * @see RaceType#AMATEURS
     */
    PROPRIETAIRES,

    /**
     * Course amateurs r�serv� aux dames. Obligatoirement associ� avec {@link RaceType#AMATEURS}.
     *
     * @see RaceType#AMATEURS
     */
    DAMES,

    /**
     * Course r�serv�e aux apprentis. Par d�faut, apprentis lad-driver, sauf en
     * pr�sence de {@link RaceType#LADS_JOCKEYS}.
     *
     * @see RaceType#LADS_JOCKEYS
     */
    APPRENTIS,

    /**
     * Course r�serv�e aux apprentis lads-jockey. Obligatoirement associ� avec
     * {@link RaceType#APPRENTIS}.
     *
     * @see RaceType#APPRENTIS
     */
    LADS_JOCKEYS,

    /**
     * Courses en partie li�e. D�finition:
     * "Course dont le r�sultat ne devient d�finitif qu'apr�s plusieurs �preuves"
     * .
     */
    LIEE,

    /**
     * Course r�serv�e � la race anglo-arabe.
     *
     * @see RaceType#PREMIERE_SERIE
     * @see RaceType#DEUXIEME_SERIE
     * @see RaceType#TROISIEME_SERIE
     */
    ANGLO_ARABES,

    /**
     * Course d'anglo-arabes de premi�re s�rie. Obligatoirement associ� avec
     * {@link RaceType#ANGLO_ARABES}.
     *
     * @see RaceType#ANGLO_ARABES
     */
    PREMIERE_SERIE,

    /**
     * Course d'anglo-arabes de deuxi�me s�rie. Obligatoirement associ� avec
     * {@link RaceType#ANGLO_ARABES}.
     *
     * @see RaceType#ANGLO_ARABES
     */
    DEUXIEME_SERIE,

    /**
     * Course d'anglo-arabes de troisi�me s�rie. Obligatoirement associ� avec
     * {@link RaceType#ANGLO_ARABES}.
     *
     * @see RaceType#ANGLO_ARABES
     */
    TROISIEME_SERIE,

    /**
     * Course r�serv�e � la race arabe pure.
     */
    ARABES_PURS,

    /**
     * Course � ventes publiques.
     */
    VENTES_PUBLIQUES,

    /**
     * Course r�serv�e aux AQPS. AQPS: Autre Que de Pur-Sang anglais.
     */
    AQPS,

    /**
     * Course de chevaux militaires.
     */
    MILITAIRES,

    /**
     * Course courues par des chevaux civils et militaires.
     */
    CIVILS_ET_MILITAIRES,

    /**
     * Course de concours.
     */
    CONCOURS,

    /**
     * Course de d�monstration.
     */
    DEMONSTRATION,

    /**
     * Course de qualification ACCAF.
     */
    QUALIFICATION_ACCAF,

    /**
     * Finale r�gionale ACCAF.
     */
    FINALE_REG_ACCAF,

    /**
     * Finale nationale ACCAF.
     */
    FINALE_NAT_ACCAF,

    /**
     * Type de course inconnu.
     */
    INCONNU;

}
