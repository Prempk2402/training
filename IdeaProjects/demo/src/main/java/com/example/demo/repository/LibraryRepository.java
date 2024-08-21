package com.example.demo.repository;

import com.example.demo.entity.ManyToMany.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<Library,Long> {
}