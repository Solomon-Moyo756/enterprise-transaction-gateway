package controller;

import dto.TransactionDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.TransactionService;

import java.util.List;

@RestController
@RequestMapping("api/")
public class TransactionController {
    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("transactions")
    public List<TransactionDto> getTransactions() {
        return transactionService.getTransactions();
    }
}
