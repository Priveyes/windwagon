package com.windwagon.pmuportal;


import com.fasterxml.jackson.databind.*;
import com.windwagon.broceliande.utils.pmu.*;
import com.windwagon.pmuportal.exceptions.*;

import org.slf4j.*;
import org.springframework.stereotype.*;

import java.util.*;
import java.util.function.*;

@Component
public class PMUUtils {

    public static final Logger logger = LoggerFactory.getLogger( PMUUtils.class );

    public String protect( String str ) {

        str = str.replace( '\u00A0', ' ' ); // espace insecable
        str = str.replace( '\u00B0', ' ' ); // symbol degree
        str = str.replace( '\u20AC', 'e' ); // symbol euro
        str = str.replace( "\u0152", "OE" ); // e dans l'o majuscule
        str = str.replace( "\u0153", "oe" ); // e dans l'o minuscule
        str = str.replace( '�', 'c' ); // c cedille
        str = str.replace( "`", "'" ); // apostrophe

        // erreur d'encodage
        str = str.replace( "��", "e" );
        str = str.replace( "��", "e" );
        str = str.replace( "��", "e" );
        str = str.replace( "��", "e" );
        str = str.replace( "ii", "e" );
        str = str.replace( "�", "e" );
        str = str.replace( "\\", "e" );
        str = str.replace( "�", "i" );
        str = str.replace( "�", "o" );
        str = str.replace( "©", "'" );
        str = str.replace( "�", "'" );

        // accents
        str = str.replace( '�', 'a' );
        str = str.replace( '�', 'a' );
        str = str.replace( '�', 'a' );
        str = str.replace( '�', 'a' );
        str = str.replace( '�', 'a' );
        str = str.replace( '�', 'a' );
        str = str.replace( '�', 'a' );
        str = str.replace( '�', 'a' );
        str = str.replace( '�', 'e' );
        str = str.replace( '�', 'e' );
        str = str.replace( '�', 'e' );
        str = str.replace( '�', 'e' );
        str = str.replace( '�', 'e' );
        str = str.replace( '�', 'e' );
        str = str.replace( '�', 'e' );
        str = str.replace( '�', 'e' );
        str = str.replace( '�', 'i' );
        str = str.replace( '�', 'i' );
        str = str.replace( '�', 'i' );
        str = str.replace( '�', 'i' );
        str = str.replace( '�', 'i' );
        str = str.replace( '�', 'i' );
        str = str.replace( '�', 'o' );
        str = str.replace( '�', 'o' );
        str = str.replace( '�', 'o' );
        str = str.replace( '�', 'o' );
        str = str.replace( '�', 'o' );
        str = str.replace( '�', 'o' );
        str = str.replace( '�', 'o' );
        str = str.replace( '�', 'o' );
        str = str.replace( '�', 'u' );
        str = str.replace( '�', 'u' );
        str = str.replace( '�', 'u' );
        str = str.replace( '�', 'u' );
        str = str.replace( '�', 'u' );
        str = str.replace( '�', 'u' );

        // espaces
        str = str.replaceAll( "\\s+", " " );

        // majuscule
        return str.trim().toUpperCase();

    }

    public String asText( JsonNode node ) {
        return node.isMissingNode() ? null : protect( node.asText() );
    }

    public <E extends Enum<E>> E findPMU( Class<E> clazz, String value )
            throws PMUParserError {

        try {
            return PMUEnumFinder.find( clazz, value );
        } catch( PMUFinderException ex ) {
            throw new PMUParserError( "Unknown PMU value", ex );
        }

    }

    public <E extends Enum<E>> E findPMU( Class<E> clazz, JsonNode node )
            throws PMUParserError {
        return node.isMissingNode() ? null : findPMU( clazz, asText( node ) );
    }

    public <E extends Enum<E>> Set<E> findAllPMU( Class<E> clazz, String value )
            throws PMUParserError {

        try {
            return PMUEnumFinder.findAll( clazz, value );
        } catch( PMUFinderException ex ) {
            throw new PMUParserError( "Unknown PMU value", ex );
        }

    }

    public <E extends Enum<E>> Set<E> findAllPMU( Class<E> clazz, JsonNode node )
            throws PMUParserError {
        return node.isMissingNode() ? null : findAllPMU( clazz, asText( node ) );
    }

    public <E, P> void shouldNotBeModified( E entity, P value, P expected ) {

        if( value != null && !Objects.equals( value, expected ) )
            logger.warn( "Unexpected modification of {}: {} -> {}", entity, value, expected );

    }

    public <S extends Set<E>, E> void updateSet(
            Supplier<S> getter,
            Consumer<S> setter,
            S value ) {

        S current = getter.get();
        if( current == null )
            setter.accept( value );

        else {

            for( E elt : new HashSet<>( current ) )
                if( !value.contains( elt ) )
                    current.remove( elt );

            for( E elt : new HashSet<>( value ) )
                if( !current.contains( elt ) )
                    current.add( elt );

        }

    }

}
