package idistbootcamptima.miniproject.service;

import idistbootcamptima.miniproject.model.dao.Transaction;
import idistbootcamptima.miniproject.model.repo.TransactionRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j //logging
public class TransactionServiceImpl implements TransactionService{

    private final TransactionRepo transactinRepo;

    @Override
    public Transaction saveTransaction(Transaction transaction) {
        log.info("Saving new transaction {} to the database", transaction.getStatus());
        return transactinRepo.save(transaction);
    }

    @Override
    public List<Transaction> getTransactions() {
        log.info("Fetching all transaction");
        return transactinRepo.findAll();
    }
}
