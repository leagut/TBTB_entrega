package com.app.backspring.domain.service;

import com.app.backspring.domain.dto.TeamDto;
import com.app.backspring.domain.useCase.ITeamUseCase;
import com.app.backspring.persistence.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class TeamService implements ITeamUseCase {

    private final TeamRepository teamRepository;
    @Override
    public List<TeamDto> getAll() {
        return teamRepository.getAll();
    }

    @Override
    public Optional<TeamDto> getById(String nombre) {
        return teamRepository.getById(nombre);
    }

    @Override
    public TeamDto save(TeamDto newTeamDto) {

        if(teamRepository.getById(newTeamDto.getName()).isEmpty()){
            return teamRepository.save(newTeamDto);
        }
        return null;
    }

    @Override
    public boolean delete(String nombre) {
        if(teamRepository.getById(nombre).isEmpty()) {

            return  false;
        }
        teamRepository.delete(nombre);
        return true;
    }

    @Override
    public TeamDto update(TeamDto newTeam) {
        if(teamRepository.getById(newTeam.getName()).isEmpty()){
            return null;
        }
        return teamRepository.save(newTeam);
    }
}
