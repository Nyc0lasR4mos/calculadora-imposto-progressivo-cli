# Calculadora de Imposto Progressivo (CLI)

CLI em Java para cálculo progressivo de Imposto de Renda com separação de responsabilidades e validação de dados


| Faixa | Valor Mínimo | Valor Máximo | Alíquota |
| :---: | :--- | :--- | :--- |
| 1 | R$ 0,00 | R$ 5.000,00 | 0% (isento) |
| 2 | R$ 5.000,01 | R$ 6.500,00 | 7,5% |
| 3 | R$ 6.500,01 | R$ 8.000,00 | 15% |

Essas alíquotas são referentes às regras do Imposto de Renda Pessoa Física (IRPF) que entraram em vigor a partir de janeiro de 2026.

O cálculo progressivo é feito aplicando o percentual devido única e exclusivamente sobre a parcela da renda que se encaixa em cada faixa. A progressividade funciona dividindo a renda em faixas, e cada uma delas possui uma porcentagem de imposto diferente. Assim, a maior alíquota é aplicada apenas à parte mais alta do salário, e não sobre toda a renda. Dessa forma, quem ganha mais paga proporcionalmente mais imposto, tornando a cobrança mais justa e equilibrada.

## Pré-Requisitos

Versão do Java necessária: JDK 25 ou 26.
Maven instalado.

## Como Executar
```
[COMANDO_DE_EXECUÇÃO_AQUI]
```
**O programa funcionará no terminal então o exemplo de entrada esperado será:**

Input: "Informe a renda bruta mensal (R$)"

Entrada: Usuário digita 5500.00 (ou valor inválido).

Na saída correta retornará ao usuário o seguinte:

Imposto Devido: R$ 112,50
Alíquota Efetiva: 2,05%
Renda Líquida: R$ 5387,50

Na saída incorreta retornará ao usuário o seguinte:

Erro: Valor inválido. Informe um número positivo.

(E o programa encerra com exit code != 0).

## Como Testar

```
mvn test
```
Para testes unitários
---

## Abaixo temos alguns cenários com outputs *corretos, errados e nulos*

> [!TIP]
> **Sucesso**
>
> **Valor:** 5500.00
>
> **Output:**
>
> Imposto Devido: R$ 112,50
>
> Alíquota Efetiva: 2,05%
>
> Renda Líquida: R$ 5387,50

> [!CAUTION]
> **Erro**
>
> Valor: -5500.00 ou ***null/vazia***
>
> Output:
>
> Erro: Valor inválido. Informe um número positivo

> [!WARNING]
> **Nulo**
>
> Valor: 0
>
> Output:
>
> Imposto Devido: R$ 0
>
> Alíquota Efetiva: 0%
>
> Renda Líquida: R$ 0

## Decisões Técnicas

A separação do I/O da Lógica foi feita pois a classe CalculadoraIR conterá apenas a lógica matemática, recebendo double e retornando para o sistema um objeto de resultado, já a classe Main cuidará da leitura do Scanner (Input) e impressão (Output) no System.out


**Nycolas Ramos**

[![LinkedIn](https://img.shields.io/badge/LinkedIn-000000?style=for-the-badge&logo=linkedin&logoColor=0A66C2)](https://www.linkedin.com/in/nycolas-ramos-483810399/) [![GitHub](https://img.shields.io/badge/GitHub-000000?style=for-the-badge&logo=github&logoColor=FFFFFF)](https://github.com/Nyc0lasR4mos)
