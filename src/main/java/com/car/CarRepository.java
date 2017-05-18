package com.car;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car,String> {

    public List<Car> findByMakeInAndYearIn(String make, String year);

    @Query(nativeQuery=true, value="SELECT * FROM Car c where c.id < 5")
    public List<Car> findCar();
}
