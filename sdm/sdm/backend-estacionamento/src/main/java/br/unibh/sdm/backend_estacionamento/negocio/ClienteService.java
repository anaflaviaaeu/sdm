package br.unibh.sdm.backend_estacionamento.negocio;

import br.unibh.sdm.backend_estacionamento.entidades.Cliente;
import br.unibh.sdm.backend_estacionamento.persistencia.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> buscarClientePorId(int id) {
        return clienteRepository.findById(id);
    }

    public Iterable<Cliente> buscarTodosClientes() {
        return clienteRepository.findAll();
    }

    public void deletarCliente(int id) {
        clienteRepository.deleteById(id);
    }
}
