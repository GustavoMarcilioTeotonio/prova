package com.senai.prova.services;

import com.senai.prova.dtos.MovimentoDTO;
import com.senai.prova.models.Movimento;
import com.senai.prova.repositories.MovimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;

@Service
public class MovimentoService {

    @Autowired
    MovimentoRepository movimentoRepository;

    public MovimentoDTO salvarMovimento (MovimentoDTO movimentoDTO) {
        Movimento movimento = converterMovimentoDTOParaMovimento(movimentoDTO);
        movimento = movimentoRepository.save(movimento);
        return converterMovimentoParaMovimentoDTO(movimento);

    }
    public MovimentoDTO converterMovimentoParaMovimentoDTO(Movimento movimento){
        MovimentoDTO movimentoDTO = new MovimentoDTO();
        movimentoDTO.setId(movimento.getId());
        movimentoDTO.setData_movimento(movimento.getData_movimento());
        movimentoDTO.setClassificacao(movimento.getClassificacao());
        movimentoDTO.setValor(movimento.getValor());
        return movimentoDTO;
    }

    public Movimento converterMovimentoDTOParaMovimento (MovimentoDTO movimentoDTO){
        Movimento movimento = new Movimento();
        movimento.setId(movimentoDTO.getId());
        movimento.setData_movimento(movimentoDTO.getData_movimento());
        movimento.setClassificacao(movimentoDTO.getClassificacao());
        movimento.setValor(movimentoDTO.getValor());
        return movimento;
    }

    public Movimento buscarMovimentoPorId(Long id) {
        return movimentoRepository.findById(id)
                .orElseThrow(() ->
                        new IllegalArgumentException("Movimento não encontrada"));
    }

    public MovimentoDTO atualizarMovimento(MovimentoDTO movimentoDTO) {
        if (isNull(movimentoDTO.getId())) {
            throw new IllegalArgumentException("campo Id não informado");
        }
        Movimento movimento = movimentoRepository.findById(movimentoDTO.getId())
                .orElseThrow(() ->
                        new IllegalArgumentException("Movimento não encontrada"));

        movimento = converterMovimentoDTOParaMovimento(movimentoDTO);
        movimento = movimentoRepository.save(movimento);
        return converterMovimentoParaMovimentoDTO(movimento);
    }

    public void deletarMovimento(Long id) {
        movimentoRepository.deleteById(id);
    }

}