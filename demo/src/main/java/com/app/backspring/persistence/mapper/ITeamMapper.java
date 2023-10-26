package com.app.backspring.persistence.mapper;

import com.app.backspring.domain.dto.TeamDto;
import com.app.backspring.persistence.entity.Team;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ITeamMapper {

    @Mapping(source = "name", target = "name")
    @Mapping(source = "city", target = "city")
    @Mapping(source = "conference", target = "conference")
    @Mapping(source = "division", target = "division")
    TeamDto toTeamDto (Team x);

    @InheritInverseConfiguration
    Team toTeam (TeamDto x);
    List<TeamDto> toTeamsDto(List<Team> teams);

}
