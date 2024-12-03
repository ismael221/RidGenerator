
# Gerador de Resource IDs Aleatórios

Este é um projeto Java que gera identificadores de recursos (Resource IDs) aleatórios com exatamente 48 caracteres. O objetivo deste projeto é fornecer uma ferramenta simples e eficiente para a geração desses IDs, que podem ser usados em diversos cenários como identificadores de recursos em sistemas de gerenciamento, arquivos, ou outros tipos de registros.

## Funcionalidades

- Geração de IDs aleatórios com 48 caracteres.
- Utiliza uma combinação de letras maiúsculas, minúsculas e números.
- Permite a personalização da quantidade de IDs gerados (pode ser configurado para gerar um ou mais IDs por vez).
- Fácil integração em outros projetos Java.

## Pré-requisitos

Antes de rodar este projeto, você precisa garantir que tenha o ambiente de desenvolvimento Java configurado. Os pré-requisitos são:

- Java 18 ou superior.
- Maven (opcional, caso queira compilar e executar via Maven).

## Como Usar

### 1. Clonar o repositório

Clone este repositório para sua máquina local:

```bash
git clone https://github.com/seuusuario/gerador-resource-id.git
```

### 2. Compilar o Projeto

Caso esteja utilizando Maven, você pode compilar o projeto executando o seguinte comando dentro da pasta do projeto:

```bash
mvn clean install
```

### 3. Executar o Gerador

Após compilar o projeto, você pode executar a classe principal do projeto para gerar os Resource IDs aleatórios.

```bash
java -jar target/gerador-resource-id-1.0-SNAPSHOT.jar
```

Ou, se estiver usando uma IDE como IntelliJ IDEA ou Eclipse, basta executar a classe `ResourceIdGenerator`.

### 4. Exemplo de Saída

A saída do programa será a impressão de IDs aleatórios, cada um com 48 caracteres. Exemplo:

```
ID Gerado: A1b2C3D4e5F6G7H8I9J0K1L2M3N4O5P6Q7R8S9T0U1V2W3X4Y5Z6
ID Gerado: p9Q8R7S6T5U4V3W2X1Y0Z9A8B7C6D5E4F3G2H1I0J9K8L7M6N5O4
```

## Como Funciona

O gerador utiliza um conjunto de caracteres alfanuméricos (letras maiúsculas, minúsculas e números) para criar um ID aleatório de 48 caracteres. A classe principal (`ResourceIdGenerator`) gerencia a criação dos IDs e a exibição dos mesmos.

### Código de Exemplo

```java
class ResourceIdCodeGenerator {
    private static final char[] CHARACTERS =
            {
                    '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','H',
                    'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f',
                    'g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
            };

    private static final int CODE_LENGTH = 48;
    private static final SecureRandom random = new SecureRandom();

    public String generateRid() {
        StringBuilder code = new StringBuilder(CODE_LENGTH);
        for (int i = 0; i < CODE_LENGTH; i++) {
            code.append(CHARACTERS[(random.nextInt(CHARACTERS.length))]);
        }
        return code.toString();
    }
}
```

## Contribuindo

Sinta-se à vontade para fazer melhorias ou correções no código. Se você encontrar um bug ou tiver uma sugestão, por favor, abra uma _issue_ ou envie um _pull request_.

1. Fork o repositório.
2. Crie uma branch para sua modificação (`git checkout -b minha-nova-feature`).
3. Faça suas mudanças e commit (`git commit -am 'Adicionando nova funcionalidade'`).
4. Push para a branch (`git push origin minha-nova-feature`).
5. Crie um _pull request_.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
```
