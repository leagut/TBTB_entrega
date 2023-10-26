package com.app.backspring.persistence.crud;

import com.app.backspring.persistence.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeamCrudRepository extends JpaRepository<Team,String> {

}
