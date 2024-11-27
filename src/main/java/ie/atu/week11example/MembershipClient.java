package ie.atu.week11example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="membership-service", url = "http://localhost:8082/membership")
public interface MembershipClient {
    @PostMapping
    public String NewMembership(Person person);
}
