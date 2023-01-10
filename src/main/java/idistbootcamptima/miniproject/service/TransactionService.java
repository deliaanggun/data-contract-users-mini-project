package idistbootcamptima.miniproject.service;

import idistbootcamptima.miniproject.model.dao.Transaction;
import idistbootcamptima.miniproject.model.dao.User;

import java.util.List;

public interface TransactionService {

    Transaction saveTransaction(Transaction transaction);
    List<Transaction> getTransactions(); //get all transaction
}
