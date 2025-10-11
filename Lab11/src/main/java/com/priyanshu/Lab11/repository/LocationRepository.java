package com.priyanshu.Lab11.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.priyanshu.Lab11.entity.Location;
public interface LocationRepository extends JpaRepository<Location, Integer> { }
