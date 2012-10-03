package spaceex;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;
import org.xml.sax.SAXException;

import sspaceex.SXSspaceex;

import ecml.CBMReader;
import ecml.CPSBehavioralModel;
import ecml.IllegalGrammarException;

public class ECMLtoSpaceEx {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		String source = null;
		String target = null;
		
		PropertyConfigurator.configure(ECMLtoSpaceEx.class
				.getResource("log4j.config.main"));
		
		if(args.length != 2)
		{
			System.out.println("usage: java -jar ECMLtoSpaceEx <source> <target>");
			System.out.println();
			System.out.println("   source : cbm file");
			System.out.println("   target : spaceEx file");
			return;	
		}else{
			source = args[0];
			target = args[1];
			CBMReader reader = new CBMReader();
			ByteArrayInputStream bais = null;
			FileOutputStream fos = null;
			try {
				CPSBehavioralModel cbm = reader.parse(source);
				Translator translator = new Translator();
				SXSspaceex spaceex = translator.translation(cbm);
				File file = new File(target);
				fos = new FileOutputStream(file);
				String result = spaceex.getXml();
				byte[] buffer = new byte[512];				
				bais = new ByteArrayInputStream(result.getBytes());
				int readcount = 0;
				while((readcount = bais.read(buffer)) != -1){
					fos.write(buffer,0,readcount);
				}				
			} catch (IllegalGrammarException e) {
				System.err.print("Grammar is not legal.");
				e.printStackTrace();
			} catch (SAXException e) {
				System.err.print("Grammar is not legal.");
				e.printStackTrace();
			} catch (IOException e) {
				System.err.print("File error.");
				e.printStackTrace();
			}finally{
				bais.close();
				fos.close();
			}
			
		}

	}

}
