package pro.sky.ShoppingCart.service;

import java.util.List;

public interface CartService {
    List<Integer> addItems(List<Integer> idList);

    List<Integer> getItems();
}