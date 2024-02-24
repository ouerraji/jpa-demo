package ma.fsac.studentapp.web;

import ma.fsac.studentapp.entities.Produit;
import ma.fsac.studentapp.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProduitRestService {
    @Autowired
    private ProduitRepository produitRepository;
    @GetMapping("/products")
    public List<Produit> products(){
        return produitRepository.findAll();
    }
    @GetMapping("/products/{id}")
    public Produit FindProduct(@PathVariable Long id){
        return produitRepository.findById(id).get();
    }
}
