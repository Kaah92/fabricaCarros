import java.sql.SQLOutput;

public class Fabrica {

    public static Car[] estoque = new Car[10];
    {
        for(int i = 0; i < estoque.length; i++)
            System.out.println(estoque[i].getBrand() + estoque[i].getColor());
    }
        static Car [] manufacturesCars() {
            Car car0 = new Car("Mitsubishi", "Silver", 4);
            Car car1 = new Car("Toyota", "Azul marinho", 4);
            Car car2 = new Car("Chevrolet", "Chumbo", 4);
            Car car3 = new Car("Wolksvagen", "Carmin", 4);
            Car car4 = new Car("Hyundai", "Branco", 4);
            Car car5 = new Car("Honda", "Preto", 4);
            Car car6 = new Car("Fiat", "vermelho", 2);
            Car car7 = new Car("Ford", "Prata", 2);
            Car car8 = new Car("Mercedes-Benz", "Preto", 4);
            Car car9 = new Car("KIA", "Carmin", 4);

            return new Car[] {car0, car1, car2, car3, car4, car5, car6, car7, car8, car9};
        }

    public static void stockCars() {
        estoque = manufacturesCars();
    }
}
/*
1-Crie a classe 'Fabrica' de modo que esta fabrique os carros e as
2- armazena no vetor 'estoque' do tipo 'Car' com capacidade
para 10 carros.
3-Você deve    criar os carros, povoar o vetor e imprimir cada uma de suas
marcas.
*/



//Sistema de produção de fábrica de carros, são fábricados 10 tipos de modelos de carros.
