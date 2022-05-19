package Cachorro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Pandora", "Shih-tzu", "Caramelo", 2021, "Gabriel");
        Proprietario proprietario = new Proprietario("Gabriel", 123456);

        System.out.println(cachorro.getNome());
        System.out.println(cachorro.getProprietario());
        
            
    }
    
}
