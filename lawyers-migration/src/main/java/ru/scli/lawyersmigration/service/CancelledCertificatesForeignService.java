package ru.scli.lawyersmigration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.scli.lawyersmigration.model.db1.CancelledCertificatesForeign;
import ru.scli.lawyersmigration.repository.db1.CancelledCertificatesForeignRepository;
import ru.scli.lawyersmigration.repository.db2.CancelledCertificatesForeignRepository2;

import java.util.List;

@Service
public class CancelledCertificatesForeignService {
    @Autowired
    CancelledCertificatesForeignRepository cancelledCertificatesForeignRepository;

    @Autowired
    CancelledCertificatesForeignRepository2 cancelledCertificatesForeignRepository2;

    public List<CancelledCertificatesForeign> getAllCancelledCertificatesForeign(){
        return cancelledCertificatesForeignRepository.findAll();
    }

    public void saveAllCancelledCertificatesForeign(List<CancelledCertificatesForeign> cancelledCertificatesForeignList){
        cancelledCertificatesForeignRepository2.saveAll(cancelledCertificatesForeignList);
    }
}
