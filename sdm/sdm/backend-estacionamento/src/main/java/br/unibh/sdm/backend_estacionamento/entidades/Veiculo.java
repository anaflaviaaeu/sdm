package br.unibh.sdm.backend_estacionamento.entidades;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;


@DynamoDBTable(tableName = "Veiculo")
public class Veiculo {

    @DynamoDBHashKey(attributeName = "id")
    private int id;

    @DynamoDBAttribute(attributeName = "placa")
    private String placa;

    @DynamoDBAttribute(attributeName = "modelo")
    private String modelo;

    public Veiculo() {
        // Construtor padrão
    }

    public Veiculo(int id, String placa, String modelo) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
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
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @DynamoDBAttribute
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Métodos adicionais conforme seu projeto
    // ...

    // Método toString() para facilitar a visualização dos dados
    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}