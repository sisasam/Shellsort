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
    	while (schrittweite > 0)
    	{
	    	for (int i = schrittweite; i < feld.length; i++)
			{
				String neu = feld[i];
				int k = i;
				while (k >= schrittweite && checkAnz(feld[k - schrittweite]) >= checkAnz(neu))
				{
//					if (checkAnz(feld[k - schrittweite]) = checkAnz(neu))
//					{
//						if (feld[k - schrittweite].length() )
//						{
//							
//						}
//					}
					System.out.print(feld[k - schrittweite] +  " " + checkAnz(feld[k - schrittweite]) + " vgl. " + neu + " " + checkAnz(neu));
					System.out.println();
					sv++;
					feld[k] = feld[k-schrittweite];
					k = k-schrittweite;
				}
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
