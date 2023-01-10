package idistbootcamptima.miniproject.model.repo;

import idistbootcamptima.miniproject.model.dao.Transaction;
import idistbootcamptima.miniproject.model.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepo extends JpaRepository<Transaction, Long> {

    Transaction findByStatus(String status);
}
