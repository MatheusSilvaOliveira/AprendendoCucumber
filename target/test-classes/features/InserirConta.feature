# language: pt
Funcionalidade:
	Eu como usuário
	Quero criar um acesso
	Para que possa criar contas
	Entao assim realizar transações bancárias

Esquema do Cenario: Adicionar um usuário
	Dado que eu acesse a página inicial do sistema
	E em seguida no botão Bank Manager Login
	E em seguida no botão Add Customer
	Quando eu informar o nome <nome>
	E o sobrenome <sobrenome>
	E o CEP <cep>
	Entao em seguida finalizo no botão Add Customer
	Entao fecho o alerta que aparece
	
	Exemplos:
		| 	nome 	| sobrenome | cep 		|
		| Matheus | 	Silva 	|	0000		|
		| Marcus  | Oliveira 	|	1234		|
		| Zenky	  | 	Lol		 	|	005500	|