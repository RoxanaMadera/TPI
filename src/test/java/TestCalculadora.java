

import com.mycompany.ejercicioclase6.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestCalculadora {
    
    public TestCalculadora() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void multiplicar80x3Da240(){
        Calculadora mult = new Calculadora(80,3);
        double multip = mult.multiplicar();
        
        Assertions.assertEquals(240,multip);
    }  
        
    @Test
    public void sumar150y180DivididoPor3da110(){
        Calculadora sum = new Calculadora (150,180);
        double sumas = sum.sumar();
        Calculadora sumD = new Calculadora(sumas,3);
        double sumDividir = sumD.dividir();
        
        Assertions.assertEquals(110,sumDividir);
        
    }
    
    @Test
    public void restar90y50multiplicadoPor15noDa605(){
        Calculadora rest = new Calculadora (90,50);
        double rests = rest.restar();
        Calculadora restMul = new Calculadora(rests,15);
        double restaMultipl = restMul.multiplicar();
        
        Assertions.assertEquals(605,restaMultipl);
    }
    
    @Test
    public void sumar70y40multiplicadoPor25noDa2700(){
        Calculadora sume = new Calculadora (70,40);
        double sumes = sume.sumar();
        Calculadora sumM = new Calculadora(sumes,25);
        double sumaMultipl = sumM.multiplicar();
        
        Assertions.assertEquals(2700,sumaMultipl);
}

    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    

