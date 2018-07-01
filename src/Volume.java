
public class Volume extends Counter
{
	String param[];
	//int reason;
	String from,to;
	double value;
	
	Volume(String p[], String f, String t, double v)
	{
		param=p;
		this.from=f;//wartosc pobrana z comboboxa z "Od"
		this.to=t;//wartosc pobrana z comboboxa z "Na"
		this.value=v;
		//reason=r; // czy reason jest potrzebny? wiem, ze jestem w length, wiec wiem, jakie mam jednostki do porownania
	}
		
	protected double countScore(String table[]) 
    {
		
		if(from==param[0] && to==param[0])//cm^3-cm^3
			return value;
		if(from==param[0] && to==param[1])//cm^3-m^3
			return value/1000000;
		if(from==param[0] && to==param[2])//cm^3-litr
			return value/1000;
		if(from==param[1] && to==param[0])//m^3-cm^3
			return value*1000000;
		if(from==param[1] && to==param[1])//m^3-m^3
			return value;
		if(from==param[1] && to==param[2])//m^3-litr
			return value*1000;
		if(from==param[2] && to==param[0])//litr-cm^3
			return value*1000;
		if(from==param[2] && to==param[1])//litr-m^3
			return value/1000;
		if(from==param[2] && to==param[2])//litr-litr
			return value;
		
		
		return 0;//nie dojdzie tu na pewno, ale niech sie kompilator nie czepia, ze fun.
		//moze nic nie zwrocic
		
    }
}
/*
units[0]="cm^3";
units[1]="m^3";
units[2]="litr";
*/