package com.example.demo.status;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ReservationStatus {
    PENDING,
    APPROVED,
    CANCELED,
    EXPIRED;

    public boolean canTransitionTo(ReservationStatus newStatus) {
        switch (this) {
            case PENDING:
                return newStatus == APPROVED || newStatus == EXPIRED;
            case APPROVED:
                return newStatus == CANCELED;
            case CANCELED:
                return newStatus == EXPIRED;
            case EXPIRED:
                return false;
            default:
                return false;
        }
    }
}