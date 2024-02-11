import java.io.File;
import java.io.FileFilter;
import java.nio.file.Path;

public class FileFilterExample{
	public static void main(String[] args){
		Path pictureDir = Path.of("/home/sahabuddin/Downloads/");	
		FileFilter pngFilter = new FileFilter(){
			@Override
			public boolean accept(File pathname){
				String fileName = pathname.getName();
				return fileName.endsWith(".png");
			}
		};
		
		File pictuerDirFile = pictureDir.toFile();
		File[] listRoots = pictuerDirFile.listFiles(pngFilter);
		for(File file : listRoots){
			System.out.println(file.getPath());
		}
	}
}
