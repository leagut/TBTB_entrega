package com.app.backspring.domain.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamDto {
    private String name;
    private String city;
    private String conference;
    private String division;
}
