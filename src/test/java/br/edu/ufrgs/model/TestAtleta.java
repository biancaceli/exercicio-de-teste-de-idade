package br.edu.ufrgs.model;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import br.edu.ufrgs.model.atleta.Atleta;

public class TestAtleta {

    @Test
    public void testClassificaAtleta() {
        Atleta atleta1 = new Atleta(0);
        Atleta atleta2 = new Atleta(14);
        Atleta atleta3 = new Atleta(15);
        Atleta atleta4 = new Atleta(16);
        Atleta atleta5 = new Atleta(17);
        Atleta atleta6 = new Atleta(18);
        Atleta atleta7 = new Atleta(19);
        Atleta atleta8 = new Atleta(20);
        Atleta atleta9 = new Atleta(34);
        Atleta atleta10 = new Atleta(35);
        Atleta atleta11 = new Atleta(99);

        assertEquals("Idade Inválida", atleta1.classificaAtleta());
        assertEquals("Idade Inválida", atleta2.classificaAtleta());
        assertEquals("Menor", atleta3.classificaAtleta());
        assertEquals("Menor e Juvenil", atleta4.classificaAtleta());
        assertEquals("Menor e Juvenil", atleta5.classificaAtleta());
        assertEquals("Juvenil", atleta6.classificaAtleta());
        assertEquals("Juvenil", atleta7.classificaAtleta());
        assertEquals("Adulto", atleta8.classificaAtleta());
        assertEquals("Adulto", atleta9.classificaAtleta());
        assertEquals("Master", atleta10.classificaAtleta());
        assertEquals("Master", atleta11.classificaAtleta());

    }
}
