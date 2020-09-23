package ru.scli.lawyersmigration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.scli.lawyersmigration.model.db1.Lawyer;
import ru.scli.lawyersmigration.repository.db1.LawyerRepository;
import ru.scli.lawyersmigration.repository.db2.LawyerRepository2;

import java.util.List;

@Service
public class LawyerService {

    @Autowired
    LawyerRepository lawyerRepository;

    @Autowired
    LawyerRepository2 lawyerRepository2;

    public List<Lawyer> getAllLawyer(){
        return lawyerRepository.findAll();
    }


    public void saveAllLawyer(List<Lawyer> lawyerList){
        lawyerRepository2.saveAll(lawyerList);
//        for (Lawyer lawyer : lawyerList){
//            System.out.println(lawyer.getId());
//            lawyerRepository2.save(lawyer);
//        }
    }
}
