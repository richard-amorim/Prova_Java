package com.senai.prova_ezequias.resources;

import com.senai.prova_ezequias.dtos.MovimentoDTO;
import com.senai.prova_ezequias.models.Movimento;
import com.senai.prova_ezequias.services.MovimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movimento")
public class MovimentoController {

    @Autowired
    private MovimentoService movimentoService;

    @PostMapping
    public ResponseEntity<MovimentoDTO> createMovimento(@RequestBody MovimentoDTO movimentoDTO) {
        MovimentoDTO novoMovimento = movimentoService.createMovimento(movimentoDTO);
        return new ResponseEntity<>(new MovimentoDTO(), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovimentoDTO> getMovimentoById(@PathVariable Long id) {
        MovimentoDTO movimentoDTO =  movimentoService.getMovimentoById(id);
        return new ResponseEntity<>(new MovimentoDTO(), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<MovimentoDTO> getAllMovimento() {
        List<MovimentoDTO> list = movimentoService.findAll();
        return new ResponseEntity<>(new MovimentoDTO(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MovimentoDTO> updateMovimento(@PathVariable Long id, @RequestBody MovimentoDTO movimentoDTO) {
        MovimentoDTO movimento = movimentoService.updateMovimento(id, movimentoDTO);
        return new ResponseEntity<>(new MovimentoDTO(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteMovimento(@PathVariable Long id) {
        movimentoService.deleteMovimento(id);
    }


}
