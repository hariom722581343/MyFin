package service;

@Service
public class LoanService {
    @Autowired
    private LoanRepository loanRepository;
    
    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }
    
    public Loan getLoanById(Long id) {
        return loanRepository.findById(id).orElseThrow();
    }
    
    public Loan createLoan(Loan loan) {
        return loanRepository.save(loan);
    }
    
    public Loan updateLoan(Loan loan) {
        return loanRepository.save(loan);
    }
    
    public void deleteLoan(Long id) {
        loanRepository.deleteById(id);
    }
}

