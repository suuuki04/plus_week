package com.example.demo.dto;

import com.example.demo.entity.Reservation;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ReservationRequestDto {
    private Long itemId;
    private Long userId;
    private LocalDateTime startAt;
    private LocalDateTime endAt;

    public ReservationRequestDto(Reservation reservation) {
        this.itemId = reservation.getItem().getId();
        this.userId = reservation.getUser().getId();
        this.startAt = reservation.getStartAt();
        this.endAt = reservation.getEndAt();
    }
}
