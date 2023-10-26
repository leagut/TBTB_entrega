package com.app.backspring.domain.useCase;

import com.app.backspring.domain.dto.TeamDto;

import java.util.List;
import java.util.Optional;

public interface ITeamUseCase {

    List<TeamDto> getAll();
    Optional<TeamDto> getById(String nombre);
    TeamDto save (TeamDto newTeamDto);
    boolean delete (String nombre);
    TeamDto update ( TeamDto newTeam);


}
