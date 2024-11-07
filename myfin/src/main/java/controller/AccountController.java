package controller;


@RestController
@RequestMapping("/api/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;

@GetMapping
public List<Account> getAllAccounts() {
    return accountService.getAllAccounts();
}

@GetMapping("/{id}")
public Account getAccountById(@PathVariable Long id) {
    return accountService.getAccountById(id);
}

@PostMapping
public Account createAccount(@RequestBody Account account) {
    return accountService.createAccount(account);
}

@PutMapping("/{id}")
public Account updateAccount(@PathVariable Long id, @RequestBody Account account) {
    return accountService.updateAccount(account);
}

@DeleteMapping("/{id}")
public void deleteAccount(@PathVariable Long id) {
    accountService.deleteAccount(id);
}
}
