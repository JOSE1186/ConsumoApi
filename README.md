# 🌦️ Projeto: Sistema de Clima com API e POO em Java  

Esse projeto foi desenvolvido com o objetivo de **colocar em prática os conhecimentos adquiridos durante o curso de Análise e Desenvolvimento de Sistemas**, aplicando **conceitos de Programação Orientada a Objetos (POO)**, **consumo de APIs REST**, **lógica de programação** e **habilidades de resolução de problemas**.  

A aplicação funciona da seguinte forma: o usuário digita o **nome de uma cidade**, e o sistema utiliza uma **API de geolocalização** para encontrar as **coordenadas geográficas (latitude e longitude)**, além do **nome do estado e da cidade**.  
Essas coordenadas são então utilizadas pela **API Open-Meteo**, que retorna as **informações de temperatura da região em tempo real**.  

Durante o desenvolvimento, exercitei práticas fundamentais como:  
- Criação de requisições **HTTP** em Java com `HttpURLConnection`;  
- Leitura e manipulação de **JSON** com a biblioteca Gson;  
- Estruturação do código em camadas (modelo e serviço) seguindo princípios de POO;  
- Tratamento de exceções e boas práticas de código.  

## 🚀 Tecnologias utilizadas  
- ☕ **Java 8+**  
- 🌐 **APIs REST (Geolocalização e Open-Meteo)**  
- 📦 **Gson (Google JSON Library)**  
- 🧠 **POO e Lógica de Programação**  
- 🔧 **IntelliJ IDEA**

## 🧠 Aprendizados principais  
Esse projeto foi essencial para reforçar meus conhecimentos em **integração de sistemas, lógica de programação e estruturação de código orientado a objetos**, além de aprimorar minha **capacidade de aprender novas tecnologias e resolver problemas de forma prática e criativa**.  
src/
│
├── app/
│   └── Main.java                     → Classe principal responsável por iniciar o sistema
│
├── modelo/
│   ├── Clima.java                    → Classe modelo que armazena informações de temperatura e clima
│   └── Coordenadas.java              → Classe modelo que armazena latitude, longitude, cidade e estado
│
├── servico/
│   ├── ServicoClima.java             → Classe responsável por consumir a API Open-Meteo e retornar dados do clima
│   └── ServicoCoordenadas.java       → Classe responsável por consumir a API de geolocalização e retornar coordenadas
│

📂 **Este projeto está disponível no GitHub.**  
🔗 [Acesse o projeto completo aqui](https://github.com/JOSE1186/ConsumoApi)
