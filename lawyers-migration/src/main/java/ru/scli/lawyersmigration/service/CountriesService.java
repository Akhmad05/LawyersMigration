package ru.scli.lawyersmigration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.scli.lawyersmigration.model.db1.Countries;
import ru.scli.lawyersmigration.repository.db1.CountriesRepository;
import ru.scli.lawyersmigration.repository.db2.CountriesRepository2;

import java.util.List;

@Service
public class CountriesService {

    @Autowired
    CountriesRepository countriesRepository;

    @Autowired
    CountriesRepository2 countriesRepository2;

    public List<Countries> getAllCountries(){
        return countriesRepository.findAll();
    }

    public void saveAllCountries(List<Countries> countriesList){
        countriesRepository2.saveAll(countriesList);
    }
}
