package com.example.demo.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordEncoderTest {

    @Test
    @DisplayName("비밀번호 인코딩")
    public void testEncode() {
        String rawPassword = "sparta1234";
        String encodedPassword = PasswordEncoder.encode(rawPassword);
        assertNotNull(encodedPassword);
        assertNotNull(rawPassword, encodedPassword);
    }

    @Test
    @DisplayName("인코딩된 비밀번호 일치 하는지 확인")
    public void testMatches() {
        String rawPassword = "sparta1234";
        String encodedPassword = PasswordEncoder.encode(rawPassword);

        //일치 시 true
        assertTrue(PasswordEncoder.matches(rawPassword, encodedPassword));
        //일치 안할시 false
        assertFalse(PasswordEncoder.matches("wrongPassword", encodedPassword));
    }
}