
public class Temperature extends Counter
{
	String param[];
	//int reason;
	String from,to;
	double value;
	
	Temperature(String p[], String f, String t, double v)
	{
		param=p;
		this.from=f;//wartosc pobrana z comboboxa z "Od"
		this.to=t;//wartosc pobrana z comboboxa z "Na"
		this.value=v;
		//reason=r; // czy reason jest potrzebny? wiem, ze jestem w length, wiec wiem, jakie mam jednostki do porownania
	}
		
	protected double countScore(String table[]) 
    {		
		if(from==param[0] && to==param[0])//Kelvin-Kelvin
			return value;
		if(from==param[0] && to==param[1])//Kelvin-Celsjusz
			return value-273.15;		
		if(from==param[1] && to==param[0])//Celsjusz-Kelvin
			return value+273.15;
		if(from==param[1] && to==param[1])//Celsjusz-Celsjusz
			return value;

		return 0;//nie dojdzie tu na pewno, ale niech sie kompilator nie czepia, ze fun.
		//moze nic nie zwrocic
		
    }
}
/*
units[0]="Kelvin";
units[1]="Celsjusz";
*/