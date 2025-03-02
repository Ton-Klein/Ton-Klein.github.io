
public class TestaMesComSwitch {

	public static void main(String[] args) {
//		Vimos como fazer testes com o if, mas se precisarmos fazer vários testes? Um exemplo, temos uma variável mes, precisamos testar o seu número e imprimir o seu mês correspondente. Então, vamos fazer 12 ifs?
//
//				Para esses casos, existe o comando switch, onde podemos colocar todas as opções ou rumos que o nosso programa pode tomar. Ele funciona da seguinte maneira:

		int mes = 10;

		switch (mes) {
		case 1:
			System.out.println("O mês é Janeiro");
			break;
		case 2:
			System.out.println("O mês é Fevereiro");
			break;
		case 3:
			System.out.println("O mês é Março");
			break;
		case 4:
			System.out.println("O mês é Abril");
			break;
		case 5:
			System.out.println("O mês é Maio");
			break;
		case 6:
			System.out.println("O mês é Junho");
			break;
		case 7:
			System.out.println("O mês é Julho");
			break;
		case 8:
			System.out.println("O mês é Agosto");
			break;
		case 9:
			System.out.println("O mês é Setembro");
			break;
		case 10:
			System.out.println("O mês é Outubro");
			break;
		case 11:
			System.out.println("O mês é Novembro");
			break;
		case 12:
			System.out.println("O mês é Dezembro");
			break;
		default:
			System.out.println("Mês inválido");
			break;
		}

		// O código que será executado, que no nosso caso será a impressão do nome do
		// mês, será o código em que a condição for verdadeira.

//        O break irá interromper a execução do caso que o contém, para as outras condições não serem analisadas e executadas.
//
//        Se nenhuma condição for aceita, o código do default é que será executado. Por exemplo, se o mes for 13, a impressão será Mês inválido.
//
//        Portanto, o switch é uma solução para os ifs encadeados.

	}

}
