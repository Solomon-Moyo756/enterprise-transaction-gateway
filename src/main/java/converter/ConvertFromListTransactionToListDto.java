package converter;

import dto.TransactionDto;
import entity.Transaction;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ConvertFromListTransactionToListDto {

    public List<TransactionDto> convertFromListTransactionToListEbo(List<Transaction> transactions) {
        List<TransactionDto> transactionDtos = new ArrayList<>();
        Optional.ofNullable(transactions)
                .ifPresent(transactionList ->
                        transactionList.forEach(transaction -> {
                            TransactionDto transactionDto = new TransactionDto();
                            ///TODO: Map from transaction to transactionDTO
                            transactionDtos.add(transactionDto);

                            // logic
                        })
                );
        return transactionDtos;
    }

}
