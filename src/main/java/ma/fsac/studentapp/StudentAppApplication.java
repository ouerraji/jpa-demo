package ma.fsac.studentapp;

import ma.fsac.studentapp.entities.Produit;
import ma.fsac.studentapp.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StudentAppApplication implements CommandLineRunner {
    @Autowired
    private ProduitRepository produitRepository;

    public static void main(String[] args) {
        SpringApplication.run(StudentAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
      /*  produitRepository.save(new Produit(null,"Computer",3400,2));
        produitRepository.save(new Produit(null,"printer",2000,4));
        produitRepository.save(new Produit(null,"Keyboard",200,20));

        List<Produit> products= produitRepository.findAll();
        products.forEach(produit -> {
            System.out.println(produit.toString());
        });
Produit p=produitRepository.findById(Long.valueOf(1)).get();
        System.out.println("****************");
        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.getPrice());
        System.out.println(p.getQuantity());
        System.out.println("****************");


        System.out.println("------------------");
        List<Produit> products=produitRepository.findByNameContains("o");
        products.forEach(produit -> {
            System.out.println(produit.toString());
        });
        System.out.println("------------------");
        List<Produit> products2=produitRepository.search("%o%");
        products2.forEach(produit -> {
            System.out.println(produit.toString());
        });
*/
        System.out.println("Price ------------------");
        List<Produit> products=produitRepository.findByPriceGreaterThan(500);
        products.forEach(produit -> {
            System.out.println(produit.toString());
        });
        System.out.println("------------------");
        List<Produit> products2=produitRepository.pricesup(500);
        products2.forEach(produit -> {
            System.out.println(produit.toString());
        });

    }
}
