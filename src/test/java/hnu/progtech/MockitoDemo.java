package hnu.progtech;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MockitoDemo {

    // Klasse, die wir testen möchten
    public class Calculator {
        private MathService mathService;

        public Calculator(MathService mathService) {
            this.mathService = mathService;
        }
        public int add(int a, int b) {
            return mathService.add(a, b);
        }
    }

    // Abhängige Klasse, die wir mocken möchten
    public interface MathService {
        int add(int a, int b);
    }

    @Test
    public void testAdd() {
        // Erstelle ein Mock-Objekt für MathService
        MathService mathService = Mockito.mock(MathService.class);

        // Definiere das Verhalten des Mock-Objekts
        when(mathService.add(10, 20)).thenReturn(30);

        // Erstelle eine Instanz von Calculator mit dem Mock-Objekt
        Calculator calculator = new Calculator(mathService);

        // Teste die add-Methode
        int result = calculator.add(10, 20);

        // Überprüfe das Ergebnis
        assertEquals(30, result);
    }
}

