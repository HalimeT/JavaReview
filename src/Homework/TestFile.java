package Homework;

public class TestFile {

	public static void main(String[] args) {
		File obj;
		obj=new JavaFile();
		obj.Open();
		obj.Close();
		obj.Edit();
		
		obj=new PDFFile();
		obj.Open();
		obj.Close();
		obj.Edit();
		
		obj=new WordFile();
		obj.Open();
		obj.Close();
		obj.Edit();

	}

}
