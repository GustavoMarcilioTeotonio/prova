package com.senai.prova.resources;

import com.senai.prova.dtos.MovimentoDTO;
import com.senai.prova.models.Movimento;
import com.senai.prova.services.MovimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/movimentos")
public class movimentoResource {

    @Autowired
    private MovimentoService movimentoService;
    @GetMapping("{id}")

    public ResponseEntity<MovimentoDTO> buscarMovimentoPorId(@PathVariable Long id) {
        Movimento movimento = movimentoService.buscarMovimentoPorId(id);
        return ResponseEntity.ok(movimentoService.converterMovimentoParaMovimentoDTO(movimento));
    }

    @PostMapping()
    public ResponseEntity<MovimentoDTO> criarMovimento(@RequestBody MovimentoDTO movimentoDTO) {
        return ResponseEntity.ok(movimentoService.salvarMovimento(movimentoDTO));
    }

    @PutMapping()
    public ResponseEntity<MovimentoDTO> atualizarMovimento(@RequestBody MovimentoDTO movimentoDTO) {
        return ResponseEntity.ok(movimentoService.atualizarMovimento(movimentoDTO));
    }

    @DeleteMapping()
    public ResponseEntity<Void> deletarMovimento(@RequestBody MovimentoDTO movimentoDTO)  {
        movimentoService.deletarMovimento(movimentoDTO.getId());
        return ResponseEntity.noContent().build();
    }
}
