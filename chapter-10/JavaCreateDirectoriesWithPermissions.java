import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;
import java.io.File;

public class JavaCreateDirectoriesWithPermissions{
	public static void main(String[] args) throws IOException {
		Path path = Path.of("myDir");
		
		if(!Files.exists(path)){
			Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rwxr--r--");
			FileAttribute<Set<PosixFilePermission>> fileAttributes = PosixFilePermissions.asFileAttribute(permissions);
			Files.createDirectory(path, fileAttributes);
		}
		
		Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(path);
		
		System.out.println(posixFilePermissions);
		
		File file = new File("anotherDir");
		file.mkdir();
	}
}
