package ru.scli.lawyersmigration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.scli.lawyersmigration.model.db1.CancelledCertificates;
import ru.scli.lawyersmigration.repository.db1.CancelledCertificatesRepository;
import ru.scli.lawyersmigration.repository.db2.CancelledCertificatesRepository2;

import java.util.List;

@Service
public class CancelledCertificatesService {

    @Autowired
    CancelledCertificatesRepository canceledCertificatesRepository;

    @Autowired
    CancelledCertificatesRepository2 cancelledCertificatesRepository2;

    public List<CancelledCertificates> getAllCancelledCertificates(){
        return canceledCertificatesRepository.findAll();
    }

    public void saveAllCancelledCertificates(List<CancelledCertificates> cancelledCertificates2List){
        cancelledCertificatesRepository2.saveAll(cancelledCertificates2List);
    }
}
