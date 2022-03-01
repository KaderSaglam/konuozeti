package bankaProjesi;

public class KrediKarti extends BankaParentClass  {
	   public KrediKarti(String isim, String soyisim,String tcNo,double krediKartiLimit) {
	        super(isim, soyisim,tcNo,krediKartiLimit);//mainden yukaridaki degiskenler parent classa sabitlenecek 
	    }

	@Override
	public void yatirilacakTutar(double yatirilanTutar) {//extends BankaParentClass  dedigimiz icin prentteki abtract metodlari implement
		// etmek zorundayiz

	}

	@Override
	public void cekilecekTutar(double cekilecekTutar) {

		
	}
	

}
