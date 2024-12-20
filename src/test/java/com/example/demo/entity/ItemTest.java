package com.example.demo.entity;

import com.example.demo.repository.ItemRepository;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@Transactional
class ItemTest {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    @DisplayName("Null일때 아이템 기본값 설정 확인")
    void testItemStatusNotNullAndDefaultStatus() {

        String defaultStatus = "PENDING";

        User admin = new User("admin", "admin@gmail.com", "admin", "Test!1234");
        User user = new User("user", "user@gmail.com", "user", "Test!1234");

        Item item = new Item("이름", "설명", admin, user);

        item.setStatus(defaultStatus);

        Item savedItem = itemRepository.save(item);

        assertNotNull(savedItem);
        assertEquals(defaultStatus, savedItem.getStatus());
    }
}