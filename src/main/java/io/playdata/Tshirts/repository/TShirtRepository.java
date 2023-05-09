package io.playdata.Tshirts.repository;
import io.playdata.Tshirts.model.TShirt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TShirtRepository extends JpaRepository<TShirt, Long> {
}