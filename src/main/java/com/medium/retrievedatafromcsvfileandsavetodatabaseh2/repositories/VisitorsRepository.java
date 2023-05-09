package com.medium.retrievedatafromcsvfileandsavetodatabaseh2.repositories;

import com.medium.retrievedatafromcsvfileandsavetodatabaseh2.dto.Visitors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorsRepository extends JpaRepository<Visitors, Long> {
}
