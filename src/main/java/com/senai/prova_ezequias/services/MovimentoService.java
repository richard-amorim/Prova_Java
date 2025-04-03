package com.senai.prova_ezequias.services;

import com.senai.prova_ezequias.dtos.MovimentoDTO;
import com.senai.prova_ezequias.models.Movimento;
import com.senai.prova_ezequias.repository.MovimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovimentoService {

    @Autowired
    private MovimentoRepository movimentoRepository;

    @Transactional(readOnly = true)
    public MovimentoDTO getMovimentoById(Long id) {
        return movimentoRepository.findById(id).map(movimento
                -> new
                MovimentoDTO(movimento.getId(),
                movimento.getDataMovimento(),
                movimento.getValor(),
                movimento.getClassificacao(),
                movimento.getObservacao())).orElse(null);
    }

    @Transactional
    public MovimentoDTO createMovimento(MovimentoDTO movimentoDTO) {
        Movimento movimento = new Movimento();
        movimento.setDataMovimento(movimentoDTO.getDataMovimento());
        movimento.setValor(movimentoDTO.getValor());
        movimento.setClassificacao(movimentoDTO.getClassificacao());
        movimento.setObservacao(movimentoDTO.getObservacao());
        movimento = movimentoRepository.save(movimento);
        return new MovimentoDTO(movimento);
    }

    @Transactional(readOnly = true)
    public List<MovimentoDTO> findAll() {
        return movimentoRepository.findAll().stream().map(movimento
                -> new MovimentoDTO(movimento.getId(),
                movimento.getDataMovimento(),
                movimento.getValor(),
                movimento.getClassificacao(),
                movimento.getObservacao())).collect(Collectors.toList());
    }


    @Transactional(readOnly = true)
    public MovimentoDTO updateMovimento(Long id, MovimentoDTO movimentoDTO) {
        Movimento movimento = movimentoRepository.findById(id).orElseThrow(( ()
                -> new ResourceNotFoundException("Movimento not found")));

        movimento.setDataMovimento(movimentoDTO.getDataMovimento());
        movimento.setValor(movimentoDTO.getValor());
        movimento.setClassificacao(movimentoDTO.getClassificacao());
        movimento.setObservacao(movimentoDTO.getObservacao());
        movimento = movimentoRepository.save(movimento);
        return new MovimentoDTO(movimento);

    }

    @Transactional
    public void deleteMovimento(Long id) {
        Movimento movimento = movimentoRepository.findById(id).orElseThrow(( ()
                -> new ResourceNotFoundException("Movimento not found")));
        if (!movimentoRepository.existsById(id)) {
            throw new ResourceNotFoundException("Movimento not found");
        }
        movimentoRepository.deleteById(id);
    }
}
