package br.estacio.prototype2;

class Cliente {
	
	public static void main(String[] args) {
		DocumentoPrototype ascii = new ASCIIPrototype();
		DocumentoPrototype pdf = new PDFPrototype();
		
		System.out.println(ascii.clone());
		System.out.println(pdf.clone());
	} 
}	