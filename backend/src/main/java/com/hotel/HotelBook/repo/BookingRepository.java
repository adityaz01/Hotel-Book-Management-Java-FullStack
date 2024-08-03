package com.hotel.HotelBook.repo;

import com.hotel.HotelBook.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking ,Long> {

    List<Booking> findByRoomId(Long roomID);

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);

    List<Booking> findByUserId(Long userId);
}
