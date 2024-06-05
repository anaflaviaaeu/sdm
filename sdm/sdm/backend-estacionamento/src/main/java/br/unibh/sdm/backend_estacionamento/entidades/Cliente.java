package br.unibh.sdm.backend_estacionamento.entidades;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "Cliente")
public class Cliente {

    @DynamoDBHashKey(attributeName = "id")
    private int id;

    @DynamoDBAttribute(attributeName = "nome")
    private String nome;

    public Cliente() {
        // Construtor padrão
    }

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Métodos Get e Set para todos os atributos
    @DynamoDBHashKey
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @DynamoDBAttribute
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para cadastrar um novo cliente no sistema
    public void cadastrarCliente(Cliente cliente) {
        // Implemente a lógica para cadastrar o cliente no sistema
        System.out.println("Cliente " + cliente + " cadastrado com sucesso.");
    }

    // Método para buscar informações de um cliente pelo seu ID
    public Cliente buscarCliente(int id) {
        // Implemente a lógica para buscar o cliente pelo ID e retorná-lo
        // Por simplicidade, vamos retornar um cliente fictício
        return new Cliente(id, "Cliente Teste");
    }

    // Método toString() para facilitar a visualização dos dados
    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}