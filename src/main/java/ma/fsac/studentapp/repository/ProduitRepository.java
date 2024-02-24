package ma.fsac.studentapp.repository;

import ma.fsac.studentapp.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
    //premier methode
    List<Produit> findByNameContains(String mc);
    List<Produit> findByPriceGreaterThan(double price);

    //deuxieme methode
    @Query("select p from Produit p where p.name like :x")
    List<Produit> search(@Param("x") String mc);
    @Query("select p from Produit  p where p.price > :x")
    List<Produit> pricesup(@Param("x") double price);

}
