package WelcomeAPI.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "WELCOME-API")
public interface WelcomeAPIClient
{
    @GetMapping("/welcome")
    public String invokeWelcomeMsg();
}
