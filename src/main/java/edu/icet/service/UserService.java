package edu.icet.service;

import edu.icet.model.dto.UserDto;

public interface UserService {
    void registerUser(UserDto userDto);
    boolean verifyCustomerOtp(String email, String enteredOtp);
    void approveUser(Long userId);
}