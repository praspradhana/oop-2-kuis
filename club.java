public class club {
    
	 public void bertanding (){
	 System.out.println("Club Bertanding ");
}
	public void berlatih (){
		System.out.println("Club Berlatih");
	}
	public void bersaing (){
		System.out.println("Club Bersaing");
	}
}
 
 class sepakbola extends club {

 	public void bertanding(){
 		System.out.println("");
 		System.out.println("Club Sepakbola Bertanding");
 	}
 	public void berlatih(){
 		System.out.println("Club Sepakbola Berlatih");
 	}
 	public void bersaing(){
 		System.out.println("Club Sepakbola Bersaing");
 	}

 	public void tampil(){
 		super.bertanding();
 		super.berlatih();
 		super.bersaing();
 	}

 	
 }
 
  class volly extends club {

 	public void bertanding(){
 		System.out.println("");
 		System.out.println("Club Volly Bertanding");
 	}
 	public void berlatih(){
 		System.out.println("Club Volly Berlatih");
 	}
 	public void bersaing (){
 		System.out.println("Club Volly Bersaing");
 	}

 	/*public void tampil(){
 		super.bertanding();
 		super.berlatih();
 		super.bersaing();
 	}*/
 	
 }
 	class cetak{
 		public static void main(String []args){
 		sepakbola SepakBola = new sepakbola();
 		volly Volly = new volly();
 		
 		SepakBola.tampil();
 		SepakBola.bertanding();
 		SepakBola.berlatih();
 		SepakBola.bersaing();

 		Volly.bertanding();
 		Volly.berlatih();
 		Volly.bersaing();

 		 	}
 		 }
 