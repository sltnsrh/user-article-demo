package com.salatin.demouser.service;

import com.salatin.demouser.model.User;
import com.salatin.demouser.model.dto.request.UserLoginRequestDto;
import com.salatin.demouser.model.dto.response.UserLoginResponseDto;

public interface AuthService {

    User register(User user);
    UserLoginResponseDto login(UserLoginRequestDto requestDto);
}
