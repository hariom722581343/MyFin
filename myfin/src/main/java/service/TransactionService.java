package service;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;
    
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
    
    public Transaction getTransactionById(Long id) {
        return transactionRepository.findById(id).orElseThrow();
    }
    
    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
    
    public Transaction updateTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
    
    public void deleteTransaction(Long id) {
        transactionRepository.deleteById(id);
    }
}

