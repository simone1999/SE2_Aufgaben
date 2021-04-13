package de.tiere;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SchweinTest {

    private Schwein objectUnderTest;

    @BeforeEach
    void setUp() {
        objectUnderTest = new Schwein();
    }

    @Test
    void constructor_default() {
        assertEquals("nobody", objectUnderTest.getName());
    }

    @ParameterizedTest
    @ValueSource(strings={"asdf", "Luca", "Simon", "Marvin", "Maurice"})
    void constructor_overwrite(String name){
        objectUnderTest = new Schwein(name);
        assertEquals(name, objectUnderTest.getName());
    }

    @Test
    void constructor_IllegalArgumentException(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            objectUnderTest = new Schwein("elsa");
        });
    }

    @ParameterizedTest
    @ValueSource(strings={"asdf", "Luca", "Simon", "Marvin", "Maurice"})
    void setName_overwrite(String name){
        objectUnderTest = new Schwein();
        objectUnderTest.setName(name);
        assertEquals(name, objectUnderTest.getName());
    }

    @Test
    void setName_IllegalArgumentException(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            objectUnderTest = new Schwein();
            objectUnderTest.setName("elsa");
        });
    }

    @Test
    void setName_Null(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            objectUnderTest = new Schwein();
            objectUnderTest.setName(null);
        });
    }

    @Test
    void fressen_default() {
        objectUnderTest = new Schwein();
        objectUnderTest.fressen();
        assertEquals(11, objectUnderTest.getGewicht());
        objectUnderTest.fressen();
        assertEquals(12, objectUnderTest.getGewicht());
    }

    @ParameterizedTest
    @ValueSource(strings={"asdf", "Luca", "Simon", "Marvin", "Maurice"})
    void testToString_ganzerBauernhof(String name) {
        objectUnderTest = new Schwein(name);
        assertEquals("Schwein [name=" + name + ", gewicht=10]", objectUnderTest.toString());
    }

}
