package controller;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;
    
    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }
    
    @GetMapping("/{id}")
    public Transaction getTransactionById(@PathVariable Long id) {
        return transactionService.getTransactionById(id);
    }
    
    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }
    
    @PutMapping("/{id}")
    public Transaction updateTransaction(@PathVariable Long id, @RequestBody Transaction transaction) {
        return transactionService.updateTransaction(transaction);
    }
    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable Long id) {
        transactionService.deleteTransaction(id);
    }
}

