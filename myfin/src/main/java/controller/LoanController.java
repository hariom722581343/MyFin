package controller;

@RestController
@RequestMapping("/api/loans")
public class LoanController {
    @Autowired
    private LoanService loanService;
    
    @GetMapping
    public List<Loan> getAllLoans() {
        return loanService.getAllLoans();
    }
    
    @GetMapping("/{id}")
    public Loan getLoanById(@PathVariable Long id) {
        return loanService.getLoanById(id);
    }
    
    @PostMapping
    public Loan createLoan(@RequestBody Loan loan) {
        return loanService.createLoan(loan);
    }
    
    @PutMapping("/{id}")
    public Loan updateLoan(@PathVariable Long id, @RequestBody Loan loan) {
        return loanService.updateLoan(loan);
    }
    @DeleteMapping("/{id}")
    public void deleteLoan(@PathVariable Long id) {
        loanService.deleteLoan(id);
    }
}
