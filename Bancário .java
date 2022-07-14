/*APLICAÇÃO BANCÁRIA
Após criar as classes e seus atributos, implementei um método para realizar o saque de dinheiro.
Comecei pela classe “Conta” adicionando o método de saque.
*/

package br.com.meuprojeto;
public class Conta {
String cliente;
double saldo;
void exibesaldo() {
System.out.println(cliente + “ seu saldo é * + saldo);
}
void saque(double valor) {
saldo -= valor;
}
}

/*Já na classe “ContaTeste”eu realizei a chamada do método de saque.
Exemplo: Isso pode ser feito simulando um saque no valor de R$ 3.000,00*/

package br.com.meuprojeto;
public class ContaTeste {
public static void main(String[] args) {
Conta conta = new Conta();
conta.cliente = “Priscila”;
conta.saldo = 4 _ 000.00;
conta.exibesaldo();
conta. saque(3000) ;
conta.exibesaldo();
}
}

/*OBS: A linha de código é ajustada para esse fim.
Na sequência consegui ver o método de saque realizado*/

/*Em seguida, é implantado o método de depósito. Então, eu adicionei o
método na classe “Conta”.*/

public class Conta {
String cliente;
double saldo;
void exibesaldo() {
System.out.println(cliente + ” seu saldo é “ + saldo);

}
void saque(double valor) {
saldo -= valor;
}
void deposita(double valor) {
saldo += valor;
}
}

/*Depois, acrescentei a chamada do método na classe “ContaTeste”.*/

public class ContaTeste{
public static void main(String() args) {
Conta conta = new Conta();
conta.cliente = “Priscila”;
conta.saldo = 8 _ 000.00;
conta.exibesaldo();
conta. saque(3000) ;
conta.exibesaldo();
conta. deposita(7000);
conta.exibesaldo();
}
}

/*Agora eu executo e são exibidos os resultados.*/

/*Finalmente elaborei um método que realizará a transferência de valor para uma
conta de destino, o qual será implantado na classe “Conta”.
Sendo que o método “this.”, serve para fazer a referência do objeto. */

package br.com.meuprojeto;
public class Conta {
String cliente;
double saldo;
void exibesaldo() {
System.out.println(cliente + “ seu saldo é “ + saldo);
}
void saque(double valor) {
saldo -= valor;
}
void deposita(double valor) {
saldo += valor;
}
void transferenciaValor(Conta destino, double valor) {
thís.saque(valor);
destino.deposita(valor);
}
}

/*Seguindo com o processo, implante a classe “ContaTeste”, comentando os métodos
“conta.saque” e “conta.deposita”.*/

Package br.com.meuprojeto;
public class ContaTeste (
public static void main(String(] args) {
Conta conta = new Conta();
conta.cliente = “Priscila”;
conta.saldo = 8 _ 000.00;
conta.exibesaldo();
//conta. saque(3000);
//conta.exibesaldo();
//conta.deposita(7000);
//conta.exibesaldo();
Conta destino = new Conta();
destino.Cliente = “João”;
destino.saldo = 5 _ 000.00;
destino.exibesaldo();
}
}

/*Assim consegui chegar no resultado da transferência.*/




