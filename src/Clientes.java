public class Clientes {

    static String[] nomes = {"Maria", "Carlos", "Thiago", "Rafaela", "Julia", "Matheus"};

    public static void main(String[] args) {

        Fabrica.stockCars();

        for(int i = 0; i < nomes.length; i++)
            System.out.println(nomes[i] + " possui o carro da " + Fabrica.estoque[i].getBrand() + " de cor "+ Fabrica.estoque[i].getColor() + ".");
    }
}

/* O que eu queria fazer e não consegui. Seria pegar o vetor da pasta b e colocar na c
PARA isso, precisaria usar o metodo construtor da pasta A. Mas só deu erro, por conta do acesso
mesmo utilizando o get.
 */

/*
Q9) Utilizando o vetor 'nomes' (no início desta lista) e
'estoques', crie um programa que imprima
todos os nomes associando com uma marca de carro. Exemplo da saída:

	Maria possui o carro da Mitsubishi.
	Carlos possui o carro da Toyota.
	Thiago possui o carro da Chevrolet.
	Rafaela possui o carro da Wolksvagen.
	Julia possui o carro da Hyundai.
	Matheus possui o carro da Honda.
 */