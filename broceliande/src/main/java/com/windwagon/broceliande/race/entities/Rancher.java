package com.windwagon.broceliande.race.entities;

import java.util.Comparator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.windwagon.logres.getset.Getter;

@Entity
@Table( name = "ww_rancher" )
public class Rancher implements Comparable<Rancher> {

    public static final Comparator<Rancher> COMPARATOR = Comparator.comparing( Rancher::getName );

    @Id
    @SequenceGenerator( name = "sequence_id", sequenceName = "ww_sequence_id" )
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "sequence_id" )
    private Long id;

    @Column( length = 50 )
    private String name;

    @Override
    public String toString() {

        String id = Getter.get( Rancher::getId ).str( this );
        String name = Getter.get( Rancher::getName ).str( this );

        return "rancher #" + id + " [" + name + "]";

    }

    @Override
    public int compareTo( Rancher rancher ) {
        return COMPARATOR.compare( this, rancher );
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId( Long id ) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName( String name ) {
        this.name = name;
    }

}
