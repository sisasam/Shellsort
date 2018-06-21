package adsaufgabe3;

public class Testtreiber{
    public static void main (String[] args) {
	IShellsort sort = new Shellsort_MeinName();

	String[] feld1 = { "aba", "baaza", "abab", "bab", "baaab", "bazbab" };
	String[] soll1 = { "bab", "bazbab", "aba", "abab", "baaza", "baaab"};
	int sollvgl1 = 10; // Schrittweiten 4 und 1
	
	int vgl = sort.shellsort(feld1);
	
	boolean ergebnis = (vgl == sollvgl1);
	for (int i=0; i<feld1.length; i++)
	    if (!feld1[i].equals(soll1[i]))
		ergebnis = false;	
	if (ergebnis)
	    System.out.println("Testfall 1 erfolgreich");
	else
	    System.out.println("Fehler bei der Bearbeitung von Testfall 1");

	// zweiter Testfall

	
	String[] feld2 = { "aba", "baaza", "abab", "bab", "baaab", "bazbab" };
	String[] soll2 = { "aba", "bab", "abab", "bazbab", "baaab", "baaza"};
	int sollvgl2 = 5;
	
	int vgl2 = sort.insertionsortMitSchrittweite(feld2,2);
	
	boolean ergebnis2 = (vgl2 == sollvgl2);
	for (int i=0; i<feld2.length; i++)
	    if (!feld2[i].equals(soll2[i]))
		ergebnis2 = false;	
	if (ergebnis2)
	    System.out.println("Testfall 2 erfolgreich");
	else
	    System.out.println("Fehler bei der Bearbeitung von Testfall 2");



    }
}
