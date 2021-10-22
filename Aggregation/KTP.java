package Aggregation;

class KTP {
	int nomorId;
	String Nama;
	String Gender;
	Alamat alamat;
	KTP (int nomorId, String Nama, String Gender, Alamat alamat){
		this.nomorId = nomorId;
		this.Nama = Nama;
		this.Gender = Gender;
		this.alamat = alamat;
	}
	public static void main(String args[]) {
	Alamat add = new Alamat (12, "Mawar", "Samarang", "Garut","Jawa Barat");
	KTP card = new KTP (2001234567,"Safna Anbiya", "Wanita", add);
	
	System.out.println("----------------------------");
	System.out.println("    KARTU TANDA PENDUDUK	");
	System.out.println("----------------------------");
	System.out.println("Nomor Id : " + card.nomorId);
	System.out.println("Nama	 : " + card.Nama);
	System.out.println("Gender   : " + card.Gender);
	System.out.println("Alamat	 : " + "jalan" + " " + add.Jalan + " " + "no." + add.noRumah);
	System.out.println("	kecamatan" + " " + add.Kecamatan);
	System.out.println("	kabupaten" + " " + add.Kabupaten);
	System.out.println("	provinsi" + " " + add.Provinsi);
}
}