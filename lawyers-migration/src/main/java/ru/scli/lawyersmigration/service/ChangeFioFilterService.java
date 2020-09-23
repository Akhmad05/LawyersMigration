package ru.scli.lawyersmigration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.scli.lawyersmigration.model.db1.ChangeFioFilter;
import ru.scli.lawyersmigration.repository.db1.ChangeFioFilterRepository;
import ru.scli.lawyersmigration.repository.db2.ChangeFioFilterRepository2;

import java.util.List;

@Service
public class ChangeFioFilterService {

    @Autowired
    ChangeFioFilterRepository changeFioFilterRepository;
    @Autowired
    ChangeFioFilterRepository2 changeFioFilterRepository2;

    public List<ChangeFioFilter> getAllChangeFioFilter(){
        return changeFioFilterRepository.findAll();
    }

    public void saveAllChangeFioFilter(List<ChangeFioFilter> changeFioFilterList){
        changeFioFilterRepository2.saveAll(changeFioFilterList);
    }
}
