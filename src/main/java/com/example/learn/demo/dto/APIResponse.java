package com.example.learn.demo.dto;

import lombok.*;

import java.util.List;

@ToString
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class APIResponse<T> {
    private T results;
    private List<Error> error;
    private String status;



}
