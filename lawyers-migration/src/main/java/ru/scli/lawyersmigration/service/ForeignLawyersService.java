package ru.scli.lawyersmigration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.scli.lawyersmigration.model.db1.ForeignLawyers;
import ru.scli.lawyersmigration.repository.db1.ForeignLawyersRepository;
import ru.scli.lawyersmigration.repository.db2.ForeignLawyersRepository2;

import java.util.List;

@Service
public class ForeignLawyersService {

    @Autowired
    ForeignLawyersRepository foreignLawyersRepository;
    @Autowired
    ForeignLawyersRepository2 foreignLawyersRepository2;

    public List<ForeignLawyers> getAllForeignLawyers(){
        return foreignLawyersRepository.findAll();
    }

    public void saveAllForeignLawyers(List<ForeignLawyers> foreignLawyersList){
        foreignLawyersRepository2.saveAll(foreignLawyersList);
    }
}
