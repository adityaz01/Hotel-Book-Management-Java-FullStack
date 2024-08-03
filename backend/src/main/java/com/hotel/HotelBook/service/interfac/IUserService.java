package com.hotel.HotelBook.service.interfac;

import com.hotel.HotelBook.dto.LoginRequest;
import com.hotel.HotelBook.dto.Response;
import com.hotel.HotelBook.entity.User;

public interface IUserService {

    Response register(User user);

    Response login (LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
