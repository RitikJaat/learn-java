import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImageNameList {

  public static void main(String[] args) throws IOException {
    // Replace "path/to/your/folder" with the actual path to your folder
    String folderPath = "/home/m0nster/Desktop/Photos/New folder";
    File folder = new File(folderPath);

    // Check if the folder exists
    if (!folder.isDirectory()) {
      System.out.println("Error: Provided path is not a directory");
      return;
    }

    // Define a pattern to match image extensions (common ones)
    Pattern imagePattern = Pattern.compile("(?i)(.*\\.(jpg|jpeg|png|gif))");

    // Open a FileWriter to write to the txt file
    FileWriter writer = new FileWriter(folderPath + "/image_names.txt");

    try {
      for (File file : folder.listFiles()) {
        Matcher matcher = imagePattern.matcher(file.getName());
        if (matcher.matches()) {
          // Extract the image name without extension
          String imageName = matcher.group(1);
          writer.write(imageName + "\n");
        }
      }
      System.out.println("Image names written to image_names.txt");
    } finally {
      writer.close();
    }
  }
}
