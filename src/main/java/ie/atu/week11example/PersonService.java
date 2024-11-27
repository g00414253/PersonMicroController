package ie.atu.week11example;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private PaymentClient paymentClient;
    private MembershipClient membershipClient;

   // private PersonRepository personRepository;
    //public PersonService(PersonRepository personRepository) {
      //  this.personRepository = personRepository;
    //}

    public PersonService(PaymentClient paymentClient, MembershipClient membershipClient) {
        this.paymentClient = paymentClient;
        this.membershipClient = membershipClient;
    }


    // Placeholder method to save a person (add to Db in the next two weeks)
    public void savePerson(Person person) {
      //  personRepository.save(person);
        System.out.println("Person saved: " + person);
        String responsePay = paymentClient.makePayment(person);
        String responseMem  = membershipClient.NewMembership(person);
    }

    // Placeholder method to retrieve a person by employeeId
    public Person getPersonByEmployeeId(String employeeId) {
        // fetch data from a database in future lab
        // For simplicity, we return a dummy person here
        return new Person();
    }
}
