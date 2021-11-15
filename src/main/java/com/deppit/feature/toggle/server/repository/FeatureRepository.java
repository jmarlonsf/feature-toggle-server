package com.deppit.feature.toggle.server.repository;

import com.deppit.feature.toggle.server.entity.Feature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeatureRepository extends JpaRepository<Feature, Long> { }