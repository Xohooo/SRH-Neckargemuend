/*
Aufgabe:
In einem Programm soll die folgende Ausgabe mit Hilfe einer for-Schleife erzeugt werden
Anzeige/Darstellung:
	i	j
1.	5	25
2.	6	24
3.	7	23
4.	8	22
5.	9	21
*/
public class �bung5 {

	public static void main(String[] args) {

		int i, j;

		System.out.println("\ti\tj");

		for (i = 5, j = 25; i <= 9; i++, j--) {

			System.out.println((i-4)+".\t" +i +"\t" +j);
		}
	}
}
