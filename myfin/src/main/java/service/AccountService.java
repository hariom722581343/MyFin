package service;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
    
    public Account getAccountById(Long id) {
        return accountRepository.findById(id).orElseThrow();
    }
    
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }
    
    public Account updateAccount(Account account) {
        return accountRepository.save(account);
    }
    
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }
}

