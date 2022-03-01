package bankaProjesi;

public class BankaKarti extends BankaParentClass   {
	
	 public BankaKarti(String isim, String soyIsim, String tcNo, double bankaKartiBakiye) {
	        super(isim, soyIsim, tcNo, bankaKartiBakiye);//mainden yukaridaki degiskenler parent classa sabitlenecek 
	    }

	@Override
	public void yatirilacakTutar(double yatirilanTutar) {//extends BankaParentClass  dedigimiz icin prentteki abtract metodlari implement 
		//etmek zorundayiz
	
		
	}

	@Override
	public void cekilecekTutar(double cekilecekTutar) {
		// TODO Auto-generated method stub
		
	}
}
