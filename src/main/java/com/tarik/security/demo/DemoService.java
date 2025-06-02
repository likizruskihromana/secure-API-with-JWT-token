package com.tarik.security.demo;

import com.tarik.security.exceptions.ObjectNotValidException;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class DemoService {
    public String throwException() {
        Set<String> errorMessages;
        errorMessages = new HashSet<>();
        errorMessages.add("Not Valid Object");
        errorMessages.add("Not Valid Object To Fuck");
        throw new ObjectNotValidException(errorMessages);
    }
}
