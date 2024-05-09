package com.gianna.demo3.carpentry_mis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarpentersService {

    private final CarpentersRepository carpentersRepository;

    @Autowired
    public CarpentersService(CarpentersRepository carpentersRepository) {
        this.carpentersRepository = carpentersRepository;
    }

    public List<Carpenters> getAllCarpenters() {
        return carpentersRepository.findAll();
    }

    public Optional<Carpenters> getCarpenterById(Long id) {
        return carpentersRepository.findById(id);
    }

    public void saveCarpenter(Carpenters carpenter) {
        carpentersRepository.save(carpenter);
    }

    public void deleteCarpenter(Long id) {
        carpentersRepository.deleteById(id);
    }



    // Other service methods for CRUD operations
}
