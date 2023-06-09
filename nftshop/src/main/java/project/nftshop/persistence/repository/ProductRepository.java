package project.nftshop.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import project.nftshop.persistence.entity.Product;
import project.nftshop.persistence.entity.User;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findAllByProductsNamesIn(@Param("productsNames") Set<String> productsNames);

    Optional<Product> findByProductsNames(String ProductsNames);

    List<Product> findTop4ByOrderByQuantitySaleDesc();

    Boolean existsByProductsNames(String ProductsNames);

    List<Product> findByUser(User user);
}
