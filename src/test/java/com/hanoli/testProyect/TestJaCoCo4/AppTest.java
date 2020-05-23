package com.hanoli.testProyect.TestJaCoCo4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;



@RunWith(JUnit4.class)

public class AppTest 
{
    
    @Test
    public void imprimirHolaTest () {
    	String prueba = "hola";
    	assertEquals("Hola, mai neim hola bebe is "+ prueba, App.imprimirHola(prueba)); //importante bebe
    }
}
