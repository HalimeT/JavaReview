package Homework;

public abstract class File {
//	Create a class 
//	File that will have the following behaviors: open, edit, close.
//	Edit and close are implemented method while open is an abstract. 
//	Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific implementation of open behaviour: 
//    Example: to open .java file we need notepad++ or sublime tex, to open .doc file we need Microsoft word to be installed

	
	public void Edit() {
		System.out.println("Edit");
		
	}
	public void Close() {
		System.out.println("Close");
	}
	public abstract void Open();
		
	
}
class JavaFile extends File{

	@Override
	public void Open() {
	System.out.println("to open .java file we need notepad++ or sublime tex");
		
	}
	
}
class WordFile extends File{

	@Override
	public void Open() {
	System.out.println("to open .doc file we need Microsoft word to be installed");	
		
	}
	
}
class PDFFile extends File{

	@Override
	public void Open() {
	System.out.println("to.open.pdf file we need AdobeReader to be installed");
		
	}
	
}

