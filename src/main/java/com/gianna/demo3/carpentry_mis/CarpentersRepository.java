package com.gianna.demo3.carpentry_mis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

  public interface CarpentersRepository extends JpaRepository<Carpenters, Long> {
    // You can add custom query methods here if needed
}

