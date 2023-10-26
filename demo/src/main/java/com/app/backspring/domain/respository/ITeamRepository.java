package com.app.backspring.domain.respository;

import com.app.backspring.domain.dto.TeamDto;

import java.util.List;
import java.util.Optional;

public interface ITeamRepository {
    List<TeamDto> getAll();
    Optional<TeamDto>getById(String nombre);
    TeamDto save (TeamDto newTeamDto);
    void delete (String nombre);

}
