package com.deppit.feature.toggle.server.service;

import com.deppit.feature.toggle.model.Feature;
import com.deppit.feature.toggle.server.repository.FeatureRepository;
import com.deppit.feature.toggle.service.FeatureDataServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FeatureDataServiceImpl implements FeatureDataServices {

    private final FeatureRepository featureRepository;

    @Override
    public List<Feature> loadData(List<Feature> set) {

        return featureRepository.findAll().stream()
                .map(m -> Feature.builder()
                        .id(m.getId())
                        .name(m.getName())
                        .enable(m.getEnable())
                        .build()
                ).collect(Collectors.toList());
    }
}