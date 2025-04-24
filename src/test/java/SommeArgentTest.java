import com.example.SommeArgent;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SommeArgentTest {
  @Test
  void testEgalite() {
  SommeArgent s1 = new SommeArgent(50, "EUR");
  SommeArgent s2 = new SommeArgent(50, "EUR");
  assertEquals(s1, s2);
  }


  @Test
  void testAdditionMemeDevise() {
  SommeArgent s1 = new SommeArgent(20, "EUR");
  SommeArgent s2 = new SommeArgent(30, "EUR");
  SommeArgent attendu = new SommeArgent(50, "EUR");
  assertEquals(attendu, s1.additionner(s2));
  }
  
  @Test
  void testAdditionDeviseDifferente() {
  SommeArgent s1 = new SommeArgent(10, "EUR");
  SommeArgent s2 = new SommeArgent(10, "USD");
  assertThrows(IllegalArgumentException.class, () -> {
  s1.additionner(s2);
  });
  }

  //test
  @Test
  void testAdditionCorrecteSommeArgent() {
  // Arrange
  SommeArgent s1 = new SommeArgent(30, "EUR");
  SommeArgent s2 = new SommeArgent(20, "EUR");
  // Act
  SommeArgent resultat = s1.additionner(s2);
  // Assert
  SommeArgent attendu = new SommeArgent(50, "EUR");
  assertEquals(attendu, resultat, "L'addition devrait donner 50 EUR");
  }


  @Test
  void testAdditionDH() {
  // (1) Création de deux montants en DH
  SommeArgent m12DH = new SommeArgent(12, "DH");
  SommeArgent m14DH = new SommeArgent(14, "DH");
  // (2) Résultat attendu : 26 DH
  SommeArgent expected = new SommeArgent(26, "DH");
  SommeArgent result = m12DH.add(m14DH); // ou.additionner(...) selon votre classe
  // (3) Vérification de l'égalité
  assertTrue(expected.equals(result), "L'addition de 12 DH et 14 DH devrait donner 26 DH");
  }
  
}
