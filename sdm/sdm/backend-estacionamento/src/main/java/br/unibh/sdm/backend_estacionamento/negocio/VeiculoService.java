package br.unibh.sdm.backend_estacionamento.negocio;

import br.unibh.sdm.backend_estacionamento.entidades.Veiculo;
import br.unibh.sdm.backend_estacionamento.persistencia.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Veiculo salvarVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public Optional<Veiculo> buscarVeiculoPorPlaca(String placa) {
        return veiculoRepository.findById(placa);
    }

    public Iterable<Veiculo> buscarTodosVeiculos() {
        return veiculoRepository.findAll();
    }

    public void deletarVeiculo(String placa) {
        veiculoRepository.deleteById(placa);
    }

}
