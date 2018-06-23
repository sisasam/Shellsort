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
    		sv = insertionsortMitSchrittweite(feld, sw);
    	return sv;
    }

    /* Rueckgabewert: Anzahl der Schluesselvergleiche
     */
    public int insertionsortMitSchrittweite(String[] feld, int schrittweite) 
    {
    	int sv = 0;
    	int svs = 0;
    	boolean vergleiche = false;
    	while (schrittweite > 0)
    	{
	    	for (int i = schrittweite; i < feld.length; i++)
			{
				String neu = feld[i];
				int k = i;	//k wird auf die Schrittweite gestezt und dann bis zur Länge des Feldes hochgezählt.
				if (k-schrittweite > schrittweite) 
				{
					vergleiche = true;
				}
				/*
				 * der erste Wert wird dann ab der Schrittweite genommen
				 * und es wird verglichen, ob der hintere ( neu ) Wert kleiner ist als der vordere
				 */
				while (k >= schrittweite && ( checkAnz(feld[k - schrittweite]) > checkAnz(neu) || (feld[k - schrittweite].length() > neu.length() && checkAnz(feld[k - schrittweite]) == checkAnz(neu)) )) 
				{
					/*
					 * check auf Anzahl der a's, da bei gleicher Anzahl
					 * noch ein Vergleich auf die Länge stattfindet
					 */
//					if (checkAnz(feld[k - schrittweite]) != checkAnz(neu)) 
//					{
						svs++;
//					}
//					else
//					{
//						svs = svs+2;
//					}
						
						feld[k] = feld[k-schrittweite];
						k = k-schrittweite;
					
				}
				/*
				 * check auf den Durchlauf der While Schleife, da er sonnst nur ein Vergleich geführt hat.
				 */
				if (svs != 0 && vergleiche == false) 
				{
					sv = svs+sv;
					svs = 0;
				}
				else if (svs != 0 && vergleiche == true) 
				{
					sv = (svs+1)+sv;
					svs = 0;
					vergleiche = false;
				}
				else //if (svs == 0 && checkAnz(feld[k - schrittweite]) != checkAnz(neu))
				{
					sv++;
				}
//				else if (svs == 0 && checkAnz(feld[k - schrittweite]) == checkAnz(neu))
//				{
//					sv = sv+2;
//				}
				feld[k] = neu;
			}
	    	schrittweite = schrittweite/3;
		}
    	showStr(feld);
    	System.out.println(sv);
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
