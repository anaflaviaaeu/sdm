package br.unibh.sdm.backend_estacionamento.rest;

import br.unibh.sdm.backend_estacionamento.entidades.Veiculo;
import br.unibh.sdm.backend_estacionamento.negocio.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @PostMapping
    public Veiculo salvar(@RequestBody Veiculo veiculo) {
        return veiculoService.salvarVeiculo(veiculo);
    }

    @GetMapping("/{placa}")
    public Optional<Veiculo> buscarPorPlaca(@PathVariable String placa) {
        return veiculoService.buscarVeiculoPorPlaca(placa);
    }

    @GetMapping
    public Iterable<Veiculo> buscarTodos() {
        return veiculoService.buscarTodosVeiculos();
    }

    @DeleteMapping("/{placa}")
    public void deletar(@PathVariable String placa) {
        veiculoService.deletarVeiculo(placa);
    }
}
