import java.util.regex.*;

public class User {
    
    public String email;
    public String nom;
    public String prenom;
    public int age;

    public User () {

    }

    public User (String email, String nom, String prenom, int age) {
        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String mail){
        this.email = mail;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String surname){
        this.nom = surname;
    }
    
    public String getPrenom(){
        return this.prenom;
    }

    public void setPrenom(String name){
        this.prenom = name;
    }

    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    public Boolean isValid() {
        
        if(this.email != null && this.nom != null 
        && this.prenom != null && this.age >= 13 
        && Pattern.matches("[a-zA-Z-0-9]+@[a-zA-Z]+.[a-zA-Z-0-9]{2,3}", this.email)){
            return true;
        }
        return false;
    } 
}
