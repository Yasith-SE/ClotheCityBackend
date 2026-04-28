package edu.icet.repository;

import edu.icet.model.entity.SellItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellItemRepository extends JpaRepository<SellItemEntity, Long> {
}