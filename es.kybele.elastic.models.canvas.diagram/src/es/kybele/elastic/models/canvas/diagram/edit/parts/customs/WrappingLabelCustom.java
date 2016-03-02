package es.kybele.elastic.models.canvas.diagram.edit.parts.customs;

import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

public class WrappingLabelCustom extends WrappingLabel {

	@Override
    public void setText(String text) 
    {
		//System.out.println(text);
		String myString = ""+text+"";
		String replaceString = myString.replace('\\', '@');
		String replaceString2 = replaceString.replaceAll("@n", "\n");
		String[] partsTest = replaceString2.split("\n");
		String[] parts = text.split("\\n");
		//System.out.println("Nº Partes: "+partsTest.length);
		String newString = "";
		for(String part : partsTest)
		{
			newString += part + "\n";
		}
		//System.out.println(newString);
        super.setText(newString);
    }
	@Override
    public String getText() {
         
		String myString = ""+super.getText()+"";
		String replaceString = myString.replace('\\', '@');
		String replaceString2 = replaceString.replaceAll("@n", "\n");
		String[] partsTest = replaceString2.split("\n");
		String newString = "";
		for(String part : partsTest)
		{
			newString += part + "\n";
		}
		System.out.println("PASA");
		return newString;
    }
}
