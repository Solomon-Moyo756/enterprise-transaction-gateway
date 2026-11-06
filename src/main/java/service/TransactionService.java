package service;

import converter.ConvertFromListTransactionToListDto;
import dto.TransactionDto;
import entity.Transaction;
import org.springframework.stereotype.Service;
import repository.TransactionRepository;

import java.util.List;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;
    private final ConvertFromListTransactionToListDto convertFromListTransactionToListDto;

    public TransactionService(TransactionRepository transactionRepository, ConvertFromListTransactionToListDto convertFromListTransactionToListDto) {
        this.transactionRepository = transactionRepository;
        this.convertFromListTransactionToListDto = convertFromListTransactionToListDto;
    }

    public List<TransactionDto> getTransactions() {
        List<Transaction> transactions = transactionRepository.findAll();
        return convertFromListTransactionToListDto.convertFromListTransactionToListEbo(transactions);
    }
}
