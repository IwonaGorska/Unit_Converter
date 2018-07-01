
public class Length extends Counter
{
	String param[];
	//int reason;
	String from,to;
	double value;
	
	Length(String p[], String f, String t, double v)
	{
		param=p;
		this.from=f;//wartosc pobrana z comboboxa z "Od"
		this.to=t;//wartosc pobrana z comboboxa z "Na"
		this.value=v;
		//reason=r; // czy reason jest potrzebny? wiem, ze jestem w length, wiec wiem, jakie mam jednostki do porownania
	}
		
	protected double countScore(String table[]) 
    {
		//if w pierwszym combo jest cosA, a w drugim combo cosB, to oblicz wynik i zwroc go return
		//mnostwo ifow i obliczen
		// i ta metoda bedzie wywolywana za kazdym kliknieciem na ktores combo i za kazdym wpisaniem wartosci, nie 
		//bd przycisku typu "check score", tylko od razu ma przeliczac, natychmiastowo
		//double score;
		
		if(from==param[0] && to==param[0])//mm-mm
			return value;
		if(from==param[0] && to==param[1])//mm-dm
			return value/100;
		if(from==param[0] && to==param[2])//mm-cm
			return value/10;
		if(from==param[0] && to==param[3])//mm-m
			return value/1000;
		if(from==param[0] && to==param[4])//mm-km
			return value/1000000;
		if(from==param[1] && to==param[0])//dm-mm
			return value*100;
		if(from==param[1] && to==param[1])//dm-dm
			return value;
		if(from==param[1] && to==param[2])//dm-cm
			return value*10;
		if(from==param[1] && to==param[3])//dm-m
			return value/10;
		if(from==param[1] && to==param[4])//dm-km
			return value/10000;
		if(from==param[2] && to==param[0])//cm-mm
			return value*10;
		if(from==param[2] && to==param[1])//cm-dm
			return value/10;
		if(from==param[2] && to==param[2])//cm-cm
			return value;
		if(from==param[2] && to==param[3])//cm-m
			return value/100;
		if(from==param[2] && to==param[4])//cm-km
			return value/100000;
		if(from==param[3] && to==param[0])//m-mm
			return value*1000;
		if(from==param[3] && to==param[1])//m-dm
			return value*10;
		if(from==param[3] && to==param[2])//m-cm
			return value*100;
		if(from==param[3] && to==param[3])//m-m
			return value;
		if(from==param[3] && to==param[4])//m-km
			return value/1000;
		if(from==param[4] && to==param[0])//km-mm
			return value*1000*100*10;
		if(from==param[4] && to==param[1])//km-dm
			return value*1000*10;
		if(from==param[4] && to==param[2])//km-cm
			return value*1000*100;
		if(from==param[4] && to==param[3])//km-m
			return value*1000;
		if(from==param[4] && to==param[4])//km-km
			return value;
		
		return 0;//nie dojdzie tu na pewno, ale niech sie kompilator nie czepia, ze fun.
		//moze nic nie zwrocic
		
    }
}
/*
units[0]="mm";
units[1]="dm";
units[2]="cm";
units[3]="m";
units[4]="km";*/