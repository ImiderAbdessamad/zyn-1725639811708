import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InsecureApplication {
    private static final String SECRET_KEY = "THIS_IS_A_VERY_SECRET_KEY_12345";

    public static void main(String[] args) {
        SpringApplication.run(InsecureApplication.class, args);
        System.out.println("Secret key: " + SECRET_KEY);
    }
}