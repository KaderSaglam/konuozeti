package bankaProjesi;

public abstract class BankaParentClass {//parent classimizi abtract olarak yapmassak abtract method kullanamayiz hata aliriz
	
private String isim; //private yapiyorum cunku encapsulation dayayi gizleme yapicam	
private String soyIsim;	
private String tcNo;	
private double bankaKartiBakiye=2000;//2000 ilk hesap ailisinda kartta 2000 tl limit olsun diye	
private double krediKartiLimiti=10000;//10000 buda kredi karti limitini 10000 tl olarak ayarladik 	
// yukaridaki class larin 1 tanesi haric paremetreli cont olusturucaz 2 tane ayri kartimiz oldugu icin 

public BankaParentClass() {// default class olusturduk diger parametreli class olusturunca defaul const silinir
	
}
public BankaParentClass(String isim, String soyIsim, String tcNo, double gelenBakiye) {
	super();
	this.isim = isim;
	this.soyIsim = soyIsim;
	this.tcNo = tcNo;
	this.bankaKartiBakiye = bankaKartiBakiye;
}


public double getBankaKartiBakiye() {
	return bankaKartiBakiye;
}
public void setBankaKartiBakiye(double bankaKartiBakiye) {
	this.bankaKartiBakiye = bankaKartiBakiye;
}
public double getKrediKartiLimiti() {
	return krediKartiLimiti;
}
public void setKrediKartiLimiti(double krediKartiLimiti) {
	this.krediKartiLimiti = krediKartiLimiti;
}
public String getIsim() {
	return isim;
}
public String getSoyIsim() {
	return soyIsim;
}
public String getTcNo() {
	return tcNo;
}
@Override
public String toString() {
	return "BankaParentClass [isim=" + isim + ", soyIsim=" + soyIsim + ", tcNo=" + tcNo + ", bankaKartiBakiye="
			+ bankaKartiBakiye + ", krediKartiLimiti=" + krediKartiLimiti + "]";
}


//getter ve setter olarak isim soyisim Tcno degismiyecegi icin bunlara getter demem lazim 
//8. ve 9. satirdaki degiskenlerede hem getter hemde setter demem gereli cunku bunlari goruntuleyip degistirmem lazim
public abstract  void yatirilacakTutar(double yatirilanTutar);

public abstract void cekilecekTutar(double cekilecekTutar);
//


}
