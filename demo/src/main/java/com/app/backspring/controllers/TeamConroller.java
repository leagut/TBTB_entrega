package com.app.backspring.controllers;

import com.app.backspring.domain.dto.TeamDto;
import com.app.backspring.domain.useCase.ITeamUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/team")
public class TeamConroller {
    private final ITeamUseCase iTeamUseCase;

    @GetMapping()
    public ResponseEntity<List<TeamDto>> getAll(){
        return ResponseEntity.ok(iTeamUseCase.getAll());
    }

    @GetMapping(path = "/{nombre}")
    public ResponseEntity<TeamDto> getTeam(@PathVariable String nombre){
        return ResponseEntity.of(iTeamUseCase.getById(nombre));
    }

        @PostMapping()
        public ResponseEntity<?>save(@RequestBody TeamDto teamDto){

            if(teamDto.getName().isBlank()){
                String mensaje = "faltan argumentos para poder guardar";
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mensaje);
            }

            TeamDto teamDtoDto = iTeamUseCase.save(teamDto);
            if (teamDtoDto ==null){
                String mensaje = "El equipo ya existe en la base de datos.";
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(mensaje);

            } else {
                return ResponseEntity.status(HttpStatus.OK).body(teamDtoDto);
            }

        }

    @PatchMapping
    public ResponseEntity<TeamDto> update(@RequestBody TeamDto teamDtooUpdate) {
        TeamDto teamDtoDto = iTeamUseCase.update(teamDtooUpdate);
        if (teamDtoDto ==null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

        } else {
            return ResponseEntity.status(HttpStatus.OK).body(teamDtoDto);
        }
    }

    @DeleteMapping("/{nombre}")
    public ResponseEntity<Boolean>delete(@PathVariable String nombre){
        return new ResponseEntity<>(this.iTeamUseCase.delete(nombre) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }


}
