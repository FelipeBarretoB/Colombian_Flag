package ui;

import thread.Colours;

public class Main {

	public static void main(String [] args) throws InterruptedException {
		
		System.out.print("\u001b[2J");//Limpia la pantalla de la consola
		//la primer variable es el sleep, es decir, cuanto demora en mostrar el siguiente *
		//La segunda variable es cuantas filas de x color van a haber (en este caso, 10 filas amarillas, 5 azules, 5 rojas)
		//La tercera es en que columna empieza el cursor para ese color, todas empiezan en 1
		//La cuarta es en que fila empieza cada color (este es basicamente la cantidad de filas del color anterior +1)
		//La ultima es el codigo del color
		Colours yellow= new Colours(1,10,1,1,33);
		Colours blue= new Colours(10,5,1,11,34);
		Colours red= new Colours(50,5,1,16,31);
		yellow.start();
		blue.start();
		red.start();
	}
}
