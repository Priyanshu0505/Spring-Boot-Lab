package com.priyanshu.Lab10.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.priyanshu.Lab10.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> { }
