package ru.scli.lawyersmigration.repository.db2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.scli.lawyersmigration.model.db1.CancelledCertificatesForeign;

@Repository
public interface CancelledCertificatesForeignRepository2 extends JpaRepository<CancelledCertificatesForeign, Long> {
}
