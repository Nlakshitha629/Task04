package Nipun_unitDemo1;
import static NLUnit1.Nipun_Unit.*;

import java.lang.reflect.*;
 
public class TestSimple {

  void checkConstructorAndAccess(){
    Simple h = new Simple(17, 25);
    checkEquals(h.getAB(), 4.0);
    checkEquals(h.getCD(), 2.5);
    checkNotEquals(h.getAB(), 4);    
    checkNotEquals(h.getCD(), 2.5);    
  }

  void checkSquareA(){
    Simple h = new Simple(17, 45);
    h.squareAB();
    checkEquals(h.getAB(), 9);
  }
  
  void checkDivisibleValues(){
	Simple h = new Simple(17, 24);
    checkDivisibleInts(h.getAB(), h.getCD());
    h = new Simple(17, 45);
    checkDivisibleInts(h.getAB(), h.getCD());
  }
  

  public static void main(String[] args) throws Exception{
    TestSimple ts = new TestSimple();
	ts.checkDivisibleValues();
    ts.checkConstructorAndAccess();
    ts.checkSquareA();
    
    // Access Private Members
    Simple h = new Simple(5, 6);
    Field fi = h.getClass().getDeclaredField("cd");
    fi.setAccessible(true);
    checkEquals(fi.getDouble(h), 6);
    
    report();
  }
}
