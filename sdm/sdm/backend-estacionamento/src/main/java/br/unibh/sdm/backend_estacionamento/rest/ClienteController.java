package br.unibh.sdm.backend_estacionamento.rest;

import br.unibh.sdm.backend_estacionamento.entidades.Cliente;
import br.unibh.sdm.backend_estacionamento.negocio.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return clienteService.salvarCliente(cliente);
    }

    @GetMapping("/{id}")
    public Optional<Cliente> buscarPorId(@PathVariable int id) {
        return clienteService.buscarClientePorId(id);
    }

    @GetMapping
    public Iterable<Cliente> buscarTodos() {
        return clienteService.buscarTodosClientes();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        clienteService.deletarCliente(id);
    }
}
