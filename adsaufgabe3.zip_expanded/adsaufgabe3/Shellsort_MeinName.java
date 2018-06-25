package adsaufgabe3;

public class Shellsort_MeinName implements IShellsort 
{

    /* Der Konstruktor hat kein Argument
     */
    public Shellsort_MeinName() 
    {

    }

    /* Rueckgabewert: Anzahl der Schluesselvergleiche
     */
    public int shellsort(String[] feld) 
    {
    	int sv = 0;
    	int sw = 1;
    	while ((sw * 3)+1 < feld.length)
    	{
    		sw = (sw * 3) +1;
    	}
    	while (sw > 0)
    	{
    		sv += insertionsortMitSchrittweite(feld, sw);
    		sw = sw/3;
    	}
//    	showStr(feld);
//    	System.out.println(sv);
    	return sv;
    }

    /* Rueckgabewert: Anzahl der Schluesselvergleiche
     */
    public int insertionsortMitSchrittweite(String[] feld, int schrittweite) 
    {
    	int sv = 0;
    	int svs = 0;
	    	for (int i = schrittweite; i < feld.length; i++)
			{
				String neu = feld[i];
				int k = i;	//k wird auf die Schrittweite gestezt und dann bis zur Länge des Feldes hochgezählt.
				/*
				 * der erste Wert wird dann ab der Schrittweite genommen
				 * und es wird verglichen, ob der hintere ( neu ) Wert kleiner ist als der vordere
				 */
				while (k >= schrittweite &&
							( checkAnz(feld[k - schrittweite]) > checkAnz(neu) ||
							(feld[k - schrittweite].length() > neu.length() &&
							checkAnz(feld[k - schrittweite]) == checkAnz(neu)) )) 
				{
						svs++;
						
						feld[k] = feld[k-schrittweite];
						k = k-schrittweite;
					
				}
				/*
				 * check auf den Durchlauf der While Schleife, 
				 * da er sonnst nur ein Vergleich geführt hat.
				 */
				if (svs != 0) 
				{
					sv = svs+sv;
					svs = 0;
				}
				if (k >= schrittweite)
				{
					sv++;
				}
				feld[k] = neu;
			}
//    	showStr(feld);
//    	System.out.println(sv);
    	return sv;
    }
    
    public int checkAnz(String str)
    {
    	int anz = 0;
    	for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == 'a')
			{
				anz++;
			}
			if (str.charAt(i) == 'z')
			{
				break;
			}
		}
    	return anz;
    }
    
    public void showStr(String[] feld)
    {
    	for (int i = 0; i < feld.length; i++)
		{
			System.out.print(feld[i] + " ");
		}
    }
    


}
