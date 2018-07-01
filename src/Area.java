
public class Area extends Counter
{
	String param[];
	//int reason;
	String from,to;
	double value;
	
	Area(String p[], String f, String t, double v)
	{
		param=p;
		this.from=f;//wartosc pobrana z comboboxa z "Od"
		this.to=t;//wartosc pobrana z comboboxa z "Na"
		this.value=v;
		//reason=r; // czy reason jest potrzebny? wiem, ze jestem w length, wiec wiem, jakie mam jednostki do porownania
	}
		
	protected double countScore(String table[]) 
    {
		
		double literalRange=100000000;
		if(from==param[0] && to==param[0])//cm^2-cm^2
			return value;
		if(from==param[0] && to==param[1])//cm^2-m^2
			return value/10000;
		if(from==param[0] && to==param[2])//cm^2-km^2
			return value/literalRange;
		if(from==param[0] && to==param[3])//cm^2-ar
			return value/1000000;
		if(from==param[0] && to==param[4])//cm^2-hektar
			return value/100000000;
		if(from==param[1] && to==param[0])//m^2-cm^2
			return value*10000;
		if(from==param[1] && to==param[1])//m^2-m^2
			return value;
		if(from==param[1] && to==param[2])//m^2-km^2
			return value/1000000;
		if(from==param[1] && to==param[3])//m^2-ar
			return value/100;
		if(from==param[1] && to==param[4])//m^2-hektar
			return value/10000;
		if(from==param[2] && to==param[0])//km^2-cm^2
			return value*literalRange;
		if(from==param[2] && to==param[1])//km^2-m^2
			return value*1000000;
		if(from==param[2] && to==param[2])//km^2-km^2
			return value;
		if(from==param[2] && to==param[3])//km^2-ar
			return value*10000;
		if(from==param[2] && to==param[4])//km^2-hektar
			return value*100;
		if(from==param[3] && to==param[0])//ar-cm^2
			return value*1000000;
		if(from==param[3] && to==param[1])//ar-m^2
			return value*100;
		if(from==param[3] && to==param[2])//ar-km^2
			return value/10000;
		if(from==param[3] && to==param[3])//ar-ar
			return value;
		if(from==param[3] && to==param[4])//ar-hektar
			return value/100;
		if(from==param[4] && to==param[0])//hektar-cm^2
			return value*100000000;
		if(from==param[4] && to==param[1])//hektar-m^2
			return value*10000;
		if(from==param[4] && to==param[2])//hektar-km^2
			return value/100;
		if(from==param[4] && to==param[3])//hektar-ar
			return value*100;
		if(from==param[4] && to==param[4])//hektar-hektar
			return value;
		
		return 0;//nie dojdzie tu na pewno, ale niech sie kompilator nie czepia, ze fun.
		//moze nic nie zwrocic
		
    }
}
/*
units[0]="cm^2";
units[1]="m^2";
units[2]="km^2";
units[3]="ar";
units[4]="hektar";
*/