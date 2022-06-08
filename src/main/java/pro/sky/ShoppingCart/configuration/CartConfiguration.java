package pro.sky.ShoppingCart.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.ShoppingCart.model.Cart;

@Configuration
public class CartConfiguration {

    @Bean
    @SessionScope
    public Cart createCart() {
        return new Cart();
    }
}
