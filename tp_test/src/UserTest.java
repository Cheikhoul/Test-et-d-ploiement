import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

public class UserTest {
   
    private final String userMail = "cheikhoulkhadimseck@gmail.com";
    private final String nom = "Seck";
    private final String prenom = "Cheikhoul";
    private final int age = 23;
    private User user1 = new User(userMail, nom, prenom, age);

    @Test
    public void isNotValidWhenBadFormatMail(){
        
    }
    
    @Test
    public void isNotValidWhenMailIsNull(){
        user1.setEmail(null);
        assertFalse(user1.isValid());
    }

    @Test
    public void isNotValidWhenNameisNull(){
        user1.setPrenom(null);
        assertFalse(user1.isValid());
    }

    @Test 
    public void isNotValidWhenSurnameIsNuLL(){
        user1.setNom(null);
        assertFalse(user1.isValid());
    }

    @Test
    public void isNotValidWhenUserTooYoung(){
        user1.setAge(10);
        assertFalse(user1.isValid());
    }

    @Test
    public void isValid(){
        assertTrue(user1.isValid());
    }
}
