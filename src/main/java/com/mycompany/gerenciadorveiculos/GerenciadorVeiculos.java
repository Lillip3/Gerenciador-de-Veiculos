package com.mycompany.gerenciadorveiculos;

import java.util.ArrayList;

// Classe abstrata Veiculo
abstract class Veiculo {
    String placa;
    int ano;
    
    public Veiculo(String placa, int ano){
        this.placa = placa;
        this.ano = ano;
    }
    
    // Método abstrato para calcular o valor do seguro
    public abstract double calcularValorSeguro();
    
    // Método concreto para exibir os detalhes do veículo
    public void exibirDetalhes(){
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }
}

interface Manutencao {
    String realizarManutencao();
}

// Classe Carro, herda de Veiculo e implementa Manutencao
class Carro extends Veiculo implements Manutencao{
    int numeroPortas;
    
    public Carro(String placa, int ano, int numeroPortas){
        super(placa, ano);
        this.numeroPortas = numeroPortas;
    }
    
    @Override
    public double calcularValorSeguro(){
        // O valor do seguro varia conforme o número de portas do carro
        double valorBase = 1000;
        if(numeroPortas == 2){
            return valorBase * 1.2; // carro de 2 portas são mais caros
        }else if(numeroPortas == 4){
            return valorBase * 1.1; // carros de 4 portas têm seguro mais barato
        }
        return valorBase;
    }
    
    @Override
    public String realizarManutencao(){
        return "Manutenção realizada no carro " + placa;
    }
}

class Moto extends Veiculo implements Manutencao {
    int cilindrada;
    
    public Moto(String placa, int ano, int cilindrada){
        super(placa, ano);
        this.cilindrada = cilindrada;
    }
    
    @Override
    public double calcularValorSeguro(){
        // O valor do seguro varia conforme a cilindrada da moto
        double valorBase = 500;
        if(cilindrada > 1000){
            return valorBase * 1.3; // Moto com mais de 1000 cilindradas são mais caras
        }
        return valorBase;
    }
    
    @Override
    public String realizarManutencao(){
        return "Manutenção realizada na moto " + placa;
    }
}

// Classe principal GerenciadorVeiculos
public class GerenciadorVeiculos{
    public static void main(String[] args){
        // Criação da lista de veículos
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        
        
       // Adicionando carros e motos à lista
       veiculos.add(new Carro("ABC1234", 2020, 4));
       veiculos.add(new Moto("XYZ5678", 2018, 1500));
       veiculos.add(new Carro("LMN9101", 2021, 2));
       
       
       // Percorrendo a lista de veículos, exibindo detalhes, calculando seguro e realizando manutenção
       for(Veiculo veiculo : veiculos){
           veiculo.exibirDetalhes();
           System.out.println("Valor do seguro: R$" + veiculo.calcularValorSeguro());
           System.out.println(veiculo instanceof Manutencao ? ((Manutencao) veiculo).realizarManutencao() : "Veículo sem manutenção definida");
           System.out.println();
       }
    }
}