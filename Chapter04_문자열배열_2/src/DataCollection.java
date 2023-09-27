import java.io.FileReader;

public class DataCollection {
	static String fileReaderData(String path)
	{
		String seoulData="";
		try
		{
			FileReader fr = new FileReader("/Users/maclovin/git/"+path);
			int i=0;
			while((i=fr.read())!=-1)
			{
				seoulData+=(char)i;
			}
			fr.close();
		}catch(Exception ex) {}
		
		return seoulData;
	
	}

}
