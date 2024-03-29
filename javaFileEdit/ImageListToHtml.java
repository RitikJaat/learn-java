import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ImageListToHtml {

  public static void main(String[] args) throws IOException {
    String folderPath = "/home/m0nster/Desktop/Photos/New folder";
    String imagePath = folderPath + "/";  // Adjust path based on image location

    // Call function to write image names to txt file (if needed)
    ImageList.writeImageNames(folderPath);

    // Read image names from txt file
    ArrayList<String> imageNames = readImageNames(folderPath);

    StringBuilder html = new StringBuilder();
    html.append("<ul>");  // Start unordered list

    for (String imageName : imageNames) {
      html.append("<li><img src=\"" + imagePath + imageName + "\"></li>");
    }

    html.append("</ul>");  // End unordered list

    System.out.println(html.toString());  // Print generated HTML
  }

  private static ArrayList<String> readImageNames(String filePath) throws IOException {
    File file = new File(filePath + "/image_names.txt");

    // Check if the file exists
    if (!file.isFile()) {
      System.out.println("Error: image_names.txt not found. Run writeImageNames first.");
      return new ArrayList<>();
    }

    ArrayList<String> imageNames = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      String line;
      while ((line = reader.readLine()) != null) {
        imageNames.add(line);
      }
    }
    return imageNames;
  }
}
