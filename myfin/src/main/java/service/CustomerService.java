package service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElseThrow();
    }
    
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}

