
public class Weight extends Counter
{
	String param[];
	//int reason;
	String from,to;
	double value;
	
	Weight(String p[], String f, String t, double v)
	{
		param=p;
		this.from=f;//wartosc pobrana z comboboxa z "Od"
		this.to=t;//wartosc pobrana z comboboxa z "Na"
		this.value=v;
		//reason=r; // czy reason jest potrzebny? wiem, ze jestem w length, wiec wiem, jakie mam jednostki do porownania
	}
		
	protected double countScore(String table[]) 
    {
		
		
		if(from==param[0] && to==param[0])//mg-mg
			return value;
		if(from==param[0] && to==param[1])//mg-g
			return value/1000;
		if(from==param[0] && to==param[2])//mg-dkg
			return value/100;
		if(from==param[0] && to==param[3])//mg-kg
			return value/1000000;
		if(from==param[0] && to==param[4])//mg-tona
			return value/1000000000;
		if(from==param[1] && to==param[0])//g-mg
			return value*1000;
		if(from==param[1] && to==param[1])//g-g
			return value;
		if(from==param[1] && to==param[2])//g-dkg
			return value/10;
		if(from==param[1] && to==param[3])//g-kg
			return value/1000;
		if(from==param[1] && to==param[4])//g-tona
			return value/1000000;
		if(from==param[2] && to==param[0])//dkg-mg
			return value*10000;
		if(from==param[2] && to==param[1])//dkg-g
			return value*10;
		if(from==param[2] && to==param[2])//dkg-dkg
			return value;
		if(from==param[2] && to==param[3])//dkg-kg
			return value/100;
		if(from==param[2] && to==param[4])//dkg-tona
			return value/100000;
		if(from==param[3] && to==param[0])//kg-mg
			return value*1000000;
		if(from==param[3] && to==param[1])//kg-g
			return value*1000;
		if(from==param[3] && to==param[2])//kg-dkg
			return value*100;
		if(from==param[3] && to==param[3])//kg-kg
			return value;
		if(from==param[3] && to==param[4])//kg-tona
			return value/1000;
		if(from==param[4] && to==param[0])//tona-mg
			return value*1000*100*10;
		if(from==param[4] && to==param[1])//tona-g
			return value*1000*10;
		if(from==param[4] && to==param[2])//tona-dkg
			return value*1000*100;
		if(from==param[4] && to==param[3])//tona-kg
			return value*1000;
		if(from==param[4] && to==param[4])//tona-tona
			return value;
		
		return 0;//nie dojdzie tu na pewno, ale niech sie kompilator nie czepia, ze fun.
		//moze nic nie zwrocic
		
    }
}
/*
units[0]="mg";
units[1]="g";
units[2]="dkg";
units[3]="kg";
units[4]="tona";*/