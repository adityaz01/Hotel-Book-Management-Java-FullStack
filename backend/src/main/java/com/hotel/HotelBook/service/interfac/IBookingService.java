package com.hotel.HotelBook.service.interfac;

import com.hotel.HotelBook.dto.Response;
import com.hotel.HotelBook.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);
}
