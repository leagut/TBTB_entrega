package com.app.backspring.persistence.repository;

import com.app.backspring.domain.dto.TeamDto;
import com.app.backspring.domain.respository.ITeamRepository;
import com.app.backspring.persistence.crud.ITeamCrudRepository;
import com.app.backspring.persistence.entity.Team;
import com.app.backspring.persistence.mapper.ITeamMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class TeamRepository implements ITeamRepository {

    private final ITeamCrudRepository iTeamCrudRepository;
    private final ITeamMapper iTeamMapper;

    @Override
    public List<TeamDto> getAll() {
        return iTeamMapper.toTeamsDto(iTeamCrudRepository.findAll());
    }

    @Override
    public Optional<TeamDto> getById(String nombre) {
        return iTeamCrudRepository.findById(nombre).map(x -> iTeamMapper.toTeamDto(x));
    }

    @Override
    public TeamDto save(TeamDto newTeamDto) {
        Team team = iTeamMapper.toTeam(newTeamDto);
        return iTeamMapper.toTeamDto(iTeamCrudRepository.save(team));
    }

    @Override
    public void delete(String nombre) {
        iTeamCrudRepository.deleteById(nombre);
    }

}
