package ru.scli.lawyersmigration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.scli.lawyersmigration.model.db1.Regions;
import ru.scli.lawyersmigration.repository.db1.RegionsRepository;
import ru.scli.lawyersmigration.repository.db2.RegionsRepository2;

import java.util.List;

@Service
public class RegionsService {

    @Autowired
    RegionsRepository regionRepository;
    @Autowired
    RegionsRepository2 regionsRepository2;

    public List<Regions> getAllRegions(){
        return regionRepository.findAll();
    }

    public void saveAllRegions(List<Regions> regionList){
        regionsRepository2.saveAll(regionList);
    }
}
