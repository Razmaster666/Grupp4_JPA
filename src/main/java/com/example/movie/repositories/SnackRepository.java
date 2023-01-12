package com.example.movie.repositories;

import com.example.movie.models.Snack;
import org.springframework.data.repository.CrudRepository;

public interface SnackRepository extends CrudRepository <Snack, Long> {

}
