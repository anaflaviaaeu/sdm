package br.unibh.sdm.backend_estacionamento.persistencia;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import br.unibh.sdm.backend_estacionamento.entidades.Veiculo;

@EnableScan
public interface VeiculoRepository extends CrudRepository<Veiculo, String> {
}
