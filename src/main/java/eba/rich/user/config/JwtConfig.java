package eba.rich.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;

@Configuration
public class JwtConfig {

    private static final String SECRET_KEY = "U7y1eE3t1Kp9rLmVzA1casljhlasgajjnoojaaDeFgHiJkLmnO"; // 256-bit key (min 32 karakter)

    @Bean
    public JwtDecoder jwtDecoder() {
        return NimbusJwtDecoder.withSecretKey(
                new javax.crypto.spec.SecretKeySpec(SECRET_KEY.getBytes(), "HmacSHA256")
        ).build();
    }
}