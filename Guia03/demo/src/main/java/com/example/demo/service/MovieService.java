package com.example.demo.service;
import com.example.demo.repository.domain.Movie;

public interface MovieService {
    Movie findMovieById(final Long id);
}
