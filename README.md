# 🚗 Gerenciador de Frotas  

Este projeto é um sistema de **Gerenciamento de Frotas** desenvolvido em **Java**, que permite organizar e controlar veículos de uma empresa. Ele utiliza conceitos de **programação orientada a objetos**, como classes abstratas, interfaces, herança e polimorfismo.  

## ✨ Funcionalidades  
- Cadastro de veículos (carros e motos) com informações como **placa** e **ano**.  
- Cálculo do valor do seguro com base em características específicas de cada veículo.  
  - **Carros**: número de portas.  
  - **Motos**: cilindrada.  
- Realização de manutenções periódicas.  
- Exibição de detalhes dos veículos cadastrados.  

## 🛠️ Tecnologias Utilizadas  
- **Java**: linguagem principal para a lógica do sistema.  
- **ArrayList**: para armazenar e organizar os veículos.  

## 📂 Estrutura do Código  
1. **Veiculo**: classe abstrata com atributos e métodos base para carros e motos.  
2. **Manutencao**: interface que padroniza o método de manutenção.  
3. **Carro e Moto**: subclasses de `Veiculo`, que implementam a interface `Manutencao` e métodos específicos.  
4. **GerenciadorVeiculos**: classe principal para executar e testar o sistema.  

## 📝 Como Usar  
1. Clone este repositório:  
   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git




